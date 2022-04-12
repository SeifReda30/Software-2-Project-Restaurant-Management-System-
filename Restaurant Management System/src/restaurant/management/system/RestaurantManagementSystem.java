/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.management.system;

import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class RestaurantManagementSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            database.connect.connect();
            System.out.println("Connection succeded");
            first_scr screen = new first_scr();
        }catch (ClassNotFoundException | SQLException ee)
        {
            System.out.println(ee.getMessage());
        }
    }
    
}
