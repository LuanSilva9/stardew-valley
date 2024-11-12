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
    
    public Fazenda(String nomeFazenda) {
        this.nomeFazenda = nomeFazenda;
        
        this.matrizFazenda = new Semente[64][64];
    }
    
    // Metodo(s) da Fazenda
    public void cultivar() {
        for(int i = 0; i < 64; i++) {
            for(int j = 0; j < 64; j++) {
                if(matrizFazenda[i][j] == null);
                else {
                    int statusAntesCultivo = matrizFazenda[i][j].getStatus();
                
                    matrizFazenda[i][j].setStatus(statusAntesCultivo + 1);
                }
            }
        }
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
}
