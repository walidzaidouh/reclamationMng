package ma.atos.reclamation.dto;

import java.time.LocalDateTime;
import java.util.List;

public class Facture {

    private String refernce;
    private List<Transaction> transactionList;
    private Client client;
    private LocalDateTime dateFacture;
    private LocalDateTime dateEcheance;

    public Facture(String refernce, List<Transaction> transactionList, Client client, LocalDateTime dateFacture, LocalDateTime dateEcheance) {
        this.refernce = refernce;
        this.transactionList = transactionList;
        this.client = client;
        this.dateFacture = dateFacture;
        this.dateEcheance = dateEcheance;
    }

    public String getRefernce() {
        return refernce;
    }

    public void setRefernce(String refernce) {
        this.refernce = refernce;
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
}
