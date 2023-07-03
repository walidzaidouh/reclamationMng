package ma.atos.reclamation.dto;

import ma.atos.reclamation.enums.TypePaiement;
import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Transaction {
    private TypePaiement type;
    private BigDecimal montant;
    private String referance ;
    private LocalDateTime date;

}
