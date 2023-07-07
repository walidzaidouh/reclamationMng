package ma.atos.reclamation.services;


import ma.atos.reclamation.dto.RapprochementDTO;

import java.math.BigDecimal;
import java.util.List;

public interface RapprochementService {
    BigDecimal calculEcart(String refCaisse);
    public List<RapprochementDTO> listRapprochement();

}
