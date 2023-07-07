package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.entites.Agence;
import ma.atos.reclamation.repositories.AgenceRepository;
import ma.atos.reclamation.services.AgenceService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AgenceServiceImpl implements AgenceService {

    @Autowired
    AgenceRepository agenceRepository;

    @Override
    public List<AgenceDTO> list() {

        // Return all agenies exist in DB
        List<Agence> agenceList =  agenceRepository.findAll();

        List<AgenceDTO> agenceDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(agenceList)) {
            agenceList.forEach(agence -> {
                AgenceDTO agenceDTO = new AgenceDTO();
                BeanUtils.copyProperties(agence, agenceDTO);
                agenceDTOList.add(agenceDTO);
            });
        }

        return agenceDTOList;
    }

    @Override
    public AgenceDTO getAgenceByCode(String code) {

        Agence agence = agenceRepository.findByCode(code);
        AgenceDTO agenceDTO = new AgenceDTO();

        BeanUtils.copyProperties(agence, agenceDTO);

        return agenceDTO;
    }

    @Override
    public void createAgence(AgenceDTO agenceDTO) {

        Agence agence = new Agence();
        BeanUtils.copyProperties(agenceDTO, agence);
        agenceRepository.save(agence);

    }

}
