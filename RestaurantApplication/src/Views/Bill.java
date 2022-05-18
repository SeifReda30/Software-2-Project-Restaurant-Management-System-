package Views;

import Controllers.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.ArrayList;

enum MealsDataType{Id, Name, Price, Quantity};
enum CustomerDataType{Id, Name, Address, PhoneNumber, Marketing, LoyaltyRewardPrograms,
        TotalPayments, Points, Gifts, SpetialOffers};

public class Bill extends javax.swing.JFrame {

    public Bill(DefaultTableModel Orders,Object...BillData) {
        
        initComponents();
        setLocationRelativeTo(null);
                
        DefaultTableModel BillTable = new DefaultTableModel();
        billTable.setModel(BillTable);
        BillTable.addColumn("Meals");
        BillTable.addColumn("Quantities");
        BillTable.addColumn("Total Price");
        BillTable.addColumn("Points");
        
        try {
            for(int RowOrder = 0; RowOrder < Orders.getRowCount();RowOrder++) {
                ArrayList<Object> MealsData = MealsTableController.GetMealsData(1, Orders.getValueAt(RowOrder,1) );
                BillTable.addRow( new Object[]{ MealsData.get( RowOrder + MealsDataType.Name.ordinal()),
                Orders.getValueAt(RowOrder,2),Orders.getValueAt(RowOrder,3), Orders.getValueAt(RowOrder,4)} );
            }
        } catch (SQLException ex) { JOptionPane.showMessageDialog(null,"showing bill is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
        
        try{
            ArrayList<Object> CustomerData = CustomerScreensController.GetCustomersData(1, BillData[0]);
            customername.setText(CustomerData.get(CustomerDataType.Name.ordinal())+"");
            
            int[] ResultOfOperations = CustomerScreensController.UpdateCustomerGifts_SpetialOffers( CustomerData.get(CustomerDataType.Id.ordinal()),
                CustomerData.get(CustomerDataType.Name.ordinal()), CustomerData.get(CustomerDataType.Address.ordinal()), CustomerData.get(CustomerDataType.PhoneNumber.ordinal()), 
                CustomerData.get(CustomerDataType.Marketing.ordinal()), CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal()), CustomerData.get(CustomerDataType.TotalPayments.ordinal()), 
                CustomerData.get(CustomerDataType.Points.ordinal()), CustomerData.get(CustomerDataType.Gifts.ordinal()), CustomerData.get(CustomerDataType.SpetialOffers.ordinal()));
            
                if(ResultOfOperations[0]==1) JOptionPane.showMessageDialog(null,"Congratulations "+customername.getText()+"! You have just won a gift! \n you can choose one of our gifts and recieve it from our gift shop.\nThank you!","Surprise",JOptionPane.INFORMATION_MESSAGE);
                if(ResultOfOperations[1]==1) JOptionPane.showMessageDialog(null,"Congratulations "+customername.getText()+"! You have just won a Special Offer! \n you can enjoy one of our great Offers.\nThank you!","Surprise",JOptionPane.INFORMATION_MESSAGE);
           }catch(SQLException ex){ JOptionPane.showMessageDialog(null,"updating Customer`s data is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
        
        TotalPayments.setText(BillData[1]+"");
        totalpoints.setText(BillData[2]+"");
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
