package net.achraf;

import java.util.ArrayList;
import java.util.List;

public class CapteurTemperature {
    private float temperature;
    private List<IObservateur> observateurs = new ArrayList<>();

    public void ajouterObservateur(IObservateur o) {
        observateurs.add(o);
    }

    public void retirerObservateur(IObservateur o) {
        observateurs.remove(o);
    }

    public void setTemperature(float nouvelleTemp) {
        this.temperature = nouvelleTemp;
        notifierTous(); // Dès que la température change, on prévient tout le monde
    }

    private void notifierTous() {
        for (IObservateur o : observateurs) {
            o.actualiser(this.temperature);
        }
    }
}
