package ma.atos.reclamation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
public class RapprochementDTO {


    private String reference;
    private CaisseDTO caisse;
    private LocalDateTime date;
    private boolean ecart;

    private BigDecimal montantEcart;

}
