package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.FactureDTO;
import ma.atos.reclamation.entites.Facture;

import java.util.List;


public interface FactureService {

    public List<FactureDTO> list();

    Facture getFactureByReference(String reference);

    Facture createFacture(FactureDTO factureDTO);
    //Facture updateFacture(Long id, Facture facture);
   // void deleteFacture(Long id);

    // Méthode pour effectuer le paiement d'une facture
    void payerFacture(String reference);
}
