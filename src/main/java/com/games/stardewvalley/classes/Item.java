/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

/**
 *
 * @author Luan
 */
public abstract class Item {
    private static final double constante = 2.5;
    private String nome;
    private int raridade;
    private String tipo;
    private String descricao;

    public Item(String nome, int raridade, String tipo, String descricao) {
        this.nome = nome;
        this.raridade = raridade;
        this.tipo = tipo;
        this.descricao = descricao;
    }
    
    // Metodo do Item
    public double calcularPreco() {
        return raridade * constante;
    }
    
    // Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getRaridade() {
        return raridade;
    }

    public void setRaridade(int raridade) {
        this.raridade = raridade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
