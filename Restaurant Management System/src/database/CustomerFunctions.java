package database;

import java.sql.*;

public class CustomerFunctions extends database.CustomerModuleTables{
    
    
    public  void selectCustomers(){
        select("select * from Customers");
    }
    public void searchById(int id) {
        select("select * from Customers where ID = " + id );
    }
    public void searchByName(String name) {
        select("select * from Customers where FullName = '" + name + "'" );
    }
    public int addcustomer(String ...D) {
        return Modify("insert into Customers (ID,FullName,Address,Phone_Number,Marketing,Loyalty_Reward_Programs) values ("
                        +D[0]+",'"+D[1]+"','"+D[2]+"','"+D[3]+"',"+D[4] +","+D[5]+")");
    }
    public int deletecustomer(int id) {
        return Modify("delete from Customers where ID = "+ id);
    }
    public void updatecustomer(String ...D) {
           Modify("update Customers set FullName = '" + D[1] + "' where ID = " + D[0] );
           Modify("update Customers set Address = '" + D[2] + "' where ID = " + D[0]);
           Modify("update Customers set Phone_Number = '" + D[3] + "' where ID = " + D[0] );
           Modify("update Customers set Marketing = " + D[4] + " where ID = " + D[0] );
           Modify("update Customers set Loyalty_Reward_Programs = " + D[5] + " where ID = " + D[0] );
           Modify("update Customers set Total_Payments = " + D[6] + " where ID = " + D[0] );
           Modify("update Customers set Points = " + D[7] + " where ID = " + D[0] );
           Modify("update Customers set Gifts = " + D[8] + " where ID = " + D[0] );
           Modify("update Customers set Spetial_Offers = " + D[9] + " where ID = " + D[0] );
    }
    public void checkCustomer(int id) {
           select("select count(*) from Customers where ID = " + id );
           try{
           int res = 0;
           if( r.next() ) res = r.getInt(1);
           if(res == 0 ) Modify("insert into Customers (ID) values (" + id + ")" );
           } catch(SQLException ex){System.out.println(ex);}
    }
    
    public void update_TotalPayments_Points(Object ...D) {
            Modify("update Customers set Total_Payments = " + D[0] + " where ID = " + D[2] );
            Modify("update Customers set Points = " + D[1] + " where ID = " + D[2] );
    }
    
    public void update_gifts(Object ...D) {
            Modify("update Customers set Gifts = " + D[0] + " where ID = " + D[1] );
    }
    
    public void update_offers(Object ...D) {
            Modify("update Customers set Spetial_Offers = " + D[0] + " where ID = " + D[1] );
    }
}
