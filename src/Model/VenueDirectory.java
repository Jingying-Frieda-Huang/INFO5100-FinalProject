/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class VenueDirectory {
    private ArrayList<Venue> venue_dir;

    public VenueDirectory() {
        this.venue_dir = new ArrayList<>();
    }
    
    public ArrayList<Venue> getVenueList(){
        return venue_dir;
    }
    
    public void createVenue(){
        
    }
    
    public void deleteVenue(Venue ve){
        
    }
}
