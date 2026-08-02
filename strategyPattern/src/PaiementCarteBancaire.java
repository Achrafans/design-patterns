public class PaiementCarteBancaire  implements IStrategiePaiement {
    private String numeroCarte;
    private String dateExpiration;
    private String cvv;

    public PaiementCarteBancaire(String numeroCarte, String dateExpiration, String cvv) {
        this.numeroCarte = numeroCarte;
        this.dateExpiration = dateExpiration;
        this.cvv = cvv;

    }
    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + "€ par Carte Bancaire.");
        System.out.println("   - Numéro : " + numeroCarte + " (Exp: " + dateExpiration + ")");
    }
}
