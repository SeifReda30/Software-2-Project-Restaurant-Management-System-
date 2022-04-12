package database;

import static database.connect.connect;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import domain.*;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class employee_database {
    public static ArrayList<employee> get_employee() throws ClassNotFoundException, SQLException {

        ArrayList<employee> list = new ArrayList<>();
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select * from employee");
            ResultSet r = p.executeQuery();
            while (r.next()) {
               list.add(new employee(
                       r.getInt("id"),
                       r.getString("name"),
                       r.getString("password"),
                       r.getString("phone"),
                       r.getString("address")
               )
               );
            }
        } catch (SQLException ee) {
            System.out.println(ee.getMessage());

        }
        return list;
    }
     
     public static void add_employee(int employee_id,String  employee_name,String employee_password,String  employee_phone,String employee_address) 
            throws ClassNotFoundException, SQLException{
        try{
        Connection con=connect();
        PreparedStatement p=con.prepareStatement("insert into employee values(?,?,?,?,?)");
        p.setInt(1, employee_id);
        p.setString(2, employee_name);
        p.setString(3, employee_password);
        p.setString(4, employee_phone);
        p.setString(5, employee_address);

        p.execute();
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }
     
    public static void update_employee(int employee_id,String  employee_name,String employee_password,String  employee_phone,String employee_address) 
            throws ClassNotFoundException,SQLException{
        try {
            Connection con=connect();
            PreparedStatement p=con.prepareStatement("update employee set name =?,password=? ,phone=? ,address=? where id = ? ");
            p.setString(1,  employee_name);
            p.setString(2, employee_password);
            p.setString(3, employee_phone);
            p.setString(4, employee_address);
            p.setInt(5, employee_id);
          
            p.execute();
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        } 
    }
     public static void delete_employee(int employee_id) throws ClassNotFoundException,SQLException{
        
        try {
            Connection con=connect();
            PreparedStatement p=con.prepareStatement("delete from employee where id = ? ");
            p.setInt(1, employee_id);
            p.execute();
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        } 
    }
     
     public static int check_employee(String user, String password) throws ClassNotFoundException, SQLException
    {
        ArrayList<employee> list = get_employee();
        for (int i=0;i<list.size();i++)
        {
            if (list.get(i).getName().equalsIgnoreCase(user))
            {
                if (list.get(i).getPassword().equals(password))
                {
                    return 1;
                }
                else
                {
                    return 2;
                }       
            }
            else
            {
                continue;
            }
            
        }
        return 0;
   
    }
     

}