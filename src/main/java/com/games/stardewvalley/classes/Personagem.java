/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.games.stardewvalley.classes;

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
    private int diaAtual;

    public Personagem(String nome, String skin, Fazenda fazenda, Vila vila) {
        this.nome = nome;
        this.skin = skin;
        this.fazenda = fazenda;
        this.vila = vila;
        
        this.saldo = 0;
        this.diaAtual = 0;
        this.inventario = new Item[128];
    }
    
    // Metodos do Personagem
    public void plantar(int posX, int posY, int slot) {
        if(posX >= 64 || posY >= 64) {
            System.out.println("Posição invalida para plantio!");
            return;
        }
        
        Semente[][] farmMapper = this.fazenda.getMatrizFazenda();
        
        if(inventario[slot] == null) {
            System.out.println("Slot vazio!");
            return;
        }
        
        if(inventario[slot].getTipo() == "semente") {
            Semente semente = (Semente) inventario[slot];
            
            farmMapper[posX][posY] = semente;
            System.out.println("Semente " + semente.getNome() + " Plantada com successo!");
        
            inventario[slot] = null;
        }
    }
    
    public void regar(int posX, int posY) {
        if(posX >= 64 || posY >= 64) {
            System.out.println("Posição invalida para regar!");
            return;
        }
        
        Semente[][] farmMapper = this.fazenda.getMatrizFazenda();
        
        if(farmMapper[posX][posY].getSeco()) {
            farmMapper[posX][posY].setSeco(false);
            System.out.println("Semente " + farmMapper[posX][posY].getNome() + " Foi regada!");
        };
        
        System.out.println("A semente " + farmMapper[posX][posY].getNome() + " Ja está regada e umida!");
    } 
    

    public void pescar() {
        Item peixePescado = new Peixe("Lucio", 10, "Peixe de agua doce", "Esse cara é bao!");
        
        int slot = findForEmptySlot();
        
        setInventario(peixePescado, slot);
    }
    
    public void abrirInventario() {
        if(inventario[0] == null) {
            System.out.println("Inventario vazio!");
        }
        else {
            System.out.println("Inventario:");
            
            System.out.print("[ ");
            for(int i = 0; i < inventario.length; i++) {
                if(inventario[i] != null ) System.out.print(inventario[i].getNome() + " - " + i);
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
        if(posX > 64 || posY > 64) {
            System.out.println("Posição invalida para plantio!");
            return;
        }
        
        Semente[][] farmMapper = this.fazenda.getMatrizFazenda();
        
        System.out.println("Relatorio do plantio: \nNome da semente" + farmMapper[posX][posY].getNome() + "\nDescricao: " + farmMapper[posX][posY].getDescricao() + "\nDias até a colheita: " + farmMapper[posX][posY].devolverDiferenca() + "\nPreco atual da semente: " + farmMapper[posX][posY].calcularPreco());
    }
    
    public void dormir() {
        this.diaAtual++;
        this.fazenda.cultivar();
        
        System.out.println("Bom dia " + this.nome + " // Dia " + this.diaAtual + "!");
    }
    
    public void venderItem(int slot) {
        if(inventario[slot] == null) {
            System.out.println("Slot vazio!");
        } else {
            Item item = inventario[slot];
            
            this.saldo += item.calcularPreco();
            
            inventario[slot] = null;
            
            System.out.println("Item " + item.getNome() + " foi Vendido por " + item.calcularPreco() + "$");
        }
    }
    
    public void colher(int posX, int posY) {
        if(posX >= 64 || posY >= 64) {
            System.out.println("Posição invalida!");
            return;
        }
        
        Semente[][] farmMapper = this.fazenda.getMatrizFazenda();
        
        if (farmMapper[posX][posY] == null) {
            System.out.println("Nao tem nada plantado aqui!");
            return;
        }
        
        if(farmMapper[posX][posY].devolverDiferenca() == 0) {
            int slot = findForEmptySlot();
            
            setInventario(farmMapper[posX][posY], slot);
            
            System.out.println("Semente " + farmMapper[posX][posY].getNome() + " Foi colhida, seu preco de venda: " + farmMapper[posX][posY].calcularPreco() + "$");
            
            farmMapper[posX][posY] = null;
            
        } else {
            System.out.println("A semente ainda nao pode ser colhida, deixe-a crescer mais! [tempo: " + farmMapper[posX][posY].getStatus() + "/" + farmMapper[posX][posY].getStatusColheita() + " dias]");
        }
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

    public int getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(int diaAtual) {
        this.diaAtual = diaAtual;
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
}
