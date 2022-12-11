/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author evelynzu
 */
public class Database {
    String className;
    String url;
    String user;
    String password;

    public Database(String className, String url, String user, String password) {
        this.className = "com.mysql.cj.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/ems_5100";
        this.user = "root";
        this.password = "root";
    }
    
    public Database(){
        this.className = "com.mysql.cj.jdbc.Driver";
        this.url = "jdbc:mysql://localhost:3306/ems_5100";
        this.user = "root";
        this.password = "root";
    }
    
    public void update(String updateSQL){
        try{  
            Class.forName(this.className );  
            Connection con=DriverManager.getConnection(  
            this.url,this.user,this.password);  
            Statement stmt=con.createStatement();             
            System.out.print(updateSQL);
            stmt.executeUpdate(updateSQL);
            stmt.executeUpdate("commit");
            System.out.print("execute2");
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
    }
    
    
    public void insert(String insertSQL){
        try{  
            Class.forName(this.className);  
            System.out.print(this.className);
            Connection con=DriverManager.getConnection(  
            this.url,this.user,this.password);   
            PreparedStatement preparedStmt = con.prepareStatement(insertSQL);             
            preparedStmt.execute();
            preparedStmt.executeUpdate("commit");
//            System.out.print("execute1");
            con.close();  
            }catch(Exception e){ System.out.println(e);}
    }
    
    
    

}
