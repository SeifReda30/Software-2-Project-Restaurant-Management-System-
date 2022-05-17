package Models;

import java.sql.*;
import javax.swing.JOptionPane;

public class OrdersTableQueries {
    
    public static ResultSet SelectOrderData(Object...OrderData)throws SQLException{
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from Orders "
                + "where Customer_ID = "+ OrderData[0] + " and (Meal_ID = " + OrderData[1] + " and quantity = " + OrderData[2] + ")" );
        return ReturnedTableData;
    }

    public static int SubmitNewOrder(Object ...OrderData)throws SQLException{
        int isAdded = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isAdded = CreateQueryStatement.executeUpdate("insert into Orders "
                     + "(Customer_ID,Meal_ID,quantity,total_price) values (" + 
                     OrderData[0] + ","+ OrderData[1] +","+OrderData[2] + "," + OrderData[3] + ")");
        return isAdded;
    }
    
    public static int CancleWrongOrder(Object ...OrderData)throws SQLException {
        int isDeleted = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isDeleted = CreateQueryStatement.executeUpdate("delete top (1) from Orders where Customer_ID = "+ 
                     OrderData[0] + " and (Meal_ID = " + OrderData[1] + " and quantity = " + OrderData[2] + ")");
        return isDeleted;
    }
    
    public static int DeleteCustomerOrders(int id)throws SQLException {
        int isDeleted = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isDeleted = CreateQueryStatement.executeUpdate("delete from Orders where Customer_ID = "+ id);
        return isDeleted;
    }
}
