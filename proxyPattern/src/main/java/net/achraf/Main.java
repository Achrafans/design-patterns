package net.achraf;

import net.achraf.impl.ImageProxy;


public class Main {
    public static void main(String[] args) {
        System.out.println("--- Démarrage de l'application ---");

        // Le Proxy est créé immédiatement (léger, pas de chargement)
        Image photo = new ImageProxy("vacances_ete.jpg");

        // L'utilisateur navigue, mais n'affiche pas encore l'image...
        System.out.println("L'utilisateur regarde la liste des images...");

        // Plus tard, l'utilisateur clique pour voir l'image
        System.out.println("\n--- L'utilisateur clique sur AFFICHER ---");
        photo.afficher(); // ICI, l'image est chargée pour la première fois !

        // Deuxième affichage (l'image est déjà chargée, on va vite)
        System.out.println("\n--- Deuxième affichage ---");
        photo.afficher();

    }
}