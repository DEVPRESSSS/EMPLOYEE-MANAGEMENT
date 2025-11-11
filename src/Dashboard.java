
import SidebarContents.Attendance;
import SidebarContents.Benefits;
import SidebarContents.DeductionsManagement;
import SidebarContents.EmployeeManagement;
import SidebarContents.JobPosition;
import SidebarContents.LeaveManagement;
import SidebarContents.OverView;
import SidebarContents.Salary;
import SidebarContents.Users;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;



public class Dashboard extends javax.swing.JFrame {

    
    public Dashboard() {
        initComponents();
        showPanel(new EmployeeManagement());
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        SalaryBtn = new javax.swing.JButton();
        UsersBtn = new javax.swing.JButton();
        Attendance = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Leave = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        JobPositions = new javax.swing.JButton();
        Deduction = new javax.swing.JButton();
        BenefitsBtn = new javax.swing.JButton();
        MainContentPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setForeground(new java.awt.Color(0, 153, 255));
        jButton6.setText("Employee");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        SalaryBtn.setBackground(new java.awt.Color(255, 255, 255));
        SalaryBtn.setForeground(new java.awt.Color(0, 153, 255));
        SalaryBtn.setText("Salary");
        SalaryBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        SalaryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalaryBtnActionPerformed(evt);
            }
        });

        UsersBtn.setBackground(new java.awt.Color(255, 255, 255));
        UsersBtn.setForeground(new java.awt.Color(0, 153, 255));
        UsersBtn.setText("Users");
        UsersBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        UsersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsersBtnActionPerformed(evt);
            }
        });

        Attendance.setBackground(new java.awt.Color(255, 255, 255));
        Attendance.setForeground(new java.awt.Color(0, 153, 255));
        Attendance.setText("Attendance");
        Attendance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AttendanceActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hrm.png"))); // NOI18N

        Leave.setBackground(new java.awt.Color(255, 255, 255));
        Leave.setForeground(new java.awt.Color(0, 153, 255));
        Leave.setText("Leave");
        Leave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Leave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaveActionPerformed(evt);
            }
        });

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setForeground(new java.awt.Color(0, 153, 255));
        Logout.setText("Logout");
        Logout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        JobPositions.setBackground(new java.awt.Color(255, 255, 255));
        JobPositions.setForeground(new java.awt.Color(0, 153, 255));
        JobPositions.setText("Job positions");
        JobPositions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        JobPositions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JobPositionsActionPerformed(evt);
            }
        });

        Deduction.setBackground(new java.awt.Color(255, 255, 255));
        Deduction.setForeground(new java.awt.Color(0, 153, 255));
        Deduction.setText("Deductions");
        Deduction.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        Deduction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeductionActionPerformed(evt);
            }
        });

        BenefitsBtn.setBackground(new java.awt.Color(255, 255, 255));
        BenefitsBtn.setForeground(new java.awt.Color(0, 153, 255));
        BenefitsBtn.setText("Benefits");
        BenefitsBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        BenefitsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BenefitsBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SalaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JobPositions, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Leave, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Deduction, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BenefitsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SalaryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(UsersBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Attendance, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Leave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JobPositions, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Deduction, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(BenefitsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        MainContentPanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout MainContentPanelLayout = new javax.swing.GroupLayout(MainContentPanel);
        MainContentPanel.setLayout(MainContentPanelLayout);
        MainContentPanelLayout.setHorizontalGroup(
            MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );
        MainContentPanelLayout.setVerticalGroup(
            MainContentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainContentPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
           showPanel(new EmployeeManagement());
    }//GEN-LAST:event_jButton6ActionPerformed

    private void UsersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsersBtnActionPerformed
        showPanel(new Users());

    }//GEN-LAST:event_UsersBtnActionPerformed

    private void AttendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AttendanceActionPerformed
        


        showPanel(new Attendance());

    }//GEN-LAST:event_AttendanceActionPerformed

    private void SalaryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalaryBtnActionPerformed
        showPanel(new Salary());
        
    }//GEN-LAST:event_SalaryBtnActionPerformed

    private void LeaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaveActionPerformed
        showPanel(new LeaveManagement());
    }//GEN-LAST:event_LeaveActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
            int confirm = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to log out?",
                "Confirm Delete",
                JOptionPane.YES_NO_OPTION);
        
            if (confirm == JOptionPane.YES_OPTION) {
            
                Login p = new Login();
                p.setVisible(true);
                
                this.dispose();
                
            }
    }//GEN-LAST:event_LogoutActionPerformed

    private void JobPositionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JobPositionsActionPerformed
         showPanel(new JobPosition());

    }//GEN-LAST:event_JobPositionsActionPerformed

    private void DeductionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeductionActionPerformed
         showPanel(new DeductionsManagement());
    }//GEN-LAST:event_DeductionActionPerformed

    private void BenefitsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BenefitsBtnActionPerformed
        showPanel(new Benefits());
    }//GEN-LAST:event_BenefitsBtnActionPerformed

    //Dynamic showpanel
    public void showPanel(JPanel panel){
        MainContentPanel.removeAll();
        MainContentPanel.setLayout(new BorderLayout()); 

        MainContentPanel.add(panel, BorderLayout.CENTER);

        // Refresh
        MainContentPanel.revalidate();
        MainContentPanel.repaint();
    }


    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Attendance;
    private javax.swing.JButton BenefitsBtn;
    private javax.swing.JButton Deduction;
    private javax.swing.JButton JobPositions;
    private javax.swing.JButton Leave;
    private javax.swing.JButton Logout;
    private javax.swing.JPanel MainContentPanel;
    private javax.swing.JButton SalaryBtn;
    private javax.swing.JButton UsersBtn;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
