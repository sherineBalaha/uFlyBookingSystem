/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uflybookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 91030283
 */
public class DbConnector 
{
    public static Connection connectToDb() throws SQLException{

        String url = "jdbc:mysql://127.0.0.1:3306/";
        String database = "customer_products";
        String userName = "root";
        String password = "password";
        
        return DriverManager.getConnection(url+ database, userName, password);
    }
}
   
    

