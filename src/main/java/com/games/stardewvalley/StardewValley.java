/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.games.stardewvalley;

import com.games.stardewvalley.classes.Adubo;
import com.games.stardewvalley.classes.Estacao;
import com.games.stardewvalley.classes.Fazenda;
import com.games.stardewvalley.classes.Ingredientes;
import com.games.stardewvalley.classes.Item;
import com.games.stardewvalley.classes.Loja;
import com.games.stardewvalley.classes.Npc;
import com.games.stardewvalley.classes.Personagem;
import com.games.stardewvalley.classes.Semente;
import com.games.stardewvalley.classes.Vila;
import com.games.stardewvalley.db.DB;

/**
 *
 * @author Luan
 */
public class StardewValley { 
    public static Npc gerarNpc(String nome, String humor) {
        return new Npc(nome, humor);
    }
    
    public static Loja gerarLoja(String nome, Item[] estoque, Npc npc) {
        return new Loja(nome, estoque, npc);
    }
    
    public static Item[] gerarEstoque(DB dbGame) {
        Item[] estoque = dbGame.getStock(dbGame.getEstacao());
        
        return estoque;
    }

    
    public static Personagem createGame(String nome) {
        
        Fazenda fazenda = new Fazenda("Fazenda JavaValley"); 
        Vila vilaPelicanos = new Vila("Vila pelicanos", gerarNpc("Lewis", "Feliz"), null);
        
        Personagem personagem = new Personagem(nome, "./skindefault.png", fazenda, vilaPelicanos);
        
        Loja lojaDoPierre = gerarLoja("Loja do Pierre", gerarEstoque(personagem.getDbGame()), gerarNpc("Pierre", "Cansado porem feliz"));
        
        vilaPelicanos.setLoja(lojaDoPierre);
        
        return personagem;
    }
    
    public static void main(String[] args) {
        Personagem luan = createGame("Luan");
        
        luan.andar("casa");
        
//        for(int i = 0; i < 127; i++) {
//            luan.dormir();
//        }
//        
        
    }
}
