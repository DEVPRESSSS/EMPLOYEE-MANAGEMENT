
package SidebarContents;
import java.math.BigDecimal;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
public class Salary extends javax.swing.JPanel {

  
    public Salary() {
        initComponents();
        LoadData();
        SearchEmployee.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Search(SearchEmployee.getText()); // runs when user types
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
//                Search(SearchEmployee.getText()); // runs when user deletes text
                  EmployeeName.setText("");
                  Deductions.setText("");
                  SalaryMonth.setText("");
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // rarely triggered for JTextField (used for styled text)
            }
        });
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        SearchSalary = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SalaryMonth = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        SearchEmployee = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EmployeeName = new javax.swing.JLabel();
        Deductions = new javax.swing.JLabel();
        Overpay = new javax.swing.JLabel();
        BaseSalary = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SalaryTable = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SearchSalary.setText("Search salary here...");

        jLabel1.setText("Base salary:");

        jLabel2.setText("Overtime Amount:");

        jLabel3.setText("Salary/This Month:");

        jLabel4.setText("Deductions Amount:");

        SearchEmployee.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                SearchEmployeeInputMethodTextChanged(evt);
            }
        });

        jLabel5.setText("Search employee:");

        jLabel6.setText("Employee Name:");

        EmployeeName.setForeground(new java.awt.Color(0, 102, 0));

        Deductions.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(270, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(SearchEmployee)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                    .addComponent(EmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Deductions, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BaseSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(SearchSalary, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SalaryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Overpay, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deductions, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BaseSalary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SalaryMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmployeeName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Overpay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SearchSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        SalaryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "SalaryId", "Fullname", "Base salary", "Overtime Pay", "Deductions", "Net salary", "Date Issued"
            }
        ));
        SalaryTable.setEnabled(false);
        jScrollPane1.setViewportView(SalaryTable);

        AddBtn.setText("Generate");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        EditBtn.setText("Edit");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 738, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(EditBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddBtn)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddBtn)
                    .addComponent(EditBtn))
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

    private void SearchEmployeeInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_SearchEmployeeInputMethodTextChanged
        
        System.out.print("HEY");
    }//GEN-LAST:event_SearchEmployeeInputMethodTextChanged

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
       
        GenerateSalary();
    }//GEN-LAST:event_AddBtnActionPerformed
    
    //Generate all the salary
    private void GenerateSalary(){
        
           
        try {
            String input = Overpay.getText();
            String inputDeduction = Deductions.getText();
            String inputSalaryMonth = SalaryMonth.getText();
            String inputBaseSalary = BaseSalary.getText();
            
            double overpayValue =0;
            double deductionValue =0;
            double salaryMonthValue =0;
            double baseSalaryValue = 0;
            
            if(!input.isEmpty() && !inputDeduction.isEmpty() && !inputSalaryMonth.isEmpty() && !inputBaseSalary.isEmpty()){
                input = input.replace("₱","").trim();
                inputDeduction= inputDeduction.replace("₱","").trim();
                inputSalaryMonth= inputSalaryMonth.replace("₱","").trim();
                inputBaseSalary= inputBaseSalary.replace("₱","").trim();
                
                overpayValue= Double.parseDouble(input);
                deductionValue = Double.parseDouble(inputDeduction);
                salaryMonthValue = Double.parseDouble(inputSalaryMonth);
                baseSalaryValue = Double.parseDouble(inputBaseSalary);
            }
            
            PreparedStatement pst = null;
            Connection con = DatabaseConnection.Database.getConnection();
            String sql = "INSERT INTO salaries (EmpId, BaseSalary, OvertimePay, Deductions, SalaryMonth, DateIssued) " +
                    "VALUES (?, ?, ?, ?, ?, NOW())";
            
         
            pst = con.prepareStatement(sql);

            pst.setInt(1, 20);
            pst.setDouble(2,baseSalaryValue);
            pst.setDouble(3, overpayValue);
            pst.setDouble(4, deductionValue);
            pst.setDouble(5, salaryMonthValue);
           

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                
                 JOptionPane.showMessageDialog(null, "Generate salary successfully!");
                 LoadData();
                // Clear(); 
            }
        } catch (SQLException ex) {
            Logger.getLogger(Salary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Search employee
    private void Search(String keyword) {
        String query = "SELECT e.EmpId, p.SalaryRate, CONCAT(e.FirstName, ' ', e.MiddleName, ' ', e.LastName) AS FullName, a.Overtime, "
                     + "SUM(CASE WHEN a.Status = 'Absent' THEN 1 ELSE 0 END) AS TotalAbsent "
                     + "FROM employee e "
                     + "LEFT JOIN attendance a ON e.EmpId = a.EmpId "
                     + "LEFT JOIN position p ON e.PositionId = p.PositionId "
                     + "WHERE e.EmpId LIKE ? OR CONCAT(e.FirstName, ' ', e.MiddleName, ' ', e.LastName) LIKE ? "
                     + "GROUP BY e.EmpId, FullName";

        try (Connection con = DatabaseConnection.Database.getConnection();
             PreparedStatement pst = con.prepareStatement(query)) {

            pst.setString(1, "%" + keyword + "%");
            pst.setString(2, "%" + keyword + "%");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String fullName = rs.getString("FullName");
                int totalAbsent = rs.getInt("TotalAbsent");
                int totalOvertime = rs.getInt("Overtime");
                double salaryRate = rs.getDouble("SalaryRate");
                double deduction = totalAbsent * 695.0;
                double overtimePay = totalOvertime * 135.0;

                EmployeeName.setText(fullName);
                Deductions.setText(String.format("₱%.2f", deduction));
                Overpay.setText(String.format("₱%.2f",overtimePay));
                BaseSalary.setText(String.format("₱%.2f",salaryRate));
                
                double totalSalary = salaryRate - deduction + overtimePay;               
                SalaryMonth.setText(String.format("₱%.2f",totalSalary));
            } else {
                EmployeeName.setText("");
                Deductions.setText("₱0.00");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        }
    }


    //Load all the data
    private void LoadData() {
        Connection con = DatabaseConnection.Database.getConnection();

        PreparedStatement pst = null;
        ResultSet rs = null;

        try {


            String sql = "SELECT s.SalaryID, Concat(e.Firstname, '', e.MiddleName, '',e.LastName, '') as FullName, "
                    + "s.BaseSalary, s.OvertimePay, s.Deductions, s.NetSalary, s.DateIssued FROM salaries s "
                    + "INNER JOIN employee e ON s.EmpId = e.EmpId";
            
          
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            DefaultTableModel model = (DefaultTableModel) SalaryTable.getModel();
            model.setRowCount(0); 

            while (rs.next()) {
                Object[] row = new Object[7];
                row[0] = rs.getInt("SalaryID");
                row[1] = rs.getString("FullName");
                row[2] = rs.getString("BaseSalary");
                row[3] = rs.getString("OvertimePay");
                row[4] = rs.getString("Deductions");
                row[5] = rs.getString("NetSalary");
                row[6] = rs.getString("DateIssued");
              

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
    private javax.swing.JLabel BaseSalary;
    private javax.swing.JLabel Deductions;
    private javax.swing.JButton EditBtn;
    private javax.swing.JLabel EmployeeName;
    private javax.swing.JLabel Overpay;
    private javax.swing.JTextField SalaryMonth;
    private javax.swing.JTable SalaryTable;
    private javax.swing.JTextField SearchEmployee;
    private javax.swing.JTextField SearchSalary;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
