package Views;

import Controllers.*;
import java.sql.*;
import javax.swing.*;

public class Add extends javax.swing.JFrame {

    public Add() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Add = new javax.swing.JButton();
        id = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        marketing = new javax.swing.JCheckBox();
        lrprograms = new javax.swing.JCheckBox();
        name = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Add New Customer");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Phone Number");

        Add.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        marketing.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        marketing.setText("Marketing");

        lrprograms.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lrprograms.setText("Loyalty & Reward Programs");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(107, 107, 107)
                        .add(Add, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(38, 38, 38)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(marketing, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 104, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel4)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel3)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel2)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1))
                                .add(10, 10, 10)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                    .add(id)
                                    .add(address)
                                    .add(phonenumber, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                                    .add(name)))
                            .add(lrprograms))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel4)
                    .add(phonenumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(marketing)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(lrprograms)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 24, Short.MAX_VALUE)
                .add(Add)
                .add(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
            try{
                  if(id.getText().equals("") || name.getText().equals("")) JOptionPane.showMessageDialog(null,"No data added or incompleted data!","Error",JOptionPane.ERROR_MESSAGE);
                  else{
                        int IsAdded = CustomerScreensController.UpdateCustomerTable( 0 ,id.getText(), name.getText(), address.getText(), 
                                phonenumber.getText(), (marketing.isSelected()? "1" : "0"),(lrprograms.isSelected()? "1" : "0") );
                        if(IsAdded == 1) JOptionPane.showMessageDialog(null,"Customer has been added!","Success",JOptionPane.INFORMATION_MESSAGE);
            
                  id.setText(""); name.setText(""); address.setText(""); phonenumber.setText(""); marketing.setSelected(false);
                  lrprograms.setSelected(false); }
        }catch (SQLException ex) {JOptionPane.showMessageDialog(null,"Adding New Customer is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
         catch (Exception ex) { JOptionPane.showMessageDialog(null,"Invalid id!","Error",JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_AddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField address;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JCheckBox lrprograms;
    private javax.swing.JCheckBox marketing;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phonenumber;
    // End of variables declaration//GEN-END:variables

}
