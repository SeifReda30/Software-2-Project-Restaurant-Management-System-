package Models;

import java.sql.*;
import javax.swing.JOptionPane;

public class CustomersTableQueries {
    
    public static ResultSet SelectCustomersData()throws SQLException{
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from Customers");
        return ReturnedTableData;
    }
    
    public static ResultSet SearchCustomersById(int id)throws SQLException {
            
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from Customers where ID = " + id);
        return ReturnedTableData;
    }
    
    public static ResultSet SearchCustomersByName(String name)throws SQLException{

        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from Customers where FullName = '" + name + "'");
        return ReturnedTableData;
    }
    
    public static int AddNewCustomer(Object ...CustomerData)throws SQLException{
        int isAdded = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isAdded = CreateQueryStatement.executeUpdate("insert into Customers "
                     + "(ID,FullName,Address,Phone_Number,Marketing,Loyalty_Reward_Programs) values "
                     + "(" +CustomerData[0]+",'"+CustomerData[1]+"','"+CustomerData[2]+"','"+CustomerData[3]+
                     "',"+CustomerData[4] +","+CustomerData[5]+")");
        return isAdded;
    }
    
    public static int DeleteCustomerData(int id)throws SQLException{
        int isDeleted = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isDeleted = CreateQueryStatement.executeUpdate("delete from Customers where ID = "+ id);
        return isDeleted;
    }
    
    public static int UpdateCustomerData(Object ...CustomerData)throws SQLException{
        int isUpdated = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isUpdated = CreateQueryStatement.executeUpdate( "update Customers set FullName = '" + 
                     CustomerData[1] + "',Address = '" + CustomerData[2] + "',Phone_Number = '" + 
                     CustomerData[3] + "',Marketing = " + CustomerData[4] + ",Loyalty_Reward_Programs = " + 
                     CustomerData[5] + ",Total_Payments = " + CustomerData[6] + ",Points = " + CustomerData[7] + 
                     ",Gifts = " + CustomerData[8] + ",Spetial_Offers = " + CustomerData[9] + " where ID = " + 
                     CustomerData[0] );
           
        return isUpdated;
    }
    
    public static int UpdateCustomer_TotalPayments_Points(Object ...CustomerData)throws SQLException{
        int isUpdated = 0;
            ConnectionToDataBase Connector = new ConnectionToDataBase();
            Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
            isUpdated = CreateQueryStatement.executeUpdate( "update Customers set Total_Payments = " + CustomerData[1] + ",Points = " + CustomerData[2] + 
                     " where ID = " + CustomerData[0] );
        return isUpdated;
    }
    
    public static int UpdateCustomerGifts(Object ...CustomerData)throws SQLException{
        int isUpdated = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isUpdated = CreateQueryStatement.executeUpdate( "update Customers set Gifts = " + CustomerData[1] +
                     " where ID = " + CustomerData[0] );
        return isUpdated;
    }
    
    public static int UpdateCustomerOffers(Object ...CustomerData)throws SQLException{
        int isUpdated = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isUpdated = CreateQueryStatement.executeUpdate( "update Customers set Spetial_Offers = " + CustomerData[1] +
                     " where ID = " + CustomerData[0] ); 
        return isUpdated;
    }
    
    public static void IsCustomerIdExist(int id)throws SQLException{
            ConnectionToDataBase Connector = new ConnectionToDataBase();
            Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
            ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select count(*) from Customers where ID = " + id );
            if( ReturnedTableData.next() && ReturnedTableData.getInt(1)==0)
                CreateQueryStatement.executeUpdate( "insert into Customers (ID) values (" + id + ")");
    }
}

          
