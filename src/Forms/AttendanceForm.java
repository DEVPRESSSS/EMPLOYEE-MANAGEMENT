
package Forms;

import SidebarContents.Attendance;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;


public class AttendanceForm extends javax.swing.JFrame {

    private int _empId;
    private String _state;
    private Attendance _form;
    public AttendanceForm(Attendance form, int empId,String state ) {
        initComponents();
        this._empId = empId;
        this._form = form;
        this._state= state;
       

        
        if (_state.equals("Present") || _state.equals("Late")) {
             Status.setVisible(false); 
             TimeInBtn.setVisible(false);
             StatusLbl.setVisible(false);
            
        }else{
            
            TimeInBtn.setVisible(false);
            TimeOutBtn.setVisible(false);
        }
        

        
        SelectedStatus();
        
        
        Status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedStatus();
            }
        });
        

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Status = new javax.swing.JComboBox<>();
        StatusLbl = new javax.swing.JLabel();
        TimeOutBtn = new javax.swing.JButton();
        TimeInBtn = new javax.swing.JButton();
        AbsentBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Present", "Absent", "Late", " " }));

        StatusLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        StatusLbl.setText("Status:");

        TimeOutBtn.setText("TIME OUT");
        TimeOutBtn.setEnabled(false);
        TimeOutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeOutBtnActionPerformed(evt);
            }
        });

        TimeInBtn.setText("TIME IN");
        TimeInBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeInBtnActionPerformed(evt);
            }
        });

        AbsentBtn.setText("MARK AS ABSENT");
        AbsentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Status, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TimeOutBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(TimeInBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AbsentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(19, 19, 19)
                .addComponent(StatusLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(TimeInBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TimeOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(AbsentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TimeInBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeInBtnActionPerformed
        
        
        PreparedStatement pst = null;
        Connection con = DatabaseConnection.Database.getConnection();
        
        try {
          
           
            String sql = "INSERT INTO attendance (EmpId, Date, TimeIn, Status) VALUES (?, ?, ?, ?)";

            
            
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();

            java.sql.Date sqlDate = java.sql.Date.valueOf(currentDate);

            java.sql.Time sqlTime = java.sql.Time.valueOf(currentTime);            
            pst = con.prepareStatement(sql);

            pst.setInt(1, _empId);
            pst.setDate(2, sqlDate);
            pst.setTime(3, sqlTime);
            pst.setString(4, Status.getSelectedItem().toString());
           

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                
                 JOptionPane.showMessageDialog(null, "Employee attendance record successfully");
                 _form.FetchAllEmployee();
                 
                 this.dispose();
                
            }
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
    }//GEN-LAST:event_TimeInBtnActionPerformed

    private void TimeOutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeOutBtnActionPerformed
        
        
  
        SingleTimeOut(_empId);

    }//GEN-LAST:event_TimeOutBtnActionPerformed

    private void AbsentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsentBtnActionPerformed
        
        MarkAsAbsent(_empId);
    }//GEN-LAST:event_AbsentBtnActionPerformed

    private void SelectedStatus(){
        
        int statusInput = Status.getSelectedIndex();
        if(statusInput == 0 || statusInput == 2){
            
            TimeInBtn.setEnabled(true);
            TimeOutBtn.setEnabled(true);
            AbsentBtn.setEnabled(false);
        }else{
             TimeInBtn.setEnabled(false);
             TimeOutBtn.setEnabled(false);
             AbsentBtn.setEnabled(true);
        }
    }
    
    //Mark as absent button
    private void MarkAsAbsent(int empId){
        
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Do you want to mark as absent this employee?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        PreparedStatement pst = null;
        Connection con = DatabaseConnection.Database.getConnection();
        
        try {
          
           
            String sql = "INSERT INTO attendance (EmpId, Date, TimeIn, Status) VALUES (?, ?, ?, ?)";

            
            
            LocalDate currentDate = LocalDate.now();
            LocalTime currentTime = LocalTime.now();

            java.sql.Date sqlDate = java.sql.Date.valueOf(currentDate);

            java.sql.Time sqlTime = java.sql.Time.valueOf(currentTime);            
            pst = con.prepareStatement(sql);

            pst.setInt(1, _empId);
            pst.setDate(2, sqlDate);
            pst.setTime(3, sqlTime);
            pst.setString(4, "Absent");

            int rowsInserted = pst.executeUpdate();
            if (rowsInserted > 0) {
                
                 JOptionPane.showMessageDialog(null, "Employee attendance record successfully");
                 _form.FetchAllEmployee();
                 
                 this.dispose();
                
            }
        } catch (SQLException ex) {
            
            ex.printStackTrace();
        }
        
        
    }
    
    
    //Single time out
    private void SingleTimeOut(int empId) {
        int confirm = JOptionPane.showConfirmDialog(
                this,
                "Do you want to time out this employee?",
                "Confirm Time Out",
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
            String checkSql = "SELECT AttendanceId FROM attendance " +
                  "WHERE EmpId = ? " +
                  "AND DATE(Date) = CURDATE() " +
                  "AND Status IN ('Present', 'Late') " +
                  "AND (TimeOut IS NULL OR TimeOut = '')";

            pst = con.prepareStatement(checkSql);
            pst.setInt(1, empId);
            rs = pst.executeQuery();

            if (!rs.next()) {
                JOptionPane.showMessageDialog(this, "This employee has already timed out or has no time-in record today.");
                return;
            }

            int attendanceId = rs.getInt("AttendanceID");

            String updateSql = "UPDATE attendance SET TimeOut = NOW(), Status = 'Completed' WHERE AttendanceId = ?";
            pst = con.prepareStatement(updateSql);
            pst.setInt(1, attendanceId);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, "Successfully timed out the employee!");
            _form.FetchAllEmployee(); 

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error during single time-out: " + e.getMessage());
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
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AttendanceForm(null, 0,"").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbsentBtn;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JLabel StatusLbl;
    private javax.swing.JButton TimeInBtn;
    private javax.swing.JButton TimeOutBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
