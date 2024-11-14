/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.db;

import com.games.stardewvalley.classes.Estacao;
import com.games.stardewvalley.classes.Semente;
import static com.games.stardewvalley.db.FishSeeder.peixes;

import java.util.Random;

/**
 * 
 * @author Luan
 */
public class SeedSeeder {
    public static Semente[] sementes = {
        new Semente("Semente de Milho", 3, "Semente", "Semente de milho, ideal para climas quentes.", 10, Estacao.VERAO, "Milho"),
        new Semente("Semente de Trigo", 2, "Semente", "Semente de trigo, fácil de cultivar.", 7, Estacao.PRIMAVERA, "Trigo"),
        new Semente("Semente de Abóbora", 5, "Semente", "Semente de abóbora, boa para o outono.", 12, Estacao.OUTONO, "Abóbora"),
        new Semente("Semente de Feijão", 4, "Semente", "Semente de feijão, boa para o inverno.", 14, Estacao.INVERNO, "Feijão"),
        new Semente("Semente de Batata", 2, "Semente", "Semente de batata, cultivada na primavera.", 9, Estacao.PRIMAVERA, "Batata"),
        new Semente("Semente de Tomate", 3, "Semente", "Semente de tomate, cultivada no verão.", 11, Estacao.VERAO, "Tomate"),
        new Semente("Semente de Melancia", 5, "Semente", "Semente de melancia, boa para o verão.", 13, Estacao.VERAO, "Melancia"),
        new Semente("Semente de Morango", 6, "Semente", "Semente de morango, colhida na primavera.", 8, Estacao.PRIMAVERA, "Morango"),
        new Semente("Semente de Cenoura", 3, "Semente", "Semente de cenoura, ideal para a primavera e outono.", 10, Estacao.PRIMAVERA, "Cenoura"),
        new Semente("Semente de Beterraba", 4, "Semente", "Semente de beterraba, cultivada no outono.", 10, Estacao.OUTONO, "Beterraba"),
        new Semente("Semente de Alface", 2, "Semente", "Semente de alface, ideal para o verão.", 7, Estacao.VERAO, "Alface"),
        new Semente("Semente de Pimentão", 3, "Semente", "Semente de pimentão, cultivada no verão.", 9, Estacao.VERAO, "Pimentão"),
        new Semente("Semente de Abobrinha", 3, "Semente", "Semente de abobrinha, cultivada no verão.", 11, Estacao.VERAO, "Abobrinha"),
        new Semente("Semente de Alho", 3, "Semente", "Semente de alho, cultivada no inverno.", 12, Estacao.INVERNO, "Alho"),
        new Semente("Semente de Gengibre", 5, "Semente", "Semente de gengibre, cultivada no inverno.", 15, Estacao.INVERNO, "Gengibre"),
        new Semente("Semente de Cebola", 3, "Semente", "Semente de cebola, cultivada no outono.", 11, Estacao.OUTONO, "Cebola"),
        new Semente("Semente de Pera", 4, "Semente", "Semente de pera, cultivada no outono.", 12, Estacao.OUTONO, "Pera"),
        new Semente("Semente de Uva", 4, "Semente", "Semente de uva, cultivada no verão.", 10, Estacao.VERAO, "Uva"),
        new Semente("Semente de Figo", 5, "Semente", "Semente de figo, cultivada na primavera e verão.", 14, Estacao.VERAO, "Figo"),
        new Semente("Semente de Framboesa", 6, "Semente", "Semente de framboesa, cultivada no verão.", 13, Estacao.VERAO, "Framboesa"),
        new Semente("Semente de Kiwi", 7, "Semente", "Semente de kiwi, cultivada no outono.", 15, Estacao.OUTONO, "Kiwi"),
        new Semente("Semente de Laranja", 8, "Semente", "Semente de laranja, cultivada no inverno.", 16, Estacao.INVERNO, "Laranja"),
        new Semente("Semente de Abacaxi", 10, "Semente", "Semente de abacaxi, cultivada no verão.", 17, Estacao.VERAO, "Abacaxi"),
        new Semente("Semente de Caqui", 6, "Semente", "Semente de caqui, cultivada no outono.", 12, Estacao.OUTONO, "Caqui"),
        new Semente("Semente de Figo-da-índia", 7, "Semente", "Semente de figo-da-índia, cultivada no inverno.", 14, Estacao.INVERNO, "Figo-da-índia"),
        new Semente("Semente de Pêssego", 9, "Semente", "Semente de pêssego, cultivada na primavera.", 18, Estacao.PRIMAVERA, "Pêssego")
    };

    public Semente gerarSementePorEstacao(Estacao estacao) {
        Random randNumber = new Random();

        for (int i = 0; i < sementes.length; i++) {
            int vec = randNumber.nextInt(sementes.length);
            if (sementes[vec].getEstacao() == estacao) {
                return sementes[vec];
            }
        }
        return null;
    }
}
