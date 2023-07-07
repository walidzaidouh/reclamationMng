package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.FactureDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FactureService {

    public List<FactureDTO> list();

    public FactureDTO getFactureByReference(String reference);
    void createFacture(FactureDTO factureDTO);

    // Méthode pour effectuer le paiement d'une facture
    void payerFacture(String reference);
}
