
package SidebarContents;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class JobPosition extends javax.swing.JPanel {

   
   private int selectedRow; 
   private int id;
    public JobPosition() {
        initComponents();
        loadDepartments();
        LoadPositionData() ;
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Department = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        PositionName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SalaryRate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PositionTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Select department:");

        PositionName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PositionNameKeyTyped(evt);
            }
        });

        jLabel2.setText("Salary Rate:");

        SalaryRate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SalaryRateKeyTyped(evt);
            }
        });

        jLabel3.setText("Job Position:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SalaryRate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(PositionName, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PositionName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SalaryRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        PositionTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PositionId", "Department", "Job Position", "Salary", "Created"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        PositionTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PositionTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PositionTable);

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 653, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(176, 176, 176))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(570, Short.MAX_VALUE)
                    .addComponent(Add)
                    .addGap(16, 16, 16)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(492, Short.MAX_VALUE)
                    .addComponent(Update)
                    .addGap(94, 94, 94)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(416, Short.MAX_VALUE)
                    .addComponent(Add)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(422, Short.MAX_VALUE)
                    .addComponent(Update)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void GetSelectedRow(){
        
        
        selectedRow = PositionTable.getSelectedRow();
        System.out.print(selectedRow);
        
        DefaultTableModel model = (DefaultTableModel) PositionTable.getModel();
        id = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        PositionName.setText(model.getValueAt(selectedRow, 2).toString());
        SalaryRate.setText(model.getValueAt(selectedRow, 3).toString());
        Department.setSelectedItem(model.getValueAt(selectedRow, 4).toString());
    }
    
    //Delete the record
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete!");
                return;
            }


            int confirm = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to delete this posiiton?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection con = DatabaseConnection.Database.getConnection();
                     PreparedStatement pst = con.prepareStatement("DELETE FROM position WHERE PositionId = ?")) {

                    pst.setInt(1, id);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Position deleted successfully!");
                    LoadPositionData();
                    Clear(); 

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error deleting record: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        updatePosition();
    }//GEN-LAST:event_UpdateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void SalaryRateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SalaryRateKeyTyped
         char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != '.') {
            evt.consume();
        }

        if (c == '.' && SalaryRate.getText().contains(".")) {
            evt.consume();
        }

        if (SalaryRate.getText().length() >= 6) {
            evt.consume();
        } // Allow only digits and a single dot for decimals
   
    }//GEN-LAST:event_SalaryRateKeyTyped

    private void PositionNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PositionNameKeyTyped
          char c = evt.getKeyChar();
       
        if(!Character.isAlphabetic(c)){
            
            evt.consume();
        }
         if (PositionName.getText().length() >= 25) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_PositionNameKeyTyped
    
    //Clear all fields
    private void Clear(){
        
        PositionName.setText("");
        SalaryRate.setText("");
    }
    
    //Add job positions
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       PreparedStatement pst = null;
        Connection con = DatabaseConnection.Database.getConnection();
        
        try {
          
           
            String positionName = PositionName.getText();
            String salary = SalaryRate.getText();
            
            if(positionName.equals("") || salary.equals("")){
                
                   JOptionPane.showMessageDialog(null, "All fields are required");
                   return;
            }
            
            String sql = "INSERT INTO position (DepartmentId, PositionName, SalaryRate) VALUES (?, ?, ?)";
            int selectedIndex = Department.getSelectedIndex();
            if (selectedIndex == -1) {
                    JOptionPane.showMessageDialog(null, "Please select a department.");
                    return;
            }   
            int departmentId = departmentIds.get(selectedIndex);    
            pst = con.prepareStatement(sql);

            pst.setInt(1, departmentId);
            pst.setString(2, positionName);
            pst.setDouble(3, Double.parseDouble(salary));
           

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                
                 JOptionPane.showMessageDialog(null, "Employee attendance record successfully");
                 LoadPositionData() ;
                 Clear();
                
            }
        } catch (SQLException ex) {
            Clear();
            ex.printStackTrace();
        }
    }//GEN-LAST:event_AddActionPerformed

    //Get the selected row 
    private void PositionTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PositionTableMouseClicked
       GetSelectedRow();
    }//GEN-LAST:event_PositionTableMouseClicked
    
    //Update job position record
    private void updatePosition() {
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        String positionName = PositionName.getText();
        String salary = SalaryRate.getText();
            
            if(positionName.equals("") || salary.equals("")){
                
                   JOptionPane.showMessageDialog(null, "All fields are required");
                   return;
            }
        try {
            String sql = "UPDATE position " +
                         "SET DepartmentId = ?, PositionName = ?, SalaryRate = ? " +
                         "WHERE PositionId = ?";

            pst = con.prepareStatement(sql);

            int selectedIndex = Department.getSelectedIndex();
            if (selectedIndex == -1) {
                    JOptionPane.showMessageDialog(null, "Please select a department.");
                    return;
            }   
            int departmentId = departmentIds.get(selectedIndex);
            pst.setInt(1,departmentId ); 
            pst.setString(2, positionName);
            pst.setDouble(3, Double.parseDouble(salary));
            pst.setInt(4, id); 

            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Position updated successfully!");
                LoadPositionData();
                Clear();
            } else {
                JOptionPane.showMessageDialog(this, "No record found for that Position ID.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating position: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                // ignore
            }
        }
    }

    //Fetch all job positions
    private void LoadPositionData() {
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT p.PositionId, p.PositionName, p.SalaryRate, " +
                         "DATE_FORMAT(p.CreatedAt, '%m/%d/%y %l:%i %p') AS CreatedAt, " + // format datetime
                         "d.DepartmentName AS DeptName " +
                         "FROM position p " +
                         "INNER JOIN department d ON p.DepartmentId = d.DepartmentId";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) PositionTable.getModel();
            model.setRowCount(0); // Clear existing rows

            while (rs.next()) {
                Object[] row = new Object[5];
                row[0] = rs.getInt("PositionId");
                row[1] = rs.getString("DeptName");         // Department
                row[2] = rs.getString("PositionName");     // Job Position
                row[3] = rs.getDouble("SalaryRate");       // Salary
                row[4] = rs.getString("CreatedAt");        // Formatted date/time

                model.addRow(row);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading position data: " + e.getMessage());
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

    
    private final List<Integer> departmentIds =new ArrayList<>();
    //Fetch all departments
    private void loadDepartments() {
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        Department.removeAllItems();
        departmentIds.clear(); 

        try {
            String sql = "SELECT DepartmentId, DepartmentName FROM department";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                departmentIds.add(rs.getInt("DepartmentId")); // save ID
                Department.addItem(rs.getString("DepartmentName")); // show name
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading departments: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {}
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JComboBox<String> Department;
    private javax.swing.JTextField PositionName;
    private javax.swing.JTable PositionTable;
    private javax.swing.JTextField SalaryRate;
    private javax.swing.JButton Update;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
