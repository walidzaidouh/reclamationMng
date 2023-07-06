package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.CaisseDTO;

import java.util.List;

public interface CaisseService {


    public List<CaisseDTO> list();

    public CaisseDTO getByreference(String reference);

}
