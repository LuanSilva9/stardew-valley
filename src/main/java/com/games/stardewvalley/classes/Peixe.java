/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

/**
 *
 * @author Luan
 */
public class Peixe extends Item {
    private Estacao estacao;
    
    public Peixe(String nome, int raridade, String tipo, String descricao, Estacao estacao) {
        super(nome, raridade, tipo, descricao);
        this.estacao = estacao;
    }

    public Estacao getEstacao() {
        return estacao;
    }
}
