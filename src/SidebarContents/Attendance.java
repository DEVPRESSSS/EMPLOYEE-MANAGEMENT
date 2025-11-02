
package SidebarContents;

import Forms.AttendanceForm;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Attendance extends javax.swing.JPanel {

    private int selectedRow;
    private int empId;
    private String state = "";

    public Attendance() {
        initComponents();
        FetchAllEmployee();
        
        AttendanceTable.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            GetSelectedRow();
            if(!state.equals("Completed")){
                
                OpenTimeInWindow();
            }
            
            }
        });
        
       
        SearchField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                searchEmployee();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                searchEmployee();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                searchEmployee();
            }
        });

    }

   
    public void setTbl(){
        
       AttendanceTable.setEnabled(true);

    }
    
    private void GetSelectedRow(){
        
        selectedRow = AttendanceTable.getSelectedRow();
        
        
        if (selectedRow != -1) { 
            empId = Integer.parseInt(AttendanceTable.getValueAt(selectedRow, 0).toString());
            Object value = AttendanceTable.getValueAt(selectedRow, 8);
            state = (value != null) ? value.toString().trim() : "";
           

        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first.");
        }
    }
    
     private void OpenTimeInWindow(){
        

        AttendanceForm form = new AttendanceForm(this, empId , state);
        form.setVisible(true);

        setTbl();
        
        
    }
    public void clearState(){
        
        state= "";
    }
    public void FetchAllEmployee(){
        
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {


         String sql = "SELECT e.EmpId, " +
             "CONCAT(e.FirstName, ' ', e.MiddleName, ' ', e.LastName) AS FullName, " +
             "e.Contact, e.Gmail, e.Address, " +
             "d.DepartmentName AS DeptName, " +
             "p.PositionName AS Name, " +
             "e.Gender, e.Status, " +
             "a.Status AS State, " +
             "a.TimeIn, " +
             "a.TimeOut, " +
             "e.Created " +
             "FROM employee e " +
             "INNER JOIN department d ON e.DepartmentId = d.DepartmentId " +
             "INNER JOIN position p ON e.PositionId = p.PositionId " +
             "LEFT JOIN attendance a ON e.EmpId = a.EmpId AND DATE(a.Date) = CURDATE() ";
             
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) AttendanceTable.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = new Object[9];
                row[0] = rs.getInt("EmpId");
                row[1] = rs.getString("Fullname");
                row[2] = rs.getString("Name");
                row[3] = rs.getString("Gmail");
                row[4] = rs.getString("DeptName");
                row[5] = rs.getString("TimeIn");
                row[6] = rs.getString("TimeOut");
                row[7] = rs.getString("Status");
                row[8] = rs.getString("State") != null ? rs.getString("State") : "";
                model.addRow(row);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                // ignore
            }
        }

    }
    
    private void searchEmployee() {
        String keyword = SearchField.getText().trim();
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT e.EmpId, " +
                    "CONCAT(e.FirstName, ' ', e.MiddleName, ' ', e.LastName) AS FullName, " +
                    "e.Contact, e.Gmail, e.Address, " +
                    "d.DepartmentName AS DeptName, " +
                    "p.PositionName AS Name, " +
                    "e.Gender, e.Status, " +
                    "a.Status AS State, " +
                    "a.TimeIn, " +
                    "a.TimeOut, " +
                    "e.Created " +
                    "FROM employee e " +
                    "INNER JOIN department d ON e.DepartmentId = d.DepartmentId " +
                    "INNER JOIN position p ON e.PositionId = p.PositionId " +
                    "LEFT JOIN attendance a ON e.EmpId = a.EmpId " +
                    "WHERE CONCAT(e.FirstName, ' ', e.MiddleName, ' ', e.LastName) LIKE ?";

            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + keyword + "%"); // Partial search
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) AttendanceTable.getModel();
            model.setRowCount(0);

            while (rs.next()) {
                Object[] row = new Object[9];
                row[0] = rs.getInt("EmpId");
                row[1] = rs.getString("Fullname");
                row[2] = rs.getString("Name");
                row[3] = rs.getString("Gmail");
                row[4] = rs.getString("DeptName");
                row[5] = rs.getString("TimeIn");
                row[6] = rs.getString("TimeOut");
                row[7] = rs.getString("Status");
                row[8] = rs.getString("State") != null ? rs.getString("State") : "";
                model.addRow(row);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Search error: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                // ignore
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Today = new javax.swing.JButton();
        All = new javax.swing.JButton();
        Week = new javax.swing.JButton();
        SearchField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AttendanceTable = new javax.swing.JTable();
        BulkTimeIn = new javax.swing.JButton();
        BulkTimeOut = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        Today.setText("Today");
        Today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodayActionPerformed(evt);
            }
        });

        All.setText("All");
        All.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AllActionPerformed(evt);
            }
        });

        Week.setText("This week");
        Week.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WeekActionPerformed(evt);
            }
        });

        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchFieldKeyTyped(evt);
            }
        });

        jLabel1.setText("Search:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(162, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(All, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Today, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Week, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Today)
                    .addComponent(All)
                    .addComponent(Week)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        AttendanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EmpId", "Name", "Job Position", "Department", "Gmail", "Time In", "Time Out", "Status", "State"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AttendanceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AttendanceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(AttendanceTable);

        BulkTimeIn.setText("Time In All");
        BulkTimeIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulkTimeInActionPerformed(evt);
            }
        });

        BulkTimeOut.setText("Time out All");
        BulkTimeOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BulkTimeOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BulkTimeOut, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BulkTimeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BulkTimeIn)
                    .addComponent(BulkTimeOut))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AttendanceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AttendanceTableMouseClicked
       // OpenTimeInWindow();
    }//GEN-LAST:event_AttendanceTableMouseClicked

    private void AllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AllActionPerformed
        SearchByCategory("All");
    }//GEN-LAST:event_AllActionPerformed

    private void TodayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodayActionPerformed
        
        SearchByCategory("Today");
    }//GEN-LAST:event_TodayActionPerformed

    private void WeekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WeekActionPerformed

        SearchByCategory("Week");
    }//GEN-LAST:event_WeekActionPerformed

    private void BulkTimeInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulkTimeInActionPerformed
       
        //Time In all those employee who's status in attendance are empty
        MassTimeIn();
        
    }//GEN-LAST:event_BulkTimeInActionPerformed

    private void BulkTimeOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BulkTimeOutActionPerformed
        MassTimeOut() ;
    }//GEN-LAST:event_BulkTimeOutActionPerformed

    private void SearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyTyped
      if (SearchField.getText().length() >= 25) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_SearchFieldKeyTyped
    private void MassTimeIn() {
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Do you want to time in all employees with no status today?",
                "Confirm Mass Time In",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String findSql = "SELECT e.EmpId " +
                             "FROM employee e " +
                             "LEFT JOIN attendance a ON e.EmpId = a.EmpId AND DATE(a.Date) = CURDATE() " +
                             "WHERE a.EmpId IS NULL OR a.Status = '' OR a.Status IS NULL";
            pst = con.prepareStatement(findSql);
            rs = pst.executeQuery();

            List<Integer> empIds = new ArrayList<>();

            while (rs.next()) {
                empIds.add(rs.getInt("EmpId"));
            }

            if (empIds.isEmpty()) {
                JOptionPane.showMessageDialog(this, "All employees already have a status for today.");
                return;
            }

            String insertSql = "INSERT INTO attendance (EmpId, Date, TimeIn, Status) VALUES (?, CURDATE(), NOW(), 'Present')";
            pst = con.prepareStatement(insertSql);

            for (int empId : empIds) {
                pst.setInt(1, empId);
                pst.addBatch();
            }

            pst.executeBatch();

            JOptionPane.showMessageDialog(this, "Successfully timed in " + empIds.size() + " employees!");
            FetchAllEmployee(); 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error during mass time-in: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                // ignore
            }
        }
    }
    
    private void MassTimeOut() {
     int confirm = JOptionPane.showConfirmDialog(
             this,
             "Do you want to time out all employees who are currently timed in today?",
             "Confirm Mass Time Out",
             JOptionPane.YES_NO_OPTION,
             JOptionPane.QUESTION_MESSAGE
     );

     if (confirm != JOptionPane.YES_OPTION) {
         return;
     }

     Connection con = DatabaseConnection.Database.getConnection();
     PreparedStatement pst = null;
     ResultSet rs = null;

     try {
         String findSql = "SELECT a.AttendanceId, a.EmpId " +
                          "FROM attendance a " +
                          "WHERE DATE(a.Date) = CURDATE() " +
                          "AND a.Status = 'Present' " +
                          "AND (a.TimeOut IS NULL OR a.TimeOut = '')";
         pst = con.prepareStatement(findSql);
         rs = pst.executeQuery();

         List<Integer> attendanceIds = new ArrayList<>();

         while (rs.next()) {
             attendanceIds.add(rs.getInt("AttendanceId"));
         }

         if (attendanceIds.isEmpty()) {
             JOptionPane.showMessageDialog(this, "No employees are currently timed in today.");
             return;
         }

         String updateSql = "UPDATE attendance SET TimeOut = NOW(), Status = 'Completed' WHERE AttendanceId = ?";
         pst = con.prepareStatement(updateSql);

         for (int id : attendanceIds) {
             pst.setInt(1, id);
             pst.addBatch();
         }

         pst.executeBatch();

         JOptionPane.showMessageDialog(this, "Successfully timed out " + attendanceIds.size() + " employees!");
         FetchAllEmployee(); 

     } catch (SQLException e) {
         JOptionPane.showMessageDialog(this, "Error during mass time-out: " + e.getMessage());
     } finally {
         try {
             if (rs != null) rs.close();
             if (pst != null) pst.close();
             if (con != null) con.close();
         } catch (SQLException ex) {
             // ignore cleanup exceptions
         }
     }
 }
 
    
 

   private void SearchByCategory(String cat) {
    Connection con = DatabaseConnection.Database.getConnection();
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        String sql = "SELECT e.EmpId, " +
                "CONCAT(e.FirstName, ' ', e.MiddleName, ' ', e.LastName) AS FullName, " +
                "e.Contact, e.Gmail, e.Address, " +
                "d.DepartmentName AS DeptName, " +
                "p.PositionName AS Name, " +
                "e.Gender, e.Status, " +
                "a.Status AS State, " +
                "a.TimeIn, " +
                "a.TimeOut, " +
                "e.Created " +
                "FROM employee e " +
                "INNER JOIN department d ON e.DepartmentId = d.DepartmentId " +
                "INNER JOIN position p ON e.PositionId = p.PositionId " +
                "LEFT JOIN attendance a ON e.EmpId = a.EmpId ";

        switch (cat) {
            case "All":
               
                break;

            case "Today":
                sql += "WHERE DATE(a.Date) = CURDATE()";
                break;

            case "Week":
                sql += "WHERE YEARWEEK(a.DATE, 1) = YEARWEEK(CURDATE(), 1)";
                break;
        }

        pst = con.prepareStatement(sql);
        rs = pst.executeQuery();

        DefaultTableModel model = (DefaultTableModel) AttendanceTable.getModel();
        model.setRowCount(0);

        while (rs.next()) {
            Object[] row = new Object[9];
            row[0] = rs.getInt("EmpId");
            row[1] = rs.getString("Fullname");
            row[2] = rs.getString("Name");
            row[3] = rs.getString("Gmail");
            row[4] = rs.getString("DeptName");
            row[5] = rs.getString("TimeIn");
            row[6] = rs.getString("TimeOut");
            row[7] = rs.getString("Status");
            row[8] = rs.getString("State") != null ? rs.getString("State") : "";
            model.addRow(row);
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error filtering data: " + e.getMessage());
    } finally {
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException ex) {
            // ignore
        }
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton All;
    private javax.swing.JTable AttendanceTable;
    private javax.swing.JButton BulkTimeIn;
    private javax.swing.JButton BulkTimeOut;
    private javax.swing.JTextField SearchField;
    private javax.swing.JButton Today;
    private javax.swing.JButton Week;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
