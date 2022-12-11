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
public class EventOrganizer {

    UserAccount userAccount;
    Profile profile;
    ArrayList<Event> events;
    double revenue;

    public EventOrganizer(UserAccount userAccount, Profile profile, double revenue) {
        this.userAccount = userAccount;
        this.events = new ArrayList<>();
        this.revenue = revenue;
    }

    public EventOrganizer(Profile profile, double revenue) {
        this.profile = profile;
        this.events = new ArrayList<>();
        this.revenue = revenue;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public Event createNewEvent(Event event) {
        return event;
    }

}
