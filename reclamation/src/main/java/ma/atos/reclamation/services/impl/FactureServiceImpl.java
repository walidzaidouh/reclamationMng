package ma.atos.reclamation.services.impl;


import ma.atos.reclamation.dto.FactureDTO;
import ma.atos.reclamation.entites.Facture;
import ma.atos.reclamation.repositories.FactureRepository;
import ma.atos.reclamation.services.FactureService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
@Service
public class FactureServiceImpl implements FactureService {

    @Autowired
    FactureRepository factureRepository;

    @Override
    public List<FactureDTO> list() {

        List<Facture> factureList = factureRepository.findAll();

        List<FactureDTO> factureDTOList = new ArrayList<>();

        if (!CollectionUtils.isEmpty(factureList)) {
            factureList.stream().forEach(facture -> {
                FactureDTO factureDTO = new FactureDTO();
                BeanUtils.copyProperties(facture, factureDTO);
                factureDTOList.add(factureDTO);
            });
        }

        return factureDTOList;
    }

    /*
    @Override
    public void createFacture(FactureDTO factureDTO) {
        Facture facture = new Facture();
        BeanUtils.copyProperties(factureDTO, facture);
        factureRepository.save(facture);
    }
    *
     */

    @Override
    public FactureDTO getFactureByReference(String reference) {
        Facture facture = factureRepository.findByReference(reference);
        FactureDTO factureDTO = new FactureDTO();
        BeanUtils.copyProperties(facture, factureDTO);
        return factureDTO;

    }

/*
    @Override
    public void payerFacture(String reference) {
        Facture factureDTO = factureRepository.findByReference(reference);

        if (factureDTO != null) {
            factureDTO.setStatut("payée");
            factureRepository.save(factureDTO);
            System.out.println("Facture payée avec succès !");
        } else {
            System.out.println("La facture avec la référence " + reference + " n'a pas été trouvée.");
        }
    }
    *
 */
}
