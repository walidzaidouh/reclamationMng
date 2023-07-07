package ma.atos.reclamation.entites;


import lombok.Getter;
import lombok.Setter;
import ma.atos.reclamation.enums.TypePaiement;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String reference;
    private TypePaiement typePaiement;
    private BigDecimal montant;
    private LocalDateTime date;
    private boolean isRapprochement;

    @ManyToOne
    @JoinColumn(name = "facture_id")

    private Facture facture;

    @Enumerated(EnumType.STRING)
    private String Type;
}