/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

/**
 *
 * @author Luan
 */
public class Mapa {
    private String lugarAtual;
    
    private String[] lugares = {
        "CASA",
        "FAZENDA",
        "LOJA",
        "VILA",
        "PRAIA",
        "BOSQUE",
        "CAVERNA"
    };

    public Mapa(String lugarAtual) {
        this.lugarAtual = lugarAtual;
    }
    
    @Override
    public String toString() {
        return " | Manual\n | Lugares que voce pode ir | Capacidade de Fazer coisas nesses lugares |\n"
                + " | 1 - CASA | Voce pode Dormir aqui! |\n"
                + " | 2 - FAZENDA | Voce pode Plantar, Regar, Colher e Vender itens aqui! |\n" 
                + " | 3 - LOJA | Voce pode comprar e ver os itens aqui! |\n"
                + " | 4 - VILA | Voce pode interagir com os moradores aqui! |\n"
                + " | 5 - PRAIA | Voce pode Pescar aqui! |\n"
                + " | 6 - BOSQUE | Voce pode Cortar madeira aqui! |\n"
                + " | 7 - CAVERMA | Voce pode minerar aqui! |\n";
    }
    
    // Metodos do mapa
    public int procurarLugar(String lugar) {
        for(int i = 0; i < lugares.length; i++) {
            if(lugares[i].equals(lugar.toUpperCase())) return i;
        }
        
        return -1;
    }
    
    // Getters e Setters
    public String[] getLugares() {
        return lugares;
    }
    
    public void setLugarAtual(String lugarAtual) {
        this.lugarAtual = lugarAtual.toUpperCase();
    }
    
    public String getLugarAtual() {
        return lugarAtual;
    }
    
}
