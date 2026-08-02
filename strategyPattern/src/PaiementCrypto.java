public class PaiementCrypto implements IStrategiePaiement{
    private String adresseWallet;

    public PaiementCrypto(String adresseWallet){
        this.adresseWallet = adresseWallet;
    }

    @Override
    public void payer(double montant) {
        System.out.println("Paiement de " + montant + "€ en Cryptomonnaie.");
        System.out.println("   - Wallet : " + adresseWallet);
    }
}
