/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Welcome;

import Model.Event;
import Model.Person;
import UserInterface.Bank.GeneratePaymentRecord;
import UserInterface.EventOrganizer.EventOrganizerMainPage;
import UserInterface.Sponsor.SponsorMain;
import UserInterface.TicketManager.TicketGenerate;
import UserInterface.VenueOwner.VenueOwnerMain;
import UserInterface.Volunteer.VolunteerMain;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JPanel;

/**
 *
 * @author evelynzu
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    
    javax.swing.JPanel CardSequencePanel;
    
    public LoginJPanel(JPanel clp) {
        this.CardSequencePanel = clp;
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbRole = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        tfEmail = new javax.swing.JTextField();
        tfPassword = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel1.setText("Log in");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel2.setText("email");

        jLabel3.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jLabel4.setText("Role");

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "event organizer", "catering service provider", "Venue Service Provider", "Attendee", "Sponsor", "ticket manager", "volunteer", "bank" }));

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfEmail)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel4)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jButton1)
                .addContainerGap(102, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String email = tfEmail.getText();
        String psw = tfPassword.getText();
        String role = String.valueOf(cbRole.getSelectedItem());
//        authentication(email, psw, role);
        
        
        //if you don't want to use userAccount, just write your page and it will works
        


//        EventOrganizerMainPage eventOrganizerMainPage;
//        eventOrganizerMainPage = new EventOrganizerMainPage(CardSequencePanel);
        
//        VenueOwnerMain venueOwnerMain = new VenueOwnerMain(CardSequencePanel);
//        CardSequencePanel.removeAll();
//        CardSequencePanel.add("Venue Owner", venueOwnerMain);

//        CardSequencePanel.add("eventOrganizer", eventOrganizerMainPage);
//        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        SponsorMain sponsorMain = new SponsorMain(CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("Sponsor", sponsorMain);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

//          TicketGenerate ticketGenerate = new TicketGenerate(CardSequencePanel);
//          CardSequencePanel.removeAll();
//          CardSequencePanel.add("ticketManager", ticketGenerate);
//          ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
          

//            VolunteerMain volunteerMain = new VolunteerMain(CardSequencePanel);
//            CardSequencePanel.removeAll();
//            CardSequencePanel.add("volunteer", volunteerMain);
//            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

//        GeneratePaymentRecord generatePaymentRecord = new GeneratePaymentRecord(CardSequencePanel);
//        CardSequencePanel.removeAll();
//        CardSequencePanel.add("bank generate payment record", generatePaymentRecord);
//        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
            
          
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JPasswordField tfPassword;
    // End of variables declaration//GEN-END:variables
    
    public void authentication(String email, String password, String role) {
        try{ 
            Boolean flag = false;
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/final5100","root","root");   
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from user_account WHERE email ='" + email + "';");  
            
            while(rs.next()) {
                System.out.println(password+rs.getString("password")+"||"+ role + rs.getString("role"));
                if(password.equals(rs.getString("password")) && role.equals(rs.getString("role"))){
                    flag = true;
                }
                
            }
            
            if(flag == true) {
                if(role == "volunteer") {
                    VolunteerMain volunteerMain = new VolunteerMain(CardSequencePanel);
                    CardSequencePanel.removeAll();
                    CardSequencePanel.add("volunteer", volunteerMain);
                    ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                } else if(role == "ticket manager") {
                    TicketGenerate ticketGenerate = new TicketGenerate(CardSequencePanel);
                    CardSequencePanel.removeAll();
                    CardSequencePanel.add("ticketManager", ticketGenerate);
                    ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                } else if(role == "bank") {
                    GeneratePaymentRecord generatePaymentRecord = new GeneratePaymentRecord(CardSequencePanel);
                    CardSequencePanel.removeAll();
                    CardSequencePanel.add("bank generate payment record", generatePaymentRecord);
                    ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                } else if(role == "Sponsor"){
                    SponsorMain sponsorMain = new SponsorMain(CardSequencePanel);
                    CardSequencePanel.removeAll();
                    CardSequencePanel.add("Sponsor", sponsorMain); 
                    ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                } else if(role == "Venue Service Provider"){
                    VenueOwnerMain venueOwnerMain = new VenueOwnerMain(CardSequencePanel);
                    CardSequencePanel.removeAll();
                    CardSequencePanel.add("Venue Owner", venueOwnerMain);                    
                    ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);
                }
            }

            rs.close();
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
        
    }



}
