/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codeli4m.testfarmacia.database;

/**
 *
 * @author HP
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Liam
 */
public class User {
//    private boolean isLoggedIn = false;
    public String name, nickname, rol;

    private final Connection conn = new DbConfig().getConn();

    public User() {
        this.name = "";
        this.nickname = "";
        this.rol = "";
    }
    
    private String convertirSHA256(String password) {
        MessageDigest md = null;
        try {
                md = MessageDigest.getInstance("SHA-256");
        } 
        catch (NoSuchAlgorithmException e) {		
                e.printStackTrace();
                return null;
        }
        byte[] hash = md.digest(password.getBytes());
        StringBuffer sb = new StringBuffer();
        for(byte b : hash) {        
                sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }    
    
    public AuthenticatedUser authenticate(String username,String password){
        // returns and authenticated user obj if success, else null
        String hashedPasswd = convertirSHA256(password);
        AuthenticatedUser user = null;
        try {
            PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM usuarios WHERE Usuario_nickname = ? and Usuario_contrasena = ?");
            pstmt.setString(1, username);
            pstmt.setString(2, hashedPasswd);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                user = new AuthenticatedUser(rs.getString("Usuario_nombre"), rs.getString("Usuario_nickname"), rs.getString("Usuario_rol"));
            }else{
                System.out.println("INVALID CREDENTIALS");
    //            jLabelMessage.setText("Credenciales incorrectas!");
            }
        } catch (Exception e) {
            System.out.println("ERROR ON LOGIN ADMIN SQL");
        }    
        return user;
    }
}