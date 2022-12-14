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

    String description;

    double duration;
    EventOrganizer evtOrganizer;

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
    public Event() {
    }

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

    int event_id;
    String name;
    String eventOrganizer;
    Date date;
    String location;
    String sponsor;
    String customerCapacity;
    String volunteerCapacity;
    int ticketPrice;
    String state;
    int year;
    String day;
    String venue;
    String time;
    int budget;

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
    
    
    

    public Event(int event_id, String name, String eventOrganizer, String day, Date date, String location, String sponsor, String customerCapacity, String volunteerCapacity, int ticketPrice, String state) {
        this.event_id = event_id;
        this.name = name;
        this.eventOrganizer = eventOrganizer;
        this.date = date;
        this.location = location;
        this.sponsor = sponsor;
        this.customerCapacity = customerCapacity;
        this.volunteerCapacity = volunteerCapacity;
        this.ticketPrice = ticketPrice;
        this.state = state;
        this.day = day;
    }

    public String getVenue() {
        return venue;
    }

    public String getTime() {
        return time;
    }
    

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }
    
    public String getEventOrganizer() {
        return eventOrganizer;
    }

    public void setEventOrganizer(String eventOrganizer) {
        this.eventOrganizer = eventOrganizer;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public String getCustomerCapacity() {
        return customerCapacity;
    }

    public void setCustomerCapacity(String customerCapacity) {
        this.customerCapacity = customerCapacity;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String toString() {
        return getName();
    }
    ///////////////////////////////////////////////////////////////////////////////

}
