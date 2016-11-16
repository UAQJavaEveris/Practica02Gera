/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.TallerJava.A;

/**
 *
 * @author Berserker
 */
public class Persona {
    public Persona(){
        System.out.println("Persona");
    }
    /*
    Persona(String nombre, String apellido){
        this.setNombre(nombre);
        this.setApellido(apellido);
    }*/
    
    public Persona(String... nombre){
        System.out.println(nombre[0]);
    }
    
    //variables
    private String nombre;
    
    private String apellido;
    
    
    //metodos
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
}
