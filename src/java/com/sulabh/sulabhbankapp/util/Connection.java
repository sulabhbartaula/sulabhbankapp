/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sulabh.sulabhbankapp.util;

import com.mysql.jdbc.PreparedStatement;

/**
 *
 * @author user
 */
public class Connection {
    static String username = "root";
    static String password = "";
    static String dbUrl = "jdbc:mysql://localhost:3306/sbankapp";

    public PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
