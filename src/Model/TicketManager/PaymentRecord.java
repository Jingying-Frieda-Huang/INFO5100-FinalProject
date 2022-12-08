/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.TicketManager;


/**
 *
 * @author evelynzu
 */
public class PaymentRecord {
    String id;
    String event;
    String customer;
    String state;
    
    public PaymentRecord() {}

    public PaymentRecord(String id, String event, String customer, String state) {
        this.id = id;
        this.event = event;
        this.customer = customer;
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
    
    @Override
    public String toString() {
        return getId();
    }
    
    
}
