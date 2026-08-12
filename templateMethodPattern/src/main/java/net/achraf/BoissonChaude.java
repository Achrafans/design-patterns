package net.achraf;

public abstract class BoissonChaude {
    // === TEMPLATE METHOD ===
    // Il est "final" pour que les sous-classes ne puissent pas modifier l'ordre des étapes
    public final void preparer() {
        faireBouillirEau();
        infuser();
        verserDansTasse();
        ajouterSupplements();
    }

    // Étape 1 : commune à toutes les boissons (implémentation concrète dans la classe mère)
    private void faireBouillirEau() {
        System.out.println("1. Faire bouillir l'eau à 100°C");
    }

    // Étape 2 : spécifique à chaque boisson (abstraite → obligatoire pour les sous-classes)
    protected abstract void infuser();

    // Étape 3 : commune (implémentation concrète)
    private void verserDansTasse() {
        System.out.println("3. Verser dans la tasse");
    }

    // Étape 4 : spécifique (peut être abstraite ou avoir un comportement par défaut)
    // On utilise un "hook" (crochet) : une méthode vide par défaut que les sous-classes peuvent surcharger
    protected void ajouterSupplements() {
        // Par défaut : rien
        System.out.println("4. (Aucun supplément ajouté)");
    }
}
