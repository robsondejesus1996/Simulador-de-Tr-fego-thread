/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robson de Jesus e Brenda Paetzoldt
 */
public class CSpawner extends Thread {

    CMapa controller = CMapa.getIntance();

    private boolean on = true;
    private int velocidade = 500;

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    private int totalCars = 0;

    public void removerCarro() {

    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public void run() {
        while (on) {
            try {
                if (totalCars < controller.getQuantiCarros()) {
                    controller.spawnCar();
                    totalCars++;
                    sleep(velocidade);
                }
                sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(CSpawner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
