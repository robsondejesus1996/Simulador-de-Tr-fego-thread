/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.observador;

/**
 *
 * @author Robson e Brenda
 */
public interface MapaObservador {

    void definirQuatCarros(int value);

    public void definirTabela(int[][] matriz, int rows, int collums);

    public void redefinirPintar();

    public void definirBotao(boolean on);

}
