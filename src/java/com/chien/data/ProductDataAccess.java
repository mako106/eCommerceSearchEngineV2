/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chien.data;

import com.chien.intity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import javax.xml.transform.Result;

/**
 *
 * @author chien
 */
public class ProductDataAccess {

    private PreparedStatement searchStatement;

    private PreparedStatement getPreparedStatement() throws ClassNotFoundException, SQLException {

        if (searchStatement == null) {
            Connection connection = new DBConnection().getConnection();
            searchStatement = connection.prepareStatement("SELECT id, name, description FROM product WHERE name like ?");

        }
        return searchStatement;
    }
   public  List<Product> getProductsByName(String name){
    
       try {
           PreparedStatement statement = getPreparedStatement();
           statement.setString(1,"%"+name+"%");
           ResultSet rs = statement.executeQuery();
           List<Product> products = new LinkedList<Product>();
           while (rs.next()) {               
               
               products.add(new Product(rs.getInt("id"), rs.getString("name"), rs.getString("description")));
           }
           return  products;
           
       } catch (Exception e) {
       e.printStackTrace();
       return  null;
       }
       
   }

}
