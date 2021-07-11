package controller;

import controller.observador.NovoJogoObservador;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Brenda Paetzoldt e Robson de Jesus
 */
public class CJogo {

    private CJogo() {

    }
    private static CJogo instance = null;

    public static CJogo getIntance() {
        if (instance == null) {
            instance = new CJogo();
        }
        return instance;
    }

    public void escolherMapa(int id, boolean modo) throws IOException {
        CMapa cm = CMapa.getIntance();
        cm.definirMapa(id, modo);
        notificaNovoJogo();
    }

    private List<NovoJogoObservador> criaObsJogo = new ArrayList<>();

    public void attachMap(NovoJogoObservador obs) {
        this.criaObsJogo.add(obs);
    }

    public void detach(NovoJogoObservador obs) {
        this.criaObsJogo.remove(obs);
    }

    private void notificaNovoJogo() {
        for (NovoJogoObservador obs : criaObsJogo) {
            obs.escolheMapa();
        }
    }
}
