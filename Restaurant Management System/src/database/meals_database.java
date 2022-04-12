/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import static database.connect.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import domain.meal;
import java.sql.ResultSet;
import java.util.ArrayList;


/**
 *
 * @author DELL
 */
public class meals_database {
    
    public static void add_meal(int meal_id,String meal_name,float meal_price,int meal_quantity) 
            throws ClassNotFoundException, SQLException{
        try{
        Connection con=connect();
        PreparedStatement p=con.prepareStatement("insert into meals values(?,?,?,?)");
        p.setInt(1, meal_id);
        p.setString(2, meal_name);
        p.setFloat(3, meal_price);
        p.setInt(4, meal_quantity);
        p.execute();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static ArrayList<meal> get_meals() throws ClassNotFoundException,SQLException {
        ArrayList<meal> list=new ArrayList<>();
        try {
            Connection con=connect();
            PreparedStatement p=con.prepareStatement("select * from meals");
            ResultSet r=p.executeQuery();
            while(r.next()){
                list.add(new meal(r.getInt("id"),r.getString("name"),r.getFloat("price"),r.getInt("quantity")));
            }
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        return list;
    }
    public static void delete_meal(int meal_id) throws ClassNotFoundException,SQLException{
        
        try {
            Connection con=connect();
            PreparedStatement p=con.prepareStatement("delete from meals where id = ? ");
            p.setInt(1, meal_id);
            p.execute();
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        } 
    }
    public static void update_meal(int meal_id,String meal_name,float meal_price,int meal_quantity) 
            throws ClassNotFoundException,SQLException{
        try {
            Connection con=connect();
            PreparedStatement p=con.prepareStatement("update meals set name =?,price=? ,quantity=? where id = ? ");
            p.setString(1, meal_name);
            p.setFloat(2, meal_price);
            p.setInt(3, meal_quantity);
            p.setInt(4, meal_id);
          
            p.execute();
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        } 
    }
    public static void update_price(int meal_id,float meal_price) 
            throws ClassNotFoundException,SQLException{
        try {
            Connection con=connect();
            PreparedStatement p=con.prepareStatement("update meals set price=? where id = ? ");
            p.setFloat(1, meal_price);
            p.setInt(2, meal_id);
            p.execute();
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        } 
    }
    public static void update_quantity(int meal_id,int meal_quantity) 
            throws ClassNotFoundException,SQLException{
        try {
            Connection con=connect();
            PreparedStatement p=con.prepareStatement("update meals set quantity=? where id = ? ");
            p.setInt(1, meal_quantity);
            p.setInt(2, meal_id);
            p.execute();
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        } 
    }
        
      
}
