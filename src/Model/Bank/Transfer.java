/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Bank;

/**
 *
 * @author evelynzu
 */
public class Transfer {
    String id;
    String sender;  
    String receiver;
    String type;
    int amount;
    String state;
     
    public Transfer(){}

    public Transfer(String id, String sender, String receiver, String type, int amount, String state) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.type = type;
        this.amount = amount;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }



    
    
    
    public String toString() {
        return getId();
    } 
}
