public class PaiementPayPal implements IStrategiePaiement {
    private String email;
    private String motDePasse;

    public PaiementPayPal(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = motDePasse;
    }

    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + "€ par PayPal.");
        System.out.println("   - Email : " + email);
    }
}
