package ma.atos.reclamation.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import ma.atos.reclamation.enums.TypePaiement;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Transaction {

@Id

@GeneratedValue(strategy =  GenerationType.SEQUENCE)
private long id;


    private String reference;

    private TypePaiement typePaiement;
    private BigDecimal montant;
    private LocalDateTime date;
    private boolean isRapprochement;

    @ManyToOne
    @JoinColumn(name = "facture_id")
    private Facture facture;
    @Enumerated(EnumType.STRING)
    private String Type;

    /*public Transaction(String reference, TypePaiement typePaiement, BigDecimal montant, LocalDateTime date, boolean isRapprochement,Facture facture) {
        this.reference = reference;
        this.typePaiement = typePaiement;
        this.montant = montant;
        this.date = date;
        this.isRapprochement = isRapprochement;
        this.facture= facture;
    }*/




    /*public String getReference() {
        return reference;
    }


    public void setReference(String reference) {
        this.reference = reference;
    }

    public TypePaiement getTypePaiement() {
        return typePaiement;
    }

    public void setTypePaiement(TypePaiement typePaiement) {
        this.typePaiement = typePaiement;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public boolean isRapprochement() {
        return isRapprochement;
    }

    public void setRapprochement(boolean rapprochement) {
        isRapprochement = rapprochement;
    }

    public Facture getFacture() {
        return facture;
    }

    public void setFacture(Facture facture) {
        this.facture = facture;
    }*/
}
