package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.entites.Agence;
import ma.atos.reclamation.repositories.AgenceRepository;
import ma.atos.reclamation.services.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public List<Agence> getAllAgenceList() {
        return agenceRepository.findAll();
    }

    @Override
    public Optional<Agence> getAgenceByCode(String code) {
        return agenceRepository.getAgenceByCode(code);
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
