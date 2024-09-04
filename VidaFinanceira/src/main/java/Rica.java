/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Rica extends Pessoa {
    private double dinheiro;

    public Rica(String nome, int idade) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }
    
     public void fazCompras() {
        System.out.println(nome + " está fazendo compras.");
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Dinheiro: " + dinheiro);
    }
}
    

