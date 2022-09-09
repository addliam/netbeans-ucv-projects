/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.lab02;

/**
 *
 * @author HP
 */
public class Empleado {
    private final String codigo;
    private final String nombre;
    private String area;
    double sueldoBase;
    double horasExtras;
    private String tipo_seg;
    // TODO: constructor

    public Empleado(String codigo, String nombre, String area, double sueldoBase, double horasExtras, String tipo_seg) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.area = area;
        this.sueldoBase = sueldoBase;
        this.horasExtras = horasExtras;
        this.tipo_seg = tipo_seg;
    }
    
    
    public double montoHorasExtra(){
            return sueldoBase * horasExtras / 240;
    }

    public double montoSeguro(){
        if(tipo_seg.equalsIgnoreCase("AFP")){
                return (this.sueldoBase * 0.17);
        }
        if(tipo_seg.equalsIgnoreCase("SNP")){
            System.out.println("SEGURO SNP");
                return (this.sueldoBase * 0.05);
        }else{
                return 0;
        }
    }

    public double montoEssalud(){
            return sueldoBase * 0.03;
    }

    public double montoDescuentos(){
            return montoSeguro() + montoEssalud();
    }

    public double sueldoBruto(){
            return sueldoBase + montoHorasExtra();
    }

    public double sueldoNeto(){
            return sueldoBruto() - montoDescuentos();
    }
    
    private String roundTwoDecimals(double value){
        return String.format("%.2f", value);
    }
    
    public String getEmpleadoFullInfo(){
        String info = "";
        info += "Codigo:              "+this.codigo+"\n";
        info += "Nombre:              "+this.nombre+"\n";
        info += "Seguro:              "+this.tipo_seg+"\n";
        info += "Sueldo base:         "+this.sueldoBase+"\n";
        info += "Horas extras:        "+this.horasExtras+"\n";
        info += "Area:                "+this.area+"\n";
        info += "Monto extra:         "+this.roundTwoDecimals(this.montoHorasExtra())+"\n";
        info += "Monto seguro:        "+this.roundTwoDecimals(this.montoSeguro())+"\n";
        info += "Monto EsSalud:       "+this.roundTwoDecimals(this.montoEssalud())+"\n";
        info += "Monto de descuentos: "+this.roundTwoDecimals(this.montoDescuentos())+"\n";
        info += "Sueldo bruto:        "+this.roundTwoDecimals(this.sueldoBruto())+"\n";
        info += "Sueldo neto:         "+this.roundTwoDecimals(this.sueldoNeto());
        return info;
    }
}
