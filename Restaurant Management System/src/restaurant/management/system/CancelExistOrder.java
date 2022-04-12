package restaurant.management.system;

import java.sql.*;
import javax.swing.*;
import database.CustomerFunctions;
import database.OrdersFunctions;
import database.MealsFunctions;

public class CancelExistOrder extends javax.swing.JFrame {

    MealsFunctions MF = new MealsFunctions();
    CustomerFunctions CF = new CustomerFunctions();
    OrdersFunctions OF = new OrdersFunctions();
    
    public CancelExistOrder() {
        initComponents();
        setLocationRelativeTo(null);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerid = new javax.swing.JTextField();
        mealid = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        deleteorder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cancel Exist Order");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Customer Id");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Meal Id");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Quantity");

        deleteorder.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        deleteorder.setText("Delete Order");
        deleteorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteorderActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(32, 32, 32)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(deleteorder, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 193, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                        .add(layout.createSequentialGroup()
                            .add(jLabel1)
                            .add(28, 28, 28)
                            .add(customerid, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE))
                        .add(layout.createSequentialGroup()
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel3)
                                .add(jLabel2))
                            .add(47, 47, 47)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(quantity, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .add(mealid)))))
                .add(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(customerid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(mealid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(36, 36, 36)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(42, 42, 42)
                .add(deleteorder)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void deleteorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteorderActionPerformed

                    if(customerid.getText().equals("") || mealid.getText().equals("") || quantity.getText().equals("")) JOptionPane.showMessageDialog(null,"No order added or incompleted data!","Error",JOptionPane.ERROR_MESSAGE);
                    else{
                         try{
                    OF.selectOrder( customerid.getText(), mealid.getText(), quantity.getText() );
                    ResultSet or = OrdersFunctions.r;
                    if(or.next()) {
                            MF.searchById( Integer.parseInt(mealid.getText()) );
                            if(MealsFunctions.r.next()) MF.updateQuantity( ( Integer.parseInt(MealsFunctions.r.getString("quantity")) + Integer.parseInt(or.getString("quantity") ) ), mealid.getText());
                            CF.searchById( Integer.parseInt(customerid.getText()) );
                            if(CustomerFunctions.r.next())
                                    if( Integer.parseInt(CustomerFunctions.r.getString("Marketing"))== 1 || 
                                        Integer.parseInt(CustomerFunctions.r.getString("Loyalty_Reward_Programs") ) == 1 ) 
                                                CF.update_TotalPayments_Points( ( Double.parseDouble(CustomerFunctions.r.getString("Total_Payments")) - Double.parseDouble(or.getString("total_price")) ),
                                                            ( Integer.parseInt(CustomerFunctions.r.getString("Points")) - (int)(Double.parseDouble(or.getString("total_price"))*10)), customerid.getText() );
                                    
                                    else CF.update_TotalPayments_Points( ( Double.parseDouble(CustomerFunctions.r.getString("Total_Payments")) - Double.parseDouble(or.getString("total_price")) ),
                                                                            Integer.parseInt(CustomerFunctions.r.getString("Points")), customerid.getText() );
                                    
                            }
                    
                    CF.searchById( Integer.parseInt(customerid.getText()) );
                    if(CustomerFunctions.r.next()) {
                        String name = CustomerFunctions.r.getString("FullName");
                        if(Integer.parseInt(CustomerFunctions.r.getString("Marketing"))== 1 || 
                                        Integer.parseInt(CustomerFunctions.r.getString("Loyalty_Reward_Programs") ) == 1){
                            int giftcount=0,offrcount=0;
                            for(int i = 1; i <= (int)Double.parseDouble(CustomerFunctions.r.getString("Total_Payments")); i++)
                                if( i%3000 == 0) giftcount++;
                            for(int i = 1; i <= Integer.parseInt(CustomerFunctions.r.getString("Points")); i++)
                                if( i%10000 == 0) offrcount++;
            
                            if( giftcount < Integer.parseInt(CustomerFunctions.r.getString("Gifts")) ) {
                                CF.update_gifts(giftcount, Integer.parseInt(customerid.getText()));
                                JOptionPane.showMessageDialog(null,"Sorry "+name+"! You have just Lost a gift! \n Good Luck Next Time!","Notation",JOptionPane.INFORMATION_MESSAGE);
                                }
                
                            if( offrcount < Integer.parseInt(CustomerFunctions.r.getString("Spetial_Offers")) ) {
                                CF.update_offers(offrcount, Integer.parseInt(customerid.getText()));
                                JOptionPane.showMessageDialog(null,"Sorry "+name+"! You have just Lost a Spetial Offer! \n Good Luck Next Time!","Notation",JOptionPane.INFORMATION_MESSAGE);
                                }
                
                        }
                    } 
                    
                    }catch(SQLException ex){
                        JOptionPane.showMessageDialog(null,"Modifying on tables is Failed!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                
                int r = 0;
                r = OF.deleteOrder( customerid.getText(), mealid.getText(), quantity.getText() );
                if(r == 1) JOptionPane.showMessageDialog(null,"Order has been canceld!","Success",JOptionPane.INFORMATION_MESSAGE);
                else JOptionPane.showMessageDialog(null,"Order has not been canceld!","Error",JOptionPane.ERROR_MESSAGE);
                
                customerid.setText("");
                mealid.setText("");
                quantity.setText("");
                    }
    }//GEN-LAST:event_deleteorderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField customerid;
    private javax.swing.JButton deleteorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField mealid;
    private javax.swing.JTextField quantity;
    // End of variables declaration//GEN-END:variables

}
