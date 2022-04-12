
package restaurant.management.system;

import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import database.CustomerFunctions;
import database.OrdersFunctions;
import database.MealsFunctions;

public class Bill extends javax.swing.JFrame {

    public Bill(DefaultTableModel bt,int cid,double payments,int points) {
        
        initComponents();
        setLocationRelativeTo(null);
                
        DefaultTableModel b = new DefaultTableModel();
        billTable.setModel(b);
        b.addColumn("Meals");
        b.addColumn("Quantities");
        b.addColumn("Total Price");
        b.addColumn("Points");
        
        MealsFunctions MF = new MealsFunctions();
        for(int i = 0; i < bt.getRowCount();i++) {
            MF.searchById( (Integer)bt.getValueAt(i,1) );
            try {
                if(MealsFunctions.r.next()) {
                   MealsFunctions.r.getString("id"); 
                   b.addRow( new Object[]{ MealsFunctions.r.getString("name"), bt.getValueAt(i,2), bt.getValueAt(i,3), bt.getValueAt(i,4)} );
                }
            } catch (SQLException ex) { JOptionPane.showMessageDialog(null,"showing bill is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
        }
        
        CustomerFunctions CF = new CustomerFunctions(); 
        CF.searchById(cid);
        try{
            if(CustomerFunctions.r.next()) {
                customername.setText(CustomerFunctions.r.getString("FullName"));
                if(Integer.parseInt(CustomerFunctions.r.getString("Marketing"))== 1 || 
                                        Integer.parseInt(CustomerFunctions.r.getString("Loyalty_Reward_Programs") ) == 1) {
                    int giftcount=0,offrcount=0;
                    for(int i = 1; i <= (int)Double.parseDouble(CustomerFunctions.r.getString("Total_Payments")); i++)
                        if( i%3000 == 0) giftcount++;
                    for(int i = 1; i <= Integer.parseInt(CustomerFunctions.r.getString("Points")); i++)
                        if( i%10000 == 0) offrcount++;
            
                    if( giftcount > Integer.parseInt(CustomerFunctions.r.getString("Gifts")) ) {
                        CF.update_gifts(giftcount, cid);
                        JOptionPane.showMessageDialog(null,"Congratulations "+customername.getText()+"! You have just won a gift! \n you can choose one of our gifts and recieve it from our gift shop.\nThank you!","Surprise",JOptionPane.INFORMATION_MESSAGE);
                        }
                
                    if( offrcount > Integer.parseInt(CustomerFunctions.r.getString("Spetial_Offers")) ) {
                        CF.update_offers(offrcount, cid);
                        JOptionPane.showMessageDialog(null,"Congratulations "+customername.getText()+"! You have just won a Special Offer! \n you can enjoy one of our great Offers.\nThank you!","Surprise",JOptionPane.INFORMATION_MESSAGE);
                        }
                }
            }   
        }catch(SQLException ex){ JOptionPane.showMessageDialog(null,"updating Customer`s data is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
        
        TotalPayments.setText(payments+"");
        totalpoints.setText(points+"");
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        billTable = new javax.swing.JTable();
        TotalPayments = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customername = new javax.swing.JTextField();
        totalpoints = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("bill");

        billTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        billTable.setEnabled(false);
        jScrollPane1.setViewportView(billTable);

        TotalPayments.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Total Payment");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Customer Name");

        customername.setEditable(false);

        totalpoints.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Total Points");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 99, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel2))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(22, 22, 22)
                        .add(TotalPayments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 105, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jLabel3)
                        .add(19, 19, 19)
                        .add(totalpoints))
                    .add(layout.createSequentialGroup()
                        .add(18, 18, 18)
                        .add(customername)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 180, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(customername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(11, 11, 11)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel1)
                    .add(TotalPayments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(totalpoints, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel3))
                .add(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TotalPayments;
    private javax.swing.JTable billTable;
    private javax.swing.JTextField customername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField totalpoints;
    // End of variables declaration//GEN-END:variables

}
