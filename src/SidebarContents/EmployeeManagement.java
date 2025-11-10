
package SidebarContents;

import java.awt.Color;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
public class EmployeeManagement extends javax.swing.JPanel {

    private int selectedEmpId = -1;

    public EmployeeManagement() {
        initComponents();
        LoadData();
        EmployeeTable.getTableHeader().setReorderingAllowed(false);
        EmployeeTable.getTableHeader().setResizingAllowed(false);
        Clear();
        loadDepartments(); 
        LoadPositions();
        
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

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmployeeTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        FirstName = new javax.swing.JTextField();
        MiddleName = new javax.swing.JTextField();
        LastName = new javax.swing.JTextField();
        Gender = new javax.swing.JComboBox<>();
        Contact = new javax.swing.JTextField();
        Gmail = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        Department = new javax.swing.JComboBox<>();
        Position = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Status = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        EmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "EmpId", "Firstname", "Middle", "Lastname", "Contact", "Gmail", "Address", "Dept", "Position", "Gender", "Status", "Days", "Created"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false, false, false, false, true, true
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ClearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UpdateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddBtn)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(ClearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepartmentActionPerformed(evt);
            }
        });

        Position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PositionActionPerformed(evt);
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

        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Gender:");

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive", "Resigned", "Terminated", " " }));
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatusActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Job position:");

        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchFieldKeyTyped(evt);
            }
        });

        jLabel11.setText("Search:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LastName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(206, 206, 206)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(Department, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Gmail, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(386, 386, 386)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Position, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SearchField))))
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
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
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
                .addGap(12, 12, 12)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void PositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PositionActionPerformed

    private void FirstNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_FirstNameFocusGained


    }//GEN-LAST:event_FirstNameFocusGained

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
        Insert();
    }//GEN-LAST:event_AddBtnActionPerformed

    private void EmployeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmployeeTableMouseClicked
        DisplaySelectedRow();
    }//GEN-LAST:event_EmployeeTableMouseClicked

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        Clear();
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
            UpdateEmployee();
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        Delete();
        
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void FirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FirstNameKeyTyped
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
          if (Gmail.getText().length() >= 40) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_GmailKeyTyped

    private void StatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StatusActionPerformed

    private void SearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyTyped
        if (SearchField.getText().length() >= 25) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_SearchFieldKeyTyped
    
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
        Position.setSelectedItem(model.getValueAt(selectedRow, 8).toString());
        Gender.setSelectedItem(model.getValueAt(selectedRow, 9).toString());
        Status.setSelectedItem(model.getValueAt(selectedRow, 10).toString());
        selectedEmpId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());

    }
    
    //Update employee function
    private void UpdateEmployee() {
        
        
            int selectedIndex = Department.getSelectedIndex();
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(null, "Please select a department.");
                return;
            }
            int departmentId = departmentIds.get(selectedIndex);

            int positionIds = positionId.get(selectedIndex);
            int selectedPositionIndex = Position.getSelectedIndex();
            if (selectedPositionIndex == -1) {
                JOptionPane.showMessageDialog(null, "Please select a position.");
                return;
            }
                
            int jobPositionId = positionId.get(selectedPositionIndex);
            
            if (selectedEmpId == -1) {
                JOptionPane.showMessageDialog(null, "Please select a record to update.");
                return;
            }


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
            
            String text = Gmail.getText().trim().toLowerCase();
            if (!text.endsWith("@gmail.com")) {
                Gmail.setText("");  
                return;
            } else {
                Gmail.setBackground(Color.WHITE); // valid
            }
            
            Connection con = DatabaseConnection.Database.getConnection();
            PreparedStatement pst = null;

            try {

                String sql = "UPDATE employee SET FirstName=?, MiddleName=?, LastName=?, Contact=?, Gmail=?, Address=?, DepartmentId=?, PositionId= ?, Gender=?, Status=? WHERE EmpId=?";
                pst = con.prepareStatement(sql);

                pst.setString(1, FirstName.getText().trim());
                pst.setString(2, MiddleName.getText().trim());
                pst.setString(3, LastName.getText().trim());
                pst.setString(4, Contact.getText().trim());
                pst.setString(5, text);
                pst.setString(6, Address.getText().trim());
                pst.setInt(7, departmentId);
                pst.setInt(8, jobPositionId);
                pst.setString(9, Gender.getSelectedItem().toString());
                pst.setString(10, Status.getSelectedItem().toString());
                pst.setInt(11, selectedEmpId);

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
    //Insert function 
private void Insert() {
    PreparedStatement pst = null;
    Connection con = DatabaseConnection.Database.getConnection();

    int selectedDeptIndex = Department.getSelectedIndex();
    int selectedPosIndex = Position.getSelectedIndex();

    if (selectedDeptIndex == -1) {
        JOptionPane.showMessageDialog(null, "Please select a department.");
        return;
    }
    if (selectedPosIndex == -1) {
        JOptionPane.showMessageDialog(null, "Please select a position.");
        return;
    }

    int departmentId = departmentIds.get(selectedDeptIndex);
    int positionID = positionId.get(selectedPosIndex); // ✅ Get position properly

    try {
        // Validation...
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

        String text = Gmail.getText().trim().toLowerCase();
        if (!text.endsWith("@gmail.com")) {
            JOptionPane.showMessageDialog(null, "Invalid Gmail format.");
            Gmail.requestFocus();
            return;
        }

        String sql = "INSERT INTO employee (FirstName, MiddleName, LastName, Contact, Gmail, Address, DepartmentId, PositionId, Gender, Status, Created) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, NOW())";

        pst = con.prepareStatement(sql);
        pst.setString(1, FirstName.getText());
        pst.setString(2, MiddleName.getText());
        pst.setString(3, LastName.getText());
        pst.setString(4, Contact.getText());
        pst.setString(5, text);
        pst.setString(6, Address.getText());
        pst.setInt(7, departmentId);
        pst.setInt(8, positionID); // ✅ use actual position from combobox
        pst.setString(9, Gender.getSelectedItem().toString());
        pst.setString(10, Status.getSelectedItem().toString());

        int rowsInserted = pst.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Employee added successfully!");
            LoadData();
            Clear(); 
        }

    } catch (HeadlessException | SQLException e) {
        JOptionPane.showMessageDialog(null, "Error inserting employee: " + e.getMessage());
    } finally {
        try {
            if (pst != null) pst.close();
            if (con != null) con.close();
        } catch (SQLException ex) {}
    }
}

    //Clear all fields
    private void Clear(){
        
        FirstName.setText("");
        MiddleName.setText("");
        LastName.setText("");
        Contact.setText("");
        Gmail.setText("");
        Address.setText("");
        Department.setSelectedIndex(-1);
        Gender.setSelectedIndex(-1);
        Position.setSelectedIndex(-1);
        
    }
    
    private final List<Integer> departmentIds =new ArrayList<>();

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

    //Load all items in the list
    private void LoadData() {
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {


            String sql = "SELECT e.EmpId, e.FirstName, e.MiddleName, e.LastName, e.Contact, e.Gmail, e.Address, " +
             "d.DepartmentName AS DeptName, p.PositionName AS Name, e.Gender, e.Status, " +
             "DATE_FORMAT(e.Created, '%m/%d/%y %l:%i %p') AS Created, e.Days " +
             "FROM employee e " +
             "INNER JOIN department d ON e.DepartmentId = d.DepartmentId " +
             "INNER JOIN position p ON e.PositionId = p.PositionId";
             
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = new Object[14];
                row[0] = rs.getInt("EmpId");
                row[1] = rs.getString("FirstName");
                row[2] = rs.getString("MiddleName");
                row[3] = rs.getString("LastName");
                row[4] = rs.getString("Contact");
                row[5] = rs.getString("Gmail");
                row[6] = rs.getString("Address");
                row[7] = rs.getString("DeptName");
                row[8] = rs.getString("Name");
                row[9] = rs.getString("Gender");
                row[10] = rs.getString("Status");
                row[11] = rs.getString("Days");
                row[12] = rs.getString("Created");

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

   
    //Fetch positions
    private final List<Integer> positionId =new ArrayList<>();
    private void LoadPositions(){
        
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        Position.removeAllItems();
        positionId.clear(); 

        try {
            String sql = "SELECT PositionId, PositionName FROM position";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            while (rs.next()) {
                positionId.add(rs.getInt("PositionId")); 
                Position.addItem(rs.getString("PositionName"));
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

    
     private void searchEmployee() {
        String keyword = SearchField.getText().trim();
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            String sql = "SELECT e.EmpId, e.FirstName, e.MiddleName, e.LastName, " +
             "e.Contact, e.Gmail, e.Address, " +
             "d.DepartmentName AS DeptName, " +
             "p.PositionName AS Name, " +
             "e.Gender, e.Status, DATE_FORMAT(e.Created, '%m/%d/%y %l:%i %p') AS Created, e.Days " +
             "FROM employee e " +
             "INNER JOIN department d ON e.DepartmentId = d.DepartmentId " +
             "INNER JOIN position p ON e.PositionId = p.PositionId " +
             "WHERE CONCAT(e.FirstName, ' ', e.MiddleName, ' ', e.LastName) LIKE ?";

            pst = con.prepareStatement(sql);
            pst.setString(1, "%" + keyword + "%"); 
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) EmployeeTable.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = new Object[14];
                row[0] = rs.getInt("EmpId");
                row[1] = rs.getString("FirstName");
                row[2] = rs.getString("MiddleName");
                row[3] = rs.getString("LastName");
                row[4] = rs.getString("Contact");
                row[5] = rs.getString("Gmail");
                row[6] = rs.getString("Address");
                row[7] = rs.getString("DeptName");
                row[8] = rs.getString("Name");
                row[9] = rs.getString("Gender");
                row[10] = rs.getString("Status");
                row[11] = rs.getString("Days");
                row[12] = rs.getString("Created");
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
    private javax.swing.JComboBox<String> Position;
    private javax.swing.JTextField SearchField;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
