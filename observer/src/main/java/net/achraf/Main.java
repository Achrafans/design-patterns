package net.achraf;

import net.achraf.impl.AlerteGivre;
import net.achraf.impl.EcranAccueil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        CapteurTemperature capteur = new CapteurTemperature();

        capteur.ajouterObservateur(new EcranAccueil());
        capteur.ajouterObservateur(new AlerteGivre());

        capteur.setTemperature(25);
        // Sortie :
        // Ecran d'accueil : Il fait 25.0°C.
        // (AlerteGivre ne fait rien car il fait chaud)

        capteur.setTemperature(-2);
        // Sortie :
        // Ecran d'accueil : Il fait -2.0°C.
        // ATTENTION : Risque de givre !
    }
}