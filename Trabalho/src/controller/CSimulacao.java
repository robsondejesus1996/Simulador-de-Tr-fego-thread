package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import controller.observador.NovaSimulacaoObservador;

/**
 *
 * @author Brenda Paetzoldt e Robson de Jesus
 */
public class CSimulacao {

    private CSimulacao() {

    }
    private static CSimulacao instance = null;

    public static CSimulacao getIntance() {
        if (instance == null) {
            instance = new CSimulacao();
        }
        return instance;
    }

    public void escolherMapa(int id, boolean modo) throws IOException {
        CMapa cm = CMapa.getIntance();
        cm.definirMapa(id, modo);
        notificaNovoJogo();
    }

    private List<NovaSimulacaoObservador> criaObsJogo = new ArrayList<>();

    public void attachMap(NovaSimulacaoObservador obs) {
        this.criaObsJogo.add(obs);
    }

    public void detach(NovaSimulacaoObservador obs) {
        this.criaObsJogo.remove(obs);
    }

    private void notificaNovoJogo() {
        for (NovaSimulacaoObservador obs : criaObsJogo) {
            obs.escolheMapa();
        }
    }
}
