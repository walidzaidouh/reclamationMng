package ma.atos.reclamation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ma.atos.reclamation.dto.Caisse;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String code;
    private String nom;
    private String localisation;

    @ManyToOne
    @JoinColumn(name = "distributeur_id")
    private Distributeur distributeur;

    @Entity
    public static class Rapprochement {

        @Id
        @GeneratedValue(strategy = GenerationType.SEQUENCE)
        private Long id;
        private String reference;
        @ManyToOne
        @JoinColumn(name = "caisse_id")
        private ma.atos.reclamation.dto.Caisse caisse;
        private LocalDateTime date;
        private boolean ecart;
        private BigDecimal montantEcart;
        public Long getId() {
            return id;
        }

        public String getReference() {
            return reference;
        }

        public ma.atos.reclamation.dto.Caisse getCaisse() {
            return caisse;
        }

        public LocalDateTime getDate() {
            return date;
        }

        public boolean isEcart() {
            return ecart;
        }

        public BigDecimal getMontantEcart() {
            return montantEcart;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public void setReference(String reference) {
            this.reference = reference;
        }

        public void setCaisse(Caisse caisse) {
            this.caisse = caisse;
        }

        public void setDate(LocalDateTime date) {
            this.date = date;
        }

        public void setEcart(boolean ecart) {
            this.ecart = ecart;
        }

        public void setMontantEcart(BigDecimal montantEcart) {
            this.montantEcart = montantEcart;
        }

    }
}
