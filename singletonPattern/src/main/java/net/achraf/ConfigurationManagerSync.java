package net.achraf;

public class ConfigurationManagerSync {

    private static ConfigurationManagerSync instance;
    private String databaseUrl;
    private String apiKey;

    private ConfigurationManagerSync() {
        System.out.println("🔧 [SYNC] Chargement de la config... (fait au premier appel)");
        this.databaseUrl = "jdbc:sync://localhost:3306/monApp";
        this.apiKey = "SYNC-API-5678";
        try { Thread.sleep(500); } catch (InterruptedException e) {}
        System.out.println("✅ [SYNC] Configuration chargée !");
    }

    // Méthode synchronisée (thread-safe)
    public static synchronized ConfigurationManagerSync getInstance() {
        if (instance == null) {
            instance = new ConfigurationManagerSync();
        }
        return instance;
    }

    public String getDatabaseUrl() { return databaseUrl; }
    public String getApiKey() { return apiKey; }
}