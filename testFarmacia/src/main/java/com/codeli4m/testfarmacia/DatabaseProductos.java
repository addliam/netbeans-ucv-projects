/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.testfarmacia;
import java.sql.*;

import com.codeli4m.testfarmacia.database.DbConfig;

/**
 *
 * @author HP
 */
public class DatabaseProductos {
    Connection connection;
    public DatabaseProductos() {
        System.out.println("Instanciaded Database productos!");
        DbConfig dbConnection = new DbConfig();
        connection = dbConnection.getConn();
    }
    
    public void insertProducto (){
//        INSERT INTO Productos(Producto_nombre,Producto_descripcion, Producto_precio_compra, Categoria_id, Presentacion_id, Producto_stock_actual, Producto_lote, Producto_fecha_venc, Producto_unidad_medida, Producto_cantidad_unidades) VALUES ("Paracetamol 500 mg","Para el alivio de dolores de cabeza, migraña, neuralgia y otros dolores",15.50,102,11,40,"2077850",STR_TO_DATE("01/02/2023", "%d/%m/%Y"),"unidades",100);
        System.out.println("You are trying insert product! ....");
        try {
            PreparedStatement pstmt = connection.prepareStatement("insert into Productos(Producto_nombre,Producto_descripcion, Producto_precio_compra, Categoria_id, Presentacion_id, Producto_stock_actual, Producto_lote, Producto_fecha_venc, Producto_unidad_medida, Producto_cantidad_unidades) values (?,?,?,?,?,?,?,?,?,?)");
            pstmt.setString(1, "Aspirina 500 mg");
            pstmt.setString(2, "Acido acetilsaliciclico, alivia el dolor y reduce la fiebre");
            pstmt.setFloat(3, 16.50f);
            pstmt.setInt(4, 102);
            pstmt.setInt(5, 11);
            pstmt.setInt(6, 26);
            pstmt.setString(7, "7782061");
            // The method java.sql.Date.valueOf(java.lang.String) received a string representing a date in the format yyyy-[m]m-[d]d. e.g.:
            pstmt.setDate(8, java.sql.Date.valueOf("2028-06-12"));
            pstmt.setString(9, "unidades");
            pstmt.setInt(10, 100);
            
            int recordsInserted = pstmt.executeUpdate();
                    
            System.out.println("Product inserted !!!");
            System.out.println("Records inserted: "+recordsInserted);
        } catch (Exception e) {
            System.out.println("Error inserting new product!");
        }
    }
    
    
    
}
