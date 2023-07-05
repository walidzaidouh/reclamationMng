package ma.atos.reclamation.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
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

}
