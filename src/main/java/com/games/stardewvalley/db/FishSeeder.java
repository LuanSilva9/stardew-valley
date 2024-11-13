/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.db;

import com.games.stardewvalley.classes.Estacao;
import com.games.stardewvalley.classes.Peixe;

import java.util.Random;

/**
 *
 * @author Luan
 */

public class Fish {
    public static Peixe[] peixes = {
        new Peixe("Anchova", 3, "Normal", "Peixe de oceano encontrado na primavera e outono", Estacao.PRIMAVERA),
        new Peixe("Anchova", 3, "Normal", "Peixe de oceano encontrado na primavera e outono", Estacao.OUTONO),
        new Peixe("Carpa", 3, "Normal", "Peixe encontrado em lagos da montanha, esgoto e bosque secreto", Estacao.TODAS),
        new Peixe("Peixe-sol", 3, "Normal", "Peixe de rio encontrado na primavera e verão", Estacao.PRIMAVERA),
        new Peixe("Peixe-sol", 3, "Normal", "Peixe de rio encontrado na primavera e verão", Estacao.VERAO),
        new Peixe("Arenque", 3, "Normal", "Peixe de oceano encontrado na primavera e inverno", Estacao.PRIMAVERA),
        new Peixe("Arenque", 3, "Normal", "Peixe de oceano encontrado na primavera e inverno", Estacao.INVERNO),
        new Peixe("Sardinha", 4, "Normal", "Peixe de oceano encontrado na primavera, outono e inverno", Estacao.PRIMAVERA),
        new Peixe("Sardinha", 4, "Normal", "Peixe de oceano encontrado na primavera, outono e inverno", Estacao.OUTONO),
        new Peixe("Sardinha", 4, "Normal", "Peixe de oceano encontrado na primavera, outono e inverno", Estacao.INVERNO),
        new Peixe("Brema", 5, "Normal", "Peixe de rio encontrado em todas as estações", Estacao.TODAS),
        new Peixe("Peixe-fantasma", 5, "Normal", "Peixe encontrado na mina, em todas as estações", Estacao.TODAS),
        new Peixe("Achigã-pequeno", 6, "Normal", "Peixe de rio encontrado na primavera e outono", Estacao.PRIMAVERA),
        new Peixe("Achigã-pequeno", 6, "Normal", "Peixe de rio encontrado na primavera e outono", Estacao.OUTONO),
        new Peixe("Cioba", 6, "Normal", "Peixe de oceano encontrado no verão e outono", Estacao.VERAO),
        new Peixe("Cioba", 6, "Normal", "Peixe de oceano encontrado no verão e outono", Estacao.OUTONO),
        new Peixe("Esquálio", 6, "Normal", "Peixe de rio encontrado em todas as estações", Estacao.TODAS),
        new Peixe("Perca", 7, "Normal", "Peixe de rio encontrado no inverno", Estacao.INVERNO),
        new Peixe("Alocine", 8, "Normal", "Peixe de rio encontrado na primavera, verão e outono", Estacao.PRIMAVERA),
        new Peixe("Alocine", 8, "Normal", "Peixe de rio encontrado na primavera, verão e outono", Estacao.VERAO),
        new Peixe("Alocine", 8, "Normal", "Peixe de rio encontrado na primavera, verão e outono", Estacao.OUTONO),
        new Peixe("Truta Arco-íris", 9, "Normal", "Peixe de rio encontrado no verão", Estacao.VERAO),
        new Peixe("Salmão", 10, "Normal", "Peixe de rio encontrado no outono", Estacao.OUTONO),
        new Peixe("Salmonete", 10, "Normal", "Peixe de oceano encontrado no verão e inverno", Estacao.VERAO),
        new Peixe("Pepino-do-mar", 10, "Normal", "Peixe de oceano encontrado no outono e inverno", Estacao.OUTONO),
        new Peixe("Pepino-do-mar", 10, "Normal", "Peixe de oceano encontrado no outono e inverno", Estacao.INVERNO),
        new Peixe("Areinha", 10, "Normal", "Peixe do deserto cálico encontrado em todas as estações", Estacao.TODAS),
        new Peixe("Peixe-gato", 10, "Normal", "Peixe de lago da montanha encontrado em todas as estações", Estacao.TODAS),
        new Peixe("Tilápia", 10, "Normal", "Peixe de oceano encontrado no verão e outono", Estacao.VERAO),
        new Peixe("Albacora", 10, "Normal", "Peixe de oceano encontrado no outono e inverno", Estacao.OUTONO),
        new Peixe("Madeirão", 10, "Normal", "Peixe encontrado no lago do bosque secreto em todas as estações", Estacao.TODAS),
        new Peixe("Lula", 10, "Normal", "Peixe de oceano encontrado no inverno", Estacao.INVERNO),
        new Peixe("Halibute", 10, "Normal", "Peixe de oceano encontrado na primavera, verão e inverno", Estacao.PRIMAVERA),
        new Peixe("Halibute", 10, "Normal", "Peixe de oceano encontrado na primavera, verão e inverno", Estacao.VERAO),
        new Peixe("Enguia", 10, "Normal", "Peixe de oceano encontrado na primavera e outono", Estacao.PRIMAVERA),
        new Peixe("Atum", 10, "Normal", "Peixe de oceano encontrado no verão e inverno", Estacao.VERAO),
        new Peixe("Atum", 10, "Normal", "Peixe de oceano encontrado no verão e inverno", Estacao.INVERNO),
        new Peixe("Achigã", 10, "Normal", "Peixe de lago da montanha encontrado em todas as estações", Estacao.TODAS),
        new Peixe("Lúcio", 10, "Normal", "Peixe de rio encontrado no verão e inverno", Estacao.VERAO),
        new Peixe("Dourado", 10, "Normal", "Peixe de rio encontrado no verão", Estacao.VERAO),
        new Peixe("Salmão Mutante", 10, "Normal", "Peixe encontrado no covil dos insetos mutantes em todas as estações", Estacao.TODAS),
        new Peixe("Picão-verde", 11, "Normal", "Peixe de rio encontrado no outono", Estacao.OUTONO),
        new Peixe("Ófis", 12, "Normal", "Peixe encontrado no rio e lago da montanha no inverno", Estacao.INVERNO),
        new Peixe("Polvo", 15, "Normal", "Peixe de oceano encontrado no verão", Estacao.VERAO),
        new Peixe("Carpa Escorpiônica", 15, "Normal", "Peixe encontrado no deserto cálico em todas as estações", Estacao.TODAS),
        new Peixe("Salmão Híbrido", 15, "Normal", "Peixe de rio encontrado no outono e inverno", Estacao.OUTONO),
        new Peixe("Salmão Nulo", 15, "Normal", "Peixe encontrado no pântano da bruxa em todas as estações", Estacao.TODAS),
        new Peixe("Baiacu", 20, "Normal", "Peixe de oceano encontrado no verão", Estacao.VERAO),
        new Peixe("Bagre", 20, "Normal", "Peixe de rio encontrado na primavera, outono e verão", Estacao.PRIMAVERA),
        new Peixe("Linguado", 10, "Normal", "Peixe de oceano encontrado na primavera, verão e inverno", Estacao.PRIMAVERA),
        new Peixe("Carpa da meia-noite", 15, "Normal", "Peixe de lago da montanha encontrado no outono e inverno", Estacao.OUTONO),
        new Peixe("Esturjão", 20, "Normal", "Peixe de lago da montanha encontrado no verão e inverno", Estacao.VERAO),
        new Peixe("Superpepino", 25, "Normal", "Peixe de oceano encontrado no verão e outono", Estacao.VERAO),
        new Peixe("Peixe-pedra", 30, "Normal", "Peixe encontrado na mina em todas as estações", Estacao.TODAS),
        new Peixe("Chione", 35, "Normal", "Peixe encontrado na mina em todas as estações", Estacao.TODAS),
        new Peixe("Enguia de Lava", 40, "Normal", "Peixe encontrado na mina em todas as estações", Estacao.TODAS),
        new Peixe("Tamboril", 45, "Normal", "Peixe encontrado no outono, ponte ao norte do mercado Joja", Estacao.OUTONO)
    };
    
    
    public Peixe gerarPeixePorEstacao(Estacao estacao) {
        Random randNumber = new Random();

        for (int i = 0; i < peixes.length; i++) {
            int vec = randNumber.nextInt(peixes.length);
            if (peixes[vec].getEstacao() == estacao) {
                return peixes[vec];
            }
        }
        return null;
    }
}