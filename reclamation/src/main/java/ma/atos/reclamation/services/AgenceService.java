package ma.atos.reclamation.services;

import ma.atos.reclamation.entites.Agence;

import java.util.List;
import java.util.Optional;

public interface AgenceService {
    public List<Agence> getAllAgenceList();

    public Optional<Agence> getAgenceByCode(String code);

    public void addAgence(Agence agence);

    public void updateAgence(Long id, Agence agence);

    public void deleteAgence(Long id);

}
