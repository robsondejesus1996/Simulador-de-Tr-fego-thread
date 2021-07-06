package controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Celula;
import observer.ObsMapa;

/**
 *
 * @author Brenda Paetzoldt e Robson de Jesus
 */
public class CMapa {

    private int numMapa;
    private int fila;
    private int coluna;
    private int matriz[][];
    private Celula celulaMatriz[][];

    private static CMapa instance = null;

    public CMapa() {
    }

    static CMapa getIntance() {
        if (instance == null) {
            instance = new CMapa();
        }
        return instance;
    }

    private List<ObsMapa> mapObserver = new ArrayList<>();

   public void setMapa(int id, boolean modo) throws IOException{
        this.numMapa = id;
        BufferedReader in = new BufferedReader(new FileReader("./malhas/malha" + numMapa + ".txt"));
        this.fila = Integer.parseInt(in.readLine());
        this.coluna = Integer.parseInt(in.readLine());
        matriz = new int[fila][coluna];
        for (int i = 0; i < fila; i++) {
            String fila[] = in.readLine().split("\t");
            for (int j = 0; j < coluna; j++) {
                matriz[i][j] = Integer.parseInt(fila[j]);
            }
        }

    }
   
     

}
