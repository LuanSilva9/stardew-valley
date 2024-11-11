/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

/**
 *
 * @author Luan
 */
public class Personagem {
    private String nome;
    private String skin;
    private Item[] inventario;
    private double saldo;
    private Fazenda fazenda;
    private Vila vila;
    private int diaAtual;

    public Personagem(String nome, String skin, Item[] inventario, double saldo, Fazenda fazenda, Vila vila, int diaAtual) {
        this.nome = nome;
        this.skin = skin;
        this.inventario = inventario;
        this.saldo = saldo;
        this.fazenda = fazenda;
        this.vila = vila;
        this.diaAtual = diaAtual;
    }
    
    // Metodos do Personagem
    public boolean plantar(int posX, int posY) {
        return true;
    }
    
    public boolean regar(int posX, int posY) {
        return true;
    } 
    
    public boolean arar(int posX, int posY) {
        return true;
    }
    
    public Peixe pescar() {
        return null;
    }
    
    public Item[] abrirInventario() {
        return null;
    }
    
    public void verPlantio() {
        
    }
    
    public void dormir() {
        
    }
    
    public void venderItem(Item item) {
        
    }
    
    public boolean colher() {
        return true;
    }
    
    
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Item[] getInventario() {
        return inventario;
    }

    public void setInventario(Item[] inventario) {
        this.inventario = inventario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public Vila getVila() {
        return vila;
    }

    public void setVila(Vila vila) {
        this.vila = vila;
    }

    public int getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(int diaAtual) {
        this.diaAtual = diaAtual;
    }
    
    
}
