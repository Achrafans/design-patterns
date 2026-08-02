package net.achraf.impl;

import net.achraf.IObservateur;

public class AlerteGivre implements IObservateur {

    @Override
    public void actualiser(float temperature) {
        if (temperature < 0) {
            System.out.println("ATTENTION : Risque de givre !");
        }
    }
}
