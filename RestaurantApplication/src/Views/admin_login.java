package Views;

import Controllers.*;
import javax.swing.*;
import java.sql.SQLException;

public class admin_login extends javax.swing.JFrame {

    public admin_login() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        admin_password = new javax.swing.JPasswordField();
        admin_name = new javax.swing.JTextField();
        Login = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login Form");
        setSize(new java.awt.Dimension(700, 562));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,90));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User name");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(80, 90, 82, 38);

        jLabel2.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(80, 140, 82, 34);
        jPanel1.add(admin_password);
        admin_password.setBounds(180, 140, 118, 30);
        jPanel1.add(admin_name);
        admin_name.setBounds(180, 100, 118, 30);

        Login.setBackground(new java.awt.Color(143, 3, 37));
        Login.setFont(new java.awt.Font("Lato Black", 0, 18)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginActionPerformed(evt);
            }
        });
        jPanel1.add(Login);
        Login.setBounds(27, 220, 134, 43);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 100, 22, 21);

        Back.setBackground(new java.awt.Color(143, 3, 37));
        Back.setFont(new java.awt.Font("Lato Black", 0, 18)); // NOI18N
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        jPanel1.add(Back);
        Back.setBounds(206, 220, 127, 43);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setPreferredSize(new java.awt.Dimension(22, 21));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 150, 22, 20);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 360, 340));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/rest5.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginActionPerformed
        String Username = this.admin_name.getText();
        String Password = this.admin_password.getText();
        try{
        int VerifyingResult = LoginScreensController.VerifyAdminAccount(Username, Password);
        switch(VerifyingResult){   
            case 0:
                JOptionPane.showMessageDialog(this, "Incorrect User name","Error", JOptionPane.ERROR_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(this, "Welcome "+Username+" ! You have logged in Successfully");
                this.dispose();
                AdminScreensController.AdminScreenLoading();
                break;
            case 2:
                JOptionPane.showMessageDialog(this, "Incorrect Password","Error", JOptionPane.ERROR_MESSAGE);
                break; }
        }catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Selection from Admin Table is Failed!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_LoginActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose();
        WelcomeScreensLoading.SecondWelcomeScreenLoading();
    }//GEN-LAST:event_BackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JButton Login;
    private javax.swing.JTextField admin_name;
    private javax.swing.JPasswordField admin_password;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
