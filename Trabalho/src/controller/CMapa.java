package controller;

import controller.observador.MapaObservador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import model.Carro;
import model.Celula;
import model.MonitorEstrada;
import model.SemafaroEstrada;

/**
 *
 * @author Brenda Paetzoldt e Robson de Jesus
 */
public class CMapa {

    private int mapaId;
    private int carroId;
    private int matriz[][];
    private Celula matrizCelula[][];
    private int filas;
    private int colunas;
    private int quantidadeCarros;
    private int carroVeloc = 300;
    private static CMapa instance = null;
    private CSpawner spawn;

    public CSpawner getSpawn() {
        return spawn;
    }

    public static CMapa getIntance() {
        if (instance == null) {
            instance = new CMapa();
        }
        return instance;
    }

    private CMapa() {

    }

    public int getColunas() {
        return colunas;
    }

    public int getFilas() {
        return filas;
    }

    public void definirMapa(int id, boolean modo) throws IOException {
        this.mapaId = id;

        BufferedReader in = new BufferedReader(new FileReader("./malhas/malha" + mapaId + ".txt"));
        this.filas = Integer.parseInt(in.readLine());
        this.colunas = Integer.parseInt(in.readLine());
        matriz = new int[filas][colunas];
        for (int i = 0; i < filas; i++) {
            String fila[] = in.readLine().split("\t");
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = Integer.parseInt(fila[j]);
            }
        }

        converterMatrizCelula(modo);
    }

    private void converterMatrizCelula(boolean semafaro) {
        matrizCelula = new Celula[this.filas][this.colunas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] != 0) {
                    SemafaroEstrada newSemafaro;
                    MonitorEstrada newMonitor;
                    if (semafaro) {
                        newSemafaro = new SemafaroEstrada(matriz[i][j], i, j);
                        matrizCelula[i][j] = newSemafaro;
                        estradaSpawner(newSemafaro);
                    } else {
                        newMonitor = new MonitorEstrada(matriz[i][j], i, j);
                        matrizCelula[i][j] = newMonitor;
                        estradaSpawner(newMonitor);
                    }
                } else {
                    matrizCelula[i][j] = null;
                }
            }
        }
        definirProxCelula();
    }

    private void estradaSpawner(Celula estrada) {
        if (estrada != null) {
            if (estrada.getPosicaoY() == 0) {
                if (estrada.getDirecao() == 2) {
                    estrada.setIsSpawner(true);
                }
            } else if (estrada.getPosicaoY() == (matriz[0].length - 1)) {
                if (estrada.getDirecao() == 4) {
                    estrada.setIsSpawner(true);
                }
            }

            if (estrada.getPosicaoX() == 0) {
                if (estrada.getDirecao() == 3) {
                    estrada.setIsSpawner(true);
                }
            } else if (estrada.getPosicaoX() == (matriz.length - 1)) {
                if (estrada.getDirecao() == 1) {
                    estrada.setIsSpawner(true);
                }
            }
        }
    }

    public void definirProxCelula() {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colunas; j++) {
                Celula road = matrizCelula[i][j];
               if (road != null) {
                    try {
                        switch (road.getDirecao()) {
                            case 1:
                                road.adicionarProxCelula(matrizCelula[i - 1][j]); //cima
                                break;
                            case 2:
                                road.adicionarProxCelula(matrizCelula[i][j + 1]); //direita
                                break;
                            case 3:
                                road.adicionarProxCelula(matrizCelula[i + 1][j]); // baixo
                                break;
                            case 4:
                                road.adicionarProxCelula(matrizCelula[i][j - 1]); // esquerda
                                break;
                            case 5:
                                road.adicionarProxCelula(matrizCelula[i - 1][j]); //cima
                                break;
                            case 6:
                                road.adicionarProxCelula(matrizCelula[i][j + 1]);//direita
                                break;
                            case 7:
                                road.adicionarProxCelula(matrizCelula[i + 1][j]);//baixo
                                break;
                            case 8:
                                road.adicionarProxCelula(matrizCelula[i][j - 1]);//esquerda
                                break;
                            case 9:
                                road.adicionarProxCelula(matrizCelula[i - 1][j]);
                                road.adicionarProxCelula(matrizCelula[i][j + 1]);
                                break;
                            case 10:
                                road.adicionarProxCelula(matrizCelula[i - 1][j]);
                                road.adicionarProxCelula(matrizCelula[i][j - 1]);
                                break;
                            case 11:
                                road.adicionarProxCelula(matrizCelula[i + 1][j]);
                                road.adicionarProxCelula(matrizCelula[i][j + 1]);
                                break;
                            case 12:
                                road.adicionarProxCelula(matrizCelula[i + 1][j]);
                                road.adicionarProxCelula(matrizCelula[i][j - 1]);
                                break;
                        }
                    } catch (Exception e) {
                    }
                }
            }
        }

    }

    public synchronized void definirCarroImagem(Carro carro) {
        int direcaoAtual = carro.getEstradaAtual().getDirecao();
        int direcaoAnterior = 0;
        if (carro.getEstradaVelha() != null) {
            direcaoAnterior = carro.getEstradaVelha().getDirecao();
        }
        if (direcaoAtual > 4) {
            switch (direcaoAtual) {
                case 5:
                    carro.definicaoImagem(1); 
                    break;
                case 6:
                    carro.definicaoImagem(2);
                    break;
                case 7:
                    carro.definicaoImagem(1);
                    break;
                case 8:
                    carro.definicaoImagem(2);
                    break;
                case 9:
                    if (carro.getProxDirecao() == 0) {
                        carro.definicaoImagem(1);
                    } else {
                        carro.definicaoImagem(2);
                    }
                    break;
                case 10:
                    if (direcaoAnterior <= 4) {
                        if (carro.getProxDirecao() == 0) {
                            carro.definicaoImagem(2);
                        } else {
                            carro.definicaoImagem(1);
                        }
                    } else {
                        if (carro.getProxDirecao() == 0) {
                            carro.definicaoImagem(1);
                        } else {
                            carro.definicaoImagem(2);
                        }
                    }
                    break;
                case 11:
                    if (direcaoAnterior <= 4) {
                        if (carro.getProxDirecao() == 0) {
                            carro.definicaoImagem(2);
                        } else {
                            carro.definicaoImagem(1);
                        }
                    } else {

                        carro.definicaoImagem(1);
                    }
                    break;
                case 12:
                    if (direcaoAnterior <= 4) {
                        if (carro.getProxDirecao() == 0) {
                            carro.definicaoImagem(1);
                        } else {
                            carro.definicaoImagem(2);
                        }
                    } else {
                        carro.definicaoImagem(2);
                    }
                    break;
            }

        } else {
            carro.definicaoImagem(direcaoAtual);
        }
    }

    public Icon getImagem(int coluna, int filas) {
        return new ImageIcon();
    }

    public void carregarMapa() {
        notificarTabela(matriz);
    }

    public void definirCarros(int value) {
        this.quantidadeCarros = value;
        if (value < 0) {
            NotificaQauntiCarrosErros();
            return;
        }
        notificaQuantiCarros(value);
    }

    private void NotificaQauntiCarrosErros() {
        for (MapaObservador obs : mapObserver) {
            obs.definirQuatCarrosErro();
        }
    }

    private void notificaQuantiCarros(int value) {
        for (MapaObservador obs : mapObserver) {
            obs.definirQuatCarros(value);
        }
    }

    private List<MapaObservador> mapObserver = new ArrayList<>();

    public void notificarRepintar() {
        for (MapaObservador obs : mapObserver) {
            obs.redefinirPintar();
        }
    }

    private void notificarTabela(int[][] matriz) {
        for (MapaObservador obs : mapObserver) {
            obs.definirTabela(matriz, filas, colunas);
        }

    }

    public int getQuantiCarros() {
        return quantidadeCarros;
    }

    public void spawnCar() {
        List<Celula> roads = new ArrayList();
        for (Celula[] roadLine : matrizCelula) {
            for (Celula road : roadLine) {
                if (road != null && road.isSpawner()) {
                    roads.add(road);
                
                }
            }
        }
        Random rand = new Random();
        printCar(roads.get(rand.nextInt(roads.size())));
    }

    private void printCar(Celula road) {
        road.receberCarro(criarCarro(road));
    }

    private Carro criarCarro(Celula road) {
        Carro newCar = new Carro(carroId++, road);
        definirCarroImagem(newCar);
        CCarro driver = new CCarro(newCar, this.carroVeloc);
        driver.start();
        return newCar;
    }

    private void roadSpawner(Celula estrada) {
        if (estrada != null) {
            if (estrada.getPosicaoY() == 0) {
                if (estrada.getDirecao() == 2) {
                    estrada.setIsSpawner(true);
                }
            } else if (estrada.getPosicaoY() == (matriz[0].length - 1)) {
                if (estrada.getDirecao() == 4) {
                    estrada.setIsSpawner(true);
                }
            }

            if (estrada.getPosicaoY() == 0) {
                if (estrada.getDirecao() == 3) {
                    estrada.setIsSpawner(true);
                }
            } else if (estrada.getPosicaoX() == (matriz.length - 1)) {
                if (estrada.getDirecao() == 1) {
                    estrada.setIsSpawner(true);
                }
            }
        }
    }

    public ImageIcon Estrada(int row, int collumn) {
        if (matrizCelula[row][collumn].getCarro() == null) {
            return new ImageIcon("./quarteiroes/rua.png");
        }
        return new ImageIcon(matrizCelula[row][collumn].getCarro().getImagem());
    }

    public void definirVelocidadeCarro(int velocity) {
        if (velocity >= 0) {
            this.carroVeloc = velocity;

        } else {
            velocidadeInvalida();
        }

    }

    private void velocidadeInvalida() {
        for (MapaObservador obs : mapObserver) {
            obs.velocidadeInvalida();
        }
    }

    public void iniciar() {
        notificarBotaoDesativacao(true);
        spawn = new CSpawner();
        spawn.start();
    }

    public void parar() {
        notificarBotaoDesativacao(false);
        spawn.setOn(false);
    }

    private void notificarBotaoDesativacao(boolean on) {
        for (MapaObservador obs : mapObserver) {
            obs.definirBotao(on);
        }
    }

    public void anexarMapa(MapaObservador obs) {
        this.mapObserver.add(obs);
    }

    public void separar(MapaObservador obs) {
        this.mapObserver.remove(obs);
    }

    public void definirInsercaoCarro(int velocidade) {
        spawn.setVelocidade(velocidade);

    }

}
