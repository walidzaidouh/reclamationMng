package ma.atos.reclamation.dto;

import java.math.BigDecimal;
<<<<<<< HEAD
import java.time.LocalDate;

public class Rapprochement {

    private LocalDate date;
    private  boolean ecart;

    private BigDecimal montantecart;



=======
import java.time.LocalDateTime;

public class Rapprochement {


    private Caisse caisse;
    private LocalDateTime date;
    private boolean ecart;

    private BigDecimal montantEcart;

    public Rapprochement(Caisse caisse, LocalDateTime date, boolean ecart, BigDecimal montantEcart) {
        this.caisse = caisse;
        this.date = date;
        this.ecart = ecart;
        this.montantEcart = montantEcart;
    }

    public Caisse getCaisse() {
        return caisse;
    }

    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
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
>>>>>>> aae7161c91c73d81d51eaa3b39fe70ffbb303386
}
