/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static java.lang.Thread.sleep;
import java.util.concurrent.Semaphore;
import java.util.logging.Level; 
import java.util.logging.Logger;

/**
 *
 * @author Robson e Brenda
 */
public class SemafaroEstrada extends Celula {

    private final Semaphore semaforo;

    public SemafaroEstrada(int direcao, int posicaoX, int posicaoY) {
        super(direcao, posicaoX, posicaoY);
        this.semaforo = new Semaphore(1);
    }

    
    @Override
    public void receberCarro(Carro carro) {
        try {
            while (getCarro() != null) {
                sleep(carro.getVelocidade());
            }
            semaforo.acquire();
            setCarro(carro);
        } catch (InterruptedException ex) {
            Logger.getLogger(SemafaroEstrada.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            semaforo.release();
        }
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
