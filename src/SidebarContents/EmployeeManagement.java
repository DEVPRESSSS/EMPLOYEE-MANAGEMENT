
package SidebarContents;

import Models.DepartmentModel;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
public class EmployeeManagement extends javax.swing.JPanel {

    private int selectedEmpId = -1;

    public EmployeeManagement() {
        initComponents();
        LoadData();
        EmployeeTable.getTableHeader().setReorderingAllowed(false);
        EmployeeTable.getTableHeader().setResizingAllowed(false);
        Clear();
        LoadDept();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        FirstName = new javax.swing.JTextField();
        MiddleName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        Contact = new javax.swing.JTextField();
        Gmail = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Department = new javax.swing.JComboBox<>();
        Status = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EmpId", "Firstname", "Middle", "Lastname", "Contact", "Address", "Dept", "Gender", "Status", "Created"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmployeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmployeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(EmployeeTable);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        FirstName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                FirstNameFocusGained(evt);
            }
        });
        FirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                FirstNameKeyTyped(evt);
            }
        });

        MiddleName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MiddleNameKeyTyped(evt);
            }
        });

        LastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                LastNameKeyTyped(evt);
            }
        });

        Gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        Contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContactKeyTyped(evt);
            }
        });

        Gmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                GmailKeyTyped(evt);
            }
        });

        Address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AddressKeyTyped(evt);
            }
        });

        Department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Accounting Department", "IT Department", "Others" }));
        Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentActionPerformed(evt);
            }
        });

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive", "Resigned", "Terminated", " " }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Firstname:");

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Middle Name:");

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Lastname:");

        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Contact:");

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Status:");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Department:");

        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Gmail:");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Address:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(FirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                            .addComponent(Status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Department, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(AddBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(UpdateBtn))
                                            .addComponent(Address))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Gmail, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(DeleteBtn)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(ClearBtn))))))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Gmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepartmentActionPerformed

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void FirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstNameFocusGained


    }//GEN-LAST:event_FirstNameFocusGained

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        Insert();
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMouseClicked
        // TODO add your handling code here:
        DisplaySelectedRow();
    }//GEN-LAST:event_EmployeeTableMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        // TODO add your handling code here:
        Clear();
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
            // TODO add your handling code here:
            UpdateEmployee();
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
        Delete();
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void FirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
       
        if(!Character.isAlphabetic(c)){
            
            evt.consume();
        }
         if (FirstName.getText().length() >= 25) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_FirstNameKeyTyped

    private void MiddleNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MiddleNameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
       
        if(!Character.isAlphabetic(c)){
            
            evt.consume();
        }
         if (MiddleName.getText().length() >= 25) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_MiddleNameKeyTyped

    private void LastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LastNameKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
       
        if(!Character.isAlphabetic(c)){
            
            evt.consume();
        }
         if (LastName.getText().length() >= 25) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_LastNameKeyTyped

    private void ContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContactKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
       
        if(!Character.isDigit(c)){
            
            evt.consume();
        }
         if (Contact.getText().length() >= 11) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_ContactKeyTyped

    private void AddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AddressKeyTyped
        // TODO add your handling code here:
          if (Address.getText().length() >= 11) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_AddressKeyTyped

    private void GmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_GmailKeyTyped
        // TODO add your handling code here:
          if (Gmail.getText().length() >= 40) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_GmailKeyTyped
    
    //Delete function
    private void Delete() {
        int selectedRow = EmployeeTable.getSelectedRow();

        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Please select a row to delete!");
            return;
        }

        String empId = EmployeeTable.getValueAt(selectedRow, 0).toString();

        int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to delete this employee?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            try (Connection con = DatabaseConnection.Database.getConnection();
                 PreparedStatement pst = con.prepareStatement("DELETE FROM employee WHERE EmpId = ?")) {

                pst.setString(1, empId);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Employee deleted successfully!");
                LoadData(); 
                Clear(); 

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error deleting record: " + e.getMessage());
            }
        }
    }

    
    //Display the selected record in the elements
    private void DisplaySelectedRow(){
        int selectedRow = EmployeeTable.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
        FirstName.setText(model.getValueAt(selectedRow, 1).toString());
        MiddleName.setText(model.getValueAt(selectedRow, 2).toString());
        LastName.setText(model.getValueAt(selectedRow, 3).toString());
        Contact.setText(model.getValueAt(selectedRow, 4).toString());
        Gmail.setText(model.getValueAt(selectedRow, 5).toString());
        Address.setText(model.getValueAt(selectedRow, 6).toString());
        Department.setSelectedItem(model.getValueAt(selectedRow, 7).toString());
        Gender.setSelectedItem(model.getValueAt(selectedRow, 8).toString());
        Status.setSelectedItem(model.getValueAt(selectedRow, 9).toString());
        selectedEmpId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

    }
    
    //Update employee function
    private void UpdateEmployee() {
        
            if (selectedEmpId == -1) {
                JOptionPane.showMessageDialog(null, "Please select a record to update.");
                return;
            }


            if (FirstName.getText().trim().isEmpty() || LastName.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all required fields.");
                return;
            }

            Connection con = DatabaseConnection.Database.getConnection();
            PreparedStatement pst = null;

            try {

                String sql = "UPDATE employee SET FirstName=?, MiddleName=?, LastName=?, Contact=?, Gmail=?, Address=?, DepartmentId=?, Gender=?, Status=? WHERE EmpId=?";
                pst = con.prepareStatement(sql);

                pst.setString(1, FirstName.getText().trim());
                pst.setString(2, MiddleName.getText().trim());
                pst.setString(3, LastName.getText().trim());
                pst.setString(4, Contact.getText().trim());
                pst.setString(5, Gmail.getText().trim());
                pst.setString(6, Address.getText().trim());
                pst.setString(7, Department.getSelectedItem().toString());
                pst.setString(8, Gender.getSelectedItem().toString());
                pst.setString(9, Status.getSelectedItem().toString());
                pst.setInt(10, selectedEmpId);

                int rowsUpdated = pst.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Employee updated successfully!");
                    LoadData();  
                    Clear();     
                    selectedEmpId = -1; 
                }

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error updating employee: " + e.getMessage());
            } finally {
                try {
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {}
            }
    }

    //Insert function 
    private void Insert() {
        PreparedStatement pst = null;
        Connection con = DatabaseConnection.Database.getConnection();

        try {

            if (FirstName.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter First Name.");
            FirstName.requestFocus();
            return;
            }
            if (MiddleName.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Middle Name.");
                MiddleName.requestFocus();
                return;
            }
            if (LastName.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Last Name.");
                LastName.requestFocus();
                return;
            }
            if (Contact.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Contact Number.");
                Contact.requestFocus();
                return;
            }
            if (Gmail.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Gmail.");
                Gmail.requestFocus();
                return;
            }
            if (Address.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter Address.");
                Address.requestFocus();
                return;
            }

            if (Department.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Please select a Department.");
                Department.requestFocus();
                return;
            }
            if (Gender.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Please select Gender.");
                Gender.requestFocus();
                return;
            }
            if (Status.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(null, "Please select Status.");
                Status.requestFocus();
                return;
            }

            String sql = "INSERT INTO employee (FirstName, MiddleName, LastName, Contact, Gmail, Address, DepartmentId, Gender, Status, Created) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

            pst = con.prepareStatement(sql);

            // Set values from your text fields and combo boxes
            pst.setString(1, FirstName.getText());
            pst.setString(2, MiddleName.getText());
            pst.setString(3, LastName.getText());
            pst.setString(4, Contact.getText());
            pst.setString(5, Gmail.getText());
            pst.setString(6, Address.getText());
            pst.setString(7, Department.getSelectedItem().toString());
            pst.setString(8, Gender.getSelectedItem().toString());
            pst.setString(9, Status.getSelectedItem().toString());

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(null, "Employee added successfully!");
                LoadData();
                Clear(); 
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error inserting employee: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (Exception ex) {
            }
        }
    }

    
    private void Clear(){
        
        FirstName.setText("");
        MiddleName.setText("");
        LastName.setText("");
        Contact.setText("");
        Gmail.setText("");
        Address.setText("");
        Department.setSelectedIndex(-1);
        Gender.setSelectedIndex(-1);
        Status.setSelectedIndex(-1);
        
    }
    
    private void LoadData() {
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {


            String sql = "SELECT EmpId, FirstName, MiddleName, LastName, Contact, Gmail, Address, DepartmentId, Gender, Status, Created FROM employee";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = new Object[11];
                row[0] = rs.getInt("EmpId");
                row[1] = rs.getString("FirstName");
                row[2] = rs.getString("MiddleName");
                row[3] = rs.getString("LastName");
                row[4] = rs.getString("Contact");
                row[5] = rs.getString("Gmail");
                row[6] = rs.getString("Address");
                row[7] = rs.getString("DepartmentId");
                row[8] = rs.getString("Gender");
                row[9] = rs.getString("Status");
                row[10] = rs.getTimestamp("Created");

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

   
    
    private void LoadDept() {
          Department.removeAllItems(); // clear combo box

          for (DepartmentModel dpt : DepartmentModel.getDepartments()) {
              Department.addItem(dpt.getName()); // add only the name (String)
          }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField Address;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField Contact;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JComboBox<String> Department;
    private javax.swing.JTable EmployeeTable;
    private javax.swing.JTextField FirstName;
    private javax.swing.JComboBox<String> Gender;
    private javax.swing.JTextField Gmail;
    private javax.swing.JTextField LastName;
    private javax.swing.JTextField MiddleName;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
