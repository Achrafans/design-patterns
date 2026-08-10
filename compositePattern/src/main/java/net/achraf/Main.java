package net.achraf;

import net.achraf.impl.Departement;
import net.achraf.impl.EmployeIndividuel;

public class Main {
    public static void main(String[] args) {
        EmployeIndividuel alice = new EmployeIndividuel("Alice", 3000);
        EmployeIndividuel bob = new EmployeIndividuel("Bob", 3500);

        Departement RH = new Departement("RH");
        RH.ajouter(alice);
        RH.ajouter(bob);

        Departement entreprise = new Departement("Siège");
        entreprise.ajouter(RH); // J'ajoute un département dans un autre département (arborescence)

        // Je traite le département comme un simple Employe, sans me soucier de sa complexité interne :
        entreprise.afficherSalaire();


    }
}