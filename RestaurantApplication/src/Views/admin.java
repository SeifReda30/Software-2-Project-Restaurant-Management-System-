package Views;

import Controllers.*;
import java.util.logging.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

enum AdminDataType{Id, Username, Password};
enum EmployeeDataType{Id, Username, Password, Phone, Address};

public class admin extends javax.swing.JFrame {

    DefaultTableModel EmployeesDataTable = new DefaultTableModel();
    DefaultTableModel MealsDataTable = new DefaultTableModel();
    DefaultTableModel CustomerDataTable = new DefaultTableModel();

    public admin() {
        initComponents();
        
        setLocationRelativeTo(null);
        emp_table.getTableHeader().setFont(new Font("Lato",Font.BOLD,12));
        emp_table.getTableHeader().setOpaque(false);
        emp_table.getTableHeader().setBackground(new Color(32,136,203));
        emp_table.getTableHeader().setForeground(new Color(255,255,255));
        emp_table.setRowHeight(25);
        meal_table.getTableHeader().setFont(new Font("Lato",Font.BOLD,12));
        meal_table.getTableHeader().setOpaque(false);
        meal_table.getTableHeader().setBackground(new Color(32,136,203));
        meal_table.getTableHeader().setForeground(new Color(255,255,255));
        meal_table.setRowHeight(25);
        emp_table_report.getTableHeader().setFont(new Font("Lato",Font.BOLD,12));
        emp_table_report.getTableHeader().setOpaque(false);
        emp_table_report.getTableHeader().setBackground(new Color(32,136,203));
        emp_table_report.getTableHeader().setForeground(new Color(255,255,255));
        emp_table_report.setRowHeight(25);
        customer_table.getTableHeader().setFont(new Font("Lato",Font.BOLD,12));
        customer_table.getTableHeader().setOpaque(false);
        customer_table.getTableHeader().setBackground(new Color(32,136,203));
        customer_table.getTableHeader().setForeground(new Color(255,255,255));
        customer_table.setRowHeight(25);
        meal_table_act.getTableHeader().setFont(new Font("Lato",Font.BOLD,12));
        meal_table_act.getTableHeader().setOpaque(false);
        meal_table_act.getTableHeader().setBackground(new Color(32,136,203));
        meal_table_act.getTableHeader().setForeground(new Color(255,255,255));
        meal_table_act.setRowHeight(25);        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        employeeIdAdd = new javax.swing.JTextField();
        employeeNameAdd = new javax.swing.JTextField();
        employeePhoneAdd = new javax.swing.JTextField();
        employeeAddressAdd = new javax.swing.JTextField();
        AddEmployee = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        employeePasswordAdd = new javax.swing.JPasswordField();
        ShowPasswordAddEmployee = new javax.swing.JButton();
        HidePasswordAddEmployee = new javax.swing.JButton();
        ResetAddEmployee = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        emp_table = new javax.swing.JTable();
        ShowDataEmployee = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        employeeSearchId = new javax.swing.JTextField();
        emp_name3 = new javax.swing.JLabel();
        EmployeeNameSearch = new javax.swing.JLabel();
        emp_address3 = new javax.swing.JLabel();
        EmployeePhoneSearch = new javax.swing.JLabel();
        emp_phone3 = new javax.swing.JLabel();
        EmployeeAddressSearch = new javax.swing.JLabel();
        SearchEmployee = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        EmployeePasswordSearch = new javax.swing.JLabel();
        HidePasswordSearchEmployee = new javax.swing.JButton();
        ShowPasswordSearchEmployee = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        employeeidDelete = new javax.swing.JTextField();
        DeleteEmployee = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        employeeIdUpdate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        employeeNameUpdate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        employeePhoneUpdate = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        employeeAddressUpdate = new javax.swing.JTextField();
        UpdateEmployee = new javax.swing.JButton();
        SearchUpdateEmployee = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        employeePasswordUpdate = new javax.swing.JPasswordField();
        ShowPasswordUpdateEmployee = new javax.swing.JButton();
        HidePasswordUpdateEmployee = new javax.swing.JButton();
        ResetUpdateEmployee = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        mealIdAdd = new javax.swing.JTextField();
        mealNameAdd = new javax.swing.JTextField();
        mealPriceAdd = new javax.swing.JTextField();
        mealQuantityAdd = new javax.swing.JTextField();
        AddMeal = new javax.swing.JButton();
        ResetAddMeal = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        mealIdDelete = new javax.swing.JTextField();
        DeleteMeal = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        mealIdUpdate = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        mealNameUpdate = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        mealPriceUpdate = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        mealQuantityUpdate = new javax.swing.JTextField();
        UpdateMeal = new javax.swing.JButton();
        SearchUpdateMeal = new javax.swing.JButton();
        ResetUpdateMeal = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        mealIdSearch = new javax.swing.JTextField();
        Jlabel = new javax.swing.JLabel();
        Jlabe1 = new javax.swing.JLabel();
        jlabel2 = new javax.swing.JLabel();
        SearchMeal = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        MealPriceSearch = new javax.swing.JLabel();
        MealQuantitySearch = new javax.swing.JLabel();
        MealNameSearch = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        meal_table = new javax.swing.JTable();
        ShowDataMeal = new javax.swing.JButton();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        emp_table_report = new javax.swing.JTable();
        ShowDataReportEmployee = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        customer_table = new javax.swing.JTable();
        ShowDataReportCustomer = new javax.swing.JButton();
        jTabbedPane9 = new javax.swing.JTabbedPane();
        jPanel17 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        meal_table_act = new javax.swing.JTable();
        jLabel40 = new javax.swing.JLabel();
        mealIdSpecialOffers = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        DiscountPercentageSpecialOffers = new javax.swing.JTextField();
        MakeOffer = new javax.swing.JButton();
        ShowDataSpecialOffers = new javax.swing.JButton();
        ResetMakeOffers = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        loyaltyAndRewardProgramText = new javax.swing.JTextArea();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        loyaltyadded = new javax.swing.JLabel();
        AddLoyaltyAndReward = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        marketingIdeaText = new javax.swing.JTextArea();
        jLabel51 = new javax.swing.JLabel();
        AddMarketingIdea = new javax.swing.JButton();
        markeingadd = new javax.swing.JLabel();
        jTabbedPane6 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        adminUsernameAdd = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        adminIdAdd = new javax.swing.JTextField();
        AddNewAdmin = new javax.swing.JButton();
        adminPasswordAdd = new javax.swing.JPasswordField();
        ShowPasswordAddNewAdmin = new javax.swing.JButton();
        HidePasswordAddNewAdmin = new javax.swing.JButton();
        ResetAddNewAdmin = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        idDeleteAdmin = new javax.swing.JTextField();
        DeleteAdmin = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        IdAdminUpdate = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        usernameAdminUpdate = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        UpdateAdmin = new javax.swing.JButton();
        SearchUpdateAdmin = new javax.swing.JButton();
        PasswordAdminUpdate = new javax.swing.JPasswordField();
        ShowPasswordUpdateAdmin = new javax.swing.JButton();
        HidePasswordUpdateAdmin = new javax.swing.JButton();
        ResetUpdateAdmin = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        Logout = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");
        setSize(new java.awt.Dimension(700, 562));

        jTabbedPane1.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 221, 227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel1.setText("Enter Id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel2.setText("Enter Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel3.setText("Enter Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setText("Enter Phone number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 190, -1, -1));
        jPanel1.add(employeeIdAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 116, -1));
        jPanel1.add(employeeNameAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 116, -1));
        jPanel1.add(employeePhoneAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 116, -1));
        jPanel1.add(employeeAddressAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, 116, -1));

        AddEmployee.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        AddEmployee.setText("Add");
        AddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(AddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 123, 39));

        jLabel11.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel11.setText("Enter Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));
        jPanel1.add(employeePasswordAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 116, -1));

        ShowPasswordAddEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ShowPasswordAddEmployee.setText("Show Password");
        ShowPasswordAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordAddEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(ShowPasswordAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 110, 138, -1));

        HidePasswordAddEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HidePasswordAddEmployee.setText("Hide Password");
        HidePasswordAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidePasswordAddEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(HidePasswordAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, 138, -1));

        ResetAddEmployee.setFont(new java.awt.Font("Bebas", 0, 18)); // NOI18N
        ResetAddEmployee.setText("Reset");
        ResetAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetAddEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(ResetAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, 127, 39));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emp.png"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 150, -1));

        jTabbedPane2.addTab("Add", jPanel1);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        emp_table.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        emp_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Password", "Address", "Phone Number"
            }
        ));
        emp_table.setToolTipText("");
        emp_table.setFocusable(false);
        emp_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        emp_table.setRowHeight(25);
        emp_table.setSelectionBackground(new java.awt.Color(215, 117, 132));
        emp_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(emp_table);

        ShowDataEmployee.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        ShowDataEmployee.setText("Show Data");
        ShowDataEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(395, 395, 395)
                .addComponent(ShowDataEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ShowDataEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("List", jPanel5);

        jPanel4.setBackground(new java.awt.Color(0, 221, 227));

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel10.setText("Enter Id");

        emp_name3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        emp_name3.setText("Your Name");

        EmployeeNameSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmployeeNameSearch.setForeground(new java.awt.Color(51, 51, 51));

        emp_address3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        emp_address3.setText("Your Address");

        EmployeePhoneSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmployeePhoneSearch.setForeground(new java.awt.Color(51, 51, 51));

        emp_phone3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        emp_phone3.setText("Your Phone number");

        EmployeeAddressSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmployeeAddressSearch.setForeground(new java.awt.Color(51, 51, 51));

        SearchEmployee.setFont(new java.awt.Font("Bebas", 0, 14)); // NOI18N
        SearchEmployee.setText("Search");
        SearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchEmployeeActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel15.setText("Your Password");
        jLabel15.setInheritsPopupMenu(false);

        EmployeePasswordSearch.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmployeePasswordSearch.setForeground(new java.awt.Color(51, 51, 51));

        HidePasswordSearchEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HidePasswordSearchEmployee.setText("Hide Password");
        HidePasswordSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidePasswordSearchEmployeeActionPerformed(evt);
            }
        });

        ShowPasswordSearchEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ShowPasswordSearchEmployee.setText("Show Password");
        ShowPasswordSearchEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordSearchEmployeeActionPerformed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/emp2.png"))); // NOI18N
        jLabel14.setText("jLabel14");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(emp_name3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EmployeeNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emp_phone3)
                                    .addComponent(emp_address3)
                                    .addComponent(jLabel15))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmployeePasswordSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(EmployeeAddressSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 10, Short.MAX_VALUE)
                                        .addComponent(EmployeePhoneSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(HidePasswordSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowPasswordSearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(209, 209, 209))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(employeeSearchId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(SearchEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(emp_name3)
                                    .addComponent(EmployeeNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(EmployeePasswordSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(EmployeePhoneSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(16, 16, 16)
                                        .addComponent(emp_phone3))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(ShowPasswordSearchEmployee)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(HidePasswordSearchEmployee)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(emp_address3))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EmployeeAddressSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(180, 180, 180))))
        );

        jTabbedPane2.addTab("Search", jPanel4);

        jPanel2.setBackground(new java.awt.Color(0, 221, 227));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel5.setText("Enter Id");

        DeleteEmployee.setFont(new java.awt.Font("Bebas", 0, 14)); // NOI18N
        DeleteEmployee.setText("Delete");
        DeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteEmployeeActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empdelete.png"))); // NOI18N
        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49)
                        .addComponent(employeeidDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(430, 430, 430)
                        .addComponent(DeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(407, 407, 407)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(432, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(employeeidDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(41, 41, 41)
                .addComponent(DeleteEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(123, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Delete", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 221, 227));
        jPanel3.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel6.setText("Enter Id");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(337, 48, 49, 15);
        jPanel3.add(employeeIdUpdate);
        employeeIdUpdate.setBounds(397, 46, 135, 20);

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel7.setText("Your Name");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(294, 159, 69, 15);

        employeeNameUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeNameUpdateActionPerformed(evt);
            }
        });
        jPanel3.add(employeeNameUpdate);
        employeeNameUpdate.setBounds(452, 157, 155, 20);

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel8.setText("Your Address");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(294, 274, 82, 15);
        jPanel3.add(employeePhoneUpdate);
        employeePhoneUpdate.setBounds(452, 232, 155, 20);

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel9.setText("Your Phone number");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(294, 234, 124, 15);
        jPanel3.add(employeeAddressUpdate);
        employeeAddressUpdate.setBounds(452, 272, 155, 20);

        UpdateEmployee.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        UpdateEmployee.setText("Update");
        UpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateEmployeeActionPerformed(evt);
            }
        });
        jPanel3.add(UpdateEmployee);
        UpdateEmployee.setBounds(370, 320, 82, 32);

        SearchUpdateEmployee.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        SearchUpdateEmployee.setText("Search");
        SearchUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUpdateEmployeeActionPerformed(evt);
            }
        });
        jPanel3.add(SearchUpdateEmployee);
        SearchUpdateEmployee.setBounds(400, 90, 97, 25);

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel13.setText("Your Password");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(294, 196, 93, 15);
        jPanel3.add(employeePasswordUpdate);
        employeePasswordUpdate.setBounds(452, 194, 155, 20);

        ShowPasswordUpdateEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ShowPasswordUpdateEmployee.setText("Show Password");
        ShowPasswordUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordUpdateEmployeeActionPerformed(evt);
            }
        });
        jPanel3.add(ShowPasswordUpdateEmployee);
        ShowPasswordUpdateEmployee.setBounds(662, 180, 130, 23);

        HidePasswordUpdateEmployee.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        HidePasswordUpdateEmployee.setText("Hide Password");
        HidePasswordUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidePasswordUpdateEmployeeActionPerformed(evt);
            }
        });
        jPanel3.add(HidePasswordUpdateEmployee);
        HidePasswordUpdateEmployee.setBounds(662, 214, 130, 23);

        ResetUpdateEmployee.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        ResetUpdateEmployee.setText("Reset");
        ResetUpdateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetUpdateEmployeeActionPerformed(evt);
            }
        });
        jPanel3.add(ResetUpdateEmployee);
        ResetUpdateEmployee.setBounds(510, 320, 88, 32);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empudate.png"))); // NOI18N
        jLabel27.setText("jLabel27");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(60, 140, 170, 170);

        jTabbedPane2.addTab("Update", jPanel3);

        jTabbedPane1.addTab("Manage Employee", null, jTabbedPane2, "");

        jTabbedPane3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel6.setBackground(new java.awt.Color(255, 222, 43));

        jLabel17.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel17.setText("Enter Id");

        jLabel18.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel18.setText("Enter Name");

        jLabel19.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel19.setText("Enter Price");

        jLabel20.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel20.setText("Enter Quantity");

        AddMeal.setFont(new java.awt.Font("Bebas", 0, 14)); // NOI18N
        AddMeal.setText("Add");
        AddMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMealActionPerformed(evt);
            }
        });

        ResetAddMeal.setFont(new java.awt.Font("Bebas", 0, 14)); // NOI18N
        ResetAddMeal.setText("Reset");
        ResetAddMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetAddMealActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meal1.png"))); // NOI18N
        jLabel28.setText("jLabel28");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meal2.png"))); // NOI18N
        jLabel29.setText("jLabel29");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meal3.png"))); // NOI18N
        jLabel30.setText("jLabel30");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addComponent(AddMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel19))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(75, 75, 75)
                                        .addComponent(ResetAddMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(mealPriceAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mealQuantityAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mealNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(139, 139, 139)
                                .addComponent(mealIdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153)))
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(mealIdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(mealNameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(mealPriceAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(mealQuantityAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetAddMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Add", jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 222, 43));

        jLabel21.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel21.setText("Enter Id");

        DeleteMeal.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        DeleteMeal.setText("Delete");
        DeleteMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMealActionPerformed(evt);
            }
        });

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jLabel31.setText("jLabel31");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(jLabel21)
                .addGap(36, 36, 36)
                .addComponent(mealIdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(413, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(DeleteMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(451, 451, 451))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(mealIdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(DeleteMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("Delete", jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 222, 43));

        jLabel22.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel22.setText("Enter Id");

        jLabel23.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel23.setText("Meal Name");

        jLabel24.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel24.setText("Meal Price");

        jLabel25.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel25.setText("Meal Quantity");

        UpdateMeal.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        UpdateMeal.setText("Update");
        UpdateMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMealActionPerformed(evt);
            }
        });

        SearchUpdateMeal.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        SearchUpdateMeal.setText("Search");
        SearchUpdateMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUpdateMealActionPerformed(evt);
            }
        });

        ResetUpdateMeal.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        ResetUpdateMeal.setText("Reset");
        ResetUpdateMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetUpdateMealActionPerformed(evt);
            }
        });

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.png"))); // NOI18N
        jLabel32.setText("jLabel32");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(61, 61, 61)
                                .addComponent(mealIdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(SearchUpdateMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel25)
                                    .addGroup(jPanel8Layout.createSequentialGroup()
                                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel23)
                                            .addGroup(jPanel8Layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(UpdateMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(51, 51, 51)
                                        .addComponent(ResetUpdateMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 53, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mealNameUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                    .addComponent(mealPriceUpdate)
                                    .addComponent(mealQuantityUpdate))))))
                .addGap(351, 351, 351))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(mealIdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SearchUpdateMeal)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mealNameUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mealPriceUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mealQuantityUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ResetUpdateMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPane3.addTab("Update", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 222, 43));
        jPanel9.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel26.setText("Enter Id");
        jPanel9.add(jLabel26);
        jLabel26.setBounds(391, 71, 49, 15);
        jPanel9.add(mealIdSearch);
        mealIdSearch.setBounds(497, 69, 96, 20);

        Jlabel.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Jlabel.setText("Meal Name");
        jPanel9.add(Jlabel);
        Jlabel.setBounds(397, 176, 70, 15);

        Jlabe1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Jlabe1.setText("Meal Price");
        jPanel9.add(Jlabe1);
        Jlabe1.setBounds(397, 214, 65, 15);

        jlabel2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jlabel2.setText("Meal Quantity");
        jPanel9.add(jlabel2);
        jlabel2.setBounds(397, 247, 89, 15);

        SearchMeal.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        SearchMeal.setText("Search");
        SearchMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchMealActionPerformed(evt);
            }
        });
        jPanel9.add(SearchMeal);
        SearchMeal.setBounds(458, 107, 80, 25);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/meal4.png"))); // NOI18N
        jLabel42.setText("jLabel42");
        jPanel9.add(jLabel42);
        jLabel42.setBounds(60, 90, 230, 220);

        MealPriceSearch.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jPanel9.add(MealPriceSearch);
        MealPriceSearch.setBounds(560, 210, 100, 20);

        MealQuantitySearch.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jPanel9.add(MealQuantitySearch);
        MealQuantitySearch.setBounds(560, 240, 100, 20);

        MealNameSearch.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        jPanel9.add(MealNameSearch);
        MealNameSearch.setBounds(560, 176, 220, 20);

        jTabbedPane3.addTab("Search", jPanel9);

        meal_table.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        meal_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Price", "Quantity"
            }
        ));
        meal_table.setFocusable(false);
        meal_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        meal_table.setRowHeight(25);
        meal_table.setSelectionBackground(new java.awt.Color(255, 222, 43));
        meal_table.getTableHeader().setReorderingAllowed(false);
        jScrollPane8.setViewportView(meal_table);

        ShowDataMeal.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        ShowDataMeal.setText("Show Data");
        ShowDataMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataMealActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(413, 413, 413)
                .addComponent(ShowDataMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 67, Short.MAX_VALUE)
                .addComponent(ShowDataMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane3.addTab("List", jPanel10);

        jTabbedPane1.addTab("Manage Meals", jTabbedPane3);

        jTabbedPane4.setBackground(new java.awt.Color(255, 255, 255));

        emp_table_report.setBorder(new javax.swing.border.MatteBorder(null));
        emp_table_report.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        emp_table_report.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Password", "Address", "Phone Number"
            }
        ));
        emp_table_report.setFocusable(false);
        emp_table_report.setIntercellSpacing(new java.awt.Dimension(0, 0));
        emp_table_report.setRowHeight(25);
        emp_table_report.setSelectionBackground(new java.awt.Color(255, 94, 118));
        jScrollPane3.setViewportView(emp_table_report);

        ShowDataReportEmployee.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        ShowDataReportEmployee.setText("Show Data");
        ShowDataReportEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataReportEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(ShowDataReportEmployee)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(ShowDataReportEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane4.addTab("Employee", jPanel11);

        customer_table.setBorder(new javax.swing.border.MatteBorder(null));
        customer_table.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        customer_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FullName", "Address", "Phone_Number", "Marketing", "Loyalty_Reward_Programs", "Total_Payments", "Points", "Gifts", "Special_Offers"
            }
        ));
        customer_table.setFocusable(false);
        customer_table.setIntercellSpacing(new java.awt.Dimension(0, 0));
        customer_table.setRowHeight(25);
        customer_table.setSelectionBackground(new java.awt.Color(106, 244, 169));
        jScrollPane4.setViewportView(customer_table);

        ShowDataReportCustomer.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        ShowDataReportCustomer.setText("Show Data");
        ShowDataReportCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataReportCustomerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(ShowDataReportCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(0, 59, Short.MAX_VALUE)
                .addComponent(ShowDataReportCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane4.addTab("Customer", jPanel12);

        jTabbedPane1.addTab("Make Reports", jTabbedPane4);

        jTabbedPane9.setBackground(new java.awt.Color(255, 255, 255));

        jPanel17.setBackground(new java.awt.Color(203, 253, 135));

        meal_table_act.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        meal_table_act.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Price", "Quantity"
            }
        ));
        meal_table_act.setFocusable(false);
        meal_table_act.setIntercellSpacing(new java.awt.Dimension(0, 0));
        meal_table_act.setRowHeight(25);
        meal_table_act.setSelectionBackground(new java.awt.Color(136, 252, 182));
        meal_table_act.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                meal_table_actMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(meal_table_act);

        jLabel40.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel40.setText("Enter Meal Id");

        jLabel41.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel41.setText("Enter Discount Percentage");

        MakeOffer.setFont(new java.awt.Font("Lato Black", 1, 12)); // NOI18N
        MakeOffer.setText("Make Offer");
        MakeOffer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MakeOfferActionPerformed(evt);
            }
        });

        ShowDataSpecialOffers.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        ShowDataSpecialOffers.setText("Show Data");
        ShowDataSpecialOffers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowDataSpecialOffersActionPerformed(evt);
            }
        });

        ResetMakeOffers.setFont(new java.awt.Font("Lato Black", 1, 12)); // NOI18N
        ResetMakeOffers.setText("Reset");
        ResetMakeOffers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetMakeOffersActionPerformed(evt);
            }
        });

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/special.png"))); // NOI18N
        jLabel43.setText("jLabel43");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(ShowDataSpecialOffers, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(397, 397, 397)
                                .addComponent(jLabel40)
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                        .addComponent(MakeOffer, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mealIdSpecialOffers, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ResetMakeOffers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(DiscountPercentageSpecialOffers, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(391, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(ShowDataSpecialOffers)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(mealIdSpecialOffers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(DiscountPercentageSpecialOffers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ResetMakeOffers)
                    .addComponent(MakeOffer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel43)
                .addContainerGap())
        );

        jTabbedPane9.addTab("Special Offers", jPanel17);

        jPanel19.setBackground(new java.awt.Color(203, 253, 135));

        jLabel53.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel53.setText("Points System");

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setText("For every 1$ the customer earns 10 points and if customer");

        jLabel55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel55.setText("reached 10K points he earns a special offer from the restaurant");

        jLabel56.setFont(new java.awt.Font("Lato", 1, 18)); // NOI18N
        jLabel56.setText("Add loyalty & reward program");

        loyaltyAndRewardProgramText.setColumns(20);
        loyaltyAndRewardProgramText.setRows(5);
        jScrollPane7.setViewportView(loyaltyAndRewardProgramText);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/reward.png"))); // NOI18N
        jLabel57.setText("jLabel57");

        jLabel58.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel58.setText("Shop");
        jLabel58.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel59.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel59.setText("Earn");

        jLabel60.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel60.setText("Redeem");

        AddLoyaltyAndReward.setFont(new java.awt.Font("Bebas", 0, 14)); // NOI18N
        AddLoyaltyAndReward.setText("Add");
        AddLoyaltyAndReward.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddLoyaltyAndRewardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel55)
                            .addComponent(jLabel54)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel53)))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddLoyaltyAndReward, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(loyaltyadded, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addComponent(jLabel59))
                            .addComponent(jLabel57)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(jLabel58)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel60))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel53)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel55)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel56)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(AddLoyaltyAndReward)))
                        .addGap(18, 18, 18)
                        .addComponent(loyaltyadded, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Loyalty & Reward Programs", jPanel19);

        jPanel18.setBackground(new java.awt.Color(203, 253, 135));

        jLabel44.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel44.setText("Facebook Page");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel45.setText("https://www.facebook.com/restaurant/");

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/marketing.png"))); // NOI18N
        jLabel46.setText("jLabel46");

        jLabel47.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel47.setText("Marketing Cards");

        jLabel48.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel48.setText("Free Wi-Fi");

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/wifi.png"))); // NOI18N
        jLabel49.setText("jLabel49");

        jLabel50.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel50.setText("Add  Marketing Idea");

        marketingIdeaText.setColumns(20);
        marketingIdeaText.setRows(5);
        jScrollPane6.setViewportView(marketingIdeaText);

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/facebook.png"))); // NOI18N
        jLabel51.setText("jLabel51");

        AddMarketingIdea.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        AddMarketingIdea.setText("Add");
        AddMarketingIdea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMarketingIdeaActionPerformed(evt);
            }
        });

        markeingadd.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel47)
                .addGap(148, 148, 148))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AddMarketingIdea, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(markeingadd, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 249, Short.MAX_VALUE)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(117, 117, 117))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))
                                .addGap(128, 128, 128))))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel44)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addComponent(jLabel45)
                .addGap(328, 328, 328))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jLabel50))
                .addGap(18, 18, 18)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel48)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markeingadd, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(AddMarketingIdea)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel45)
                        .addGap(9, 9, 9)))
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane9.addTab("Marketing", jPanel18);

        jTabbedPane1.addTab("Add Activities", jTabbedPane9);

        jTabbedPane6.setBackground(new java.awt.Color(255, 255, 255));

        jPanel14.setBackground(new java.awt.Color(198, 198, 198));

        jLabel33.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel33.setText("Enter User name");

        jLabel34.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel34.setText("Enter Password");

        jLabel35.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel35.setText("Enter Id");

        AddNewAdmin.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        AddNewAdmin.setText("Add");
        AddNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddNewAdminActionPerformed(evt);
            }
        });

        ShowPasswordAddNewAdmin.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        ShowPasswordAddNewAdmin.setText("Show Password");
        ShowPasswordAddNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordAddNewAdminActionPerformed(evt);
            }
        });

        HidePasswordAddNewAdmin.setFont(new java.awt.Font("Lato", 1, 12)); // NOI18N
        HidePasswordAddNewAdmin.setText("Hide Password");
        HidePasswordAddNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidePasswordAddNewAdminActionPerformed(evt);
            }
        });

        ResetAddNewAdmin.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        ResetAddNewAdmin.setText("Reset");
        ResetAddNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetAddNewAdminActionPerformed(evt);
            }
        });

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin1.png"))); // NOI18N
        jLabel52.setText("jLabel52");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel35)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(adminIdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(adminPasswordAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(adminUsernameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ShowPasswordAddNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HidePasswordAddNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(AddNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(ResetAddNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel52))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(ShowPasswordAddNewAdmin)
                .addGap(7, 7, 7)
                .addComponent(HidePasswordAddNewAdmin))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adminIdAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel35))
                        .addGap(20, 20, 20)
                        .addComponent(adminUsernameAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)))
                .addGap(24, 24, 24)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(adminPasswordAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetAddNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane6.addTab("Add", jPanel14);

        jPanel16.setBackground(new java.awt.Color(198, 198, 198));

        jLabel39.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel39.setText("Enter Id");

        DeleteAdmin.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        DeleteAdmin.setText("Delete");
        DeleteAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAdminActionPerformed(evt);
            }
        });

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empdelete.png"))); // NOI18N
        jLabel61.setText("jLabel61");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel39)
                        .addGap(42, 42, 42)
                        .addComponent(idDeleteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(DeleteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(458, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(idDeleteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(DeleteAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        jTabbedPane6.addTab("Delete", jPanel16);

        jPanel15.setBackground(new java.awt.Color(189, 189, 189));
        jPanel15.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel36.setText("Enter Id");
        jPanel15.add(jLabel36);
        jLabel36.setBounds(319, 86, 49, 15);
        jPanel15.add(IdAdminUpdate);
        IdAdminUpdate.setBounds(404, 84, 103, 20);

        jLabel37.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel37.setText("Your User name");
        jPanel15.add(jLabel37);
        jLabel37.setBounds(300, 170, 98, 15);
        jPanel15.add(usernameAdminUpdate);
        usernameAdminUpdate.setBounds(450, 168, 100, 20);

        jLabel38.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel38.setText("Your Password");
        jPanel15.add(jLabel38);
        jLabel38.setBounds(300, 209, 110, 15);

        UpdateAdmin.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        UpdateAdmin.setText("Update");
        UpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAdminActionPerformed(evt);
            }
        });
        jPanel15.add(UpdateAdmin);
        UpdateAdmin.setBounds(340, 270, 77, 35);

        SearchUpdateAdmin.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        SearchUpdateAdmin.setText("Search");
        SearchUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchUpdateAdminActionPerformed(evt);
            }
        });
        jPanel15.add(SearchUpdateAdmin);
        SearchUpdateAdmin.setBounds(387, 122, 80, 25);
        jPanel15.add(PasswordAdminUpdate);
        PasswordAdminUpdate.setBounds(450, 207, 100, 20);

        ShowPasswordUpdateAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShowPasswordUpdateAdmin.setText("Show Password");
        ShowPasswordUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordUpdateAdminActionPerformed(evt);
            }
        });
        jPanel15.add(ShowPasswordUpdateAdmin);
        ShowPasswordUpdateAdmin.setBounds(595, 178, 150, 23);

        HidePasswordUpdateAdmin.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        HidePasswordUpdateAdmin.setText("Hide Password");
        HidePasswordUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidePasswordUpdateAdminActionPerformed(evt);
            }
        });
        jPanel15.add(HidePasswordUpdateAdmin);
        HidePasswordUpdateAdmin.setBounds(595, 218, 150, 23);

        ResetUpdateAdmin.setFont(new java.awt.Font("Bebas", 0, 12)); // NOI18N
        ResetUpdateAdmin.setText("Reset");
        ResetUpdateAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetUpdateAdminActionPerformed(evt);
            }
        });
        jPanel15.add(ResetUpdateAdmin);
        ResetUpdateAdmin.setBounds(460, 270, 70, 35);

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/empudate.png"))); // NOI18N
        jLabel62.setText("jLabel62");
        jPanel15.add(jLabel62);
        jLabel62.setBounds(50, 110, 170, 170);

        jTabbedPane6.addTab("Update", jPanel15);

        jTabbedPane1.addTab("Alter Admin", jTabbedPane6);

        jPanel13.setBackground(new java.awt.Color(198, 198, 198));

        Logout.setFont(new java.awt.Font("Bebas", 0, 24)); // NOI18N
        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        jLabel63.setText("jLabel63");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(373, 373, 373)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel63, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(126, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Logout", jPanel13);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteEmployeeActionPerformed
        try {   
            if (this.employeeidDelete.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill Employee id","Error", JOptionPane.ERROR_MESSAGE);
            else { 
                int isDeleted = EmployeeScreensController.UpdateEmployeeTable(1,Integer.parseInt(employeeidDelete.getText()));
                if (isDeleted == 1) JOptionPane.showMessageDialog(this, "Employee Deleted Successfully");
                }
        } catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Deleting Employee is Failed! Or Id Not Found !","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_DeleteEmployeeActionPerformed

    private void UpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateEmployeeActionPerformed
       try{ if (this.employeeNameUpdate.getText().equals("")||this.employeePasswordUpdate.getText().equals("")||
                this.employeePhoneUpdate.getText().equals("")||this.employeeAddressUpdate.getText().equals(""))
                JOptionPane.showMessageDialog(this, "Please Fill all inputs","Error", JOptionPane.ERROR_MESSAGE);
        else
        {   int isUpdated = EmployeeScreensController.UpdateEmployeeTable(2, Integer.parseInt(this.employeeIdUpdate.getText()), 
                    employeeNameUpdate.getText(), employeePasswordUpdate.getText(), employeePhoneUpdate.getText(), employeeAddressUpdate.getText());
            if(isUpdated == 1) JOptionPane.showMessageDialog(this, "Employee Updated Successfully");
            }        
       }catch(Exception ex) {JOptionPane.showMessageDialog(this, "Modifying Employee is Failed! Or Check your inputs","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_UpdateEmployeeActionPerformed

    private void DeleteMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMealActionPerformed
    try {   if (this.mealIdDelete.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill Meal id","Error", JOptionPane.ERROR_MESSAGE);
            else {
                    int isDeleted = MealsScreensController.UpdateMealsTable(1, Integer.parseInt(mealIdDelete.getText()+""));
                    if(isDeleted == 1) JOptionPane.showMessageDialog(this, "Meal Deleted Successfully");  
                }        
    }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Deleting Meal is Failed! Or Id Not Found !","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_DeleteMealActionPerformed

    private void UpdateMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMealActionPerformed
    try{
         if (this.mealNameUpdate.getText().equals("")||this.mealPriceUpdate.getText().equals("")||this.mealQuantityUpdate.getText().equals(""))
             JOptionPane.showMessageDialog(this, "Please Fill all inputs","Error", JOptionPane.ERROR_MESSAGE);
         else {
             int isUpdated  = MealsScreensController.UpdateMealsTable(2, Integer.parseInt(this.mealIdUpdate.getText()), 
                       mealNameUpdate.getText(), Float.parseFloat(this.mealPriceUpdate.getText()), Integer.parseInt(this.mealQuantityUpdate.getText()));
             if(isUpdated == 1) JOptionPane.showMessageDialog(this, "Meal Updated Successfully");
                }        
        }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Modifying Meal is Failed! Or Check your inputs","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_UpdateMealActionPerformed

    private void DeleteAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAdminActionPerformed
        try {   if (this.idDeleteAdmin.getText().equals("")) JOptionPane.showMessageDialog(this, "You haven't entered any id","Error", JOptionPane.ERROR_MESSAGE);
                else{
                    int isDeleted = AdminScreensController.UpdateAdminTable(1,Integer.parseInt(idDeleteAdmin.getText()));
                    if (isDeleted == 1) JOptionPane.showMessageDialog(this, "Admin Deleted Successfully");
                    }
       }catch (SQLException ex) {JOptionPane.showMessageDialog(null,"Modifying Admin is Failed! Or Id Not Found !","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_DeleteAdminActionPerformed

    private void MakeOfferActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MakeOfferActionPerformed
    try {   if (this.mealIdSpecialOffers.getText().equals("")||this.DiscountPercentageSpecialOffers.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill all inputs","Error", JOptionPane.ERROR_MESSAGE);
            else {  
                    double discountPercentage = Integer.parseInt(this.DiscountPercentageSpecialOffers.getText()) /100.0;
                    ArrayList<Object> MealsData = MealsScreensController.GetMealsData(1, mealIdSpecialOffers.getText());
                    double netPrice = Double.parseDouble(MealsData.get(MealsDataType.Price.ordinal())+"") - 
                                      ( discountPercentage * Double.parseDouble(MealsData.get(MealsDataType.Price.ordinal())+""));
                    int isUpdated = MealsScreensController.UpdateMealsTable(3, MealsData.get(MealsDataType.Id.ordinal()), netPrice);
                    if(isUpdated==1) JOptionPane.showMessageDialog(this, "Special offer for "+MealsData.get(MealsDataType.Name.ordinal())+" with discount "+discountPercentage+"%"+" New Price : "+netPrice+"$");
                }
    }catch (SQLException ex) {JOptionPane.showMessageDialog(null,"Modifying Meal is Failed! Or Id Not Found !","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_MakeOfferActionPerformed

    private void SearchUpdateMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUpdateMealActionPerformed
        try {   if (this.mealIdUpdate.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill Meal id","Error", JOptionPane.ERROR_MESSAGE);
                else{
                     ArrayList<Object> MealsData = MealsScreensController.GetMealsData(1, Integer.parseInt(mealIdUpdate.getText()));
                    this.mealNameUpdate.setText(MealsData.get(MealsDataType.Name.ordinal())+"");
                    this.mealPriceUpdate.setText(Double.parseDouble(MealsData.get(MealsDataType.Price.ordinal())+"")+"");
                    this.mealQuantityUpdate.setText(Integer.parseInt(MealsData.get(MealsDataType.Quantity.ordinal())+"")+"");
                }
            }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Id Not Found !","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_SearchUpdateMealActionPerformed

    private void SearchMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchMealActionPerformed
        try {   if (this.mealIdSearch.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill all inputs","Error", JOptionPane.ERROR_MESSAGE);
                else { ArrayList<Object> MealsData = MealsScreensController.GetMealsData(1, Integer.parseInt(mealIdSearch.getText()));
                        this.MealNameSearch.setText(MealsData.get(MealsDataType.Name.ordinal())+"");
                        this.MealPriceSearch.setText(Double.parseDouble(MealsData.get(MealsDataType.Price.ordinal())+"")+"$");
                        this.MealQuantitySearch.setText(Integer.parseInt(MealsData.get(MealsDataType.Quantity.ordinal())+"")+"");
                      }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(this, "Id Not Found !","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_SearchMealActionPerformed

    private void AddMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMealActionPerformed
    try {   if (this.mealIdAdd.getText().equals("") || this.mealNameAdd.getText().equals("") || 
            this.mealPriceAdd.getText().equals("") || this.mealQuantityAdd.getText().equals(""))
                    JOptionPane.showMessageDialog(this, "Please fill all inputs !","Error", JOptionPane.ERROR_MESSAGE);
            else{
                   int isAdded = MealsScreensController.UpdateMealsTable(0, Integer.parseInt(mealIdAdd.getText()), mealNameAdd.getText(),
                   Double.parseDouble(mealPriceAdd.getText()), Integer.parseInt(mealQuantityAdd.getText()));
                   if(isAdded == 1) JOptionPane.showMessageDialog(this, "Meal Added Successfully");
                }
        } catch (SQLException ex) {JOptionPane.showMessageDialog(this, "Id already exists ! , Enter another unique id","Error", JOptionPane.ERROR_MESSAGE); }    
    }//GEN-LAST:event_AddMealActionPerformed

    private void AddNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddNewAdminActionPerformed
        try {   if (this.adminIdAdd.getText().equals("")||this.adminUsernameAdd.getText().equals("")||this.adminPasswordAdd.getText().equals(""))
                    JOptionPane.showMessageDialog(this, "Please Fill all inputs","Error", JOptionPane.ERROR_MESSAGE);
                else {
                        int isAdded = AdminScreensController.UpdateAdminTable(0, Integer.parseInt(adminIdAdd.getText()), 
                                adminUsernameAdd.getText(), adminPasswordAdd.getText());
                        if(isAdded==1) JOptionPane.showMessageDialog(this, "Admin Added Successfully");
                        this.adminIdAdd.setText(null);
                        this.adminUsernameAdd.setText(null);
                        this.adminPasswordAdd.setText(null);
                    }
            }catch (SQLException ex) { JOptionPane.showMessageDialog(this, "Id already exists ! Enter another unique id","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_AddNewAdminActionPerformed

    private void SearchUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUpdateAdminActionPerformed
        try { if (this.IdAdminUpdate.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill Admin id","Error", JOptionPane.ERROR_MESSAGE);
              else{
                    ArrayList<Object> AdminData = AdminScreensController.GetAdminsData(1, Integer.parseInt(IdAdminUpdate.getText()));
                    this.usernameAdminUpdate.setText(AdminData.get(AdminDataType.Username.ordinal())+"");
                    this.PasswordAdminUpdate.setText(AdminData.get(AdminDataType.Password.ordinal())+"");
                    this.PasswordAdminUpdate.setEchoChar('*');
                }
        } catch (SQLException ex) { JOptionPane.showMessageDialog(this, "Id Not Found !","Error", JOptionPane.ERROR_MESSAGE); }
          catch (Exception ex) { JOptionPane.showMessageDialog(this, "Id Not Found !","Error", JOptionPane.ERROR_MESSAGE); }
    }//GEN-LAST:event_SearchUpdateAdminActionPerformed

    private void ShowPasswordUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordUpdateAdminActionPerformed
        this.PasswordAdminUpdate.setEchoChar((char)0);
    }//GEN-LAST:event_ShowPasswordUpdateAdminActionPerformed

    private void HidePasswordUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidePasswordUpdateAdminActionPerformed
        this.PasswordAdminUpdate.setEchoChar('*');
    }//GEN-LAST:event_HidePasswordUpdateAdminActionPerformed

    private void UpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAdminActionPerformed
        try{    if (this.usernameAdminUpdate.getText().equals("")||this.PasswordAdminUpdate.getText().equals("")||this.IdAdminUpdate.getText().equals(""))
                    JOptionPane.showMessageDialog(this, "Please Fill all inputs","Error", JOptionPane.ERROR_MESSAGE);
                else {
                        int isUpdated = AdminScreensController.UpdateAdminTable(2, Integer.parseInt(IdAdminUpdate.getText()), 
                            usernameAdminUpdate.getText(), PasswordAdminUpdate.getText());
                        if(isUpdated==1) JOptionPane.showMessageDialog(this, "Admin Updated Successfully");
                      }
        }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Check your inputs!","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_UpdateAdminActionPerformed

    private void ShowPasswordAddNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordAddNewAdminActionPerformed
        this.adminPasswordAdd.setEchoChar((char)0);
    }//GEN-LAST:event_ShowPasswordAddNewAdminActionPerformed

    private void HidePasswordAddNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidePasswordAddNewAdminActionPerformed
        this.adminPasswordAdd.setEchoChar('*');
    }//GEN-LAST:event_HidePasswordAddNewAdminActionPerformed

    private void AddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddEmployeeActionPerformed
        try {   if (this.employeeNameAdd.getText().equals("")||this.employeeIdAdd.getText().equals("")||
                this.employeePasswordAdd.getText().equals("")||this.employeePhoneAdd.getText().equals("")||this.employeeAddressAdd.getText().equals(""))
                    JOptionPane.showMessageDialog(this, "Please Fill all inputs","Error", JOptionPane.ERROR_MESSAGE);
                else { int isAdded = EmployeeScreensController.UpdateEmployeeTable(0, Integer.parseInt(employeeIdAdd.getText()), 
                        employeeNameAdd.getText(), employeePasswordAdd.getText(), employeePhoneAdd.getText(), employeeAddressAdd.getText());
                        if(isAdded == 1) JOptionPane.showMessageDialog(this, "Employee Added Successfully");
                        this.employeeIdAdd.setText(null);
                        this.employeeNameAdd.setText(null);
                        this.employeePasswordAdd.setText(null);
                        this.employeePhoneAdd.setText(null);
                        this.employeeAddressAdd.setText(null);
                    }  
        }catch (SQLException ex) { JOptionPane.showMessageDialog(this, "Id already exists ! Enter another unique id","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_AddEmployeeActionPerformed

    private void ShowPasswordAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordAddEmployeeActionPerformed
        this.employeePasswordAdd.setEchoChar((char)0);
    }//GEN-LAST:event_ShowPasswordAddEmployeeActionPerformed

    private void HidePasswordAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidePasswordAddEmployeeActionPerformed
        this.employeePasswordAdd.setEchoChar('*');
    }//GEN-LAST:event_HidePasswordAddEmployeeActionPerformed

    private void SearchUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchUpdateEmployeeActionPerformed
        try { if (this.employeeIdUpdate.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill Employee id","Error", JOptionPane.ERROR_MESSAGE);
              else {    ArrayList<Object> EmployeeData = EmployeeScreensController.GetEmployeesData(1, Integer.parseInt(employeeIdUpdate.getText()));
                    this.employeeNameUpdate.setText(EmployeeData.get(EmployeeDataType.Username.ordinal())+"");
                    this.employeePasswordUpdate.setText(EmployeeData.get(EmployeeDataType.Password.ordinal())+"");
                    this.employeePasswordUpdate.setEchoChar('*');
                    this.employeePhoneUpdate.setText(EmployeeData.get(EmployeeDataType.Phone.ordinal())+"");
                    this.employeeAddressUpdate.setText(EmployeeData.get(EmployeeDataType.Address.ordinal())+"");
                    }            
        } catch (SQLException ex) { JOptionPane.showMessageDialog(this, "Id Not Found !","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_SearchUpdateEmployeeActionPerformed

    private void ShowPasswordUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordUpdateEmployeeActionPerformed
        this.employeePasswordUpdate.setEchoChar((char)0);
    }//GEN-LAST:event_ShowPasswordUpdateEmployeeActionPerformed

    private void HidePasswordUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidePasswordUpdateEmployeeActionPerformed
        this.employeePasswordUpdate.setEchoChar('*');
    }//GEN-LAST:event_HidePasswordUpdateEmployeeActionPerformed

    private void SearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchEmployeeActionPerformed
        try{ if (this.employeeSearchId.getText().equals("")) JOptionPane.showMessageDialog(this, "You haven't entered any id !","Error", JOptionPane.ERROR_MESSAGE);
            else{
                    ArrayList<Object> EmployeeData = EmployeeScreensController.GetEmployeesData(1, Integer.parseInt(employeeSearchId.getText()));
                    this.EmployeeNameSearch.setText(EmployeeData.get(EmployeeDataType.Username.ordinal())+"");
                    this.EmployeePasswordSearch.setText(EmployeeData.get(EmployeeDataType.Password.ordinal())+"");
                    String HiddenPass = "";
                    for (int Count =0;Count<EmployeePasswordSearch.getText().length();Count++)
                    {
                        HiddenPass+="*";
                    }
                    this.EmployeePasswordSearch.setText(HiddenPass);
                    this.EmployeePhoneSearch.setText(EmployeeData.get(EmployeeDataType.Phone.ordinal())+"");
                    this.EmployeeAddressSearch.setText(EmployeeData.get(EmployeeDataType.Address.ordinal())+"");
                }
        } catch (SQLException ex) { JOptionPane.showMessageDialog(this, "Id Not Found !","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_SearchEmployeeActionPerformed

    private void HidePasswordSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidePasswordSearchEmployeeActionPerformed
        String HiddenPass = "";
                    for (int Count =0;Count<EmployeePasswordSearch.getText().length();Count++)
                    {
                        HiddenPass+="*";
                    }
        this.EmployeePasswordSearch.setText(HiddenPass);
    }//GEN-LAST:event_HidePasswordSearchEmployeeActionPerformed

    private void ShowPasswordSearchEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordSearchEmployeeActionPerformed
         try{           
        ArrayList<Object> EmployeeData = EmployeeScreensController.GetEmployeesData(1, Integer.parseInt(employeeSearchId.getText()));
        this.EmployeePasswordSearch.setText(EmployeeData.get(EmployeeDataType.Password.ordinal())+"");
        } catch (SQLException ex) { JOptionPane.showMessageDialog(this, "Id Not Found !","Error", JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_ShowPasswordSearchEmployeeActionPerformed

 
    private void ShowDataEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataEmployeeActionPerformed
    try{
        emp_table.setModel(EmployeesDataTable); EmployeesDataTable.setRowCount(0); EmployeesDataTable.setColumnCount(0);
        EmployeesDataTable.addColumn("Id");EmployeesDataTable.addColumn("Name");
        EmployeesDataTable.addColumn("password"); EmployeesDataTable.addColumn("Phone");EmployeesDataTable.addColumn("Address");
        ArrayList<Object> EmployeesData = EmployeeScreensController.GetEmployeesData(0);
        for(int Index=0; Index<EmployeesData.size(); Index+=5){
            EmployeesDataTable.addRow( new Object[] { EmployeesData.get(Index+EmployeeDataType.Id.ordinal()), 
                EmployeesData.get(Index+EmployeeDataType.Username.ordinal()), EmployeesData.get(Index+EmployeeDataType.Password.ordinal()), 
                EmployeesData.get(Index+EmployeeDataType.Phone.ordinal()), EmployeesData.get(Index+EmployeeDataType.Address.ordinal())} );
            }
    }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Showing Employees table List is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_ShowDataEmployeeActionPerformed

    private void ShowDataMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataMealActionPerformed
        try{
                meal_table.setModel(MealsDataTable); MealsDataTable.setRowCount(0); MealsDataTable.setColumnCount(0);
                MealsDataTable.addColumn("id"); MealsDataTable.addColumn("name"); 
                MealsDataTable.addColumn("price"); MealsDataTable.addColumn("quantity");
                ArrayList<Object> MealsData = MealsScreensController.GetMealsData(0);
                for(int Index=0; Index<MealsData.size(); Index+=4){
                    MealsDataTable.addRow( new Object[] { MealsData.get(Index+MealsDataType.Id.ordinal()), MealsData.get(Index+MealsDataType.Name.ordinal()), 
                    MealsData.get(Index+MealsDataType.Price.ordinal()), MealsData.get(Index+MealsDataType.Quantity.ordinal())} );
            }
    }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Showing Meals table List is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_ShowDataMealActionPerformed

    private void ShowDataReportEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataReportEmployeeActionPerformed
     try{
        emp_table_report.setModel(EmployeesDataTable);  EmployeesDataTable.setRowCount(0); EmployeesDataTable.setColumnCount(0);
        EmployeesDataTable.addColumn("Id");EmployeesDataTable.addColumn("Name");
        EmployeesDataTable.addColumn("password"); EmployeesDataTable.addColumn("Phone");EmployeesDataTable.addColumn("Address");
        ArrayList<Object> EmployeesData = EmployeeScreensController.GetEmployeesData(0);
        for(int Index=0; Index<EmployeesData.size(); Index+=5){
            EmployeesDataTable.addRow( new Object[] { EmployeesData.get(Index+EmployeeDataType.Id.ordinal()), 
                EmployeesData.get(Index+EmployeeDataType.Username.ordinal()), EmployeesData.get(Index+EmployeeDataType.Password.ordinal()), 
                EmployeesData.get(Index+EmployeeDataType.Phone.ordinal()), EmployeesData.get(Index+EmployeeDataType.Address.ordinal())} );
            }
    }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Showing Employees table List is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_ShowDataReportEmployeeActionPerformed

    private void ShowDataSpecialOffersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataSpecialOffersActionPerformed
        try{
                meal_table_act.setModel(MealsDataTable); MealsDataTable.setRowCount(0); MealsDataTable.setColumnCount(0);
                MealsDataTable.addColumn("id"); MealsDataTable.addColumn("name"); 
                MealsDataTable.addColumn("price"); MealsDataTable.addColumn("quantity");
                ArrayList<Object> MealsData = MealsScreensController.GetMealsData(0);
                for(int Index=0; Index<MealsData.size(); Index+=4){
                    MealsDataTable.addRow( new Object[] { MealsData.get(Index+MealsDataType.Id.ordinal()), MealsData.get(Index+MealsDataType.Name.ordinal()), 
                    MealsData.get(Index+MealsDataType.Price.ordinal()), MealsData.get(Index+MealsDataType.Quantity.ordinal())} );
            }
    }catch (SQLException ex) { JOptionPane.showMessageDialog(null,"Showing Meals table List is Failed!","Error",JOptionPane.ERROR_MESSAGE);}
    }//GEN-LAST:event_ShowDataSpecialOffersActionPerformed

    private void ResetAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetAddEmployeeActionPerformed
        this.employeeIdAdd.setText(null);
        this.employeeNameAdd.setText(null);
        this.employeePasswordAdd.setText(null);
        this.employeePhoneAdd.setText(null);
        this.employeeAddressAdd.setText(null);
    }//GEN-LAST:event_ResetAddEmployeeActionPerformed

    private void ResetUpdateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetUpdateEmployeeActionPerformed
        this.employeeNameUpdate.setText(null);
        this.employeePasswordUpdate.setText(null);
        this.employeePhoneUpdate.setText(null);
        this.employeeAddressUpdate.setText(null);
    }//GEN-LAST:event_ResetUpdateEmployeeActionPerformed

    private void ResetAddMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetAddMealActionPerformed
        this.mealIdAdd.setText(null);
        this.mealNameAdd.setText(null);
        this.mealPriceAdd.setText(null);
        this.mealQuantityAdd.setText(null);
    }//GEN-LAST:event_ResetAddMealActionPerformed

    private void ResetUpdateMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetUpdateMealActionPerformed
        this.mealIdUpdate.setText(null);
        this.mealNameUpdate.setText(null);
        this.mealPriceUpdate.setText(null);
        this.mealQuantityUpdate.setText(null);
    }//GEN-LAST:event_ResetUpdateMealActionPerformed

    private void ResetMakeOffersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetMakeOffersActionPerformed
        this.mealIdSpecialOffers.setText(null);
        this.DiscountPercentageSpecialOffers.setText(null);
    }//GEN-LAST:event_ResetMakeOffersActionPerformed

    private void ResetAddNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetAddNewAdminActionPerformed
        this.adminIdAdd.setText(null);
        this.adminUsernameAdd.setText(null);
        this.adminPasswordAdd.setText(null);
    }//GEN-LAST:event_ResetAddNewAdminActionPerformed

    private void ResetUpdateAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetUpdateAdminActionPerformed
        this.IdAdminUpdate.setText(null);
        this.usernameAdminUpdate.setText(null);
        this.PasswordAdminUpdate.setText(null);
    }//GEN-LAST:event_ResetUpdateAdminActionPerformed

    private void ShowDataReportCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowDataReportCustomerActionPerformed
         try{
            customer_table.setModel(CustomerDataTable); CustomerDataTable.setRowCount(0); CustomerDataTable.setColumnCount(0);
            CustomerDataTable.addColumn("ID"); CustomerDataTable.addColumn("Name"); 
        CustomerDataTable.addColumn("Address"); CustomerDataTable.addColumn("Phone Number");
        CustomerDataTable.addColumn("Marketing"); CustomerDataTable.addColumn("Loyalty&Reward Programs"); 
        CustomerDataTable.addColumn("Total Payments"); CustomerDataTable.addColumn("Points"); 
        CustomerDataTable.addColumn("Gifts");CustomerDataTable.addColumn("Spetial Offers");
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
    }//GEN-LAST:event_ShowDataReportCustomerActionPerformed

    private void meal_table_actMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_meal_table_actMouseClicked
         meal_table_act.setRowSelectionAllowed(true);
        int row = meal_table_act.getSelectedRow();
        mealIdSpecialOffers.setText(meal_table_act.getValueAt(row,0)+"");
    }//GEN-LAST:event_meal_table_actMouseClicked

    private void AddLoyaltyAndRewardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddLoyaltyAndRewardActionPerformed
        if (this.loyaltyAndRewardProgramText.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill Text","Error", JOptionPane.ERROR_MESSAGE);
        else loyaltyadded.setText(loyaltyAndRewardProgramText.getText());
    }//GEN-LAST:event_AddLoyaltyAndRewardActionPerformed

    private void AddMarketingIdeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMarketingIdeaActionPerformed
    if (this.marketingIdeaText.getText().equals("")) JOptionPane.showMessageDialog(this, "Please Fill Text","Error", JOptionPane.ERROR_MESSAGE);
    else markeingadd.setText(marketingIdeaText.getText());
    }//GEN-LAST:event_AddMarketingIdeaActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        JOptionPane.showMessageDialog(this, "Bye Bye see you next time");
        this.dispose();
        WelcomeScreensLoading.SecondWelcomeScreenLoading();
    }//GEN-LAST:event_LogoutActionPerformed

    private void employeeNameUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeNameUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeNameUpdateActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddEmployee;
    private javax.swing.JButton AddLoyaltyAndReward;
    private javax.swing.JButton AddMarketingIdea;
    private javax.swing.JButton AddMeal;
    private javax.swing.JButton AddNewAdmin;
    private javax.swing.JButton DeleteAdmin;
    private javax.swing.JButton DeleteEmployee;
    private javax.swing.JButton DeleteMeal;
    private javax.swing.JTextField DiscountPercentageSpecialOffers;
    private javax.swing.JLabel EmployeeAddressSearch;
    private javax.swing.JLabel EmployeeNameSearch;
    private javax.swing.JLabel EmployeePasswordSearch;
    private javax.swing.JLabel EmployeePhoneSearch;
    private javax.swing.JButton HidePasswordAddEmployee;
    private javax.swing.JButton HidePasswordAddNewAdmin;
    private javax.swing.JButton HidePasswordSearchEmployee;
    private javax.swing.JButton HidePasswordUpdateAdmin;
    private javax.swing.JButton HidePasswordUpdateEmployee;
    private javax.swing.JTextField IdAdminUpdate;
    private javax.swing.JLabel Jlabe1;
    private javax.swing.JLabel Jlabel;
    private javax.swing.JButton Logout;
    private javax.swing.JButton MakeOffer;
    private javax.swing.JLabel MealNameSearch;
    private javax.swing.JLabel MealPriceSearch;
    private javax.swing.JLabel MealQuantitySearch;
    private javax.swing.JPasswordField PasswordAdminUpdate;
    private javax.swing.JButton ResetAddEmployee;
    private javax.swing.JButton ResetAddMeal;
    private javax.swing.JButton ResetAddNewAdmin;
    private javax.swing.JButton ResetMakeOffers;
    private javax.swing.JButton ResetUpdateAdmin;
    private javax.swing.JButton ResetUpdateEmployee;
    private javax.swing.JButton ResetUpdateMeal;
    private javax.swing.JButton SearchEmployee;
    private javax.swing.JButton SearchMeal;
    private javax.swing.JButton SearchUpdateAdmin;
    private javax.swing.JButton SearchUpdateEmployee;
    private javax.swing.JButton SearchUpdateMeal;
    private javax.swing.JButton ShowDataEmployee;
    private javax.swing.JButton ShowDataMeal;
    private javax.swing.JButton ShowDataReportCustomer;
    private javax.swing.JButton ShowDataReportEmployee;
    private javax.swing.JButton ShowDataSpecialOffers;
    private javax.swing.JButton ShowPasswordAddEmployee;
    private javax.swing.JButton ShowPasswordAddNewAdmin;
    private javax.swing.JButton ShowPasswordSearchEmployee;
    private javax.swing.JButton ShowPasswordUpdateAdmin;
    private javax.swing.JButton ShowPasswordUpdateEmployee;
    private javax.swing.JButton UpdateAdmin;
    private javax.swing.JButton UpdateEmployee;
    private javax.swing.JButton UpdateMeal;
    private javax.swing.JTextField adminIdAdd;
    private javax.swing.JPasswordField adminPasswordAdd;
    private javax.swing.JTextField adminUsernameAdd;
    private javax.swing.JTable customer_table;
    private javax.swing.JLabel emp_address3;
    private javax.swing.JLabel emp_name3;
    private javax.swing.JLabel emp_phone3;
    private javax.swing.JTable emp_table;
    private javax.swing.JTable emp_table_report;
    private javax.swing.JTextField employeeAddressAdd;
    private javax.swing.JTextField employeeAddressUpdate;
    private javax.swing.JTextField employeeIdAdd;
    private javax.swing.JTextField employeeIdUpdate;
    private javax.swing.JTextField employeeNameAdd;
    private javax.swing.JTextField employeeNameUpdate;
    private javax.swing.JPasswordField employeePasswordAdd;
    private javax.swing.JPasswordField employeePasswordUpdate;
    private javax.swing.JTextField employeePhoneAdd;
    private javax.swing.JTextField employeePhoneUpdate;
    private javax.swing.JTextField employeeSearchId;
    private javax.swing.JTextField employeeidDelete;
    private javax.swing.JTextField idDeleteAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JTabbedPane jTabbedPane6;
    private javax.swing.JTabbedPane jTabbedPane9;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JTextArea loyaltyAndRewardProgramText;
    private javax.swing.JLabel loyaltyadded;
    private javax.swing.JLabel markeingadd;
    private javax.swing.JTextArea marketingIdeaText;
    private javax.swing.JTextField mealIdAdd;
    private javax.swing.JTextField mealIdDelete;
    private javax.swing.JTextField mealIdSearch;
    private javax.swing.JTextField mealIdSpecialOffers;
    private javax.swing.JTextField mealIdUpdate;
    private javax.swing.JTextField mealNameAdd;
    private javax.swing.JTextField mealNameUpdate;
    private javax.swing.JTextField mealPriceAdd;
    private javax.swing.JTextField mealPriceUpdate;
    private javax.swing.JTextField mealQuantityAdd;
    private javax.swing.JTextField mealQuantityUpdate;
    private javax.swing.JTable meal_table;
    private javax.swing.JTable meal_table_act;
    private javax.swing.JTextField usernameAdminUpdate;
    // End of variables declaration//GEN-END:variables
}