/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.sem3ciclo2;

/**
 *
 * @author HP
 */
public class Course {
    private String name;
    private float[] notas = {0f,0f,0f};
    
    public Course(String name) {
        this.name = name;
    }
    
    // TODO: set notas individually
    
    public void setNotas(float[] arrayNotasFloat){
        if (arrayNotasFloat.length == 3){
            this.notas = arrayNotasFloat;
        }
        else{
            System.out.println("Array notes Float must be lennght 3!");
        }
    }
    
    public float getNotasAverage(){
        float average;
        float notasSum = 0f;
        for (float nota: this.notas){
            notasSum += nota;
        }
        average = notasSum / this.notas.length;
        return average;
    }
    
    public String getInfo(){
        String info="";
        info += "NOMBRE: "+this.name+"\n";
        info += "CANTIDAD DE NOTAS: "+this.notas.length+"\n";
        info += "NOTAS: \n";
        String joinedNotas = "";
        for (int i=0;i<this.notas.length;i++){
            if (i != (this.notas.length-1)){
                joinedNotas+=notas[i]+" - ";
            }else{
                joinedNotas+=notas[i];
            }
        }
        info += joinedNotas+"\n";
        String formattedAverage = String.format("%.2f", this.getNotasAverage());
        info += "PROMEDIO: "+formattedAverage+"\n";
//        for (int nota: this.notas){
//            info+=(nota+" - ");
//        }
        return info;
    }
    
}
