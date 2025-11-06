
package SidebarContents;

import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Users extends javax.swing.JPanel {


    
    private int selectedRow;
    private int appUserId;
    public Users() {
        initComponents();
        LoadAllAppUsers();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Username = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Email = new javax.swing.JTextField();
        Password = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Contact = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        RoleCb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        SearchField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameActionPerformed(evt);
            }
        });
        Username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsernameKeyTyped(evt);
            }
        });

        jLabel1.setText("Contact:");

        jLabel2.setText("Username:");

        Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailActionPerformed(evt);
            }
        });
        Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                EmailKeyTyped(evt);
            }
        });

        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });
        Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PasswordKeyTyped(evt);
            }
        });

        jLabel3.setText("Password:");

        Contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactActionPerformed(evt);
            }
        });
        Contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ContactKeyTyped(evt);
            }
        });

        jLabel4.setText("Email:");

        jLabel5.setText("Name:");

        Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameActionPerformed(evt);
            }
        });
        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NameKeyTyped(evt);
            }
        });

        RoleCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "HR" }));

        jLabel6.setText("Role:");

        SearchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchFieldKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchFieldKeyTyped(evt);
            }
        });

        jLabel7.setText("Search:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SearchField)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addComponent(RoleCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addComponent(Contact, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Password, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                        .addComponent(Username)
                        .addComponent(jLabel2)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RoleCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Username", "Password", "Contact", "Gmail", "RoleName", "Created"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        UsersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UsersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(UsersTable);

        AddBtn.setText("Add");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Edit");
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ClearBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DeleteBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EditBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddBtn)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AddBtn)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ClearBtn)))
                .addContainerGap())
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

    
    //Add function
    private void InsertUser(){
        
        PreparedStatement pst = null;
        Connection con = DatabaseConnection.Database.getConnection();
        
        String name = Name.getText();
        String username = Username.getText();
        String contact = Contact.getText();
        String password = Password.getText();
        String email = Email.getText();
        String selectedRole = RoleCb.getSelectedItem().toString();
        String text =   Email.getText().trim().toLowerCase();
        
        
            if (!text.endsWith("@gmail.com")) {
                Email.setText("");  
                return;
            } else {
                Email.setBackground(Color.WHITE); 
            }
        if(name.isEmpty() || username.isEmpty() || contact.isEmpty() || password.isEmpty()|| email.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "All fields are required");
            ClearFields();
            return;
        }
        
        try {
          
           
            String sql = "INSERT INTO appusers (Name, Username, Contact, Password, email, RoleName) VALUES (?, ?, ?, ?, ?, ?)";           
            pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setString(2, username);
            pst.setString(3, contact);
            pst.setString(4, password);
            pst.setString(5, text);
            pst.setString(6, selectedRole);
             
            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                
                 JOptionPane.showMessageDialog(null, "User  added successfully successfully");
                 ClearFields();
                 LoadAllAppUsers();
                 
                
            }
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Name or username or email or contact are already exist please create new one");
            ClearFields();
            ex.printStackTrace();
        }
    }
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
        InsertUser();
    }//GEN-LAST:event_AddBtnActionPerformed
    
    
    
    //Clear all fields
    private void ClearFields(){
        
        Name.setText("");
        Username.setText("");
        Contact.setText("");
        Password.setText("");
        Email.setText("");
        selectedRow = -1;
        appUserId = 0;
    }
    
    
    //Get selected row
    private void GetSelectedRow() {
        selectedRow = UsersTable.getSelectedRow();
        if (selectedRow == -1) return;

        DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
        appUserId = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        Name.setText(model.getValueAt(selectedRow, 1).toString());
        Username.setText(model.getValueAt(selectedRow, 2).toString());
        Password.setText(model.getValueAt(selectedRow, 3).toString());
        Contact.setText(model.getValueAt(selectedRow, 4).toString());
        Email.setText(model.getValueAt(selectedRow, 5).toString());
        RoleCb.setSelectedItem(model.getValueAt(selectedRow, 6).toString()); // ✅ fixed index
    }
    
    //Load all users except admin record    
    private void LoadAllAppUsers(){
        
        
        Connection con = DatabaseConnection.Database.getConnection();

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {


        String sql = "SELECT UserId, Name, Username, Password, Contact, Email, RoleName, " +
                     "DATE_FORMAT(Created, '%m/%d/%y %l:%i %p') AS Created " +  // 🕐 12-hour format with AM/PM
                     "FROM appusers " +
                     "WHERE RoleName <> 'Admin'";

            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = new Object[8];
                row[0] = rs.getInt("UserId");
                row[1] = rs.getString("Name");
                row[2] = rs.getString("Username");
                row[3] = rs.getString("Password");
                row[4] = rs.getString("Contact");
                row[5] = rs.getString("email");
                row[6] = rs.getString("RoleName") != null ? rs.getString("RoleName") : "";
                row[7] = rs.getString("Created");
              

                model.addRow(row);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
            ClearFields();
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
    
    private void SearchUsers(String searchValue) {
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // SQL with LIKE for searching and excluding Admins
            String sql = "SELECT UserId, Name, Username, Password, Contact, Email, RoleName, " +
             "DATE_FORMAT(Created, '%m/%d/%y %l:%i %p') AS Created " +
             "FROM appusers " +
             "WHERE RoleName <> 'Admin' " +
             "AND (Name LIKE ? OR Username LIKE ? OR Email LIKE ?)";

            pst = con.prepareStatement(sql);
            String searchPattern = "%" + searchValue + "%";
            pst.setString(1, searchPattern);
            pst.setString(2, searchPattern);
            pst.setString(3, searchPattern);

            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) UsersTable.getModel();
            model.setRowCount(0); // Clear table first

            while (rs.next()) {
                Object[] row = new Object[8];
                row[0] = rs.getInt("UserId");
                row[1] = rs.getString("Name");
                row[2] = rs.getString("Username");
                row[3] = rs.getString("Password");
                row[4] = rs.getString("Contact");
                row[5] = rs.getString("Email");
                row[6] = rs.getString("RoleName") != null ? rs.getString("RoleName") : "";
                row[7] = rs.getString("Created");

                model.addRow(row);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error searching data: " + e.getMessage());
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

    private void UpdateUser(){
        
        PreparedStatement pst = null;
        Connection con = DatabaseConnection.Database.getConnection();
        
        String name = Name.getText();
        String username = Username.getText();
        String contact = Contact.getText();
        String password = Password.getText();
        String email = Email.getText();
        String selectedRole = RoleCb.getSelectedItem().toString();
        
        
        String text =   Email.getText().trim().toLowerCase();
        
        
            if (!text.endsWith("@gmail.com")) {
                Email.setText("");  
                return;
            } else {
                Email.setBackground(Color.WHITE); 
            }
        if(name.isEmpty() || username.isEmpty() || contact.isEmpty() || password.isEmpty()|| email.isEmpty()){
            
            JOptionPane.showMessageDialog(null, "All fields are required");
            ClearFields();
            return;
        }
        
        
        try {

                String sql = "UPDATE appusers SET Name=?, Username=?, Password=?, email=?, Contact=?, RoleName=? WHERE UserId=?";
                pst = con.prepareStatement(sql);

                pst.setString(1, name);
                pst.setString(2, username);
                pst.setString(3, password);
                pst.setString(4, text);
                pst.setString(5, contact);
                pst.setString(6, selectedRole);
              
                pst.setInt(7,appUserId );

                int rowsUpdated = pst.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(null, "Employee updated successfully!");
                    LoadAllAppUsers();  
                    ClearFields();     
                }

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error updating employee: " + e.getMessage());
                ClearFields();
            } finally {
                try {
                    if (pst != null) pst.close();
                    if (con != null) con.close();
                } catch (SQLException ex) {}
            }
    }
    
    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        
        UpdateUser();
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed

        if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete!");
                return;
            }

            String empId = UsersTable.getValueAt(selectedRow, 0).toString();

            int confirm = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to delete this employee?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection con = DatabaseConnection.Database.getConnection();
                     PreparedStatement pst = con.prepareStatement("DELETE FROM appusers WHERE UserId = ?")) {

                    pst.setString(1, empId);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "AppUser deleted successfully!");
                    LoadAllAppUsers(); 
                    ClearFields(); 

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error deleting record: " + e.getMessage());
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        ClearFields();
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameActionPerformed

    private void EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PasswordActionPerformed

    private void ContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactActionPerformed

    private void NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameActionPerformed

    private void UsersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UsersTableMouseClicked
        GetSelectedRow();
    }//GEN-LAST:event_UsersTableMouseClicked

    private void NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyTyped
        char c = evt.getKeyChar();

        // Allow letters, space, and period only
        if (!Character.isAlphabetic(c) && c != ' ' && c != '.') {
            evt.consume(); // Block any other character
        }

        // Limit the length to 30 characters
        if (Name.getText().length() >= 30) {
            evt.consume();
        }

    }//GEN-LAST:event_NameKeyTyped

    private void ContactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ContactKeyTyped
        char c = evt.getKeyChar();
       
        if(!Character.isDigit(c)){
            
            evt.consume();
        }
         if (Contact.getText().length() >= 11) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_ContactKeyTyped

    private void UsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsernameKeyTyped
        char c = evt.getKeyChar();
       
        if(!Character.isAlphabetic(c)){
            
            evt.consume();
        }
         if (Username.getText().length() >= 30) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_UsernameKeyTyped

    private void EmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EmailKeyTyped
        if (Email.getText().length() >= 40) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_EmailKeyTyped

    private void PasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordKeyTyped
        if (Password.getText().length() >= 20) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_PasswordKeyTyped

    private void SearchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyReleased
        String searchValue = SearchField.getText().trim();
        SearchUsers(searchValue);
    }//GEN-LAST:event_SearchFieldKeyReleased

    private void SearchFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchFieldKeyTyped
        if (SearchField.getText().length() >= 25) { 
                    evt.consume(); 
                }
    }//GEN-LAST:event_SearchFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JTextField Contact;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JTextField Email;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField Password;
    private javax.swing.JComboBox<String> RoleCb;
    private javax.swing.JTextField SearchField;
    private javax.swing.JTextField Username;
    private javax.swing.JTable UsersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
