package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.AgenceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AgenceService {

    public List<AgenceDTO> list();

    public AgenceDTO getAgenceByCode(String code);

    void createAgence(AgenceDTO agenceDTO);

}
