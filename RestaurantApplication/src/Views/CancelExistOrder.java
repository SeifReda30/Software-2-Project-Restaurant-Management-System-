package Views;

import Controllers.*;
import java.sql.*;
import javax.swing.*;
import java.util.ArrayList;

enum OrderDataType{CustomerId, MealId, Quantity, TotalPrice}
public class CancelExistOrder extends javax.swing.JFrame {
    
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
        if(customerid.getText().equals("") || mealid.getText().equals("") || quantity.getText().equals("")) 
            JOptionPane.showMessageDialog(null,"No order added or incompleted data!","Error",JOptionPane.ERROR_MESSAGE);
        else{
            ArrayList<Object> OrderData = new ArrayList<Object>();
             try{
                 OrderData = OrdersScreensController.GetOrderData(customerid.getText(), mealid.getText(), quantity.getText());
                 System.out.println(OrderData.size());
                 ArrayList<Object> MealData = MealsTableController.GetMealsData(1, Integer.parseInt(mealid.getText()) );
                 MealsTableController.UpdateMealsTable(4, Integer.parseInt(mealid.getText()),
                        ( Integer.parseInt(MealData.get(MealsDataType.Quantity.ordinal())+"") + Integer.parseInt(quantity.getText())) );
                }catch(SQLException ex){ JOptionPane.showMessageDialog(null,"updating meal quantity is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
             
             try{
                ArrayList<Object> CustomerData = CustomerScreensController.GetCustomersData(1, Integer.parseInt(customerid.getText()) );      
                String name = CustomerData.get(CustomerDataType.Name.ordinal())+"";
                System.out.println(CustomerData.size());
                if(Integer.parseInt(CustomerData.get(CustomerDataType.Marketing.ordinal())+"")== 1 && 
                   Integer.parseInt(CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal())+"")== 1){
                        CustomerScreensController.UpdateCustomerTable(3 ,customerid.getText(),
                                ( Double.parseDouble(CustomerData.get(CustomerDataType.TotalPayments.ordinal())+"") - Double.parseDouble(OrderData.get(OrderDataType.TotalPrice.ordinal())+"") ),
                                ( Integer.parseInt(CustomerData.get(CustomerDataType.Points.ordinal())+"") - (int)(Double.parseDouble(CustomerData.get(CustomerDataType.TotalPayments.ordinal())+"") * 10 ) ) );
                        
                        int[] ResultOfOperations = CustomerScreensController.UpdateCustomerGifts_SpetialOffers( CustomerData.get(CustomerDataType.Id.ordinal()),
                CustomerData.get(CustomerDataType.Name.ordinal()), CustomerData.get(CustomerDataType.Address.ordinal()), CustomerData.get(CustomerDataType.PhoneNumber.ordinal()), 
                CustomerData.get(CustomerDataType.Marketing.ordinal()), CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal()), CustomerData.get(CustomerDataType.TotalPayments.ordinal()), 
                CustomerData.get(CustomerDataType.Points.ordinal()), CustomerData.get(CustomerDataType.Gifts.ordinal()), CustomerData.get(CustomerDataType.SpetialOffers.ordinal()));
                        if(ResultOfOperations[0]==0) JOptionPane.showMessageDialog(null,"Sorry "+name+"! You have just Lost a gift! \n Good Luck Next Time!","Notation",JOptionPane.INFORMATION_MESSAGE);
                        if(ResultOfOperations[1]==0) JOptionPane.showMessageDialog(null,"Sorry "+name+"! You have just Lost a Spetial Offer! \n Good Luck Next Time!","Notation",JOptionPane.INFORMATION_MESSAGE);
                
                }else CustomerScreensController.UpdateCustomerTable(3 ,customerid.getText(),
                                ( Double.parseDouble(CustomerData.get(CustomerDataType.TotalPayments.ordinal())+"") - Double.parseDouble(OrderData.get(OrderDataType.TotalPrice.ordinal())+"") ),
                                Integer.parseInt(CustomerData.get(CustomerDataType.Points.ordinal())+"") );
                }catch(SQLException ex){ JOptionPane.showMessageDialog(null,"Modifying on Customer rewardes is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
                
             try{
                int IsDeleted = OrdersScreensController.UpdateOrdersTable( 1, customerid.getText(), mealid.getText(), quantity.getText() );
                if(IsDeleted == 1) JOptionPane.showMessageDialog(null,"Order has been canceld!","Success",JOptionPane.INFORMATION_MESSAGE);
             }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Order has not been canceld!","Error",JOptionPane.ERROR_MESSAGE);}
                
             customerid.setText(""); mealid.setText(""); quantity.setText(""); }
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
