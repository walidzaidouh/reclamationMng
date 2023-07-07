package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.FactureDTO;
import ma.atos.reclamation.entites.Facture;

import java.util.List;


public interface FactureService {

    public List<FactureDTO> list();

    FactureDTO getFactureByReference(String reference);

    /* void createFacture(FactureDTO factureDTO);

    void payerFacture(String reference);

     */
}
