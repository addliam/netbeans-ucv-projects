/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.testfarmacia;

/**
 *
 * @author HP
 */
import java.sql.*;

public class connection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String urlConnectionString = "jdbc:mysql://localhost:3306/inventario_farmacia";
            String usernameConnectionString = "root";
            String passwordConnectionString = "root";
            
            Connection con = DriverManager.getConnection(urlConnectionString, usernameConnectionString, passwordConnectionString);
            Statement stmt = con.createStatement();
            String customQueryString = "select * from usuarios";
            ResultSet rs = stmt.executeQuery(customQueryString);
            while (rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
            }
            con.close();
            
        } catch (Exception e) {
            System.out.println("An error ocurred while connection to database MySql.");
            System.out.println(e);
        } 
        
    }
}
