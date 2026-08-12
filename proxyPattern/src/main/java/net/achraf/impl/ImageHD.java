package net.achraf.impl;

import net.achraf.Image;

// L'image haute résolution (celle qui est coûteuse à charger)
class ImageHD implements Image {
    private String nomFichier;

    public ImageHD(String nomFichier) {
        this.nomFichier = nomFichier;
        chargerImageDepuisDisque(); // Opération très lente !
    }

    private void chargerImageDepuisDisque() {
        System.out.println("🔄 Chargement lourd de l'image : " + nomFichier + " (500 Mo) ...");
        try {
            Thread.sleep(2000); // Simulation du temps de chargement
        } catch (InterruptedException e) {}
        System.out.println("✅ Image chargée !");
    }

    @Override
    public void afficher() {
        System.out.println("🖼️ Affichage de l'image : " + nomFichier);
    }
}
