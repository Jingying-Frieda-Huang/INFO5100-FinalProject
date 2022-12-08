/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Volunteer;

import Model.Event;
import Model.Profile;
import Model.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author friedahuang
 */
public class Volunteer {

    UserAccount userAccount;
    ArrayList<Event> history;

    public Volunteer(UserAccount userAccount, ArrayList<Event> history) {
        this.userAccount = userAccount;
        this.history = history;
    }
    
    public Volunteer(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public ArrayList<Event> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Event> history) {
        this.history = history;
    }

    
    
    
}
