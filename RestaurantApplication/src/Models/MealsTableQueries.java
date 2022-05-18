package Models;

import java.sql.*;
import javax.swing.JOptionPane;

public class MealsTableQueries {
    
    public static ResultSet SelectMealsData()throws SQLException{
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from Meals");
     return ReturnedTableData;
    }
    
    public static ResultSet SearchMealByName(String name)throws SQLException{

        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from Meals where name = '" + name + "'");
        return ReturnedTableData;
    }
    
    public static ResultSet SearchMealById(int id)throws SQLException{
    
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from Meals where id = " + id); 
     return ReturnedTableData;
    }
    
    public static int AddNewMeal(Object...MealData)throws SQLException{
        int isAdded = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isAdded = CreateQueryStatement.executeUpdate("insert into Meals values("
                     + MealData[0] +",'"+ MealData[1] + "'," + MealData[2] + "," + MealData[3] +")");
        return isAdded;
    }
    
    public static int UpdateMealData(Object...MealData)throws SQLException{
        int isUpdated = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isUpdated = CreateQueryStatement.executeUpdate("update Meals set name = '"
                     +MealData[1] + "',price=" + MealData[2] + ",quantity=" + MealData[3] +
                     "where id =" + MealData[0]);
        return isUpdated;
    }
    
    public static int DeleteMealData(int id)throws SQLException{
        int isDeleted = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isDeleted = CreateQueryStatement.executeUpdate("delete from Meals where id ="+ id);
        return isDeleted;
    }
    
    public static int UpdateMealPrice(Object...MealData)throws SQLException{
        int isUpdated = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isUpdated = CreateQueryStatement.executeUpdate("update Meals set price ="
                     + MealData[1] + "where id =" + MealData[0]);
        return isUpdated;
    }
    
    public static int UpdateMealQuantity(Object ...MealData)throws SQLException{
        int isUpdated = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isUpdated = CreateQueryStatement.executeUpdate("update Meals set quantity ="
                     + MealData[1] + "where id =" + MealData[0]);
        return isUpdated;
    }
}
