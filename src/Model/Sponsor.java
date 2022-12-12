/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.util.Date;

/**
 *
 * @author friedahuang
 */
public class Sponsor {
    private int lic_no;
    private String name;
    private String business_type;
    private Date est_date;
    UserAccount user;

    public Sponsor() {
    }

    public Sponsor(UserAccount user) {
        this.user = user;
    }

    public UserAccount getUser() {
        return user;
    }

    public void setUser(UserAccount user) {
        this.user = user;
    }

    public Date getEst_date() {
        return est_date;
    }

    public void setEst_date(Date est_date) {
        this.est_date = est_date;
    }

    public String getBusiness_type() {
        return business_type;
    }

    public void setBusiness_type(String business_type) {
        this.business_type = business_type;
    }
    

    public String getName(){
        return name;
    }
    
    public String getId(){
        return user.getUser_id();
    }

    public int getLic_no() {
        return lic_no;
    }

    public void setLic_no(int lic_no) {
        this.lic_no = lic_no;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    @Override
    public String toString() {
        return name;
    }
}
