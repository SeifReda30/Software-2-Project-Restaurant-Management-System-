package Controllers;

import Views.*;
import Models.*;
import java.sql.*;
import java.util.ArrayList;

public class EmployeeScreensController {
    
    public static ArrayList<Object> GetEmployeesData(Object...DataFetch)throws SQLException{
        ArrayList<Object> EmployeesData = new ArrayList<Object>();
        ResultSet ReturnedTableData = null;
        switch((int)DataFetch[Index.DataFetchMode.ordinal()]){
            case 0:
                ReturnedTableData = EmployeeTableQueries.SelectEmployeesData();
              break;
            case 1:
                ReturnedTableData = EmployeeTableQueries.SearchEmployeeById(Integer.parseInt(DataFetch[Index.DataFetchWith.ordinal()]+""));
              break;
        }
        while(ReturnedTableData.next()) {
            EmployeesData.add(ReturnedTableData.getString("id"));
            EmployeesData.add(ReturnedTableData.getString("name"));
            EmployeesData.add(ReturnedTableData.getString("password"));
            EmployeesData.add(ReturnedTableData.getString("phone"));
            EmployeesData.add(ReturnedTableData.getString("address"));
        }
        return EmployeesData;
    }
    
    public static int UpdateEmployeeTable(int OperationType,Object...EmployeeData)throws SQLException{
        int ResultOfOperation = -1;
        switch(OperationType){
            case 0:
                ResultOfOperation = EmployeeTableQueries.AddNewEmployee(EmployeeData);
                break;
            case 1:
                ResultOfOperation = EmployeeTableQueries.DeleteEmployeeData(Integer.parseInt(EmployeeData[0]+""));
                break;
            case 2:
                ResultOfOperation = EmployeeTableQueries.UpdateEmployeeData(EmployeeData);
                break;
        }
        return ResultOfOperation;
    }
}
