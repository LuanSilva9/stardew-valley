/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

/**
 *
 * @author Luan
 */
public class Loja {
    private String nome;
    private Item[] estoque;
    private Npc balconista;
    private double saldo;
    
    public Loja(String nome, Item[] estoque, Npc balconista) {
        this.nome = nome;
        this.estoque = estoque;
        this.balconista = balconista;
        this.saldo = 0;
    }
    

    // Metodos da Loja
    public void mostrarEstoque(double saldo) {
        System.out.println("Bem vindo a " + getNome() + "!" + ". O que deseja comprar?");
        
        System.out.println("Seu saldo atual: " + saldo + "$");
        System.out.println("");
        System.out.printf("%-7s | %-30s | %-10s%n", "Indice", "Item", "Preco");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < estoque.length; i++) {
            System.out.printf("%-7s | %-30s | %-10s%n", i, estoque[i].getNome(), estoque[i].calcularPreco() + "$");
        }
        
        System.out.println("--------------------------------------------------");
    }
    
    @Override
    public String toString() {
        return "";
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Item[] getEstoque() {
        return estoque;
    }

    public void setEstoque(Item[] estoque) {
        this.estoque = estoque;
    }

    public Npc getBalconista() {
        return balconista;
    }

    public void setBalconista(Npc balconista) {
        this.balconista = balconista;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
}
