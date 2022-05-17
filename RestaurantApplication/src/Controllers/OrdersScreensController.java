package Controllers;

import Views.*;
import Models.*;
import java.sql.*;
import java.util.ArrayList;

public class OrdersScreensController {
        public static int UpdateOrdersTable(int OperationType,Object...OrderData)throws SQLException{
        int ResultOfOperation = -1;
        switch(OperationType){
            case 0:
                ResultOfOperation= OrdersTableQueries.SubmitNewOrder(OrderData);
                break;
            case 1:
                ResultOfOperation = OrdersTableQueries.CancleWrongOrder(OrderData);
                break;
            case 2:
                ResultOfOperation = OrdersTableQueries.DeleteCustomerOrders(Integer.parseInt(OrderData[0]+""));     
                break;
        }return ResultOfOperation;
    }
        
        public static ArrayList<Object> GetOrderData(Object...OrderData)throws SQLException{
        ArrayList<Object> ReturnedData = new ArrayList<Object>();
        ResultSet ReturnedTableData = OrdersTableQueries.SelectOrderData(OrderData);
        while(ReturnedTableData.next()){
            ReturnedData.add(ReturnedTableData.getString("Customer_ID"));
            ReturnedData.add(ReturnedTableData.getString("Meal_ID"));
            ReturnedData.add(ReturnedTableData.getString("quantity"));
            ReturnedData.add(ReturnedTableData.getString("total_price"));
        }
        return ReturnedData;
    }
}