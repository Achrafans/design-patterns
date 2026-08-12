package net.achraf;

import net.achraf.impl.NonStandardFilterAdapter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // --- 1. Saisie du filtre ---
            System.out.println("=== Configuration du Framework ===");
            System.out.print("Entrez le nom complet de la classe Filter (ex: ContrasteFilter ou NonStandardFilterAdapter) : ");
            String filterClassName = scanner.nextLine();

            // Chargement dynamique du filtre
            Class<?> filterClass = Class.forName(filterClassName);
            Filter filter = (Filter) filterClass.getDeclaredConstructor().newInstance();

            // Cas particulier : si c'est l'adaptateur, on doit lui passer une instance de ImplNonStandard
            if (filter instanceof NonStandardFilterAdapter) {
                // On simule la récupération de l'ancien système
                ImplNonStandard oldImpl = new ImplNonStandard();
                // On demande le nom du filtre à utiliser dans l'ancien système
                System.out.print("Entrez le nom du filtre pour l'implémentation non standard (ex: flou) : ");
                String oldFilterName = scanner.nextLine();
                // On reconstruit l'adaptateur avec les bons paramètres
                filter = new NonStandardFilterAdapter(oldImpl, oldFilterName);
            }

            // --- 2. Saisie du compresseur ---
            System.out.print("Entrez le nom complet de la classe Compressor (ex: RLECompressor ou JPEGCompressor) : ");
            String compressorClassName = scanner.nextLine();

            Class<?> compressorClass = Class.forName(compressorClassName);
            Compressor compressor = (Compressor) compressorClass.getDeclaredConstructor().newInstance();

            // --- 3. Création du processeur et traitement ---
            ImageProcessor processor = new ImageProcessor(filter, compressor);

            // Simulons une image (tableau d'entiers)
            int[] image = new int[100];
            for (int i = 0; i < image.length; i++) {
                image[i] = (int)(Math.random() * 256);
            }

            System.out.println("\n--- Exécution du traitement ---");
            int[] result = processor.traiter(image);
            System.out.println("Taille de l'image traitée : " + result.length + " pixels.");

        } catch (ClassNotFoundException e) {
            System.err.println("Erreur : Classe non trouvée. Vérifiez le nom complet (package.Classe).");
        } catch (Exception e) {
            System.err.println("Erreur lors de l'instanciation : " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}