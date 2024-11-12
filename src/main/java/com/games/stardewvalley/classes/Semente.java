/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

/**
 *
 * @author Luan
 */
public class Semente extends Item {
    private int status;
    private int statusColheita;
    private boolean seco;

    public Semente(String nome, int raridade, String tipo, String descricao, int statusColheita) {
        super(nome, raridade, tipo, descricao);
        this.statusColheita = statusColheita;
        
        this.seco = true;
        this.status = 0;
    }
    
    
    // Metodo(s) da semente
    public int devolverDiferenca() {
        return statusColheita - status;
    }
    
    @Override 
    public double calcularPreco() {
        double preco = super.getRaridade() * super.getConstante();
        
        return preco + ( status * 5 );
    }
    
    // Getters e Setters
    public int getStatus() {
        return status;
    }
    
    public boolean getSeco() {
        return seco;
    }
    
    public void setSeco(boolean valor) {
        this.seco = valor;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatusColheita() {
        return statusColheita;
    }

    public void setStatusColheita(int statusColheita) {
        this.statusColheita = statusColheita;
    }
    
}
