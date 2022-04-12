package database;

import java.sql.*;

public class OrdersFunctions extends database.CustomerModuleTables{
    
    public int submitOrders(Object ...D){
        return Modify( "insert into Orders (Customer_ID,Meal_ID,quantity,total_price) values (" + D[0] + ","+ D[1] +","+
                D[2] + "," + D[3] + ")" );
    }
    
    public void selectOrder(Object ...D){
        select("select * from Orders where Customer_ID = "+ D[0] + " and (Meal_ID = " + D[1] + " and quantity = " + D[2] + ")" );
    }
    
    public int deleteOrder(Object ...D){
        return Modify("delete top (1) from Orders where Customer_ID = "+ D[0] + " and (Meal_ID = " + D[1] + " and quantity = " + D[2] + ")" );
    }
    
     public int deleteCustomerOrder(int id){
        return Modify("delete from Orders where Customer_ID = "+ id);
    }
     
}
