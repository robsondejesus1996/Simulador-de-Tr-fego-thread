/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Robson e Brenda
 */
public class Carro {

    private int carroId;
    private String imagem;
    private int proxDirecao;
    private Celula estradaAtual;
    private Celula estradaVelha;

    public Carro(int carroId, Celula estraCelula) {
        this.carroId = carroId;
        this.estradaAtual = estraCelula;
        this.proxDirecao = 0;

    }

    public void definicaoImagem(int direcao) {
        if (direcao == 2 || direcao == 4) {
            this.imagem = "./quarteiroes/carro2.png";
        } else {
            this.imagem = "./quarteiroes/carro1.png";
        }

    }

    public int getCarroId() {
        return carroId;
    }

    public void setCarroId(int carroId) {
        this.carroId = carroId;
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
