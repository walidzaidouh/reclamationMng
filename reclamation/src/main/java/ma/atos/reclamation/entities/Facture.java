package ma.atos.reclamation.entities;


import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Facture {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String reference;

    @OneToMany(mappedBy = "facture", cascade = CascadeType.ALL)
    private List<Transaction> transactionList;

    @ManyToOne
    @JoinColumn(name="client_id")
    private Client client;

    private LocalDateTime dateFacture;

    private LocalDateTime dateEcheance;

    private BigDecimal montant;
    private String statut;

    public Facture() {}

    public Facture(String reference, List<Transaction> transactionList, Client client, LocalDateTime dateFacture, LocalDateTime dateEcheance, BigDecimal montant,String statut) {
        this.reference = reference;
        this.transactionList = transactionList;
        this.client = client;
        this.dateFacture = dateFacture;
        this.dateEcheance = dateEcheance;
        this.montant = montant;
        this.statut = statut;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
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
