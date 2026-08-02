public class Panier {
    private double montantTotal;
    private IStrategiePaiement strategie;

    public Panier(double montantTotal){
        this.montantTotal = montantTotal;
    }

    public void setStrategie(IStrategiePaiement strategie){
        this.strategie = strategie;
    }

    public void payerPanier() {
        if (strategie == null) {
            throw new IllegalStateException("Veuillez choisir un moyen de paiement !");
        }
        strategie.payer(montantTotal);
    }



}
