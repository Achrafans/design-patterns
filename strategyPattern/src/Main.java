//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Panier panier = new Panier(150.0);

        //Paypal
        IStrategiePaiement paypal = new PaiementPayPal("test@test.com", "test123");
        panier.setStrategie(paypal);
        panier.payerPanier();

        System.out.println("\n--- Changement de stratégie ---");
        //Crypto
        IStrategiePaiement crypto = new PaiementCrypto("0x1234ABC...");
        panier.setStrategie(crypto);
        panier.payerPanier();

        System.out.println("\n--- Changement de stratégie ---");
        IStrategiePaiement carte = new PaiementCarteBancaire("1234 5678 9012 3456", "12/28", "123");
        panier.setStrategie(carte);
        panier.payerPanier();

    }
}