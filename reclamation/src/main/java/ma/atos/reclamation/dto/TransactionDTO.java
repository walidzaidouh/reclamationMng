package ma.atos.reclamation.dto;

import ma.atos.reclamation.enums.TypePaiement;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransactionDTO {

    //private Long id;
    private String reference;
    private TypePaiement typePaiement;
    private BigDecimal montant;
    private LocalDateTime date;
    private boolean isRapprochement;


    public TransactionDTO(String reference, TypePaiement typePaiement, BigDecimal montant, LocalDateTime date, boolean isRapprochement) {
        this.reference = reference;
        this.typePaiement = typePaiement;
        this.montant = montant;
        this.date = date;
        this.isRapprochement = isRapprochement;
    }




    public String getReference() {
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

}