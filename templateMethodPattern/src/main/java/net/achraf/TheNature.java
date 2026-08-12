package net.achraf;

public class TheNature extends BoissonChaude {

    @Override
    protected void infuser() {
        System.out.println("2. Infuser le sachet de thé pendant 3 minutes");
    }

    // On ne surcharge PAS ajouterSupplements() → comportement par défaut : "Aucun supplément"
}
