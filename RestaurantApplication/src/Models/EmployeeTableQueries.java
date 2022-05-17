package Models;

import java.sql.*;
import javax.swing.JOptionPane;

public class EmployeeTableQueries {
 
    public static ResultSet SelectEmployeesData()throws SQLException{
            ConnectionToDataBase Connector = new ConnectionToDataBase();
            Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
            ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from employee");
            return ReturnedTableData;
    }
    
    public static ResultSet SearchEmployeeById(int id) throws SQLException{
            ConnectionToDataBase Connector = new ConnectionToDataBase();
            Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
            ResultSet ReturnedTableData = CreateQueryStatement.executeQuery("select * from employee where id = " + id);
            return ReturnedTableData;
    }
    
    public static int AddNewEmployee(Object...EmployeeData)throws SQLException{
        int isAdded = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isAdded = CreateQueryStatement.executeUpdate("insert into employee values("
                     + EmployeeData[0] +",'"+ EmployeeData[1] + "','" + EmployeeData[2] + "','" + 
                EmployeeData[3] + "','" + EmployeeData[4] +"')");
        return isAdded;
    }

    public static int UpdateEmployeeData(Object...EmployeeData)throws SQLException{
        int isUpdated = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isUpdated = CreateQueryStatement.executeUpdate("update employee set name = '"
                     +EmployeeData[1] + "',password = '" + EmployeeData[2] + "',phone = '" + EmployeeData[3] +
                     "',address = '" + EmployeeData[4] + "' where id =" + EmployeeData[0]);
        return isUpdated;
    }
    
    public static int DeleteEmployeeData(int id)throws SQLException{
        int isDeleted = 0;
        ConnectionToDataBase Connector = new ConnectionToDataBase();
        Statement CreateQueryStatement = Connector.ConenctToDataBase().createStatement();
        isDeleted = CreateQueryStatement.executeUpdate("delete from employee where id ="+ id);
        return isDeleted;
    }
}
