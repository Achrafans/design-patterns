package net.achraf;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== DÉMARRAGE DE L'APPLICATION ===\n");

        // -----------------------------------------------------------------
        // 1. UTILISATION DE LA VERSION EAGER
        // -----------------------------------------------------------------
        System.out.println("--- UTILISATION DE EAGER ---");
        ConfigurationManagerEager eager1 = ConfigurationManagerEager.getInstance();
        System.out.println("Eager URL  : " + eager1.getDatabaseUrl());
        System.out.println("Eager API  : " + eager1.getApiKey());

        // Récupération d'une 2e instance pour vérifier que c'est la même
        ConfigurationManagerEager eager2 = ConfigurationManagerEager.getInstance();
        System.out.println("eager1 == eager2 ? " + (eager1 == eager2)); // true
        System.out.println();

        // -----------------------------------------------------------------
        // 2. UTILISATION DE LA VERSION SYNCHRONIZED
        // -----------------------------------------------------------------
        System.out.println("--- UTILISATION DE SYNCHRONIZED ---");
        ConfigurationManagerSync sync1 = ConfigurationManagerSync.getInstance();
        System.out.println("Sync URL   : " + sync1.getDatabaseUrl());
        System.out.println("Sync API   : " + sync1.getApiKey());

        ConfigurationManagerSync sync2 = ConfigurationManagerSync.getInstance();
        System.out.println("sync1 == sync2 ? " + (sync1 == sync2)); // true
        System.out.println();

        // -----------------------------------------------------------------
        // 3. TEST MULTI-THREADS (pour prouver que Sync est bien thread-safe)
        // -----------------------------------------------------------------
        System.out.println("--- TEST MULTI-THREADS (10 threads qui appellent SYNC en même temps) ---");
        Runnable tache = () -> {
            String nom = Thread.currentThread().getName();
            System.out.println(nom + " -> Récupération de l'instance...");
            ConfigurationManagerSync instance = ConfigurationManagerSync.getInstance();
            System.out.println(nom + " -> OK, instance obtenue : " + instance.getApiKey());
        };

        // On lance 10 threads simultanément
        for (int i = 1; i <= 10; i++) {
            new Thread(tache, "Thread-" + i).start();
        }

        // Petite pause pour laisser les threads finir avant la fin du main
        try { Thread.sleep(3000); } catch (InterruptedException e) {}
        System.out.println("\n✅ Fin du programme.");
    }
}