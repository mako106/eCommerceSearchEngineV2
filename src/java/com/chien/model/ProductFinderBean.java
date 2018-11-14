/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chien.model;

import com.chien.data.ProductDataAccess;
import com.chien.intity.Product;
import java.util.List;

/**
 *
 * @author chien
 */
public class ProductFinderBean {
    
    private String keyword;


    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
    
  
    public  List<Product> getProducts(){
    return  new ProductDataAccess().getProductsByName(keyword);
    }
    
}
