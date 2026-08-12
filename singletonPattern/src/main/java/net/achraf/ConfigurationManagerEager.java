package net.achraf;

public class ConfigurationManagerEager {

    // Créée immédiatement au chargement de la classe
    private static final ConfigurationManagerEager INSTANCE = new ConfigurationManagerEager();

    private String databaseUrl;
    private String apiKey;

    private ConfigurationManagerEager() {
        System.out.println("🔧 EAGER : Chargement de la config...");
        this.databaseUrl = "jdbc:mysql://localhost:3306/monApp";
        this.apiKey = "EAGER-API-KEY";
    }

    public static ConfigurationManagerEager getInstance() {
        return INSTANCE; // Pas besoin de synchronized
    }

    public String getDatabaseUrl() { return databaseUrl; }
    public String getApiKey() { return apiKey; }
}