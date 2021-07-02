/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Robson e Brenda
 */
public abstract class Celula {

    protected boolean cruzamento;
    protected boolean Spawner;
    protected ArrayList<Celula> proxCelula;
    protected int direcao;
    protected Carro carro;
    protected String imagem;
    protected int posicaoX;
    protected int posicaoY;

    public Celula(int direcao, int posicaoX, int posicaoY) {
        this.direcao = direcao;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        proxCelula = new ArrayList<>();
        verificacaoCruzamento();
    }

    public void verificacaoCruzamento() {
        if (this.direcao > 8) {
            this.cruzamento = true;
        }
    }

    //metodo para limitar a quantidade de carros no caminho max 1 por vez
    public abstract void receberCarro(Carro carro);

    public abstract void removerCarro();

    public boolean isCruzamento() {
        return cruzamento;
    }

    public void setCruzamento(boolean cruzamento) {
        this.cruzamento = cruzamento;
    }

    public boolean isSpawner() {
        return Spawner;
    }

    public void setSpawner(boolean Spawner) {
        this.Spawner = Spawner;
    }

    public ArrayList<Celula> getProxCelula() {
        return proxCelula;
    }

    public void setProxCelula(ArrayList<Celula> proxCelula) {
        this.proxCelula = proxCelula;
    }

    public int getDirecao() {
        return direcao;
    }

    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    
    

}
