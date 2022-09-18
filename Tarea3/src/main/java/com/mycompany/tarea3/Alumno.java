/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3;

/**
 *
 * @author HP
 */
public class Alumno {
    private String codigo;
    private String nombre;
   String Asignatura;
   double nota1,nota2,nota3;
   
   Alumno(String codigo,String nombre, String asignatura, double n1,double n2,double n3){
       
       this.codigo=codigo;
       this.nombre=nombre;
       this.Asignatura=asignatura;
       this.nota1=n1;
       this.nota2=n2;
       this.nota3=n3;
   }
   double promedio(){
       return (nota1+nota2+nota3)/3;}
   
   public String getCodigo(){
       return codigo;}
   
   public void setCodigo(String codigo){
       this.codigo=codigo;}
   
   public String getNombre(){
       return nombre;}
   
    public void setNombre(String NOMBRE){
       this.nombre=nombre;}  
}
