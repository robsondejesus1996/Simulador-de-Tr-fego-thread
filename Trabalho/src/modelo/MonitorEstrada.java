/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Robson e Brenda
 */
public class MonitorEstrada extends Celula {
    
    @Override
    public void receberCarro(Carro carro) {
        try {
            while (getCarro() != null) {
                wait(10);
            }
            setCarro(carro);
        } 
        catch (Exception e) {
        }
    }
    @Override
    public void removerCarro() {
        super.carro = null;
    }
    
    public MonitorEstrada(int direcao, int posicaoX, int posicaoY) {
        super(direcao, posicaoX, posicaoY);
    }
    
}
