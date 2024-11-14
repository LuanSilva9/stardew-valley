/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.db;

import com.games.stardewvalley.classes.Estacao;
import com.games.stardewvalley.classes.Item;

/**
 *
 * @author Luan
 */
public class DB {
    private static FishSeeder fish = new FishSeeder();
    private static SeedSeeder seed = new SeedSeeder();
    private Estacao estacao;
    private int diaAtual;
    private int diaCorrido;
    
    
    public DB() {
        this.estacao = Estacao.PRIMAVERA;
    }
    
    
    public SeedSeeder getSeed() {
        return seed;
    }
    
    public FishSeeder getFish() {
        return fish;
    }
    
    public Item[] getStock(Estacao estacao) {
        Item estoque[] = new Item[20];
        
        for(int i = 0; i < estoque.length; i++) {
            if(estoque[i] == null) estoque[i] = seed.gerarSementePorEstacao(estacao);
        }
        
        return estoque;
    }
    
    public Estacao getEstacao() {
        return estacao;
    }

    public void setEstacao(Estacao estacao) {
        this.estacao = estacao;
    }

    public int getDiaCorrido() {
        return diaCorrido;
    }

    public void setDiaCorrido(int vdiaCorrido) {
        diaCorrido = vdiaCorrido;
    }

    public int getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(int vdiaAtual) {
        diaAtual = vdiaAtual;
    }
    
    
    
}
