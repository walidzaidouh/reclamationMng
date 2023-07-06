package ma.atos.reclamation.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class RapprochementDTO {


    private String reference;
    private CaisseDTO caisseDTO;
    private LocalDateTime date;
    private boolean ecart;

    private BigDecimal montantEcart;

    public RapprochementDTO(String reference, CaisseDTO caisseDTO, LocalDateTime date, boolean ecart, BigDecimal montantEcart) {
        this.reference = reference;
        this.caisseDTO = caisseDTO;
        this.date = date;
        this.ecart = ecart;
        this.montantEcart = montantEcart;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public CaisseDTO getCaisse() {
        return caisseDTO;
    }

    public void setCaisse(CaisseDTO caisseDTO) {
        this.caisseDTO = caisseDTO;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public boolean isEcart() {
        return ecart;
    }


    public void setEcart(boolean ecart) {
        this.ecart = ecart;
    }

    public BigDecimal getMontantEcart() {
        return montantEcart;
    }

    public void setMontantEcart(BigDecimal montantEcart) {
        this.montantEcart = montantEcart;
    }
}
