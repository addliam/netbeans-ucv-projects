/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.sem4clase;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author HP
 */
public class Factura {
    String nombreCliente = "";
    String direccionCliente = "";
    String rucCliente = "";
    List<ProductoDetalle> productoDetalleList = new ArrayList<>();
    
    public Factura(){
        // test
        ProductoDetalle pDetalle = new ProductoDetalle("Equipaje de futbol", 80.0f, 3);
        ProductoDetalle pDetalle2 = new ProductoDetalle("Balon de futbol", 50.0f, 2);
        
        this.productoDetalleList.add(pDetalle);
        this.productoDetalleList.add(pDetalle2);
        
    }
    
    public void registrarCliente(String nombre, String direccion, String ruc){
        this.nombreCliente = nombre;
        this.direccionCliente = direccion;
        this.rucCliente = ruc;
        System.out.println("CLIENTE REGISTRADO CON EXITO");
    }
    
    public void agregarProductoDetalle(ProductoDetalle prodDetalle){
        this.productoDetalleList.add(prodDetalle);
        System.out.println("OBJECTO PRODUCTO DETALLE AGREGADO");
    }
    
    public float getMontoTotal(){
        float suma = 0;
        for (int i=0;i<productoDetalleList.size();i++){
            suma += productoDetalleList.get(i).productoDetImporte;
        }
        return suma;
    }
    
    public String getFacturaInfo(){
        String info = "";
        info += "------ INFORMACION DEL CLIENTE ------\n";
        info += "NOMBRE  -> "+this.nombreCliente+"\n";
        info += "DIRECCION -> "+this.direccionCliente+"\n";
        info += "RUC-> "+this.rucCliente+"\n";
        return info;
    }
    
//    public ProductosDetalle[] productoDetalleList = new P;
    
//    Object<ProductoDetalle> listProducts;
            
}
