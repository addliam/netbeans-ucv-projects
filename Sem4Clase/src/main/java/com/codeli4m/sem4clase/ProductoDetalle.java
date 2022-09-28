/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.sem4clase;

/**
 *
 * @author HP
 */
public class ProductoDetalle {
    public String productoDetDescripcion;
    public float productoDetPrecioUnitario;
    public int productoDetCantidad;
    public float productoDetImporte;

    public ProductoDetalle(String productoDetDescripcion, float productoDetPrecioUnitario, int productoDetCantidad) {
        this.productoDetDescripcion = productoDetDescripcion;
        this.productoDetPrecioUnitario = productoDetPrecioUnitario;
        this.productoDetCantidad = productoDetCantidad;
        this.productoDetImporte = this.productoDetPrecioUnitario * this.productoDetCantidad;
    }
    
}
