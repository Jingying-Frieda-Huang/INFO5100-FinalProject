/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Bank;

/**
 *
 * @author evelynzu
 */
public class Payment {
    String id;
    String accountNumber;  
    String name;
    String customerId;
    String eventId;
    int money;
     
    public Payment(){}

    public Payment(String id, String accountNumber, String name, String customerId, String eventId, int money) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.name = name;
        this.customerId = customerId;
        this.eventId = eventId;
        this.money = money;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    
    public String toString() {
        return getName();
    } 
}
