/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

import com.games.stardewvalley.db.DB;

/**
 *
 * @author Luan
 */

public class Personagem {
    private String nome;
    private String skin;
    private Item[] inventario;
    private double saldo;
    private Fazenda fazenda;
    private Vila vila;
    private Mapa mapa;

    private DB dbGame;


    public Personagem(String nome, String skin, Fazenda fazenda, Vila vila) {
        this.nome = nome;
        this.skin = skin;
        this.fazenda = fazenda;
        this.vila = vila;
        this.saldo = 10.0;
        this.inventario = new Item[128];
        this.mapa = new Mapa("FAZENDA");
        this.dbGame = new DB();
    }
    
    // Metodos do Personagem
    public void plantar(int posX, int posY, int slot) {
        if(chunksLimiter(posX, posY) && validatePlace("FAZENDA")) {
            Semente[][] farmMapper = this.fazenda.getMatrizFazenda();

            if(inventario[slot] == null) {
                System.out.println("Slot vazio!");
                return;
            }

            if(inventario[slot].getTipo().toLowerCase().equals("semente")) {
                Semente semente = (Semente) inventario[slot];

                if(semente.getEstacao() == dbGame.getEstacao()) {
                    farmMapper[posX][posY] = semente;
                    System.out.println("Semente " + semente.getNome() + " Plantada com successo!");

                    inventario[slot] = null;
                }
                else {
                    System.out.println("A semente " + semente.getNome() + " nao pode ser plantada na estacao atual! ");
                }
            }

        }
    }
    
    public void regar(int posX, int posY) {
        if(chunksLimiter(posX, posY) && validatePlace("FAZENDA")) {
        
            Semente[][] farmMapper = this.fazenda.getMatrizFazenda();

            if(farmMapper[posX][posY].getSeco()) {
                farmMapper[posX][posY].setSeco(false);
                System.out.println("Semente " + farmMapper[posX][posY].getNome() + " Foi regada!");
            }

            System.out.println("A semente " + farmMapper[posX][posY].getNome() + " Ja está regada e umida!");
        }
    } 
    

    public void pescar() {
        if(validatePlace("PRAIA")) {
            Peixe peixeCapturado = dbGame.getFish().gerarPeixePorEstacao(dbGame.getEstacao());
            
            System.out.println("Peixe capturado: " + peixeCapturado.getNome());
            
            colocarNoInventario(peixeCapturado);
        }
    }
    
    public void abrirInventario() {
        if(inventario[0] == null) {
            System.out.println("Inventario vazio!");
        }
        else {
            System.out.println("Inventario:");
            
            System.out.print("[ ");
            for(int i = 0; i < inventario.length; i++) {
                if(inventario[i] != null) System.out.print(inventario[i].getNome() + " - " + i);
                if(inventario[i + 1] != null) System.out.print(" | ");
                if(inventario[i] == null) break;
            }
            System.out.println(" ]");
        }
        
    }
    
    public void colocarNoInventario(Item item) {
        int slot = findForEmptySlot();
        
        setInventario(item, slot);
    }
    
    public void verPlantio(int posX, int posY) {
        if(chunksLimiter(posX, posY) && validatePlace("FAZENDA")) {
            Semente[][] farmMapper = this.fazenda.getMatrizFazenda();

            System.out.println("Relatorio do plantio: \nNome da semente" + farmMapper[posX][posY].getNome() + "\nDescricao: " + farmMapper[posX][posY].getDescricao() + "\nDias até a colheita: " + farmMapper[posX][posY].devolverDiferenca() + "\nPreco atual da semente: " + farmMapper[posX][posY].calcularPreco());
        }
    }
    
    public void dormir() {
        if(validatePlace("CASA")) {
            dbGame.setDiaAtual(dbGame.getDiaAtual()+1);
            dbGame.setDiaCorrido(dbGame.getDiaCorrido()+1);
            
            
            fazenda.cultivar();
            
            updateSeason();
            
            System.out.println("Bom dia " + nome + " | Dia: " + dbGame.getDiaAtual() + " de " + dbGame.getEstacao());
        }
    }
    
    public void venderItem(int slot) {
        if(validatePlace("FAZENDA")) {
            if(inventario[slot] == null) {
                System.out.println("Slot vazio!");
            } else {
                Item item = inventario[slot];

                this.saldo += item.calcularPreco();

                inventario[slot] = null;

                System.out.println("Item " + item.getNome() + " foi Vendido por " + item.calcularPreco() + "$");
            }
        }
    }
    
    public void colher(int posX, int posY) {
        if(chunksLimiter(posX, posY) && validatePlace("FAZENDA")) {
            Semente[][] farmMapper = this.fazenda.getMatrizFazenda();

            if (farmMapper[posX][posY] == null) {
                System.out.println("Nao tem nada plantado aqui!");
                return;
            }

            if(farmMapper[posX][posY].devolverDiferenca() == 0) {
                colocarNoInventario(farmMapper[posX][posY]);

                System.out.println("Semente " + farmMapper[posX][posY].getNome() + " Foi colhida, seu preco de venda: " + farmMapper[posX][posY].calcularPreco() + "$");

                farmMapper[posX][posY] = null;

            } else {
                System.out.println("A semente ainda nao pode ser colhida, deixe-a crescer mais! [tempo: " + farmMapper[posX][posY].getStatus() + "/" + farmMapper[posX][posY].getStatusColheita() + " dias]");
            }
        }
    }
    
    public void verItemsLoja() {
        if(validatePlace("LOJA")) {  
            Loja loja = getVila().getLoja();

            loja.mostrarEstoque(getSaldo());
        }
    }
    
    public void comprarItem(int slot) {
        if(validatePlace("LOJA")) {
            Loja loja = getVila().getLoja();
            Item[] estoque = loja.getEstoque();

            double saldoPersonagem = getSaldo();
            double saldoLoja = loja.getSaldo();

            if(estoque[slot] == null) {
                System.out.println("Não há nada aqui...");
            } else if(getSaldo() < estoque[slot].calcularPreco()) {
                System.out.println("Dinheiro insuficiente...");
            } else {
                colocarNoInventario(estoque[slot]);

                loja.setSaldo(saldoLoja + estoque[slot].calcularPreco());

                setSaldo(saldoPersonagem - estoque[slot].calcularPreco());

                estoque[slot] = null;

                System.out.println("Comprado com Sucesso!!!");
            }
        }
      
    }
    
    public void minerar() {
        if(validatePlace("CAVERNA")) {
            
        }
    }
    
    public void consultarLugar() {
        System.out.println(mapa);
    }
    
    public void andar(String lugar) {
        if(mapa.procurarLugar(lugar) != -1) {
            mapa.setLugarAtual(lugar);
            
            System.out.println("Voce andou ate: " + mapa.getLugarAtual().toLowerCase());
            
        } else {
            System.out.println("Lugar inexistente!");
        };
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSkin() {
        return skin;
    }
    
       public DB getDbGame() {
        return dbGame;
    }

    public Item[] getInventario() {
        return inventario;
    }

    private void setInventario(Item item, int slot) {
        if(slot == -1) {
            System.out.println("Nao foi possivel atribuir o item " + item.getNome() + " Ao inventario, pois esta muito cheio!");
        } else {
            this.inventario[slot] = item;
            System.out.println(item.getNome() + " foi colocado no inventario");
        }
        
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Fazenda getFazenda() {
        return fazenda;
    }

    public void setFazenda(Fazenda fazenda) {
        this.fazenda = fazenda;
    }

    public Vila getVila() {
        return vila;
    }
   

    public void setVila(Vila vila) {
        this.vila = vila;
    }
    
    // Metodos necessarios
    private int findForEmptySlot() {
        int slot = -1;
        
        for(int i = 0; i < inventario.length; i++) {
            if(inventario[i] == null) {
                slot = i;
                break;
            }
        }
        
        return slot;
    }
    
    private boolean chunksLimiter(int posX, int posY) {
        if(posX >= 64 || posY >= 64 || posX < 0 || posY < 0) {
            System.out.println("Posição invalida");
            return false;
        }
        
        return true;
    }
    
    private boolean validatePlace(String _PLACE) {
        if(!mapa.getLugarAtual().equals(_PLACE)) {
            System.out.println("Voce esta em " + mapa.getLugarAtual().toLowerCase() + " e portanto nao pode executar essa tarefa, consulte o mapa e saiba mais!");
            return false;
        }
        
        return true;
    }
    
    private void updateSeason() {
        if(dbGame.getDiaCorrido() > 30 &&  dbGame.getDiaCorrido() <= 60) {
            dbGame.setEstacao(Estacao.VERAO);
        }
        
        else if (dbGame.getDiaCorrido() >= 60 && dbGame.getDiaCorrido() <= 90) {
            dbGame.setEstacao(Estacao.OUTONO);
        }
        
        else if (dbGame.getDiaCorrido() >= 90 && dbGame.getDiaCorrido() <= 120) {
            dbGame.setEstacao(Estacao.INVERNO);
        }
        
        else if (dbGame.getDiaCorrido() > 120) {
            dbGame.setEstacao(Estacao.PRIMAVERA);
            dbGame.setDiaCorrido(0);
        }
        
        if(dbGame.getDiaCorrido() == 0 || dbGame.getDiaCorrido() == 31 || dbGame.getDiaCorrido() == 61 || dbGame.getDiaCorrido() == 91 || dbGame.getDiaCorrido() == 121) dbGame.setDiaAtual(1);
    }
}
