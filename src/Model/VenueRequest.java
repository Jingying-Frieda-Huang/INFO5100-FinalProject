/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Administrator
 */
/* Class to track the job role(as per project requirement) of venue owner. event organizer books venue, 
  in turn which creates a new record in venue request table with event id and venue id which will 
  be in pending state to start with and once venue owner acknowledeges will be set to complete/close
*/
public class VenueRequest {
    private int requestId;
    Event evt;
    Venue venue;
    private String status;
    Date requestDate;

    public VenueRequest() {
    }

    public int getRequestId() {
        return requestId;
    }

    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    public Event getEvt() {
        return evt;
    }

    public void setEvt(Event evt) {
        this.evt = evt;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    
}
