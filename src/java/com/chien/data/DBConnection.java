/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chien.data;

import static java.awt.SystemColor.info;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author chien
 */
public class DBConnection {
    
    
    private static  Connection connection;
    public  Connection getConnection() throws ClassNotFoundException,SQLException{
    
        if (connection ==null) {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection("jdbc:derby://localhost:1527/Product", "sa", "sa");
         
        }
        return  connection;
        
    }
    
    
    
}
