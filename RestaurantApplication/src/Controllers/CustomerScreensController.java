package Controllers;

import Views.*;
import Models.*;
import java.sql.*;
import java.util.ArrayList;

enum Index{DataFetchMode, DataFetchWith};

public class CustomerScreensController {
    
    public static ArrayList<Object> GetCustomersData(Object...DataFetch)throws SQLException{
        ArrayList<Object> CustomersData = new ArrayList<Object>();
        ResultSet ReturnedTableData = null;
        switch((int)DataFetch[Index.DataFetchMode.ordinal()]){
            case 0:
                ReturnedTableData = CustomersTableQueries.SelectCustomersData();
              break;
            case 1:
                ReturnedTableData = CustomersTableQueries.SearchCustomersById(Integer.parseInt(DataFetch[Index.DataFetchWith.ordinal()]+""));
              break;
            case 2:
                ReturnedTableData = CustomersTableQueries.SearchCustomersByName((String)DataFetch[Index.DataFetchWith.ordinal()]);
              break;
        }
        while(ReturnedTableData.next()) {
            CustomersData.add(ReturnedTableData.getString("ID"));
            CustomersData.add(ReturnedTableData.getString("FullName"));
            CustomersData.add(ReturnedTableData.getString("Address"));
            CustomersData.add(ReturnedTableData.getString("Phone_Number"));
            CustomersData.add(ReturnedTableData.getString("Marketing"));
            CustomersData.add(ReturnedTableData.getString("Loyalty_Reward_Programs"));
            CustomersData.add(ReturnedTableData.getString("Total_Payments"));
            CustomersData.add(ReturnedTableData.getString("Points"));
            CustomersData.add(ReturnedTableData.getString("Gifts"));
            CustomersData.add(ReturnedTableData.getString("Spetial_Offers"));
        }
        return CustomersData;
    }
    
    public static void CustomerScreenLoading(){
        Customer Screen = new Customer();
        Screen.setVisible(true);
    }
    
    public static void AddCustomerScreenLoading(){
        Add Screen = new Add();
        Screen.setVisible(true);
    }
    
    public static void UpdateCustomerScreenLoading(int Id){
        Update Screen = new Update(Id);
        Screen.setVisible(true);
    }
    
    public static void MakeOrdersScreenLoading(int Id){
        Order Screen = new Order(Id);
        Screen.setVisible(true);
    }
    
    public static int UpdateCustomerTable(int OperationType,Object...CustomerData)throws SQLException{
        int ResultOfOperation = -1;
        switch(OperationType){
            case 0:
                ResultOfOperation= CustomersTableQueries.AddNewCustomer(CustomerData);
                break;
            case 1:
                ResultOfOperation = CustomersTableQueries.DeleteCustomerData(Integer.parseInt(CustomerData[0]+""));
                break;
            case 2:
                CustomersTableQueries.IsCustomerIdExist(Integer.parseInt(CustomerData[0]+""));
                ResultOfOperation = CustomersTableQueries.UpdateCustomerData(CustomerData); 
                break;
            case 3:
                ResultOfOperation = CustomersTableQueries.UpdateCustomer_TotalPayments_Points(CustomerData);
                break;
        }return ResultOfOperation;
    }
    
    public static int[] UpdateCustomerGifts_SpetialOffers(Object...CustomerData)throws SQLException{
        int[] ResultOfOperations = {-1,-1};
        if(Integer.parseInt(CustomerData[4]+"")== 1 || Integer.parseInt(CustomerData[5]+"") == 1) {
            int giftcount=0,offrcount=0;
            for(int giftpoints = 1; giftpoints <= (int)Double.parseDouble(CustomerData[6]+""); giftpoints++)
                if( giftpoints%3000 == 0) giftcount++;
            for(int offerspoints = 1; offerspoints <= Integer.parseInt(CustomerData[7]+""); offerspoints++)
                if( offerspoints%10000 == 0) offrcount++;
            
            CustomersTableQueries.UpdateCustomerGifts(CustomerData[0], giftcount);
            CustomersTableQueries.UpdateCustomerOffers(CustomerData[0], offrcount);
            if( giftcount > Integer.parseInt(CustomerData[8]+"") )
                ResultOfOperations[0]=1;
            else if( giftcount < Integer.parseInt(CustomerData[8]+""))
                ResultOfOperations[0]=0;
            if( offrcount > Integer.parseInt(CustomerData[9]+"") ) 
                ResultOfOperations[1]=1;
            else if( offrcount < Integer.parseInt(CustomerData[9]+"") )
                ResultOfOperations[1]=0;
          }
        return ResultOfOperations;
    }
}