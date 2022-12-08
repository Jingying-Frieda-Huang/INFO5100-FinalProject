 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class SponsorDirectory {
    private ArrayList<Sponsor> sponsorDir;
    Connection con;
    PreparedStatement st;
    ResultSet rs;      
    
    public SponsorDirectory() {
        this.sponsorDir = new ArrayList<>();
        try {
            this.con = Util.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SponsorDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    public void addSponsor(Sponsor obj){
        if (con != null){
            try {
                String sql = "INSERT INTO sponsor (name, type, establish_date) VALUES ('" + obj.getName() + "','" +
                        obj.getBusiness_type()+ "','" + obj.getEst_date()+ "' )";
                
                st = con.prepareStatement(sql);
                st.executeUpdate();
                st.executeUpdate("commit");
                
            } catch (SQLException ex) {
                Logger.getLogger(SponsorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void deleteSponsor(Sponsor sp){
        if (con != null){
            try {
                String sql = "DELETE FROM sponsor WHERE reg_id = " + Integer.toString(sp.getLic_no()) ;
                
                st = con.prepareStatement(sql);
                st.executeUpdate();
                st.executeUpdate("commit"); 
            } catch (SQLException ex) {
                Logger.getLogger(SponsorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<Sponsor> getSponsorList(){
        if (con != null){
            ArrayList<Sponsor> spList = new ArrayList<>();
            String sql = "SELECT * FROM sponsor";
            
            try {
                st = con.prepareStatement(sql);
                rs = st.executeQuery();
                
                while(rs.next()){
                    Sponsor v = new Sponsor();
                    v.setLic_no(rs.getInt("reg_id"));
                    v.setName(rs.getString("name"));
                    v.setBusiness_type(rs.getString("type"));
//                    v.setEst_date(rs.getDate("establish_date"));  //pending 
                    spList.add(v);
                }
                
                
            } catch (SQLException ex) {
                Logger.getLogger(SponsorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            return spList;
        }
        return new ArrayList<>();      
    }
    
    public void updateSponsor(Sponsor sp, String field, String value, boolean isNumber){
        if (con!=null){
            try {
                String sql;
                
                if (isNumber){
                    sql = "UPDATE sponsor SET " +field+ " = " + value + " WHERE reg_id =" +sp.getLic_no();
                }
                else{
                    sql = "UPDATE sponsor SET " +field+ " = '" + value + "' WHERE reg_id =" +sp.getLic_no();
                }
                
                st = con.prepareStatement(sql);
                st.executeUpdate();
                st.executeUpdate("commit");
            } catch (SQLException ex) {
                Logger.getLogger(SponsorDirectory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
