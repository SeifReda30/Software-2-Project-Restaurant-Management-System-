package Views;

import Controllers.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;


public class Customer extends javax.swing.JFrame {

    DefaultTableModel CustomerDataTable = new DefaultTableModel();

    public Customer() {
        try{
        initComponents();
        setLocationRelativeTo(null);
        customersTable.setModel(CustomerDataTable);
        customersTable.setDefaultEditor(Object.class,null);
        
        CustomerDataTable.addColumn("ID"); CustomerDataTable.addColumn("Name"); 
        CustomerDataTable.addColumn("Address"); CustomerDataTable.addColumn("Phone Number");
        CustomerDataTable.addColumn("Marketing"); CustomerDataTable.addColumn("Loyalty&Reward Programs"); 
        CustomerDataTable.addColumn("Total Payments"); CustomerDataTable.addColumn("Points"); 
        CustomerDataTable.addColumn("Gifts");CustomerDataTable.addColumn("Spetial Offers");
        }catch(Exception ex){} 
    }
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        Add = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        IDSearch = new javax.swing.JTextField();
        SearchByID = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        Address = new javax.swing.JTextField();
        PhoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Order = new javax.swing.JButton();
        Activities = new javax.swing.JTextField();
        ShowList = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TotalPayments = new javax.swing.JTextField();
        Refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        NameSearch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Id = new javax.swing.JTextField();
        SearchByName = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        points = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        gifts = new javax.swing.JTextField();
        spetialOffers = new javax.swing.JTextField();
        Logout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee");

        customersTable.setBackground(new java.awt.Color(255, 255, 0));
        customersTable.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        customersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null}
            },
            new String [] {
                "Customer"
            }
        ));
        customersTable.setColumnSelectionAllowed(true);
        customersTable.setGridColor(new java.awt.Color(102, 102, 0));
        customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersTableMouseClicked(evt);
            }
        });
        customersTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                customersTableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                customersTableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(customersTable);
        customersTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        Add.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Search By ID");

        SearchByID.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        SearchByID.setText("Search");
        SearchByID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Phone Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Address");

        Name.setEditable(false);

        Address.setEditable(false);

        PhoneNumber.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Activities");

        Order.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        Order.setText("Order");
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });

        Activities.setEditable(false);

        ShowList.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        ShowList.setText("Show List");
        ShowList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowListActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Total Payments");

        TotalPayments.setEditable(false);

        Refresh.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        Refresh.setText("Refresh");
        Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RefreshActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Search By Name");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Id");

        Id.setEditable(false);

        SearchByName.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        SearchByName.setText("Search");
        SearchByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchByNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Points");

        points.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Gifts");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Special Offers");

        gifts.setEditable(false);

        spetialOffers.setEditable(false);

        Logout.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jScrollPane1)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(jLabel1)
                        .add(jLabel4)
                        .add(jLabel3)
                        .add(jLabel5)
                        .add(jLabel8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(jLabel6)
                    .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(Activities)
                    .add(PhoneNumber)
                    .add(Address)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(IDSearch)
                            .add(Id)
                            .add(NameSearch, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(Name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 264, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(SearchByName, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(SearchByID, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(gifts, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .add(TotalPayments))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel11)
                            .add(jLabel9))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(spetialOffers, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .add(points))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 97, Short.MAX_VALUE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(Add, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .add(ShowList, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .add(update, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .add(Order, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .add(Refresh, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                    .add(Logout, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .add(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 117, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(7, 7, 7)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1)
                            .add(IDSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(SearchByID))
                        .add(18, 18, 18)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(NameSearch, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(SearchByName)
                            .add(jLabel7)))
                    .add(layout.createSequentialGroup()
                        .add(17, 17, 17)
                        .add(ShowList)
                        .add(27, 27, 27)
                        .add(Add)))
                .add(28, 28, 28)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel8)
                            .add(Id, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel2)
                            .add(Name, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(update))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel4)
                            .add(Address, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(25, 25, 25))
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jLabel3)
                        .add(PhoneNumber, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(Order)))
                .add(5, 5, 5)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Activities, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel5))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(TotalPayments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(points, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel9)
                    .add(jLabel6)
                    .add(Refresh))
                .add(24, 24, 24)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(gifts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel10)
                    .add(spetialOffers, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(Logout))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ShowListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowListActionPerformed
        try{
            ArrayList<Object> CustomersData = CustomerScreensController.GetCustomersData(0);      
            CustomerDataTable.setRowCount(0);
            for(int Index=0; Index<CustomersData.size(); Index+=10){
            CustomerDataTable.addRow( new Object[] { CustomersData.get(Index+CustomerDataType.Id.ordinal()), CustomersData.get(Index+CustomerDataType.Name.ordinal()), 
                CustomersData.get(Index+CustomerDataType.Address.ordinal()), CustomersData.get(Index+CustomerDataType.PhoneNumber.ordinal()), 
                CustomersData.get(Index+CustomerDataType.Marketing.ordinal()), CustomersData.get(Index+CustomerDataType.LoyaltyRewardPrograms.ordinal()), 
                CustomersData.get(Index+CustomerDataType.TotalPayments.ordinal()), CustomersData.get(Index+CustomerDataType.Points.ordinal()), 
                CustomersData.get(Index+CustomerDataType.Gifts.ordinal()), CustomersData.get(Index+CustomerDataType.SpetialOffers.ordinal())} );
            }
        }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Showing Customer table List is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_ShowListActionPerformed

    private void SearchByIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByIDActionPerformed
        try{  
            customersTable.setRowSelectionAllowed(true);
            Id.setText(""); Name.setText(""); Address.setText(""); PhoneNumber.setText(""); Activities.setText("");
            TotalPayments.setText(""); points.setText(""); gifts.setText(""); spetialOffers.setText("");
            
            ArrayList<Object> CustomerData = CustomerScreensController.GetCustomersData(1, Integer.parseInt(IDSearch.getText()));      
            Id.setText(CustomerData.get(CustomerDataType.Id.ordinal())+"");
            Name.setText(CustomerData.get(CustomerDataType.Name.ordinal())+"");
            Address.setText(CustomerData.get(CustomerDataType.Address.ordinal())+""); 
            PhoneNumber.setText(CustomerData.get(CustomerDataType.PhoneNumber.ordinal())+"");
                    
            if(Integer.parseInt(CustomerData.get(CustomerDataType.Marketing.ordinal())+"")== 1 && 
               Integer.parseInt(CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal())+"")== 1)
                    Activities.setText(" Marketing & Loyalty_Reward_Programs");
            else if(Integer.parseInt(CustomerData.get(CustomerDataType.Marketing.ordinal())+"")== 1) 
                    Activities.setText(" Marketing");
            else if(Integer.parseInt(CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal())+"")== 1)  
                    Activities.setText(" Loyalty_Reward_Programs");
            else    Activities.setText(" No Activities");
                    
            TotalPayments.setText(CustomerData.get(CustomerDataType.TotalPayments.ordinal())+"");
            points.setText(CustomerData.get(CustomerDataType.Points.ordinal())+"");
            gifts.setText(CustomerData.get(CustomerDataType.Gifts.ordinal())+"");
            spetialOffers.setText(CustomerData.get(CustomerDataType.SpetialOffers.ordinal())+"");
                    
            if(CustomerDataTable.getRowCount() != 0 ) {
                for(int RowNumber = 0; RowNumber<CustomerDataTable.getRowCount() ;RowNumber++) 
                    if( Integer.parseInt(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Id.ordinal())+"") == Integer.parseInt(Id.getText()) )
                        {
                          customersTable.setRowSelectionInterval(RowNumber,RowNumber);
                          customersTable.scrollRectToVisible(new Rectangle(customersTable.getCellRect( RowNumber,CustomerDataType.Id.ordinal(),true)));
                        }
                    }  
            
            if( Name.getText().equals("") ) { 
                customersTable.setRowSelectionAllowed(false);
                JOptionPane.showMessageDialog(null,"id not found!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Searching for a Customer is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
         //catch (Exception ex)    { JOptionPane.showMessageDialog(null,"Invalid id!","Error",JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_SearchByIDActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        CustomerScreensController.AddCustomerScreenLoading();
    }//GEN-LAST:event_AddActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int RowNumber = customersTable.getSelectedRow();
        if(RowNumber != -1) CustomerScreensController.UpdateCustomerScreenLoading(Integer.parseInt(customersTable.getValueAt(RowNumber,CustomerDataType.Id.ordinal())+""));
        else CustomerScreensController.UpdateCustomerScreenLoading(RowNumber);
    }//GEN-LAST:event_updateActionPerformed

    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
        int RowNumber = customersTable.getSelectedRow();
        if(RowNumber != -1) CustomerScreensController.MakeOrdersScreenLoading(Integer.parseInt(customersTable.getValueAt(RowNumber,CustomerDataType.Id.ordinal())+""));
        else if(!IDSearch.getText().equals("")) CustomerScreensController.MakeOrdersScreenLoading(Integer.parseInt(IDSearch.getText()));
        else CustomerScreensController.MakeOrdersScreenLoading(RowNumber);
    }//GEN-LAST:event_OrderActionPerformed

    private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
        int RowNumber = customersTable.getSelectedRow();
        
        Id.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Id.ordinal())+"");
        Name.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Name.ordinal())+"");
        Address.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Address.ordinal())+""); 
        PhoneNumber.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.PhoneNumber.ordinal())+"");
        if( Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Marketing.ordinal()))== 1 && 
            Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.LoyaltyRewardPrograms.ordinal())) == 1 )
                Activities.setText(" Marketing & Loyalty_Reward_Programs");
        else if(Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Marketing.ordinal()))== 1) 
                Activities.setText(" Marketing");
        else if( Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.LoyaltyRewardPrograms.ordinal())) == 1)  
                Activities.setText(" Loyalty_Reward_Programs");
        else    Activities.setText(" No Activities");
        TotalPayments.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.TotalPayments.ordinal())+"");
        points.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Points.ordinal())+"");
        gifts.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Gifts.ordinal())+"");
        spetialOffers.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.SpetialOffers.ordinal())+"");
    }//GEN-LAST:event_customersTableMouseClicked

    private void RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RefreshActionPerformed
        Id.setText(""); Name.setText(""); Address.setText(""); PhoneNumber.setText(""); Activities.setText("");
        TotalPayments.setText(""); points.setText(""); gifts.setText(""); spetialOffers.setText("");
        NameSearch.setText(""); IDSearch.setText(""); CustomerDataTable.setRowCount(0);
    }//GEN-LAST:event_RefreshActionPerformed

    private void SearchByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchByNameActionPerformed
        try{ 
            customersTable.setRowSelectionAllowed(true);
            Id.setText(""); Name.setText(""); Address.setText(""); PhoneNumber.setText(""); Activities.setText("");
            TotalPayments.setText(""); points.setText(""); gifts.setText(""); spetialOffers.setText("");
            
            ArrayList<Object> CustomerData = CustomerScreensController.GetCustomersData(2, NameSearch.getText());      
            Id.setText(CustomerData.get(CustomerDataType.Id.ordinal())+"");
            Name.setText(CustomerData.get(CustomerDataType.Name.ordinal())+"");
            Address.setText(CustomerData.get(CustomerDataType.Address.ordinal())+""); 
            PhoneNumber.setText(CustomerData.get(CustomerDataType.PhoneNumber.ordinal())+"");
                    
            if(Integer.parseInt(CustomerData.get(CustomerDataType.Marketing.ordinal())+"")== 1 && 
               Integer.parseInt(CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal())+"")== 1)
                    Activities.setText(" Marketing & Loyalty_Reward_Programs");
            else if(Integer.parseInt(CustomerData.get(CustomerDataType.Marketing.ordinal())+"")== 1) 
                    Activities.setText(" Marketing");
            else if(Integer.parseInt(CustomerData.get(CustomerDataType.LoyaltyRewardPrograms.ordinal())+"")== 1)  
                    Activities.setText(" Loyalty_Reward_Programs");
            else    Activities.setText(" No Activities");
                    
            TotalPayments.setText(CustomerData.get(CustomerDataType.TotalPayments.ordinal())+"");
            points.setText(CustomerData.get(CustomerDataType.Points.ordinal())+"");
            gifts.setText(CustomerData.get(CustomerDataType.Gifts.ordinal())+"");
            spetialOffers.setText(CustomerData.get(CustomerDataType.SpetialOffers.ordinal())+"");
                    
            if(CustomerDataTable.getRowCount() != 0 ) {
                for(int RowNumber = 0; RowNumber<CustomerDataTable.getRowCount() ;RowNumber++) 
                    if( Integer.parseInt(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Id.ordinal())+"") == Integer.parseInt(Id.getText()) )
                        {
                          customersTable.setRowSelectionInterval(RowNumber,RowNumber);
                          customersTable.scrollRectToVisible(new Rectangle(customersTable.getCellRect( RowNumber,CustomerDataType.Id.ordinal(),true)));
                        }
                    }  
            if(Name.getText().equals("")) {
                    customersTable.setRowSelectionAllowed(false);
                    JOptionPane.showMessageDialog(null,"Name not found!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Searching for a Customer is Failed!","Error",JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_SearchByNameActionPerformed

    private void customersTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customersTableKeyReleased
        int RowNumber = customersTable.getSelectedRow();
        if(RowNumber != -1 && ( evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN ) ) {
            Id.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Id.ordinal())+"");
        Name.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Name.ordinal())+"");
        Address.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Address.ordinal())+""); 
        PhoneNumber.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.PhoneNumber.ordinal())+"");
        if( Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Marketing.ordinal()))== 1 && 
            Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.LoyaltyRewardPrograms.ordinal())) == 1 )
                Activities.setText(" Marketing & Loyalty_Reward_Programs");
        else if(Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Marketing.ordinal()))== 1) 
                Activities.setText(" Marketing");
        else if( Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.LoyaltyRewardPrograms.ordinal())) == 1)  
                Activities.setText(" Loyalty_Reward_Programs");
        else    Activities.setText(" No Activities");
        TotalPayments.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.TotalPayments.ordinal())+"");
        points.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Points.ordinal())+"");
        gifts.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Gifts.ordinal())+"");
        spetialOffers.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.SpetialOffers.ordinal())+"");
        }
    }//GEN-LAST:event_customersTableKeyReleased

    private void customersTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_customersTableKeyPressed
        int RowNumber = customersTable.getSelectedRow();
        if(RowNumber != -1 && ( evt.getKeyCode() == KeyEvent.VK_UP || evt.getKeyCode() == KeyEvent.VK_DOWN ) ) {
            Id.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Id.ordinal())+"");
        Name.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Name.ordinal())+"");
        Address.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Address.ordinal())+""); 
        PhoneNumber.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.PhoneNumber.ordinal())+"");
        if( Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Marketing.ordinal()))== 1 && 
            Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.LoyaltyRewardPrograms.ordinal())) == 1 )
                Activities.setText(" Marketing & Loyalty_Reward_Programs");
        else if(Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Marketing.ordinal()))== 1) 
                Activities.setText(" Marketing");
        else if( Integer.parseInt((String)CustomerDataTable.getValueAt(RowNumber,CustomerDataType.LoyaltyRewardPrograms.ordinal())) == 1)  
                Activities.setText(" Loyalty_Reward_Programs");
        else    Activities.setText(" No Activities");
        TotalPayments.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.TotalPayments.ordinal())+"");
        points.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Points.ordinal())+"");
        gifts.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.Gifts.ordinal())+"");
        spetialOffers.setText(CustomerDataTable.getValueAt(RowNumber,CustomerDataType.SpetialOffers.ordinal())+"");
        }
    }//GEN-LAST:event_customersTableKeyPressed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        JOptionPane.showMessageDialog(this, "Bye Bye see you next time");
        this.dispose();
        WelcomeScreensLoading.SecondWelcomeScreenLoading();
    }//GEN-LAST:event_LogoutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Activities;
    private javax.swing.JButton Add;
    private javax.swing.JTextField Address;
    private javax.swing.JTextField IDSearch;
    private javax.swing.JTextField Id;
    private javax.swing.JButton Logout;
    private javax.swing.JTextField Name;
    private javax.swing.JTextField NameSearch;
    private javax.swing.JButton Order;
    private javax.swing.JTextField PhoneNumber;
    private javax.swing.JButton Refresh;
    private javax.swing.JButton SearchByID;
    private javax.swing.JButton SearchByName;
    private javax.swing.JButton ShowList;
    private javax.swing.JTextField TotalPayments;
    private javax.swing.JTable customersTable;
    private javax.swing.JTextField gifts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField points;
    private javax.swing.JTextField spetialOffers;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

}
