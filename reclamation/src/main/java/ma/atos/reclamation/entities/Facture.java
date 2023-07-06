package ma.atos.reclamation.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String reference;
   //private List<Transaction> transactionList;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    private LocalDateTime dateFacture;
    private LocalDateTime dateEcheance;
    private BigDecimal montant;


    public String getRefernce() {
        return reference;
    }

    public void setRefernce(String refernce) {
        this.reference = refernce;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getDateFacture() {
        return dateFacture;
    }

    public void setDateFacture(LocalDateTime dateFacture) {
        this.dateFacture = dateFacture;
    }

    public LocalDateTime getDateEcheance() {
        return dateEcheance;
    }

    public void setDateEcheance(LocalDateTime dateEcheance) {
        this.dateEcheance = dateEcheance;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }
}
