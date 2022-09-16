/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.codeli4m.asistencia;

/**
 *
 * @author HP
 */
public class Asistencia {

    public static void main(String[] args) {
        // public Student(String id, String name, String firstLastname, String secondLastname, int sesionsNumber) {
        Student stdnt = new Student("04084004","Ricardo","Solano","Villavicencio",16);
        stdnt.setCourse("Metodologia Programacion");
        stdnt.setAttendanceBySessionNumber(2, "A");
        stdnt.setAttendanceBySessionNumber(4, "A");
        stdnt.setAttendanceBySessionNumber(6, "A");
        
        stdnt.printInfo();
    }
}
