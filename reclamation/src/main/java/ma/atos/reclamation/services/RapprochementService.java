package ma.atos.reclamation.services;


import ma.atos.reclamation.dto.RapprochementDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public interface RapprochementService {
    BigDecimal calculEcart(String refCaisse);

    List<RapprochementDTO> listRapprochement();

    RapprochementDTO getRapprochementByReference(String reference);

    RapprochementDTO getRapprochementByDate(LocalDate date);

    void ajoutRapprochement (RapprochementDTO rapprochementDTO);

}
