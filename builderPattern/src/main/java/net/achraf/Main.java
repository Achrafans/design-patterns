package net.achraf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // --- Construction d'une personne avec TOUS les champs ---
        Personne p1 = new Personne.Builder("Dupont", "Jean")
                .age(30)
                .telephone("06 12 34 56 78")
                .email("jean.dupont@email.com")
                .adresse("12 rue de Paris, 75000 Paris")
                .build();

        System.out.println("=== Personne 1 (complète) ===");
        System.out.println(p1);

        // --- Construction d'une personne avec SEULEMENT les champs obligatoires ---
        Personne p2 = new Personne.Builder("Martin", "Sophie")
                .build(); // On ne met que le nom et prénom

        System.out.println("\n=== Personne 2 (minimale) ===");
        System.out.println(p2);

        // --- Construction d'une personne avec un sous-ensemble de champs ---
        Personne p3 = new Personne.Builder("Lefèvre", "Paul")
                .age(45)
                .telephone("01 23 45 67 89")
                .build(); // Pas d'email, pas d'adresse

        System.out.println("\n=== Personne 3 (partielle) ===");
        System.out.println(p3);

        // --- Test de la validation ---
        try {
            Personne p4 = new Personne.Builder("Test", "Erreur")
                    .age(-5)  // Déclenche l'exception dans build()
                    .build();
        } catch (IllegalArgumentException e) {
            System.out.println("\n❌ Erreur attendue : " + e.getMessage());
        }
    }
}