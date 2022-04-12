package restaurant.management.system;

import java.sql.*;
import javax.swing.*;
import database.CustomerFunctions;
import database.OrdersFunctions;
import database.MealsFunctions;

public class Update extends javax.swing.JFrame {
    
    CustomerFunctions F = new CustomerFunctions();
    
    public Update(int Id) {
        initComponents();
        setLocationRelativeTo(null);
        try{    if(Id != -1) {
                F.searchById(Id);
                if(CustomerFunctions.r.next()) {
                        id.setText(CustomerFunctions.r.getString("ID"));
                        name.setText( CustomerFunctions.r.getString("FullName") );
                        address.setText( CustomerFunctions.r.getString("Address") ); 
                        phonenumber.setText( CustomerFunctions.r.getString("Phone_Number") );
                        if(Integer.parseInt(CustomerFunctions.r.getString("Marketing"))== 1) 
                                marketing.setSelected(true);
                        if( Integer.parseInt(CustomerFunctions.r.getString("Loyalty_Reward_Programs") ) == 1)
                                lrprograms.setSelected(true);
                        totalpayment.setText( CustomerFunctions.r.getString("Total_Payments") );
                        points.setText( CustomerFunctions.r.getString("Points") );    
                        gifts.setText( CustomerFunctions.r.getString("Gifts") );
                        spetialOffers.setText( CustomerFunctions.r.getString("Spetial_Offers") );
                }
            }
        }catch (SQLException ex) {} 
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        idSearch = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        phonenumber = new javax.swing.JTextField();
        marketing = new javax.swing.JCheckBox();
        lrprograms = new javax.swing.JCheckBox();
        id = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        totalpayment = new javax.swing.JTextField();
        gifts = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        points = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        spetialOffers = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update Customer");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Search By ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Address");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Phone Number");

        search.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        Update.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        marketing.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        marketing.setText("Marketing");

        lrprograms.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lrprograms.setText("Loyalty & Reward Programs");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("ID");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Total Payments");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Gifts");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Points");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Spetial Offers");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(Delete, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 73, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(Update, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 65, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel14, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, totalpayment, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, points)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, gifts)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, spetialOffers)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(jLabel3)
                            .add(jLabel2)
                            .add(jLabel9)
                            .add(jLabel1)
                            .add(marketing, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 26, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(lrprograms, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(phonenumber, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(address, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(name, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(id, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                            .add(idSearch, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))
                .add(18, 18, 18)
                .add(search, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 78, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(search)
                    .add(idSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(12, 12, 12)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(phonenumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4))
                .add(21, 21, 21)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(marketing)
                    .add(lrprograms))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(totalpayment, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel13)
                    .add(points, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(gifts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel11))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(spetialOffers, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel14))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 10, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Delete)
                    .add(Update))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        if(id.getText().equals("")) JOptionPane.showMessageDialog(null,"No data found!","Error",JOptionPane.ERROR_MESSAGE);
        else{
        OrdersFunctions OF = new OrdersFunctions();
        int s=OF.deleteCustomerOrder( Integer.parseInt(id.getText()) );
        int r = F.deletecustomer( Integer.parseInt(id.getText()) );
        if(r == 1 && s==1) JOptionPane.showMessageDialog(null,"Customer has been deleted!","Success",JOptionPane.INFORMATION_MESSAGE);
        else       JOptionPane.showMessageDialog(null,"Customer has not been deleted!","Fail",JOptionPane.ERROR_MESSAGE);
        
        id.setText(""); name.setText(""); address.setText(""); phonenumber.setText(""); totalpayment.setText("");
        points.setText(""); gifts.setText(""); spetialOffers.setText("");
        marketing.setSelected(false); lrprograms.setSelected(false);
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        if(id.getText().equals("") || name.getText().equals("") || address.getText().equals("") || 
                phonenumber.getText().equals("") || totalpayment.getText().equals("") || points.getText().equals("") || 
                gifts.getText().equals("") || spetialOffers.getText().equals("") )
            JOptionPane.showMessageDialog(null,"No data found or incompleted data!","Error",JOptionPane.ERROR_MESSAGE);
        else {
        F.checkCustomer( Integer.parseInt(id.getText()) );
            
            Double.parseDouble( totalpayment.getText() ); Integer.parseInt( points.getText() );
            Integer.parseInt(gifts.getText()); Integer.parseInt(spetialOffers.getText());
            
            F.updatecustomer( id.getText(), name.getText(), address.getText(), phonenumber.getText(),
                              (marketing.isSelected()? "1" : "0"), (lrprograms.isSelected()? "1" : "0"), 
                              totalpayment.getText(), points.getText(), gifts.getText(), spetialOffers.getText() ); 
            JOptionPane.showMessageDialog(null,"updating has been done!","Success",JOptionPane.INFORMATION_MESSAGE);
            
            CustomerFunctions CF = new CustomerFunctions(); 
            CF.searchById(Integer.parseInt(id.getText()));
            try{
                if(CustomerFunctions.r.next()) {
                    if(Integer.parseInt(CustomerFunctions.r.getString("Marketing"))== 1 || 
                       Integer.parseInt(CustomerFunctions.r.getString("Loyalty_Reward_Programs") ) == 1) {
                            int giftcount=0,offrcount=0;
                            for(int i = 1; i <= (int)Double.parseDouble(CustomerFunctions.r.getString("Total_Payments")); i++)
                                if( i%3000 == 0) giftcount++;
                            for(int i = 1; i <= Integer.parseInt(CustomerFunctions.r.getString("Points")); i++)
                                if( i%10000 == 0) offrcount++;
                            
                    if( giftcount > Integer.parseInt(CustomerFunctions.r.getString("Gifts")) ) {
                        CF.update_gifts(giftcount, Integer.parseInt(id.getText()));
                        JOptionPane.showMessageDialog(null,"Congratulations "+name.getText()+"! You have just won a gift! \n you can choose one of our gifts and recieve it from our gift shop.\nThank you!","Surprise",JOptionPane.INFORMATION_MESSAGE);
                        }else if( giftcount < Integer.parseInt(CustomerFunctions.r.getString("Gifts")) ){
                                CF.update_gifts(giftcount, Integer.parseInt(id.getText()));
                                JOptionPane.showMessageDialog(null,"Sorry "+name.getText()+"! You have just Lose a gift! \n Good Luck Next Time!","Notation",JOptionPane.INFORMATION_MESSAGE);
                                }
                
                    if( offrcount > Integer.parseInt(CustomerFunctions.r.getString("Spetial_Offers")) ) {
                        CF.update_offers(offrcount, Integer.parseInt(id.getText()));
                        JOptionPane.showMessageDialog(null,"Congratulations "+name.getText()+"! You have just won a Spetial Offer! \n you can enjoy one of our great Offers.\nThank you!","Surprise",JOptionPane.INFORMATION_MESSAGE);
                        }else if( offrcount < Integer.parseInt(CustomerFunctions.r.getString("Spetial_Offers")) ){
                                CF.update_offers(offrcount, Integer.parseInt(id.getText()));
                                JOptionPane.showMessageDialog(null,"Sorry "+name.getText()+"! You have just Lose a Spetial Offer! \n Good Luck Next Time!","Notation",JOptionPane.INFORMATION_MESSAGE);
                                }

                }
            }   
        }catch(SQLException ex){ System.out.println(ex);JOptionPane.showMessageDialog(null,"updating Customer`s data is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
        
            
            id.setText(""); name.setText(""); address.setText(""); phonenumber.setText(""); totalpayment.setText("");
            points.setText(""); gifts.setText(""); spetialOffers.setText("");
            marketing.setSelected(false); lrprograms.setSelected(false);
        }
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
            try{ 
                id.setText(""); name.setText(""); address.setText(""); phonenumber.setText(""); totalpayment.setText("");
                points.setText(""); gifts.setText(""); spetialOffers.setText("");
                marketing.setSelected(false); lrprograms.setSelected(false);
            
                F.searchById( Integer.parseInt(idSearch.getText()));
                if(CustomerFunctions.r.next()) {
                      id.setText(CustomerFunctions.r.getString("ID"));
                        name.setText( CustomerFunctions.r.getString("FullName") );
                        address.setText( CustomerFunctions.r.getString("Address") ); 
                        phonenumber.setText( CustomerFunctions.r.getString("Phone_Number") );
                        if(Integer.parseInt(CustomerFunctions.r.getString("Marketing"))== 1) 
                                marketing.setSelected(true);
                        if( Integer.parseInt(CustomerFunctions.r.getString("Loyalty_Reward_Programs") ) == 1)
                                lrprograms.setSelected(true);
                        totalpayment.setText( CustomerFunctions.r.getString("Total_Payments") );
                        points.setText( CustomerFunctions.r.getString("Points") );    
                        gifts.setText( CustomerFunctions.r.getString("Gifts") );
                        spetialOffers.setText( CustomerFunctions.r.getString("Spetial_Offers") );
                }
                if(name.getText().equals("")) JOptionPane.showMessageDialog(null,"Customer is not found!","Error",JOptionPane.ERROR_MESSAGE);
            }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Searching for a Customer is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
             catch (Exception ex) { JOptionPane.showMessageDialog(null,"Invalid id!","Error",JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_searchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JButton Update;
    private javax.swing.JTextField address;
    private javax.swing.JTextField gifts;
    private javax.swing.JTextField id;
    private javax.swing.JTextField idSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox lrprograms;
    private javax.swing.JCheckBox marketing;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phonenumber;
    private javax.swing.JTextField points;
    private javax.swing.JButton search;
    private javax.swing.JTextField spetialOffers;
    private javax.swing.JTextField totalpayment;
    // End of variables declaration//GEN-END:variables

}
