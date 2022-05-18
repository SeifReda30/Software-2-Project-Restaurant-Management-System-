package Views;

import Controllers.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Order extends javax.swing.JFrame {
    DefaultTableModel MealsTable = new DefaultTableModel();
    DefaultTableModel OrdersTable = new DefaultTableModel();
    
    public Order(int Id) {
        try{
            initComponents();
            setLocationRelativeTo(null);
            if(Id != -1) customerid.setText(Id+"");
        
            mealsTable.setModel(MealsTable); mealsTable.setDefaultEditor(Object.class,null);
            MealsTable.addColumn("id"); MealsTable.addColumn("name"); 
            MealsTable.addColumn("price"); MealsTable.addColumn("quantity");
        
            ArrayList<Object> MealsData = MealsTableController.GetMealsData(0);
            for(int Index=0; Index<MealsData.size(); Index+=4){
                MealsTable.addRow( new Object[] { MealsData.get(Index+MealsDataType.Id.ordinal()), MealsData.get(Index+MealsDataType.Name.ordinal()), 
                MealsData.get(Index+MealsDataType.Price.ordinal()), MealsData.get(Index+MealsDataType.Quantity.ordinal())} );
            }
            
            ordersTable.setModel(OrdersTable);
            OrdersTable.addColumn("Customer id"); OrdersTable.addColumn("meal id"); OrdersTable.addColumn("quantity"); 
            OrdersTable.addColumn("total price"); OrdersTable.addColumn("points");
        }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"showing Meals table is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
         catch(Exception ex) {}
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        mealsTable = new javax.swing.JTable();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        customerid = new javax.swing.JTextField();
        quantity = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        totalprice = new javax.swing.JTextField();
        Submit = new javax.swing.JButton();
        mealid = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        NameSearch = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        CancelOrder = new javax.swing.JButton();
        totalpoints = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ordering");

        mealsTable.setBackground(new java.awt.Color(255, 153, 51));
        mealsTable.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        mealsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Meals"
            }
        ));
        mealsTable.setGridColor(new java.awt.Color(0, 102, 102));
        mealsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mealsTableMouseClicked(evt);
            }
        });
        mealsTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mealsTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mealsTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(mealsTable);

        search.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Customer ID");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Meal ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Quantity");

        Add.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Add.setText("Add to Order");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        Cancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Cancel.setText("Cancel Order");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Orders"
            }
        ));
        ordersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersTableMouseClicked(evt);
            }
        });
        ordersTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ordersTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ordersTableKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(ordersTable);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Total Price");

        totalprice.setEditable(false);

        Submit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Submit.setText("Submit Order");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        mealid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mealidKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Search By name");

        Refresh.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        CancelOrder.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        CancelOrder.setText("Cancel Existing Order");
        CancelOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelOrderActionPerformed(evt);
            }
        });

        totalpoints.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Total Points");

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel5)
                            .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jLabel1)
                                .add(jLabel3)
                                .add(jLabel2)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(customerid, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .add(mealid, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .add(quantity, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .add(NameSearch)))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, Refresh, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 142, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(Add, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(CancelOrder, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(search, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 452, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel4)
                                .add(18, 18, 18)
                                .add(totalprice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 120, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(78, 78, 78)
                                .add(Submit, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 125, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 73, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(totalpoints, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 124, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(34, 34, 34))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(Cancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 135, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(77, 77, 77))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel5)
                            .add(NameSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(search))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel1)
                                    .add(customerid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(18, 18, 18)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(jLabel2)
                                    .add(mealid, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(Add)
                                .add(18, 18, 18))))
                    .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 94, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel3)
                        .add(quantity, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(totalprice, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(totalpoints, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jLabel6)))
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(Refresh)
                            .add(CancelOrder))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(Submit)
                            .add(Cancel))
                        .add(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        try{
            double priceRec = 0.0; Integer pointRec = 0;
            if( Integer.parseInt(quantity.getText()) > Integer.parseInt( (String)MealsTable.getValueAt( Integer.parseInt( mealid.getText(0,1)) -1 ,3) ) ) {
                JOptionPane.showMessageDialog(null,"quantity is too much!","Error",JOptionPane.ERROR_MESSAGE);
            }
            else{
                  priceRec = Double.parseDouble(MealsTable.getValueAt( (Integer.parseInt( mealid.getText(0,1) )-1) , 2 )+"") * Integer.parseInt(quantity.getText());

                  ArrayList<Object> CustomerData = CustomerScreensController.GetCustomersData(1, customerid.getText());
                       if(Integer.parseInt(CustomerData.get(CustomerDataType.Marketing.ordinal())+"")== 1 && 
                          Integer.parseInt(CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal())+"")== 1)
                            pointRec = (int)priceRec * 10;
                  
                  OrdersTable.addRow( new Object[] { Integer.parseInt(customerid.getText()), Integer.parseInt(mealid.getText()), 
                            Integer.parseInt(quantity.getText()), priceRec, pointRec});
                  
                  if(totalprice.getText().equals("")) totalprice.setText(priceRec+"");
                  else totalprice.setText( ( Double.parseDouble(totalprice.getText()) + priceRec) + "");
                  
                  if(totalpoints.getText().equals("")) totalpoints.setText(pointRec+"");
                  else totalpoints.setText( ( Integer.parseInt(totalpoints.getText()) + pointRec ) + "");
            }
        }catch(Exception ex) { JOptionPane.showMessageDialog(null,"invalid inputs!","Error",JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_AddActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
         if( ( totalprice.getText().equals("") || totalprice.getText().equals("0.0") || totalpoints.getText().equals("") || 
                totalpoints.getText().equals("0") ) && ( mealid.getText().equals("") && quantity.getText().equals("") ) )
                JOptionPane.showMessageDialog(null,"no orders to cancel!","Error",JOptionPane.ERROR_MESSAGE);    
         else {   
             mealid.setText(""); 
             quantity.setText("");
             int RowNumber = ordersTable.getSelectedRow();
             if(RowNumber!=-1) {
                totalprice.setText( ( Double.parseDouble(totalprice.getText()) - (Double)ordersTable.getModel().getValueAt(RowNumber,3))+ "");
                totalpoints.setText( ( Integer.parseInt(totalpoints.getText()) - (Integer)ordersTable.getModel().getValueAt(RowNumber,4)) + "");
                OrdersTable.removeRow(RowNumber);
                mealsTable.setRowSelectionAllowed(false);
            }
         }
    }//GEN-LAST:event_CancelActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        if(ordersTable.getRowCount() == 0) JOptionPane.showMessageDialog(null,"No orders added!","Error",JOptionPane.ERROR_MESSAGE);    
        else{   
            try{
                int IsAdded = 0;
                for(int OrderRow = 0; OrderRow < ordersTable.getRowCount();OrderRow++) {
                    IsAdded = OrdersScreensController.UpdateOrdersTable(0, OrdersTable.getValueAt(OrderRow,0), 
                            OrdersTable.getValueAt(OrderRow,1), OrdersTable.getValueAt(OrderRow,2), OrdersTable.getValueAt(OrderRow,3) );
                    }
                    if(IsAdded == 1) JOptionPane.showMessageDialog(null,"Order has been submited!","Success",JOptionPane.INFORMATION_MESSAGE);
            }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Order has not been submited!","Error",JOptionPane.ERROR_MESSAGE);}
            
            try{
                ArrayList<Object> CustomerData = CustomerScreensController.GetCustomersData(1, customerid.getText());
                if(Integer.parseInt(CustomerData.get(CustomerDataType.Marketing.ordinal())+"")== 1 && 
                   Integer.parseInt(CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal())+"")== 1)
                        CustomerScreensController.UpdateCustomerTable(3 ,customerid.getText(),
                                ( Double.parseDouble(totalprice.getText()) + Double.parseDouble(CustomerData.get(CustomerDataType.TotalPayments.ordinal())+"") ),
                                ( Integer.parseInt(totalpoints.getText()) + Integer.parseInt(CustomerData.get(CustomerDataType.Points.ordinal())+"")));
                else CustomerScreensController.UpdateCustomerTable(3 ,customerid.getText(),
                                ( Double.parseDouble(totalprice.getText()) + Double.parseDouble(CustomerData.get(CustomerDataType.TotalPayments.ordinal())+"") ),
                                Integer.parseInt(CustomerData.get(CustomerDataType.Points.ordinal())+""));
                }catch(SQLException ex){ JOptionPane.showMessageDialog(null,"updating Customer data is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
            
            try{
            for(int OrderRow = 0;OrderRow<ordersTable.getRowCount();OrderRow++){
                ArrayList<Object> MealsData = MealsTableController.GetMealsData(1, ordersTable.getModel().getValueAt(OrderRow,1));
                MealsTableController.UpdateMealsTable(4, ordersTable.getModel().getValueAt(OrderRow,1),
                        ( Integer.parseInt(MealsData.get(MealsDataType.Quantity.ordinal())+"") - Integer.parseInt(ordersTable.getModel().getValueAt(OrderRow,2)+"")));
            }
            }catch(SQLException ex){ JOptionPane.showMessageDialog(null,"updating meal quantity is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
            
            BillController.BillScreenLoading((DefaultTableModel)ordersTable.getModel(), customerid.getText(), totalprice.getText(), totalpoints.getText());
        }
    }//GEN-LAST:event_SubmitActionPerformed

    private void mealsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mealsTableMouseClicked
        mealsTable.setRowSelectionAllowed(true);
        int RowNumber = mealsTable.getSelectedRow();
        mealid.setText(mealsTable.getValueAt(RowNumber,0)+"");
    }//GEN-LAST:event_mealsTableMouseClicked

    private void mealidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mealidKeyReleased
        try{
        if(!mealid.getText().equals("") && (Integer.parseInt(mealid.getText())>=(Integer)(MealsTable.getValueAt(0,0))) && (Integer.parseInt(mealid.getText())<=(Integer)(MealsTable.getValueAt(MealsTable.getRowCount()-1,0)))) {
            mealsTable.setRowSelectionAllowed(true);

            for(int RowNumber = 0; RowNumber<MealsTable.getRowCount() ;RowNumber++) 
                  if( (Integer)MealsTable.getValueAt(RowNumber,0) == Integer.parseInt(mealid.getText()) ){
                        mealsTable.setRowSelectionInterval(RowNumber,RowNumber);
                        mealsTable.scrollRectToVisible(new Rectangle(mealsTable.getCellRect( RowNumber,0,true)));
                  break;}
        }else mealsTable.setRowSelectionAllowed(false);
        } catch(Exception ex) {}
    }//GEN-LAST:event_mealidKeyReleased

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try{ 
            mealid.setText("");
            ArrayList<Object> MealsData = MealsTableController.GetMealsData(2, NameSearch.getText());
            mealid.setText( MealsData.get(MealsDataType.Id.ordinal())+"");
            if(!mealid.getText().equals("")) {
                mealsTable.setRowSelectionAllowed(true);
                for(int RowNumber = 0; RowNumber<MealsTable.getRowCount() ;RowNumber++) 
                    if( Integer.parseInt(MealsTable.getValueAt(RowNumber,0)+"") == Integer.parseInt(mealid.getText()) ){
                        mealsTable.setRowSelectionInterval(RowNumber,RowNumber);
                        mealsTable.scrollRectToVisible(new Rectangle(mealsTable.getCellRect( RowNumber,0,true)));
                        }
            } else {
                mealsTable.setRowSelectionAllowed(false);
                JOptionPane.showMessageDialog(null,"Meal not found!","Error",JOptionPane.ERROR_MESSAGE);
                }
        }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Searching for a meal is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_searchActionPerformed

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        NameSearch.setText(""); customerid.setText(""); mealid.setText(""); quantity.setText("");
        totalprice.setText(""); totalpoints.setText(""); MealsTable.setRowCount(0); OrdersTable.setRowCount(0);
        try{
        ArrayList<Object> MealsData = MealsTableController.GetMealsData(0);
            for(int Index=0; Index<MealsData.size(); Index+=4){
                MealsTable.addRow( new Object[] { MealsData.get(Index+MealsDataType.Id.ordinal()), MealsData.get(Index+MealsDataType.Name.ordinal()), 
                MealsData.get(Index+MealsDataType.Price.ordinal()), MealsData.get(Index+MealsDataType.Quantity.ordinal())} );
            }
            }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"showing Meals table is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_RefreshActionPerformed

    private void CancelOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelOrderActionPerformed
        BillController.CancelBillScreenLoading();
    }//GEN-LAST:event_CancelOrderActionPerformed

    private void mealsTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mealsTableKeyPressed
        int RowNumber = mealsTable.getSelectedRow();
        if(RowNumber != -1 && ( evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN ) ) 
            mealid.setText(MealsTable.getValueAt(RowNumber,0)+"");
    }//GEN-LAST:event_mealsTableKeyPressed

    private void mealsTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mealsTableKeyReleased
        int RowNumber = mealsTable.getSelectedRow();
        if(RowNumber != -1 && ( evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN ) ) 
            mealid.setText(MealsTable.getValueAt(RowNumber,0)+"");
    }//GEN-LAST:event_mealsTableKeyReleased

    private void ordersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersTableMouseClicked
        ordersTable.setRowSelectionAllowed(true);
        int OrderRowNumber = ordersTable.getSelectedRow();
        mealid.setText(ordersTable.getValueAt(OrderRowNumber,1)+"");
        quantity.setText(ordersTable.getValueAt(OrderRowNumber,2)+"");
        
        mealsTable.setRowSelectionAllowed(true);
        for(int MealRowNumber = 0; MealRowNumber<MealsTable.getRowCount() ;MealRowNumber++) 
               if( Integer.parseInt(MealsTable.getValueAt(MealRowNumber,0)+"") == Integer.parseInt(mealid.getText()) ) OrderRowNumber = MealRowNumber;
        mealsTable.setRowSelectionInterval(OrderRowNumber,OrderRowNumber);
        mealsTable.scrollRectToVisible(new Rectangle(mealsTable.getCellRect( OrderRowNumber,0,true)));
    }//GEN-LAST:event_ordersTableMouseClicked

    private void ordersTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ordersTableKeyPressed
        ordersTable.setRowSelectionAllowed(true);
        int OrderRowNumber = ordersTable.getSelectedRow();
        if(OrderRowNumber != -1 && ( evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN ) ) {
        mealid.setText(ordersTable.getValueAt(OrderRowNumber,1)+"");
        quantity.setText(ordersTable.getValueAt(OrderRowNumber,2)+"");
        
        mealsTable.setRowSelectionAllowed(true);
        for(int MealRowNumber = 0; MealRowNumber<MealsTable.getRowCount() ;MealRowNumber++) 
                    if( Integer.parseInt(MealsTable.getValueAt(MealRowNumber,0)+"") == Integer.parseInt(mealid.getText()) ) OrderRowNumber = MealRowNumber;
        mealsTable.setRowSelectionInterval(OrderRowNumber,OrderRowNumber);
        mealsTable.scrollRectToVisible(new Rectangle(mealsTable.getCellRect( OrderRowNumber,0,true)));
        }
    }//GEN-LAST:event_ordersTableKeyPressed

    private void ordersTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ordersTableKeyReleased
                ordersTable.setRowSelectionAllowed(true);
        int OrderRowNumber = ordersTable.getSelectedRow();
        if(OrderRowNumber != -1 && ( evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN ) ) {
        mealid.setText(ordersTable.getValueAt(OrderRowNumber,1)+"");
        quantity.setText(ordersTable.getValueAt(OrderRowNumber,2)+"");
        
        mealsTable.setRowSelectionAllowed(true);
        for(int MealRowNumber = 0; MealRowNumber<MealsTable.getRowCount() ;MealRowNumber++) 
                    if( Integer.parseInt(MealsTable.getValueAt(MealRowNumber,0)+"") == Integer.parseInt(mealid.getText()) ) OrderRowNumber = MealRowNumber;
        mealsTable.setRowSelectionInterval(OrderRowNumber,OrderRowNumber);
        mealsTable.scrollRectToVisible(new Rectangle(mealsTable.getCellRect( OrderRowNumber,0,true)));
        }
    }//GEN-LAST:event_ordersTableKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Cancel;
    private javax.swing.JButton CancelOrder;
    private javax.swing.JTextField NameSearch;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField customerid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mealid;
    private javax.swing.JTable mealsTable;
    private javax.swing.JTable ordersTable;
    private javax.swing.JTextField quantity;
    private javax.swing.JButton search;
    private javax.swing.JTextField totalpoints;
    private javax.swing.JTextField totalprice;
    // End of variables declaration//GEN-END:variables

}
