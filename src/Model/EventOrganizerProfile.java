/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author friedahuang
 */
public class EventOrganizerProfile extends Profile {

    public EventOrganizerProfile(Person p) {
        super(p);
    }

    @Override
    public String getRole() {
        return "event organizer";
    }

}
