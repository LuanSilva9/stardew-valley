/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

/**
 *
 * @author Luan
 */
public class Fazenda {
    private String nomeFazenda;
    private Semente[][] matrizFazenda;
    
    public Fazenda(String nomeFazenda, Semente[][] matrizFazenda) {
        this.nomeFazenda = nomeFazenda;
        this.matrizFazenda = matrizFazenda;
    }
    
    // Metodo(s) da Fazenda
    public void cultivar() {
        
    }
    
    // Getters e Setters 
    public String getNomeFazenda() {
        return nomeFazenda;
    }

    public void setNomeFazenda(String nomeFazenda) {
        this.nomeFazenda = nomeFazenda;
    }

    public Semente[][] getMatrizFazenda() {
        return matrizFazenda;
    }

    public void setMatrizFazenda(Semente[][] matrizFazenda) {
        this.matrizFazenda = matrizFazenda;
    }
}
