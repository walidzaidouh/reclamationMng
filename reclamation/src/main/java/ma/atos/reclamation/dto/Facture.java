package ma.atos.reclamation.dto;import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;


@Getter
@Setter
@AllArgsConstructor

public class Facture {

    private Long id;

    private String reference;

    private List<Transaction> transactionList;

    private Client client;

    private LocalDateTime dateFacture;

    private LocalDateTime dateEcheance;

    private BigDecimal montant;
    private String statut;
}