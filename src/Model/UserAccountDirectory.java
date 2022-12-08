/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class UserAccountDirectory {
    private ArrayList<UserAccount> user_dir;

    public UserAccountDirectory() {
        this.user_dir = new ArrayList<>();
    }
    
    public ArrayList<UserAccount> getUserAccountList() {
        return user_dir;

    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : user_dir)
            if (ua.getUser_id().equalsIgnoreCase(username)&& ua.getPassword().equalsIgnoreCase(password)){
                return ua;
            }
        return null;
        
        
        
    }
    
    public void createUserAccount(String username, String password, String role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUser_id(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        user_dir.add(userAccount);
    }
    
    public void removeUserAccount(UserAccount ua) {        
        user_dir.remove(ua);
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : user_dir){
            if (ua.getUser_id().equals(username))
                return false;
        }
        return true;
    }
}
