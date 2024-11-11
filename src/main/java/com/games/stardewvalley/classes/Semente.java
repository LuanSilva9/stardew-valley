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
    private int valor;
    private int status;
    private int statusColheita;

    public Semente(int valor, int status, int statusColheita, String nome, int raridade, String tipo, String descricao) {
        super(nome, raridade, tipo, descricao);
        this.valor = valor;
        this.status = status;
        this.statusColheita = statusColheita;
    }
    
    
    // Metodo(s) da semente
    public int devolverDiferenca() {
        return statusColheita - status;
    }
    
    // Getters e Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getStatus() {
        return status;
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
