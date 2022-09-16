/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.asistencia;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class Student {
    private String id;
    private String name;
    private String firstLastname;
    private String secondLastname;
    // S1, S2, ..., S16
    private String course;
    // habilitado | inhabilitado
    private boolean enabled = false;
    private List<String> sesionsList = new ArrayList<String>();
    private List<String> attendanceList = new ArrayList<String>();
    // default value for sesionsNumber
    private int sesionsNumberInt = 16;
    // TODO: hashmap curso

    public Student(String id, String name, String firstLastname, String secondLastname, int sesionsNumber) {
        this.id = id;
        this.name = name;
        this.firstLastname = firstLastname;
        this.secondLastname = secondLastname;
        this.sesionsNumberInt = sesionsNumber;
        for (int i=1; i<=sesionsNumber;i++){
            String sesionName = "S"+i;
            this.sesionsList.add(sesionName);
            // set default attendance Value as F (A|F|T)
            this.attendanceList.add("F");
        }
        
    }
    
    public void setAttendanceBySessionNumber(int sesionNumber, String attendanceValue){
        // check attendance string is valid
        if ((attendanceValue=="A"|attendanceValue=="F"|attendanceValue=="T") && (sesionNumber>=1) && (sesionNumber<=this.sesionsNumberInt)){
            int sesionIndex = sesionNumber -1;
            this.attendanceList.set(sesionIndex,attendanceValue);
        }else{
            System.out.println("PARAMETROS INVALIDOS!");
        }
        // contar el numero de inasistencias
        int absentsNumber = 0;
        for(String attendanceValString: this.attendanceList){
            if (attendanceValString == "F"){
                absentsNumber+=1;
            }
        }
        double thirtyPercent = (30/100)*this.sesionsNumberInt;
        if (absentsNumber<=thirtyPercent){
            this.enabled = true;
        }
    }
    
    public void printInfo(){
        System.out.println("CODIGO: "+this.id);
        System.out.println("NOMBRE: "+this.name);
        System.out.println("APELLIDO PATERNO: "+this.firstLastname);
        System.out.println("APELLIDO MATERNO: "+this.secondLastname);
        System.out.println("CURSO: "+this.course);
        System.out.println("HABILITADO: "+this.enabled);
        System.out.println("LISTA DE SESIONES");
        for (String sesion:this.sesionsList){
            System.out.print(sesion+" - ");
        }
        System.out.println("\nLISTA DE ASISTENCIAS");
        for (String attendance:this.attendanceList){
            System.out.print(attendance+"  |  ");
        }

    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    
}
