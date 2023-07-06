package ma.atos.reclamation.services;

import org.springframework.stereotype.Service;

@Service
public interface FactureService {
    // Méthode pour afficher les factures
    void afficherFactures();
    //List<Facture> factures = factureRepository.findAll();

    // Méthode pour effectuer le paiement d'une facture
    void payerFacture(String reference);
}
