package net.achraf;

// Classe existante et non modifiable (fournie par une vieille librairie)
public class ImplNonStandard {
    // L'ancienne signature : prend un nom de filtre en paramètre
    public int[] appliquerFiltre(String filterName, int[] data) {
        System.out.println("Utilisation de l'implémentation non standard : " + filterName);
        int[] result = new int[data.length];
        if (filterName.equalsIgnoreCase("flou")) {
            // Simule un flou
            for (int i = 0; i < data.length; i++) {
                result[i] = data[i] / 2;
            }
        } else {
            // Par défaut, inversion (négatif)
            for (int i = 0; i < data.length; i++) {
                result[i] = 255 - data[i];
            }
        }
        return result;
    }
}
