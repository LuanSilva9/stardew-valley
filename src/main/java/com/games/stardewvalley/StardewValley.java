/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.games.stardewvalley;

import com.games.stardewvalley.classes.Fazenda;
import com.games.stardewvalley.classes.Loja;
import com.games.stardewvalley.classes.Npc;
import com.games.stardewvalley.classes.Personagem;
import com.games.stardewvalley.classes.Semente;
import com.games.stardewvalley.classes.Vila;

/**
 *
 * @author Luan
 */
public class StardewValley {
    public static Npc gerarNpc(String nome, String humor) {
        return new Npc(nome, humor);
    }
    
    public static void main(String[] args) {
        Loja lojaDoPierre = new Loja("Loja do Pierre", null, gerarNpc("Pierre", "Cansado do trabalho"));
        Fazenda fazenda = new Fazenda("Fazenda JavaValley"); 
        Vila vilaPelicanos = new Vila("Vila pelicanos", gerarNpc("Lewis", "Feliz"), lojaDoPierre);
        
        Personagem luan = new Personagem("Luan", "./skindefault.png", fazenda, vilaPelicanos);
        
        Semente chirivia = new Semente("Chirivia", 2, "semente", "Planta na primavera, leva cerca de 7 dias para crescer", 7);
        
        
        System.out.println(luan.getNome());
        luan.abrirInventario(); // Inventario vazio!
        
        luan.colocarNoInventario(chirivia);
        luan.abrirInventario();
        
        // Sistema de plantacao
       
        luan.plantar(0, 0, 0);
        
        for(int i = 0; i < 7; i++) {
            luan.dormir();
        }
        
        luan.colher(0, 0);
        
        System.out.println("Saldo antes de vender a chirivia - " + luan.getSaldo());
        
        luan.venderItem(0);
        
        System.out.println("Saldo depois de vender a chirivia - " + luan.getSaldo());
        
    }
}
