/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.testfarmacia;
import com.codeli4m.testfarmacia.gui.AdminLoginInterface;
import java.sql.Connection;
import java.sql.*;
/**
 *
 * @author HP
 */
public class TestFarmacia {

    public static void main(String[] args) {
        System.out.println("Bienvenidos al sistema de gestion de inventario");
        AdminLoginInterface adminGui = new AdminLoginInterface();
        adminGui.setVisible(true);
        
//        DatabaseConnection dbConnection = new DatabaseConnection();
//        Connection connection = dbConnection.getConn();
//        DatabaseProductos dbProductos = new DatabaseProductos();
//        dbProductos.insertProducto();
//        try {
//            Statement stmt = connection.createStatement();
//            String userInputString = "' OR 1=1 -- -";
////            String userInputString = "75cee5b221098c39dc19feca49b7b7cfe46405057d0361b18726990a5f91bf25";
//
//            String customQueryString = "select * from usuarios where Usuario_nickname='invitado' and Usuario_contrasena='"+userInputString+"'";
//            System.out.println(customQueryString);
//            System.out.println("RESULTADO");
//            ResultSet rs = stmt.executeQuery(customQueryString);
//            while (rs.next()){
//                System.out.println(rs.getInt(1)+" - "+rs.getString(2)+" - "+rs.getString(3)+" - "+rs.getString(4)+" - "+rs.getString(5));
//            }
//            
//        } catch (Exception e) {
//            System.out.println("ERROR");
//        }
//        
    }
}
