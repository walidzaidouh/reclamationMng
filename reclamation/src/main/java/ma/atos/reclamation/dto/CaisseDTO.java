package ma.atos.reclamation.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
public class CaisseDTO {

    private String reference;
    private String etat;
    private String devise;
    private BigDecimal montant;




}
