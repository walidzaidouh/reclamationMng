package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.DistributeurDTO;
import ma.atos.reclamation.entites.Distributeur;
import ma.atos.reclamation.repositories.DistributeurRepository;
import ma.atos.reclamation.services.DistributeurService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class DitributeurImpl implements DistributeurService {

    @Autowired
    private DistributeurRepository distributeurRepository;

    @Override
    public List<DistributeurDTO> list() {
        List<Distributeur> distributeurList = distributeurRepository.findAll();
        List<DistributeurDTO> distributeurDTOList= new ArrayList<>();
        if (!CollectionUtils.isEmpty(distributeurList)){
            distributeurList.forEach(distributeur -> {
                DistributeurDTO distributeurDTO = new DistributeurDTO();
                BeanUtils.copyProperties(distributeur, distributeurDTO);
                distributeurDTOList.add(distributeurDTO);
            });
        }
        return distributeurDTOList;

    }



    @Override
    public DistributeurDTO updateDistributeur(DistributeurDTO distributeurDTO) {
        return null;
    }

    @Override
    public void createDistributeur(DistributeurDTO distributeurDTO) {
        Distributeur distributeur = new Distributeur();
        BeanUtils.copyProperties(distributeurDTO, distributeur);
        distributeurRepository.save(distributeur);
    }

    @Override
    public DistributeurDTO findByReference(String reference) {

        Distributeur distributeur = distributeurRepository.findByReference(reference);

        DistributeurDTO distributeurDTO = new DistributeurDTO();

        BeanUtils.copyProperties(distributeur,distributeurDTO);

        return distributeurDTO;
    }




}
