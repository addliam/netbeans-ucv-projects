/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author HP
 */
public class Model {
// model same as Course
    private String id;
    private String name;
    private float score1;
    private float score2;
    private float score3;

    public Model(String id, String name, float score1, float score2, float score3) {
        this.id = id;
        this.name = name;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
    }
    
    public float getScoreAverage(){
        float average = (this.score1+this.score2+this.score3)/3;
        return average;
    }
    
    public String getCourseInfo(){
        String info = "";
        info += "CODIGO: "+this.id+"\n";
        info += "NOMBRE: "+this.name+"\n";
        info += "PROMEDIO: "+this.getScoreAverage()+"\n";        
        return info;
    }
    
}
