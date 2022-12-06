/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.TicketManager;

import Model.Date;
import Model.Event;

/**
 *
 * @author friedahuang
 */
public class Ticket {
    String id;
    double price;
    Date date;
    Event event;
    String eventId;
    String customerId;
    
    public Ticket(String id, String customerId, String eventId){
        this.id = id;
        this.eventId = eventId;
        this.customerId = customerId;
        
    }
    
    public Ticket(){}

    public Ticket(double price, Event event, Date date, String id) {
        this.id = id;
        this.price = price;
        this.event = event;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    
    
}
