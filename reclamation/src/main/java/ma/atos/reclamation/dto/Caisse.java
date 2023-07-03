package ma.atos.reclamation.dto;

public class Caisse {

    private String etat;
    private String devise;
    private String montant;

    public Caisse(String etat, String devise, String montant) {
        this.etat = etat;
        this.devise = devise;
        this.montant = montant;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }
}
