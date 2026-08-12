package net.achraf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PATTERN PROTOTYPE - CLONAGE ===\n");

        // 1. Création du prototype original (construction coûteuse)
        Point centreOriginal = new Point(5, 10);
        Cercle original = new Cercle(15, centreOriginal);
        System.out.println("📦 Original : " + original);

        // 2. Clonage du cercle
        Cercle clone = original.clone();
        System.out.println("📋 Clone    : " + clone);

        // 3. Vérification : est-ce le même objet en mémoire ?
        System.out.println("\n--- Vérification d'identité ---");
        System.out.println("original == clone ? " + (original == clone)); // false (objets distincts)

        // 4. Test de la DEEP COPY : on modifie le centre du clone
        System.out.println("\n--- Modification du centre du CLONE ---");
        clone.getCentre().setX(100);
        clone.getCentre().setY(200);
        clone.setRayon(999);

        System.out.println("📦 Après modif du clone :");
        System.out.println("Original : " + original); // Le centre de l'original est RESTÉ à (5,10) !
        System.out.println("Clone    : " + clone);   // Le clone a son centre à (100,200)

        // 5. Test de la SHALLOW COPY (pour comprendre le piège)
        System.out.println("\n--- TEST DU PIÈGE (Si on avait fait une SHALLOW COPY uniquement) ---");
        // On simule ce qui se serait passé sans la ligne "new Point(...)" dans clone()
        System.out.println("Avec une shallow copy, le clone et l'original auraient partagé le même Point.");
        System.out.println("Le clone aurait eu le centre (100,200) ET l'original aussi !");
        System.out.println("C'est pour ça qu'on fait une DEEP COPY dans le Prototype.");
    }
}