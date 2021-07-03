package controller;

import java.util.ArrayList;
import java.util.List;
import observer.ObsJogo;

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

    public void escolherMapa(int id, boolean modo) {
        CMapa cm = CMapa.getIntance();
        cm.setMapa(id, modo);
        notificaNovoJogo();
    }

    private List<ObsJogo> criaObsJogo = new ArrayList<>();

    public void attachMap(ObsJogo obs) {
        this.criaObsJogo.add(obs);
    }

    public void detach(ObsJogo obs) {
        this.criaObsJogo.remove(obs);
    }

    private void notificaNovoJogo() {
        for (ObsJogo obs : criaObsJogo) {
            obs.escolheMapa();
        }
    }
}
