/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.poo1;

/**
 *
 * @author HP
 */
public class Customer {
    private final String dniString;
    private String nameString;
    private final String firstLastNameString;
    private final String secondLastNameString;
    private int age;
    private String emailString = "";
    public Customer(String dni, String name, String firstLastname, String secondLastname, int age, String email) throws Exception{
        if ((age <= 0) || (age >= 150)){
            System.out.println("FUERA DE RANGO EDAD: "+age);
            throw new Exception("Age out of range.");
        }
        else{
            this.age = age;
        }
        this.dniString = dni;
        this.nameString = name;
        this.firstLastNameString = firstLastname;
        this.secondLastNameString = secondLastname;
        this.emailString = email;
    }
    public String getCustomerFullName(){
        return (this.nameString +" "+ this.firstLastNameString +" "+ this.secondLastNameString);
    }
    public void printCustomerInfo(){
        System.out.println("------ CUSTOMER INFORMATION ------");
        System.out.println("DNI: "+this.dniString);
        System.out.println("FULLNAME: "+this.getCustomerFullName());
        System.out.println("AGE: "+this.age);
        System.out.println("EMAIL: "+this.emailString);
    }
    public int setEmail(String newEmail){
        // return custom status code
        // 0 success - 1 failure
        // validate @ in email
        if (!newEmail.contains("@")){
            return 1;
        }
        else{
            this.emailString = newEmail;
            return 0;
        }
    }
}
