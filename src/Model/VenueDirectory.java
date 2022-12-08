/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import Model.Util;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class VenueDirectory {
    private ArrayList<Venue> venue_dir;
    Connection con;
    PreparedStatement st;
    ResultSet rs;           

    public VenueDirectory() {
        try {
            this.con = Util.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(VenueDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.venue_dir = new ArrayList<>();
    }
    
    public ArrayList<Venue> getVenueList(){
        if (con != null){
            ArrayList<Venue> vList = new ArrayList<>();
            String sql = "SELECT * FROM venue";
            
            try {
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                
                while(rs.next()){
                    Venue v = new Venue();
                    v.setId(rs.getInt("reg_id"));
                    v.setName(rs.getString("name"));
                    v.setType(rs.getString("type"));
                    v.setCapacity(rs.getInt("seat_capacity"));
                    v.setLocation(rs.getString("zip_code"));
                    vList.add(v);
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(VenueDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return vList;
        }
        return new ArrayList<>();
    }
    
    public void createVenue(Venue obj){
        
        if (con != null){
            try {
                String sql = "INSERT INTO venue (name, zip_code, type, seat_capacity ) VALUES ('" + obj.getName() + "','" +
                        obj.getLocation() + "','" + obj.getType() + "'," + Integer.toString(obj.getCapacity()) + " )";
                
                st = con.prepareStatement(sql);
                st.executeUpdate();
                st.executeUpdate("commit");
                
            } catch (SQLException ex) {
                Logger.getLogger(VenueDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteVenue(Venue ve){
        if (con != null){
            try {
                String sql = "DELETE FROM venue WHERE reg_id = " + Integer.toString(ve.getId()) ;
                
                st = con.prepareStatement(sql);
                st.executeUpdate();
                st.executeUpdate("commit"); 
            } catch (SQLException ex) {
                Logger.getLogger(VenueDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public Venue getVenue(int id){
        try {
            if (con != null){
                String sql = "SELECT * FROM venue WHERE id = " + id;
                
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                
                while(rs.next()){
                    Venue v = new Venue();
                    v.setId(id);
                    v.setName(rs.getString("name"));
                    v.setType(rs.getString("type"));
                    v.setCapacity(rs.getInt("seat_capacity"));
                    v.setLocation(rs.getString("zip_code"));
                    return v;
                }
            } 
        }catch (SQLException ex) {
                Logger.getLogger(VenueDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new Venue();     //return empty object if not found
    }
    
    public void editVenue(Venue v, String field, String value, boolean isNumber ){
        if (con!=null){
            try {
                String sql;
                
                if (isNumber){
                    sql = "UPDATE venue SET " +field+ " = " + value + " WHERE reg_id =" +v.getId();
                }
                else{
                    sql = "UPDATE venue SET " +field+ " = '" + value + "' WHERE reg_id =" +v.getId();
                }
                
                st = con.prepareStatement(sql);
                st.executeUpdate();
                st.executeUpdate("commit");
            } catch (SQLException ex) {
                Logger.getLogger(VenueDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
