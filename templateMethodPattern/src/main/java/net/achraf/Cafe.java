package net.achraf;

public class Cafe extends BoissonChaude {

    @Override
    protected void infuser() {
        System.out.println("2. Infuser le café moulu pendant 4 minutes");
    }

    @Override
    protected void ajouterSupplements() {
        System.out.println("4. Ajouter du sucre et du lait");
    }
}
