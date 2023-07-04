package ma.atos.reclamation.dto;

import java.math.BigDecimal;

public class Caisse {
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    private String reference;
    private String etat;
    private String devise;
    private BigDecimal montant;

    public Caisse(String reference, String etat, String devise, BigDecimal montant) {
        this.reference = reference;
        this.etat = etat;
        this.devise = devise;
        this.montant = montant;
    }

    public String getEtat() {
        return etat;
    }

    //Test

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
}
