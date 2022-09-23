/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.testfarmacia.database;

/**
 *
 * @author Liam
 */
public class AuthenticatedUser {
//    private boolean isLoggedIn = false;
    // TODO add getters
    public String name, nickname, rol;

    public AuthenticatedUser(String name, String nickname, String rol) {
        this.name = name;
        this.nickname = nickname;
        this.rol = rol;
    }
    
    public boolean isAdmin(){
        boolean res = false;
        if (this.rol.equalsIgnoreCase("administrador")){
            res = true;
        }
        return res;
    }
    
    public String getUserInfo(){
        String info = "";
        info += "NAME -> "+ this.name +"\n";
        info += "NICKNAME -> "+ this.nickname +"\n";
        info += "ROL -> "+ this.rol +"\n";
        return info;
    }
}