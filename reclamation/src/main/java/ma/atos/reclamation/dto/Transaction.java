package ma.atos.reclamation.dto;

import ma.atos.reclamation.enums.TypePaiement;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transaction {

    private String reference;
    private TypePaiement typePaiement;
    private BigDecimal montant;
    private LocalDateTime date;

    public Transaction(String reference, TypePaiement typePaiement, BigDecimal montant, LocalDateTime date) {
        this.reference = reference;
        this.typePaiement = typePaiement;
        this.montant = montant;
        this.date = date;
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
}
