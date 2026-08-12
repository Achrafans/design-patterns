package net.achraf;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Préparation d'un café ===");
        BoissonChaude cafe = new Cafe();
        cafe.preparer();

        System.out.println("\n=== Préparation d'un thé au citron ===");
        BoissonChaude the = new The();
        the.preparer();

        System.out.println("\n=== Préparation d'un thé nature ===");
        BoissonChaude theNature = new TheNature();
        theNature.preparer();
    }
}