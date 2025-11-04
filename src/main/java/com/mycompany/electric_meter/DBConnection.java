/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.electric_meter;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author zh4rk
 */
public class DBConnection {
    public static Connection getConnection(){
        try{
            String dbRoot = "jdbc:mysql://";
            String hostName = "localhost:3306/";
            String dbName = "electric_meter";
            String dbUrl = dbRoot + hostName + dbName;
            
            String hostUsername = "root";
            String hostPassword = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
            //JOptionPane.showMessageDialog(null, "Connected to Database");
            
            return myConn;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Connection Error");
             JOptionPane.showMessageDialog(null, e);
             
             return null;
        }
    }
    static Connection conns(){
        throw new UnsupportedOperationException("Not Supported Yet");
    }
}
