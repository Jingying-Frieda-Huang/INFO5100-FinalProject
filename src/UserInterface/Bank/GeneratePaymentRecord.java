/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Bank;

import Model.Bank.Payment;
import Model.TicketManager.PaymentRecord;
import static java.lang.Integer.max;
import static java.lang.Integer.min;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author evelynzu
 */
public class GeneratePaymentRecord extends javax.swing.JPanel {

    /**
     * Creates new form BankGeneratePaymentRecord
     */
    javax.swing.JPanel CardSequencePanel;
    
    DefaultTableModel model;
    TableRowSorter myTableRowSorter;
    Payment selectedPayment;
    ArrayList<Payment> payments;
    
    public GeneratePaymentRecord(JPanel clp) {
        this.CardSequencePanel = clp;
        payments= new ArrayList<>();
        
        initComponents();
        
        dbGetPayment();
        populatePaymentTable();
        sort(model);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblPayment = new javax.swing.JTable();
        btnGeneratePaymentRecord = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        tblPayment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PaymentId", "AccountNumber", "AccountName", "CustomerId", "MoneyAmount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPayment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPaymentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPayment);

        btnGeneratePaymentRecord.setText("Confirm payment and Generate record");
        btnGeneratePaymentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePaymentRecordActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnSearch))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(143, 143, 143)
                            .addComponent(btnGeneratePaymentRecord))))
                .addContainerGap(366, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addGap(28, 28, 28)
                .addComponent(btnGeneratePaymentRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneratePaymentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePaymentRecordActionPerformed
        PaymentRecord record = new PaymentRecord();
        record.setId(selectedPayment.getId()+(int)(Math.random()*100+1));
        record.setCustomer(selectedPayment.getCustomerId());
        record.setEvent(selectedPayment.getEventId());
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/final5100","root","root");  
            //here sonoo is database name, root is username and password  
            String query = " insert into record (record_id, event_id, customer_id)"
        + " values ("+record.getId()+","+ record.getEvent()+ "," + record.getCustomer()+")";  
            PreparedStatement preparedStmt = con.prepareStatement(query);  
            
            preparedStmt.execute();
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
            JOptionPane.showMessageDialog(this, "Payment record generated successfully");
    }//GEN-LAST:event_btnGeneratePaymentRecordActionPerformed

    private void tblPaymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPaymentMouseClicked
        int selectedRowIndex = tblPayment.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblPayment.getModel();
        selectedPayment = (Payment)model.getValueAt(tblPayment.convertRowIndexToModel(selectedRowIndex), 0); 
        
    }//GEN-LAST:event_tblPaymentMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String text = tfSearch.getText();
        if (text.trim().length() == 0) {
     myTableRowSorter.setRowFilter(null);
  } else {
     myTableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
  }
        tblPayment.getRowSorter();
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGeneratePaymentRecord;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPayment;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    public void populatePaymentTable() {
        model = (DefaultTableModel) tblPayment.getModel();
        model.setRowCount(0);
        for(Payment p: payments) {
            Object[] row = new Object[5];
            row[0] = p;
            row[1] = p.getAccountNumber();
            row[2] = p.getName();
            row[3] = p.getCustomerId();
            row[4] = p.getMoney();
            model.addRow(row);
        }
    }
    
    public void sort(DefaultTableModel model) {
        myTableRowSorter = new TableRowSorter(model);
        tblPayment.setRowSorter(myTableRowSorter);
        
    }
    
    
    public void dbGetPayment(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/final5100","root","root");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from payment");  
             
            while(rs.next()) {
                Payment payment = new Payment();
                payment.setId(rs.getString("payment_id"));
                payment.setAccountNumber(rs.getString("account_number"));
                payment.setName(rs.getString("name"));
                payment.setCustomerId(rs.getString("customer_id"));
                payment.setEventId(rs.getString("event_id"));
                payment.setMoney(Integer.valueOf(rs.getString("money")));
                
                
                System.out.println(payment.getId());
                payments.add(payment);
            }

            rs.close();
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
    }
}