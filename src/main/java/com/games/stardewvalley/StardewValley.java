/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.games.stardewvalley;

import com.games.stardewvalley.classes.Adubo;
import com.games.stardewvalley.classes.Fazenda;
import com.games.stardewvalley.classes.Ingredientes;
import com.games.stardewvalley.classes.Item;
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
    
    public static Loja gerarLoja(String nome, Item[] estoque, Npc npc) {
        return new Loja(nome, estoque, npc);
    }
    
    public static Item[] gerarEstoque() {
        Item[] estoque = new Item[10];

        estoque[0] = new Semente("Semente de Melao", 3, "semente", "Semente para crescer melao na estacao do verao.", 12);
        estoque[1] = new Semente("Semente de Abobora", 4, "semente", "Semente para plantar aboboras no outono.", 13);
        estoque[2] = new Semente("Semente de Flor de Girassol", 3, "semente", "Semente para plantar girassois no verao ou outono.", 8);
        estoque[3] = new Semente("Semente de Couve-Flor", 3, "semente", "Semente para plantar couve-flor na primavera.", 12);


        estoque[4] = new Ingredientes("Farinha de Trigo", 1, "ingrediente", "Ingrediente de culinaria feito a partir de trigo.");
        estoque[5] = new Ingredientes("Acucar", 1, "Ingrediente", "ingrediente de culinaria feito de beterrabas.");
        estoque[6] = new Ingredientes("Vinagre", 2, "Ingrediente", "ingrediente acido usado para cozinhar.");
        estoque[7] = new Ingredientes("Farinha de Arroz", 2, "ingrediente", "Feita de arroz, usada em varias receitas.");
        estoque[8] = new Ingredientes("Oleo", 2, "ingrediente", "Oleo para cozinhar, usado em diversas receitas.");

        estoque[9] = new Adubo("Saco de Fertilizante de Qualidade", 4, "adubo", "Aumenta a chance de colheitas de qualidade superior.");

        return estoque;
    }

    
    public static Personagem createGame(String nome) {
        Loja lojaDoPierre = gerarLoja("Loja do Pierre", gerarEstoque(), gerarNpc("Pierre", "Cansado porem feliz"));
        
        Fazenda fazenda = new Fazenda("Fazenda JavaValley"); 
        Vila vilaPelicanos = new Vila("Vila pelicanos", gerarNpc("Lewis", "Feliz"), lojaDoPierre);
        
        Personagem personagem = new Personagem(nome, "./skindefault.png", fazenda, vilaPelicanos);
        
        return personagem;
    }
    
    public static void main(String[] args) {
        Personagem luan = createGame("Luan");
        
//      luan.verItemsLoja();
//      luan.comprarItem(1);
//       
//      luan.abrirInventario();
//        
//      luan.plantar(0, 0, 0);
//        
//      luan.abrirInventario();

        luan.consultarLugar();
        
        luan.andar("vila");
        
         luan.pescar();
//        
        luan.andar("praia");
//        
        luan.pescar();

        
        
    }
}
