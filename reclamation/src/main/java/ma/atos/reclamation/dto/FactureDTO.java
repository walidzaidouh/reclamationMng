package ma.atos.reclamation.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class FactureDTO {

    private String reference;
    private List<TransactionDTO> transactionDTOList;
    private ClientDTO clientDTO;
    private LocalDateTime dateFacture;
    private LocalDateTime dateEcheance;
    private BigDecimal montant;

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public FactureDTO(String reference, List<TransactionDTO> transactionDTOList, ClientDTO clientDTO, LocalDateTime dateFacture, LocalDateTime dateEcheance, BigDecimal montant) {
        this.reference = reference;
        this.transactionDTOList = transactionDTOList;
        this.clientDTO = clientDTO;
        this.dateFacture = dateFacture;
        this.dateEcheance = dateEcheance;
        this.montant = montant;
    }

    public String getRefernce() {
        return reference;
    }

    public void setRefernce(String refernce) {
        this.reference = refernce;
    }

    public List<TransactionDTO> getTransactionList() {
        return transactionDTOList;
    }

    public void setTransactionList(List<TransactionDTO> transactionDTOList) {
        this.transactionDTOList = transactionDTOList;
    }

    public ClientDTO getClient() {
        return clientDTO;
    }

    public void setClient(ClientDTO clientDTO) {
        this.clientDTO = clientDTO;
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
