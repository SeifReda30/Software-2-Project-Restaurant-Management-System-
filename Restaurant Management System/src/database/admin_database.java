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
import domain.*;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class admin_database {

    public static ArrayList<admin> get_admin() throws ClassNotFoundException, SQLException {
        ArrayList<admin> list = new ArrayList<>();
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select * from admin");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new admin(r.getInt("id"), r.getString("name"), r.getString("password")));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return list;
    }

    public static void add_admin(int id, String name, String password)
            throws ClassNotFoundException, SQLException {
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into admin values(?,?,?)");
            p.setInt(1, id);
            p.setString(2, name);
            p.setString(3, password);
            p.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void update_admin(int id, String name, String password)
            throws ClassNotFoundException, SQLException {
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("update admin set name =?,password=? where id = ? ");
            p.setString(1, name);
            p.setString(2, password);
            p.setInt(3, id);
            p.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void delete_admin(int id) throws ClassNotFoundException, SQLException {

        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("delete from admin where id = ? ");
            p.setInt(1, id);
            p.execute();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static int check_admin(String user, String password) throws ClassNotFoundException, SQLException
    {
        ArrayList<admin> list = get_admin();
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


