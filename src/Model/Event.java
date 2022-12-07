/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Model.Volunteer.Volunteer;
import Model.TicketManager.Ticket;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author friedahuang
 */
public class Event {

    String name;
    String description;
    String location;
    double duration;
    EventOrganizer evtOrganizer;
    Date date;
    int totalTickets;
    ArrayList<Ticket> tickets;
    ArrayList<EndUser> attendees;
    boolean isInPerson; 
    ArrayList<Volunteer> volunteers;
    
    


    public Event(String name, String description, String location, double duration, EventOrganizer evtOrganizer, Date date, int totalTickets, boolean isInPerson) {
        this.name = name;
        this.description = description;
        this.location = location;
        this.duration = duration;
        this.evtOrganizer = evtOrganizer;
        this.date = date;
        this.totalTickets = totalTickets;
        this.tickets = new ArrayList<>(totalTickets);
        this.attendees = new ArrayList<>(totalTickets);
        this.isInPerson = isInPerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public EventOrganizer getEvtOrganizer() {
        return evtOrganizer;
    }

    public void setEvtOrganizer(EventOrganizer evtOrganizer) {
        this.evtOrganizer = evtOrganizer;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getTotalTickets() {
        return totalTickets;
    }

    public void setTotalTickets(int totalTickets) {
        this.totalTickets = totalTickets;
    }

    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<EndUser> getAttendees() {
        return attendees;
    }

    public void setAttendees(ArrayList<EndUser> attendees) {
        this.attendees = attendees;
    }

    public boolean isIsInPerson() {
        return isInPerson;
    }

    public void setIsInPerson(boolean isInPerson) {
        this.isInPerson = isInPerson;
    }
    
    ////////////////////////////////////////////////////////////////////////////////////
    //this create because volunteer page need volunteer capacity
    public Event(){}
    String volunteerCapacity;
    int event_id;
    public Event(int evnet_id, String name, Date date, String location, String volunteerCapacity) {
        this.event_id = event_id;
        this.name = name;
        this.date = date;
        this.location = location;
        this.volunteerCapacity = volunteerCapacity;
    }

    public ArrayList<Volunteer> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(ArrayList<Volunteer> volunteers) {
        this.volunteers = volunteers;
    }

    public String getVolunteerCapacity() {
        return volunteerCapacity;
    }

    public void setVolunteerCapacity(String volunteerCapacity) {
        this.volunteerCapacity = volunteerCapacity;
    }

    public int getEvent_id() {
        return event_id;
    }

    public void setEvent_id(int event_id) {
        this.event_id = event_id;
    }
    
    
    
    public String toString() {
        return getName();
    }
    ///////////////////////////////////////////////////////////////////////////////
    
}
