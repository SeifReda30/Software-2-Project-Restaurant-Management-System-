package database;

import java.sql.*;
import javax.swing.*;

public class CustomerModuleTables {
    
    private Connection connect;
    private  Statement st;
    public static ResultSet r;
    public  CustomerModuleTables() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connect = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;user=seif;password=seif3010;databaseName=restaurant;");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Connection to your database is not established!","Error",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Connection to Customer table is Failed!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    protected  void select(String query){
           try{
            st =connect.createStatement();
            r = st.executeQuery(query);
           }catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Selection from Customer table is Failed!","Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    protected  int Modify(String query){
       int res = 0;
        try{
             st =connect.createStatement();
             res = st.executeUpdate(query);
           }catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Modifying on Customer table is Failed!","Error",JOptionPane.ERROR_MESSAGE);
        }
        return res;
    }
}