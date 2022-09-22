/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Model;
import view.CustomView;

/**
 *
 * @author HP
 */
public class Controller implements ActionListener{
    private final CustomView view;
    private final Model model;
    
    public Controller(CustomView view , Model model){
        this.view = view;
        this.model = model;
        this.view.jButtonShow.addActionListener(this);
    }
    public void initView(){
        view.setTitle("Modelo Vista Controlador");
        view.setLocationRelativeTo(null);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String courseId = view.jTextFieldId.getText();
        String courseName = view.jTextFieldName.getText();
        float courseScore1 = Float.parseFloat(view.jTextFieldScore1.getText());
        float courseScore2 = Float.parseFloat(view.jTextFieldScore2.getText());
        float courseScore3 = Float.parseFloat(view.jTextFieldScore3.getText());
        Model course = new Model(courseId, courseName, courseScore1, courseScore2, courseScore3);
        String courseInformation = course.getCourseInfo();
        view.jTextArea1.setText(courseInformation);
    }
    
}
