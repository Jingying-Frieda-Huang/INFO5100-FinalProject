/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Administrator
 */
public class UserAccount {
    private String user_id;
    private String password;
    private String role;

    public UserAccount(String user_id, String password, String role) {
        this.user_id = user_id;
        this.password = password;
        this.role = role;
    }

    public UserAccount() {
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    ////////////////////////////////////////////////////////to match the ui design in Framer
    private String email;
    private String name;

    public UserAccount(String user_id, String name, String password, String role, String email) {
        this.user_id = user_id;
        this.name = name;
        this.password = password;
        this.role = role;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
