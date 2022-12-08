/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.Volunteer;

import Model.Event;
import Model.TicketManager.PaymentRecord;
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
public class VolunteerMain extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerMain
     */
    javax.swing.JPanel CardSequencePanel;
    
    DefaultTableModel model;
    TableRowSorter myTableRowSorter;
    Event selectedEvent;
    ArrayList<Event> events;
    
    
    public VolunteerMain(JPanel clp) {
        this.CardSequencePanel = clp;
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblEvent = new javax.swing.JTable();
        Join = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();

        tblEvent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Event", "Date", "Location", "Volunteer capacity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEvent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEventMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEvent);

        Join.setText("Join the event");
        Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinActionPerformed(evt);
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
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Join)
                            .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(btnSearch)))
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(Join)
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinActionPerformed
        String[] capacityStr = selectedEvent.getVolunteerCapacity().split("/");
        int firstNumber = Integer.valueOf(capacityStr[0])+1;
        int secondNumber = Integer.valueOf(capacityStr[1]);
        String capacity = firstNumber + "/" + secondNumber;
        selectedEvent.setVolunteerCapacity(capacity);
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/final5100","root","root");  
            //here sonoo is database name, root is username and password  
            Statement stmt=con.createStatement();  
            
            String sql = "UPDATE event " + "SET volunteer_capacity = '" + capacity + "' WHERE event_id = '" + selectedEvent.getEvent_id()+ "';";
            System.out.print(sql);
            stmt.executeUpdate(sql);
//            ResultSet rs = stmt.executeQuery(sql);

            

//            rs.close();
            con.close();  
            }catch(Exception e){ System.out.println(e);}  
        populateEventTable();
    }//GEN-LAST:event_JoinActionPerformed

    private void tblEventMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEventMouseClicked
        int selectedRowIndex = tblEvent.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) tblEvent.getModel();
        selectedEvent = (Event)model.getValueAt(tblEvent.convertRowIndexToModel(selectedRowIndex), 0); 
    }//GEN-LAST:event_tblEventMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String text = tfSearch.getText();
        if (text.trim().length() == 0) {
     myTableRowSorter.setRowFilter(null);
  } else {
     myTableRowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
  }
        tblEvent.getRowSorter();
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Join;
    private javax.swing.JButton btnSearch;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEvent;
    private javax.swing.JTextField tfSearch;
    // End of variables declaration//GEN-END:variables

    public void dbGetEvent(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/final5100","root","root");   
            Statement stmt=con.createStatement();  
            ResultSet rs=stmt.executeQuery("select * from event");  
            
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
