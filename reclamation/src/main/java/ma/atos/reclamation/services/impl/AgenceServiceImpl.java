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

    private final AgenceRepository agenceRepository;

    @Autowired
    public AgenceServiceImpl(AgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }

    @Override
    public List<AgenceDTO> list() {

        // Return all agenies exist in DT
        List<Agence> agenceList =  agenceRepository.findAll();

        List<AgenceDTO> agenceDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(agenceList)) {
            agenceList.stream().forEach(agence -> {
                AgenceDTO agenceDTO = new AgenceDTO();
                BeanUtils.copyProperties(agence, agenceDTO);
                agenceDTOList.add(agenceDTO);
            });
        }

        return agenceDTOList;
    }

    @Override
    public Optional<Agence> getAgenceByCode(String code) {
        return agenceRepository.findByCode(code);
    }

    @Override
    public void addAgence(Agence agence) {
        agenceRepository.save(agence);
    }

    @Override
    public void updateAgence(Long id, Agence agence) {
        if (agenceRepository.findById(id).get() != null) {
            agenceRepository.save(agence);
        }
    }

    @Override
    public void deleteAgence(Long id) {
    agenceRepository.deleteById(id);
    }
}
