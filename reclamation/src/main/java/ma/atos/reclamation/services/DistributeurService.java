package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.DistributeurDTO;

import java.util.List;

public interface DistributeurService {
    List<DistributeurDTO> list();

    DistributeurDTO updateDistributeur(DistributeurDTO distributeurDTO);

    void createDistributeur(DistributeurDTO distributeurDTO);

    DistributeurDTO findByReference(String reference);
}
