package ma.atos.reclamation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class FactureDTO {

    private String reference;
    private List<TransactionDTO> transactionDTOList;
    private ClientDTO clientDTO;
    private LocalDateTime dateFacture;
    private LocalDateTime dateEcheance;
    private BigDecimal montant;
}
