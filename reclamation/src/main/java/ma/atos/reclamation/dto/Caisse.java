package ma.atos.reclamation.dto;

import java.math.BigDecimal;

public class Caisse {

    private String reference;
    private String etat;
    private String devise;
    private BigDecimal montant;

    public Caisse(String etat, String devise, BigDecimal montant, String reference) {
        this.etat = etat;
        this.devise = devise;
        this.montant = montant;
        this.reference = reference;
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

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
