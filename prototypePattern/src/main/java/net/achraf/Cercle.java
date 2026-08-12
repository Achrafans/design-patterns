package net.achraf;

public class Cercle implements Cloneable {

    private int rayon;
    private Point centre; // Référence vers un objet mutable

    public Cercle(int rayon, Point centre) {
        this.rayon = rayon;
        this.centre = centre;
        System.out.println("🔨 Construction d'un nouveau Cercle (coûteux) avec centre " + centre);
    }

    // --- Getters et Setters ---
    public int getRayon() { return rayon; }
    public void setRayon(int rayon) { this.rayon = rayon; }
    public Point getCentre() { return centre; }
    public void setCentre(Point centre) { this.centre = centre; }

    /**
     * Méthode de clonage (le cœur du pattern Prototype)
     * On surcharge la méthode clone() pour la rendre publique.
     */
    @Override
    public Cercle clone() {
        try {
            // 1. super.clone() fait une copie SHALLOW (copie les références)
            Cercle cercleClone = (Cercle) super.clone();

            // 2. On fait une DEEP COPY pour le Point (objet mutable)
            // Si on ne fait pas ça, le clone et l'original partageront le même objet Point !
            cercleClone.centre = new Point(this.centre.getX(), this.centre.getY());

            return cercleClone;
        } catch (CloneNotSupportedException e) {
            // Cela n'arrive pas car nous implémentons Cloneable
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Cercle{rayon=" + rayon + ", centre=" + centre + "}";
    }
}