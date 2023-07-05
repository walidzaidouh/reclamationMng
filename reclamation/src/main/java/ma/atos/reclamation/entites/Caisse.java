package ma.atos.reclamation.entites;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Caisse {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String reference;
    private String etat;
    private String devise;
    private BigDecimal montant;
    @OneToOne
    private Agence agence;
    @OneToMany(mappedBy = "Caisse")
    private List<Rapprochement> rapprochement;
    public Caisse( String reference, String etat, String devise, BigDecimal montant,Agence agence) {
        this.reference = reference;
        this.etat = etat;
        this.devise = devise;
        this.montant = montant;
        this.agence= agence;
    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
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
    public Agence getAgence() {
        return agence;
    }
    public void setAgence(Agence agence) {
        this.agence = agence;
    }
}
