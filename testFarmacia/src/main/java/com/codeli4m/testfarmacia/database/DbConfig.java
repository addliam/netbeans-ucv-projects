/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.testfarmacia.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author HP
 */

public class DbConfig {
    public Connection conn;
    public DbConfig() {
        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
            String urlConnectionString = "jdbc:mysql://localhost:3306/inventario_farmacia";
            String usernameConnectionString = "root";
            String passwordConnectionString = "root";
            conn = DriverManager.getConnection(urlConnectionString, usernameConnectionString, passwordConnectionString);
            System.out.println("SUCESSFULLY CONNECTED TO DATABASE");
            
        } catch (SQLException ex) {
            System.out.println("An error ocurred while connection to database MySql.");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } 
    }
    public Connection getConn() {
        return conn;
    }
    public int closeConnection() {
        try {
            conn.close();
            return 0;
        } catch (Exception e) {
            System.out.println("ERROR CLOSSING CONNECTION");
            return 1;
        }
    }
}
