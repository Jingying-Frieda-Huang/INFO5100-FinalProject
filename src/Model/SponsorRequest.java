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
    EventOrganizer eventOrg;
    Event event;
    private int requestId;
    private String status;
    private int amount;

    public SponsorRequest() { 
    }

    public Sponsor getSp() {
        return sp;
    }

    public void setSp(Sponsor sp) {
        this.sp = sp;
    }

    public EventOrganizer getEventOrg() {
        return eventOrg;
    }

    public void setEventOrg(EventOrganizer eventOrg) {
        this.eventOrg = eventOrg;
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
    
    
}
