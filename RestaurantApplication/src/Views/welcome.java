package Views;

import Controllers.*;

public class welcome extends javax.swing.JFrame {
            
    public welcome() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleBackGround = new javax.swing.JPanel();
        admin = new javax.swing.JButton();
        employee = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BackGround = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Choose");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TitleBackGround.setBackground(new java.awt.Color(0, 0, 0,120));

        admin.setBackground(new java.awt.Color(204, 204, 255));
        admin.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        employee.setBackground(new java.awt.Color(204, 204, 255));
        employee.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        employee.setText("Employee");
        employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(253, 233, 233));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setText("Please Choose Your Identity");

        javax.swing.GroupLayout TitleBackGroundLayout = new javax.swing.GroupLayout(TitleBackGround);
        TitleBackGround.setLayout(TitleBackGroundLayout);
        TitleBackGroundLayout.setHorizontalGroup(
            TitleBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleBackGroundLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addGroup(TitleBackGroundLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        TitleBackGroundLayout.setVerticalGroup(
            TitleBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TitleBackGroundLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(TitleBackGroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employee, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        getContentPane().add(TitleBackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 340, 270));

        BackGround.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rest1.jpg"))); // NOI18N
        BackGround.setText("jLabel2");
        getContentPane().add(BackGround, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 580, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        this.dispose();
        LoginScreensController.LoadAdminLoginScreen();
    }//GEN-LAST:event_adminActionPerformed

    private void employeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeActionPerformed
        this.dispose();
        LoginScreensController.LoadEmployeeLoginScreen();
    }//GEN-LAST:event_employeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGround;
    private javax.swing.JPanel TitleBackGround;
    private javax.swing.JButton admin;
    private javax.swing.JButton employee;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
