package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.CaisseDTO;
import ma.atos.reclamation.entites.Caisse;

import java.math.BigDecimal;
import java.util.List;

public interface CaisseService {


    public List<CaisseDTO> list();

    public CaisseDTO getByreference(String reference);
     public void ajouterCaisse(CaisseDTO caisseDTO);


}
