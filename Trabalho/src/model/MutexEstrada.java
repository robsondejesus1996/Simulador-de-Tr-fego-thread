/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Robson e Brenda
 */
public class MutexEstrada extends Celula {

    private final Semaphore semaforo;//implementação pronta

    public MutexEstrada(int direcao, int posicaoX, int posicaoY) {
        super(direcao, posicaoX, posicaoY);
        this.semaforo = new Semaphore(1);
    }

    @Override
    public void receberCarro(Carro carro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerCarro() {
        try {
            semaforo.acquire();
            setCarro(null);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaforo.release();
        }
    }

}
