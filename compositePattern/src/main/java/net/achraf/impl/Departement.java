package net.achraf.impl;

import net.achraf.IEmploye;

import java.util.ArrayList;
import java.util.List;

// 3. Le "composite" (groupe d'employés)
public class Departement implements IEmploye {
    private String nom;
    private List<IEmploye> employes = new ArrayList<>();

    public Departement(String nom) {
        this.nom = nom;
    }

    public void ajouter(IEmploye e) {
        employes.add(e);
    }

    @Override
    public void afficherSalaire() {
        System.out.println("--- Département " + nom + " ---");
        // Il délègue le travail à CHAQUE enfant (peu importe si c'est un individu ou un sous-département)
        for (IEmploye e : employes) {
            e.afficherSalaire();
        }
    }
}
