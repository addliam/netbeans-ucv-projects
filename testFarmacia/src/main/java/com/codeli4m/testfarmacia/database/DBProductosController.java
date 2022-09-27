/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.testfarmacia.database;

import java.sql.Connection;
import java.sql.*;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class DBProductosController {
    private Connection conn;

    public DBProductosController() {
        conn = new DbConfig().getConn();
    }

    public List<String[]> getBasicInfoProducts(){
        List<String[]> allProductsList = new ArrayList<String[]>();
//        Object[] arrayObject = null;
        try {
            Statement stmt = conn.createStatement();
//                            "Codigo", "Nombre", "Precio compra", "Categoria ID", "Presentacion ID", "Stock actual", "Lote", "Fecha venc.", "Medida", "Cant. medida"};
//            String[][] arrayObject;
//            allProductsList.add(e);
            ResultSet rs = stmt.executeQuery("select Producto_id, Producto_nombre, Producto_precio_compra, Categoria_id, Presentacion_id, Producto_stock_actual, Producto_lote, Producto_fecha_venc, Producto_unidad_medida, Producto_cantidad_unidades from productos");
//            ResultSet rs = stmt.executeQuery("SELECT * FROM PRODUCTOS");
            // 10 columns            
            while (rs.next()) {         
                //execute each row
                System.out.println(rs.getString(1));
                String[] productRowList = new String[10];
                for (int i=0;i<10;i++){
                    productRowList[i] = rs.getString(i+1);
                }
                System.out.println("PRODUCT ROW LIST FINISHED");
                allProductsList.add(productRowList);
            }
            
            for (int k=0;k<allProductsList.size();k++){
                String[] rowStringArray = allProductsList.get(k);
                String productInfo = String.join(" - ", rowStringArray);
                System.out.println(productInfo);
            }
//            arrayObject = allProductsList.toArray();
            
        } catch (Exception e) {
            System.out.println("ERROR ON LIST PRODUCTOS");
            System.out.println(e);
        }
        return allProductsList;
    }
    
    // return exit code
    public int insertNewProduct(String productoNombre, String productoDescripcion, float productoPrecioCompra, int categoriaId, int presentacionId, int productoStockActual, String productoLote, String productoFechaVenc, String productoUnidadMedida, int productoCantidadUnidades){
        try {
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO Productos(Producto_nombre,Producto_descripcion, Producto_precio_compra, Categoria_id, Presentacion_id, Producto_stock_actual, Producto_lote, Producto_fecha_venc, Producto_unidad_medida, Producto_cantidad_unidades) VALUES (?,?,?,?,?,?,?,STR_TO_DATE(?, \"%d/%m/%Y\"),?,?)");
            pstmt.setString(1, productoNombre);
            pstmt.setString(2, productoDescripcion);
            pstmt.setFloat(3, productoPrecioCompra);
            pstmt.setInt(4, categoriaId);
            pstmt.setInt(5, presentacionId);
            pstmt.setInt(6, productoStockActual);
            pstmt.setString(7, productoLote);
            pstmt.setString(8, productoFechaVenc);
            pstmt.setString(9, productoUnidadMedida);
            pstmt.setInt(10, productoCantidadUnidades);
            int response = pstmt.executeUpdate();
            if (response>=0){
                System.out.println("INSERT PRODUCTS");
                System.out.println("-> "+response+" rows inserted.");
            }
            
        } catch (Exception e) {
            System.out.println("OCURRIO UN ERROR AL INSERTAR PRODUCTO");
        }
        return 0;
    }
            

}
