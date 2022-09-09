/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.poo1;

/**
 *
 * @author HP
 */
public class Automovil {
    private final String automovilIdString;
    private final String marcaString;
    private String colorString;
    private float velocidadMaxima;
    private final String fechaProduccionString;
    
    public Automovil(String id,String marca, String color, float velocidadMaxima, String fechaProduccion){
        this.automovilIdString = id;
        this.marcaString = marca;
        this.colorString = color;
        this.velocidadMaxima = velocidadMaxima;
        this.fechaProduccionString = fechaProduccion;
    }
    public void Acelerar(float velocidad){
        if (velocidad > this.velocidadMaxima){
            System.out.println("ERROR. VELOCIDAD MAXIMA: "+this.velocidadMaxima);
        }
        else{
            System.out.println("EL AUTO ESTA ACELERANDO A "+velocidad);
        }
    }
    public void GetInfo(){
        System.out.println("ID: "+this.automovilIdString);
        System.out.println("MARCA: "+this.marcaString);
        System.out.println("COLOR: "+this.colorString);
        System.out.println("VELOCIDAD MAXIMA: "+this.velocidadMaxima);
        System.out.println("FECHA PRODUCCION: "+this.fechaProduccionString);
        System.out.println("ID: "+this.automovilIdString);
    }
    public void ChangeColor(String newColor){
        String oldColor = this.colorString;
        this.colorString = newColor;
        System.out.println("SE CAMBIO EL COLOR DE "+oldColor+" A "+this.colorString);
    }
}
