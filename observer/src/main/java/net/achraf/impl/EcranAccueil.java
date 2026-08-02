package net.achraf.impl;

import net.achraf.IObservateur;

public class EcranAccueil implements IObservateur {

    @Override
    public void actualiser(float temperature) {
        System.out.println("Ecran d'accueil : Il fait " + temperature + "°C.");
    }
}
