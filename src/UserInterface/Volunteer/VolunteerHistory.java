/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Volunteer;

import Model.Event;
import Model.Volunteer.Volunteer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author evelynzu
 */
public class VolunteerHistory extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerHistory
     */
    javax.swing.JPanel CardSequencePanel;
    
    DefaultTableModel model;
    TableRowSorter myTableRowSorter;
    Volunteer volunteer;
    ArrayList<Event> events;
    
    public VolunteerHistory(JPanel clp, Volunteer volunteer) {
        this.volunteer = volunteer;
        initComponents();
        
        events = new ArrayList<>();
        dbGetEvent();
        populateEventTable();
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
        tblEvent = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();

        tblEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event", "Place", "Date", "VolunteerCapacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEvent);

        jButton1.setText("Search");
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
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(66, 66, 66))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String text = tfSearch.getText();
        if (text.trim().length() == 0) {
     myTableRowSorter.setRowFilter(null);
  } else {
     myTableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
  }
        tblEvent.getRowSorter();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEvent;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    public void dbGetEvent(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/ems_5100","root","root");   
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT * FROM event join volunteer_history on event.event_id = volunteer_history.event_id WHERE user_id = " + volunteer.getUserAccount().getUser_id()); 
            
            
            while(rs.next()) {
                Event event = new Event();
                event.setEvent_id(Integer.valueOf(rs.getString("event_id")));
                event.setName(rs.getString("event_name"));
                event.setDate(rs.getDate("date"));
                event.setLocation(rs.getNString("location"));
                event.setVolunteerCapacity(rs.getString("volunteer_capacity"));
                events.add(event);
                
            }

            rs.close();
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
    }
    
    public void populateEventTable() {
        model = (DefaultTableModel) tblEvent.getModel();
        model.setRowCount(0);
        for(Event event: events) {
            Object[] row = new Object[4];
            row[0] = event;
            row[1] = event.getDate();
            row[2] = event.getLocation();
            row[3] = event.getVolunteerCapacity();
            model.addRow(row);
        }
    }
        
    public void sort(DefaultTableModel model) {
        myTableRowSorter = new TableRowSorter(model);
        tblEvent.setRowSorter(myTableRowSorter);
        
    }

}
