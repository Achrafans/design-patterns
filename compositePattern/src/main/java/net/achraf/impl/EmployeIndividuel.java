package net.achraf.impl;

import net.achraf.IEmploye;

// 2. La "feuille" (objet simple)
public class EmployeIndividuel implements IEmploye {
    private String nom;
    private double salaire;

    public EmployeIndividuel(String nom, double salaire) {
        this.nom = nom;
        this.salaire = salaire;
    }

    @Override
    public void afficherSalaire() {
        System.out.println(nom + " : " + salaire + " €");
    }
}
