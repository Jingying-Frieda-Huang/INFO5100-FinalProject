/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
/* Class to track the job role(as per project requirement) of sponsor. event organizer requests sponsorship, 
  in turn which creates a new record in sponsor request table with event id and sponsor id which will 
  be in pending state to start with and once sponsor acknowledeges will be set to complete/close
*/
public class SponsorRequest {
    Sponsor sp;
    Event event;
    private int requestId;
    private String status;
    private int amount;
    private int eventId;
    private int sponsorId;
    private int organizerId;

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public void setSponsorId(int sponsorId) {
        this.sponsorId = sponsorId;
    }

    public SponsorRequest() { 
    }

    public int getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(int organizerId) {
        this.organizerId = organizerId;
    }

    public Sponsor getSp() {
        return sp;
    }

    public void setSp(Sponsor sp) {
        this.sp = sp;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public int getEventId(){
        return eventId;
    }
    
    public int getSponsorId(){
        return sponsorId;
    }
    
    public String getEventName(){
        return event.getName();
    }

    @Override
    public String toString() {
        return  Integer.toString(eventId);
    }
    
}
