/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Admin
 */
public class Animal {

    public static void main(String[] args) {
    Cachorro cachorro = new Cachorro("Bito");
    Gato gato = new Gato("Mingau");
    
    cachorro.emitirSom();
    gato.emitirSom();
    
    cachorro.caminhar();
    gato.caminhar();
    }
   }
    
