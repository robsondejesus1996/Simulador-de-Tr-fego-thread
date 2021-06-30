/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Random;

/**
 *
 * @author Robson e Brenda
 */
public class Carro {
    
    private int carroId;
    private int carroTipo;
    private String imagem;
    private int proxDirecao;
    private Celula estradaAtual;
    private Celula estradaVelha;
    
    public Carro(int carroId, Celula estraCelula){
        this.carroId = carroId;
        this.estradaAtual = estraCelula;
        this.proxDirecao = 0;
        definicaoTipo(5);
        
    }
    
    public final void definicaoTipo(int numeroTipo){
        Random numero = new Random();
        this.carroTipo = numero.nextInt(numeroTipo) + 1;
    }
    
    
    public void definicaoImagem(int direcao){
        this.imagem = "./assets/Car" + getCarroTipo() + "Dir" + direcao + ".jpg";
    }

    public int getCarroId() {
        return carroId;
    }

    public void setCarroId(int carroId) {
        this.carroId = carroId;
    }

    public int getCarroTipo() {
        return carroTipo;
    }

    public void setCarroTipo(int carroTipo) {
        this.carroTipo = carroTipo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public int getProxDirecao() {
        return proxDirecao;
    }

    public void setProxDirecao(int proxDirecao) {
        this.proxDirecao = proxDirecao;
    }

    public Celula getEstradaAtual() {
        return estradaAtual;
    }

    public void setEstradaAtual(Celula estradaAtual) {
        this.estradaAtual = estradaAtual;
    }

    public Celula getEstradaVelha() {
        return estradaVelha;
    }

    public void setEstradaVelha(Celula estradaVelha) {
        this.estradaVelha = estradaVelha;
    }
    
    
}
