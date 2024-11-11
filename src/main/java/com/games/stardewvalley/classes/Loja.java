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
    
    public Loja(String nome, Item[] estoque, Npc balconista) {
        this.nome = nome;
        this.estoque = estoque;
        this.balconista = balconista;
    }
    
    
    // Metodos da Loja
    public Item[] mostrarEstoque() {
        return null;
    }
    
    public void comprar(Item item) {
        
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
    
}
