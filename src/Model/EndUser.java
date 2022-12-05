/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author friedahuang
 */
public class EndUser {

    Profile profile;
    ArrayList<Event> pastEvents;
    ArrayList<Event> upcomingEvents;

    public EndUser(Profile profile, ArrayList<Event> pastEvents, ArrayList<Event> upcomingEvents) {
        this.profile = profile;
        this.pastEvents = new ArrayList<>();
        this.upcomingEvents = new ArrayList<>();
    }
    
    public void getPastEvents() {
 
    }

    public void purchaseTickets(Event event, int numbeOfTickets) {
        for (int i = 0; i < numbeOfTickets; i++) {
            this.upcomingEvents.add(event);
        }
    }
    
    public void checkin() {
        
    }
    
    public void cancelOrder() {
        
    }
    
    public void signUpForVolunteering() {
        
    }
}
