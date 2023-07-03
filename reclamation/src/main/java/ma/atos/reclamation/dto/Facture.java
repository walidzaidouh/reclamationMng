package ma.atos.reclamation.dto;

import java.time.LocalDateTime;
import java.util.List;

public class Facture {
    private String reference;
    private Client client;
    private List<Transaction> transactions;
    private LocalDateTime dateFacture;
    private LocalDateTime dataEcheance;

}
