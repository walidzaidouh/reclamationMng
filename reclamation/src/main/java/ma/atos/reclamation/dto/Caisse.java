package ma.atos.reclamation.dto;
import java.math.BigDecimal;
public class Caisse {




    private String reffrence;

    private String etat;
    private String devise;
    private BigDecimal montant;

    public Caisse(String id, String etat, String devise, BigDecimal montant) {
        this.reffrence = reffrence;
        this.etat = etat;
        this.devise = devise;
        this.montant = montant;
    }

    public String getId() {
        return reffrence;
    }

    public void setId(String id) {
        this.reffrence = id;
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
}
