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
    
    public PaymentRecord() {}

    public PaymentRecord(String id, String event, String customer) {
        this.id = id;
        this.event = event;
        this.customer = customer;
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
    
    
    @Override
    public String toString() {
        return getId();
    }
    
    
}
