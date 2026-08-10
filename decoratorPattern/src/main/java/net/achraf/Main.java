package net.achraf;

import net.achraf.impl.CafeSimple;
import net.achraf.impl.LaitDecorator;
import net.achraf.impl.SucreDecorator;

public class Main {
    public static void main(String[] args) {
        // Je crée un café simple
        ICafe monCafe = new CafeSimple();
        System.out.println(monCafe.description() + " -> " + monCafe.cout() + "€");

        // Je le décore avec du lait (je l'enveloppe)
        monCafe = new LaitDecorator(monCafe);
        System.out.println(monCafe.description() + " -> " + monCafe.cout() + "€");

        // Je le décore encore avec du sucre (je ré-enveloppe)
        monCafe = new SucreDecorator(monCafe);
        System.out.println(monCafe.description() + " -> " + monCafe.cout() + "€");
    }
}