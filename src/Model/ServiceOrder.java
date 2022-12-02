/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author friedahuang
 */
public class ServiceOrder {
    String serviceProvider; // e.g., Boston Catering Company 
    int price; 
    Date deliveredDate;

    public ServiceOrder(String serviceProvider, int price, Date deliveredDate) {
        this.serviceProvider = serviceProvider;
        this.price = price;
        this.deliveredDate = deliveredDate;
    }

    public String getServiceProvider() {
        return serviceProvider;
    }

    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Date getDeliveredDate() {
        return deliveredDate;
    }

    public void setDeliveredDate(Date deliveredDate) {
        this.deliveredDate = deliveredDate;
    }
    
    
    
}
