
package SidebarContents;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Benefits extends javax.swing.JPanel {

    private int selectedRow;
    private int benefitsId;
    public Benefits() {
        initComponents();
         FetchAllDeductions();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Amount = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BenefitsTbl = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        DeleteBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                AmountKeyTyped(evt);
            }
        });

        Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NameKeyTyped(evt);
            }
        });

        jLabel1.setText("Amount:");

        jLabel2.setText("Name:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(531, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        BenefitsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Id", "Benefits", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        BenefitsTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BenefitsTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(BenefitsTbl);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ClearBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DeleteBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UpdateBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AddBtn)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteBtn)
                    .addComponent(AddBtn)
                    .addComponent(UpdateBtn)
                    .addComponent(ClearBtn))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        Add();
    }//GEN-LAST:event_AddBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        Update();
    }//GEN-LAST:event_UpdateBtnActionPerformed

    
    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
       Delete();
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BenefitsTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BenefitsTblMouseClicked
        GetSelectedRow();
    }//GEN-LAST:event_BenefitsTblMouseClicked

    private void NameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NameKeyTyped
        char c = evt.getKeyChar();
       
        if(!Character.isAlphabetic(c)){
            
            evt.consume();
        }
         if (Name.getText().length() >= 15) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_NameKeyTyped

    private void AmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AmountKeyTyped
         char c = evt.getKeyChar();
       
        if(!Character.isDigit(c)){
            
            evt.consume();
        }
         if (Amount.getText().length() >= 4) { 
            evt.consume(); 
        }
    }//GEN-LAST:event_AmountKeyTyped

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        Clear();
    }//GEN-LAST:event_ClearBtnActionPerformed

   //Delete     
    private void Delete(){
        
             if (selectedRow == -1) {
                JOptionPane.showMessageDialog(this, "Please select a row to delete!");
                return;
            }


            int confirm = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to delete this deductions?",
                    "Confirm Delete",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                try (Connection con = DatabaseConnection.Database.getConnection();
                     PreparedStatement pst = con.prepareStatement("DELETE FROM benefits WHERE Id = ?")) {

                    pst.setInt(1, benefitsId);
                    pst.executeUpdate();

                    JOptionPane.showMessageDialog(this, "Deduction deleted successfully!");
                    FetchAllDeductions();
                    Clear(); 

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Error deleting record: " + e.getMessage());
            }
        }
    }
    //Add benefits
    private void Add(){
        String name = Name.getText();
     
        Connection con = DatabaseConnection.Database.getConnection();
        
        if(name.equals("") || Amount.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "All fields are required");
                Clear();
                return;
        }
        
        Double amount = Double.parseDouble(Amount.getText());
        PreparedStatement pst = null;
        try {
          
        
            if(amount <=0){

                JOptionPane.showMessageDialog(null, "Amount of benefits cant be zero");
                Clear();
                return;
            }
           
            String sql = "INSERT INTO benefits (Name,Amount) VALUES (?, ?)";           
            pst = con.prepareStatement(sql);

            pst.setString(1, name);
            pst.setDouble(2, amount);
           

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                
                 JOptionPane.showMessageDialog(null, "Benefits added successfully");
                 FetchAllDeductions();
                 Clear();
                
            }
        } catch (SQLException ex) {
            
                JOptionPane.showMessageDialog(null, "Benefits name are already taken");
                Clear();
        }
    }
    //Clear fields
    private void Clear(){
        
        Name.setText("");
        Amount.setText("");
        selectedRow = -1;
    }

    //Update row
    private void Update(){
        
        
        if(selectedRow == -1){
            
             JOptionPane.showMessageDialog(null, "Please select a row");
             return;
        }
        
        
        
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        String name = Name.getText();
            
        if(name.equals("") || Amount.getText().equals("")){
                
            JOptionPane.showMessageDialog(null, "All fields are required");
            Clear();
            return;
        }
        Double amount = Double.parseDouble( Amount.getText());

        
        if(amount <=0){
            
            JOptionPane.showMessageDialog(null, "Amount of deductions cant be zero");
            Clear();
            return;
        }
        
        
        try {
            String sql = "UPDATE benefits " +
                         "SET Name = ?, Amount = ?" +
                         "WHERE Id = ?";

            pst = con.prepareStatement(sql);

            pst.setString(1,name ); 
            pst.setDouble(2, amount);
            pst.setInt(3, benefitsId); 

            int rowsUpdated = pst.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Deduction updated successfully!");
                FetchAllDeductions();
                Clear();
            } else {
                JOptionPane.showMessageDialog(this, "No record found for that Deduction ID.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating position: " + e.getMessage());
            Clear();
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                // ignore
            }
        }
        
        
    }
    
    //Get the selected row
    private void GetSelectedRow(){
        
        selectedRow = BenefitsTbl.getSelectedRow();
        
        
        if (selectedRow != -1) { 
            benefitsId = Integer.parseInt(BenefitsTbl.getValueAt(selectedRow, 0).toString());
            Name.setText(BenefitsTbl.getValueAt(selectedRow, 1).toString());
            Amount.setText(BenefitsTbl.getValueAt(selectedRow, 2).toString());
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row first.");
        }
    }
    
    //Fetch deductions
    private void FetchAllDeductions(){
        
        Connection con = DatabaseConnection.Database.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {


         String sql = "SELECT Id, Name, Amount from benefits";
             
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) BenefitsTbl.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = new Object[9];
                row[0] = rs.getInt("Id");
                row[1] = rs.getString("Name");
                row[2] = rs.getString("Amount");
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
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField Amount;
    private javax.swing.JTable BenefitsTbl;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField Name;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
