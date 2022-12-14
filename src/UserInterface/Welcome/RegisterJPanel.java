/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Welcome;

import Model.Database;
import Model.Event;
import Model.UserAccount;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author evelynzu
 */
public class RegisterJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RegisterJpanel
     */
    javax.swing.JPanel CardSequencePanel;
    
    Database database;
    ArrayList<UserAccount> userAccounts;
    boolean flag;
    
    public RegisterJPanel(JPanel clp) {
        this.CardSequencePanel = clp;
        initComponents();
        
        database = new Database();
        userAccounts = new ArrayList<>();
        
        dbGetUserAccount();
        
        flag = true;
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
        jLabel5 = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        tfPsw = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        cbRole = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(189, 212, 231));

        jLabel1.setText("Create new account");

        jLabel2.setText("Name");

        jLabel3.setText("Email address");

        jLabel4.setText("Password");

        jLabel5.setText("Role");

        Register.setText("Create account");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "event organizer", "catering service provider", "venue service provider", "attendee", "Sponsor", "ticket manager", "volunteer", "bank" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfPsw)
                    .addComponent(tfName)
                    .addComponent(tfEmail)
                    .addComponent(cbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(240, 240, 240))
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Register)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPsw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(Register)
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        String name = tfName.getText();
        String email = tfEmail.getText();
        String psw = tfPsw.getText();
        String role = String.valueOf(cbRole.getSelectedItem());
        

        registerDataValidation(name, email, psw, role);
        System.out.println(flag);
        if(flag == true) {
            insertUserAccount(name, email, psw, role);

        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/ems_5100","root","root");  
            //here sonoo is database name, root is username and password  
            String query = " insert into user_account (name, password, role, email)"
            + " values ('"+name+"','"+ psw+ "','" + role + "','"+ email + "')";  
            System.out.print(query);
            PreparedStatement preparedStmt = con.prepareStatement(query);             
            preparedStmt.execute();
            con.close();  
            }catch(Exception e){ System.out.println(e);}

         JOptionPane.showMessageDialog(this, "Register Successfully");
         
        LoginJPanel loginJPanel = new LoginJPanel(CardSequencePanel);
        CardSequencePanel.removeAll();
        CardSequencePanel.add("Login page", loginJPanel);
        ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);}
    }//GEN-LAST:event_RegisterActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Register;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPsw;
    // End of variables declaration//GEN-END:variables

    public void registerDataValidation(String name, String email, String psw, String role){
        
        
        if ((email == null) || (email.equals("")) || (!email.matches("^(.+)@(.+)$"))) { flag = false; JOptionPane.showMessageDialog(this, "Please follow email format");}

        for(UserAccount userAccount: userAccounts) {
            if(email.equals(userAccount.getEmail()) && role.equals(userAccount.getRole())) {
                flag = false;
                JOptionPane.showMessageDialog(this, "account already existed");
                break;
            }
        }
        
        if ((psw == null) || (psw.equals(""))) {flag = false; JOptionPane.showMessageDialog(this, "Please enter password");}
        
        if ((name == null) || (name.equals("")) || (!name.matches("^[a-zA-Z]*$"))) { flag = false; JOptionPane.showMessageDialog(this, "Please follow name format");}

    }
    
    public void dbGetUserAccount(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/ems_5100","root","root");   
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT * FROM user_account"); 
            
            
            while(rs.next()) {
                UserAccount userAccount = new UserAccount();
                userAccount.setUser_id(String.valueOf(rs.getInt("user_id")));
                userAccount.setName(rs.getString("name"));
                userAccount.setPassword(rs.getString("password"));
                userAccount.setRole(rs.getString("role"));
                userAccount.setEmail(rs.getString("email"));
                userAccount.setFinance(rs.getInt("finance"));
    
                userAccounts.add(userAccount);
               
            }

            rs.close();
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
    }
    
    
    public void insertUserAccount(String name, String email, String psw, String role){
        
        String insertsql = "insert into user_account (name, password, role, email)"
            + " values ('"+name+"','"+ psw+ "','" + role+"','"+email+"')";   
        database.insert(insertsql);
    }



}
