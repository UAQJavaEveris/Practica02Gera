/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.everis.TallerJava.Clases;

import com.everis.TallerJava.B.Hijo;

/**
 *
 * @author Berserker
 */
public class Test {
    public static void main(String[] args) {
        Hijo h = new Hijo();
        Hijo h2 = new Hijo("Gera", "Gudiño");
        
        System.out.println(h.caminar("Martita"));
        h.caminar2("Josesito");
    }
}
