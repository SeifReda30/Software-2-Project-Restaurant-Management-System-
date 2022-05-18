package Controllers;

import Views.*;
import Models.*;
import java.sql.*;
import java.util.ArrayList;

public class AdminScreensController {
    
    public static void AdminScreenLoading(){
        admin scr = new admin();
                scr.setVisible(true);
    }
    
    public static ArrayList<Object> GetAdminsData(Object...DataFetch)throws SQLException{
        ArrayList<Object> AdminsData = new ArrayList<Object>();
        ResultSet ReturnedTableData = null;
        switch((int)DataFetch[Index.DataFetchMode.ordinal()]){
            case 0:
                //ReturnedTableData = AdminTableQueries.SelectCustomersData();
              break;
            case 1:
                ReturnedTableData = AdminTableQueries.SearchAdminById(Integer.parseInt(DataFetch[Index.DataFetchWith.ordinal()]+""));
              break;
        }
        while(ReturnedTableData.next()) {
            AdminsData.add(ReturnedTableData.getString("id"));
            AdminsData.add(ReturnedTableData.getString("name"));
            AdminsData.add(ReturnedTableData.getString("password"));
        }
        return AdminsData;
    }
    
     public static int UpdateAdminTable(int OperationType,Object...AdminData)throws SQLException{
        int ResultOfOperation = -1;
        switch(OperationType){
            case 0:
                ResultOfOperation = AdminTableQueries.AddNewAdmin(AdminData);
                break;
            case 1:
                ResultOfOperation = AdminTableQueries.DeleteAdminData(Integer.parseInt(AdminData[0]+""));
                break;
            case 2:
                ResultOfOperation = AdminTableQueries.UpdateAdminData(AdminData);
                break;
        }
        return ResultOfOperation;
    }
}
