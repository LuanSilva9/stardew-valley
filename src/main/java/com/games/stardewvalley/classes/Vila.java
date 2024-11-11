/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

/**
 *
 * @author Luan
 */
public class Vila {
    private String nomeVila;
    private String qntMoradores;
    private Npc prefeito;
    private Loja loja;

    public Vila(String nomeVila, String qntMoradores, Npc prefeito, Loja loja) {
        this.nomeVila = nomeVila;
        this.qntMoradores = qntMoradores;
        this.prefeito = prefeito;
        this.loja = loja;
    }
    
    // Metodos da vila
    public Evento gerarEventos() {
        return null;
    }
    
    // Getters e Setters

    public String getNomeVila() {
        return nomeVila;
    }

    public void setNomeVila(String nomeVila) {
        this.nomeVila = nomeVila;
    }

    public String getQntMoradores() {
        return qntMoradores;
    }

    public void setQntMoradores(String qntMoradores) {
        this.qntMoradores = qntMoradores;
    }

    public Npc getPrefeito() {
        return prefeito;
    }

    public void setPrefeito(Npc prefeito) {
        this.prefeito = prefeito;
    }

    public Loja getLoja() {
        return loja;
    }

    public void setLoja(Loja loja) {
        this.loja = loja;
    }
    
}
