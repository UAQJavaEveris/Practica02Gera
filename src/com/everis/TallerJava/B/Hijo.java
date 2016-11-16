/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.TallerJava.B;

import com.everis.TallerJava.A.Persona;

/**
 *
 * @author Berserker
 */
public class Hijo extends Persona implements Acciones{
    public Hijo(){
        System.out.println("Hijo");
    }

    public Hijo(String nombre, String apellido) {
        this.setNombre(nombre);
        System.out.println(this.getNombre());
    }

    @Override
    public void correr() {
        System.out.println("Correr");
    }

    @Override
    public void hablar() {
        System.out.println("hablar");
    }

    @Override
    public void beber() {
        System.out.println("beber");
    }

    @Override
    public String caminar(String ella) {
        return "caminar con "+ella;
    }

    @Override
    public void caminar2(String ella) {
        System.out.println("Caminar con "+ella);
    }
}
