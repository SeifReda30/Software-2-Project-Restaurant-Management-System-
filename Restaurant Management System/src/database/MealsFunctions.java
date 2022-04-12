package database;

import java.sql.*;

public class MealsFunctions extends database.CustomerModuleTables{
    
    public  void selectMeals(){
        select("select * from meals");
    }
     
    public void searchByName(String n){
         select("select * from meals where name = '"+n+"'");
     }
     
     public void searchById(int id) {
         select("select * from meals where id = " + id );
     }
     
     public void updateQuantity(Object ...D) {
          Modify("update Meals set quantity = " + D[0] + " where ID = " + D[1]);
     }
}
