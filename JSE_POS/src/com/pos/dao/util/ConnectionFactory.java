/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pos.dao.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 *
 * @author moata
 */
public class ConnectionFactory {
    
    private static String driver_calss;
    private static String url;
    private static String username;
    private static String password;
    
    static{
    
        ResourceBundle bundle = ResourceBundle.getBundle("com.pos.dao.util.jdbc");
//        driver_calss = bundle.getString("driver_class");
        url = bundle.getString("url");
        username = bundle.getString("username");
        password = bundle.getString("password");
    
       }
    
    public static Connection creatConnection() throws SQLException{
        return DriverManager.getConnection(url, username, password);
    }


}
