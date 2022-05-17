package Models;

import java.sql.*;
import javax.swing.JOptionPane;

public class AdminTableQueries {
 
    public static ResultSet SelectAdminsData() throws SQLException{
            ConnectionToDataBase Connector = new ConnectionToDataBase();
            Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
            ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from admin");
            return ReturnedTableData;
    }
    
    public static ResultSet SearchAdminById(int id) throws SQLException{
            ConnectionToDataBase Connector = new ConnectionToDataBase();
            Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
            ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from admin where id = " + id);
            return ReturnedTableData;
    }
    
    public static int AddNewAdmin(Object...AdminData)throws SQLException{
        int isAdded = 0;
            ConnectionToDataBase Connector = new ConnectionToDataBase();
            Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
            isAdded = CreateQueryStatement.executeUpdate("insert into admin values("
                     + AdminData[0] +",'"+ AdminData[1] + "','" + AdminData[2] + "')");
        return isAdded;
    }
    
    public static int UpdateAdminData(Object...AdminData)throws SQLException{
        int isUpdated = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isUpdated = CreateQueryStatement.executeUpdate("update admin set name = '"
                     +AdminData[1] + "',password = '" + AdminData[2] + "' where id =" + AdminData[0]);
        return isUpdated;
    }
    
    public static int DeleteAdminData(int id)throws SQLException{
        int isDeleted = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isDeleted = CreateQueryStatement.executeUpdate("delete from admin where id ="+ id);
        return isDeleted;
    }
}
