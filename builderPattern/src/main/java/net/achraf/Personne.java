package net.achraf;

public class Personne {

    // --- Attributs (tous en "final" pour être immutables) ---
    private final String nom;          // Obligatoire
    private final String prenom;       // Obligatoire
    private final int age;             // Optionnel (0 par défaut = non renseigné)
    private final String telephone;    // Optionnel
    private final String email;        // Optionnel
    private final String adresse;      // Optionnel

    // --- Constructeur PRIVÉ (seul le Builder peut l'appeler) ---
    private Personne(Builder builder) {
        this.nom = builder.nom;
        this.prenom = builder.prenom;
        this.age = builder.age;
        this.telephone = builder.telephone;
        this.email = builder.email;
        this.adresse = builder.adresse;
    }

    // --- Getters (pas de setters pour garder l'immutabilité) ---
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getAdresse() {
        return adresse;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    // --- 3. LA CLASSE BUILDER (statique imbriquée) ---
    public static class Builder {
        // Attributs obligatoires
        private final String nom;
        private final String prenom;

        // Attributs optionnels (initialisés avec des valeurs par défaut)
        private int age = 0;
        private String telephone = "Non renseigné";
        private String email = "Non renseigné";
        private String adresse = "Non renseignée";

        // Constructeur du Builder avec les champs OBLIGATOIRES
        public Builder(String nom, String prenom) {
            this.nom = nom;
            this.prenom = prenom;
        }

        // Méthodes "fluentes" (chaining) pour chaque champ optionnel
        public Builder age(int age) {
            this.age = age;
            return this;  // Retourne le builder lui-même pour le chaînage
        }

        public Builder telephone(String telephone) {
            this.telephone = telephone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder adresse(String adresse) {
            this.adresse = adresse;
            return this;
        }

        // --- Méthode build() qui construit l'objet final ---
        public Personne build() {
            // On peut ajouter des validations ici (ex: age > 0)
            if (this.age < 0) {
                throw new IllegalArgumentException("L'âge ne peut pas être négatif !");
            }
            return new Personne(this);
        }
    }
}
