package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.services.Facture;

public class FactureImpl implements Facture {
    @Override
    public void afficherFactures() {
     /*   List<Facture> factures = factureRepository.findAll();
         for (Facture facture : factures) {
           System.out.println(facture);
         }*/
    }

    @Override
    public void payerFacture(String reference) {


/*        Facture facture = factureRepository.findById(reference);
         if (facture != null) {
             // Effectuer le paiement de la facture
         }
       facture.setPayee(true);
             factureRepository.save(facture);
            System.out.println("Facture payée avec succès !");
         }
         else {
            System.out.println("Facture non trouvée !");
         }*/
    }
}