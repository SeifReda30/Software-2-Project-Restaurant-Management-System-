package Controllers;

import Views.*;
import Models.*;
import java.sql.*;
import java.util.ArrayList;


public class CustomerScreensController {
    
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
}