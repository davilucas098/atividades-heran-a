/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.animal;

/**
 *
 * @author Admin
 */
public abstract class animal1 {
    protected String nome;
    
    public animal1 (String nome) {
        this.nome = nome;
    }
    
    public void emitirSom(){
    System.out.println(nome + " está latindo; Ruff Ruff !");
    
    }
    
    public void caminhar() {
      System.out.println(nome + "está caminhando");
    }
}
