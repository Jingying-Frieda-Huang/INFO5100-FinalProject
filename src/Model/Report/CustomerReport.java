/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Report;

/**
 *
 * @author evelynzu
 */
public class CustomerReport {
    String customerId;
    String totalSpend;
    
    public CustomerReport(){}

    public CustomerReport(String customerId, String totalSpend) {
        this.customerId = customerId;
        this.totalSpend = totalSpend;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTotalSpend() {
        return totalSpend;
    }

    public void setTotalSpend(String totalSpend) {
        this.totalSpend = totalSpend;
    }
    
    
}
