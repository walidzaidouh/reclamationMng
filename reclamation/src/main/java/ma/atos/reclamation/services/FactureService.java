package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.AgenceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface Facture {

    public List<Facture> list();

    // Méthode pour effectuer le paiement d'une facture
    void payerFacture(String reference);
}
