package ma.atos.reclamation.services;


import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.RapprochementDTO;
import ma.atos.reclamation.dto.TransactionDTO;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface RapprochementService {
    BigDecimal calculEcart(String refCaisse);
    public List<RapprochementDTO> listRapprochement();
    public RapprochementDTO getRapprochementByReference(String reference);

    public RapprochementDTO getRapprochementByDate(LocalDateTime date);

    public void ajoutRapprochement (RapprochementDTO rapprochementDTO);

}
