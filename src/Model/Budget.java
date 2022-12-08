/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author friedahuang
 */
public class Budget {
    long amount ;
    String forWhatPurpose;
    Date from; 
    Date to; 
    int duration; 

    public Budget(long amount, String forWhatPurpose, Date from, Date to, int duration) {
        this.amount = amount;
        this.forWhatPurpose = forWhatPurpose;
        this.from = from;
        this.to = to;
        this.duration = duration;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public String getForWhatPurpose() {
        return forWhatPurpose;
    }

    public void setForWhatPurpose(String forWhatPurpose) {
        this.forWhatPurpose = forWhatPurpose;
    }

    public Date getFrom() {
        return from;
    }

    public void setFrom(Date from) {
        this.from = from;
    }

    public Date getTo() {
        return to;
    }

    public void setTo(Date to) {
        this.to = to;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    
    
}
