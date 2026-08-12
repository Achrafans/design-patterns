package net.achraf.impl;

import net.achraf.Image;

// Le Proxy (l'intermédiaire)
public class ImageProxy implements Image {
    private String nomFichier;
    private ImageHD imageReelle; // Référence vers l'objet lourd

    public ImageProxy(String nomFichier) {
        this.nomFichier = nomFichier;
        // On NE charge PAS l'image ici ! On attend.
        System.out.println("📂 Proxy créé pour : " + nomFichier + " (pas encore chargé)");
    }

    @Override
    public void afficher() {
        // Contrôle d'accès : On charge l'image UNIQUEMENT au premier appel de afficher()
        if (imageReelle == null) {
            imageReelle = new ImageHD(nomFichier); // Création retardée (Lazy Loading)
        }
        // Délégation à l'objet réel
        imageReelle.afficher();
    }
}
