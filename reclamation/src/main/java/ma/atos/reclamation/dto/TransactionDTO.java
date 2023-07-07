package ma.atos.reclamation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.atos.reclamation.enums.TypePaiement;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class TransactionDTO {

    //private Long id;
    private String reference;
    private TypePaiement typePaiement;
    private BigDecimal montant;
    private LocalDateTime date;
    private boolean isRapprochement;

}
