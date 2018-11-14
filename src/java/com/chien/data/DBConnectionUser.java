/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chien.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author chien
 */
public class DBConnectionUser {
     private Connection conn = null;

    
    public static void main(String[] args) {
     Connection con = null;
        DBConnectionUser mydb = new DBConnectionUser();
        con = mydb.makeConnection();
        if (con!=null) {
            
            System.out.println("ket noi oke");
        }else{
            System.out.println("fail ket noi");
        }
    
    
    }

    public Connection makeConnection() {

        try {
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/USER_PRODUCT", "sa", "sa");
            return conn;

        } catch (SQLException sqle) {

            return null;
        }

    }

    public ResultSet checkLogin(String username, String password) {
        try {
            conn = makeConnection();
           PreparedStatement st = conn.prepareStatement("SELECT * FROM USER_PRODUCT WHERE username=? AND password =?");
           st.setString(1, username);
           st.setString(2, password);
            
//            Statement st = conn.createStatement();
//            String query = "SELECT * FROM login WHERE username ='"+ username + "' AND password ='" + password + "'";
            ResultSet rs;
            
            rs = st.executeQuery();
            return  rs;

        } catch (SQLException sqle) {
            return null;
        }

    }

}
