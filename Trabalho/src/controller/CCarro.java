/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Carro;

/**
 *
 * @author Robson de Jesus
 */
public class CCarro extends Thread {

    private Carro car;
    private int contador;
    private int velocidade = 300;

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    CMapa controller = CMapa.getIntance();

    public CCarro(Carro car, int velocity) {
        this.car = car;
        this.velocidade = velocity;
    }

    @Override
    public void run() {
        Random rand = new Random();
        controller.notificarRepintar();
        try {
            //Inicia o ciclo de vida do carro
            while (!this.car.getEstradaAtual().getProxCelula().isEmpty()) {

                sleep(velocidade); //velocidade do carro

                int numRand = rand.nextInt(2);
                if (this.car.getEstradaAtual().isCruzamento()) {
                    if (this.car.getEstradaVelha().isCruzamento()) {
                        contador++;
                    } else {
                        contador = 0;
                    }
                    if (contador >= 2) {
                        contador = 0;
                        if (this.car.getEstradaAtual().getProxCelula().get(0).isCruzamento()) {
                            numRand = 1;
                        } else {
                            numRand = 0;
                        }
                    }
                    this.car.getEstradaAtual().getProxCelula().get(numRand).receberCarro(car);
                    this.car.getEstradaAtual().removerCarro();
                    this.car.setEstradaVelha(this.car.getEstradaAtual());
                    this.car.setEstradaAtual(this.car.getEstradaAtual().getProxCelula().get(numRand));
                    this.car.setProxDirecao(numRand);

                } else {
                    this.car.getEstradaAtual().getProxCelula().get(0).receberCarro(car);
                    this.car.getEstradaAtual().removerCarro();
                    this.car.setEstradaVelha(this.car.getEstradaAtual());
                    this.car.setEstradaAtual(this.car.getEstradaAtual().getProxCelula().get(0));
                }
                controller.definirCarroImagem(car);
                controller.notificarRepintar();
            }

            //Destroi o carro quando chega no fim
            sleep(velocidade);
            controller.definirCarroImagem(car);
            this.car.getEstradaAtual().removerCarro();
            controller.notificarRepintar();
            controller.getSpawn().removerCarro();
        } catch (InterruptedException ex) {
            Logger.getLogger(CCarro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Carro getCar() {
        return car;
    }

    public void setCar(Carro car) {
        this.car = car;
    }

}
