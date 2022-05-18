package Controllers;

import Views.*;
import Models.*;
import java.sql.*;

public class LoginScreensController {
   
    public static void LoadAdminLoginScreen(){
        admin_login scr = new admin_login();
        scr.setVisible(true);
    }
    
    public static void LoadEmployeeLoginScreen(){
        employee_login scr = new employee_login();
        scr.setVisible(true);
    }
    
    public static int VerifyAdminAccount(String UserName, String Password)throws SQLException{
        ResultSet ReturnedTableData = AdminTableQueries.SelectAdminsData();
         while (ReturnedTableData.next()) {
            if ( ReturnedTableData.getString("name").equalsIgnoreCase(UserName))
            {   if (ReturnedTableData.getString("password").equals(Password))
                {
                    return 1;
                }else
                    return 2; 
            } 
        }           return 0;
    }
    
    public static int VerifyEmployeeAccount(String UserName, String Password)throws SQLException{
        ResultSet ReturnedTableData = EmployeeTableQueries.SelectEmployeesData();
        while (ReturnedTableData.next()) {
            if ( ReturnedTableData.getString("name").equalsIgnoreCase(UserName))
            {   if (ReturnedTableData.getString("password").equals(Password))
                {
                    return 1;
                }else
                    return 2; 
            } 
        }           return 0;
    }
}
