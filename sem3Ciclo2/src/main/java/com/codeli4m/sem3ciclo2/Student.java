/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.sem3ciclo2;    

/**
 *
 * @author HP
 */
public class Student {
    private String name;
    private String id;
    private Course[] courses = new Course[3];
    // posibles cursos Metodologías de Programación, Sistémica o Matemática II

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        
//        float[] prograNotas = {18.5f,20f,16.5f};
        Course prograCourse = new Course("Programacion");
        Course sistemicaCourse = new Course("Sistemica");
        Course mateiiCourse = new Course("Matematica II");
        
//        prograCourse.setNotas(prograNotas);
        courses[0] = prograCourse;
        courses[1] = sistemicaCourse;
        courses[2] = mateiiCourse;
    }
    
    public void setCourseNotasByIndex (int coursesIndex, float[] courseNotas){
        // TODO: validate courseNotas element in range 0 29
        this.courses[coursesIndex].setNotas(courseNotas);
    }
    
    public String getStudentInfo(){
        String responseInfo = "";
        responseInfo+="NOMBRE: "+this.name+"\n";
        responseInfo+="CDOIGO: "+this.id+"\n";
        
        for (Course course: this.courses){
            String currentCourseInfo = course.getInfo();
            responseInfo += currentCourseInfo+"\n";
        }
        return responseInfo;
    }
}
