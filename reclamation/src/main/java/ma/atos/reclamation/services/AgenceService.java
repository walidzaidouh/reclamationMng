package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.ClientDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AgenceService {

    List<AgenceDTO> list();

    AgenceDTO getAgenceByCode(String code);

    // We used in this Method RestTemplate !
    AgenceDTO getAgenceByCodeRestTemplate(String code);

    void createAgence(AgenceDTO agenceDTO);

}
