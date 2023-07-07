package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.CaisseDTO;
import ma.atos.reclamation.entites.Caisse;
import ma.atos.reclamation.repositories.CaisseRepository;
import ma.atos.reclamation.services.CaisseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CaisseServiceImpl implements CaisseService {

    @Autowired
    CaisseRepository caisseRepository;

    @Override
    public List<CaisseDTO> list() {
        List<Caisse> caisseList= caisseRepository.findAll();
        List<CaisseDTO> caisseDTOList= new ArrayList<>();
        if (!CollectionUtils.isEmpty(caisseList)){
            caisseList.stream().forEach(caisse -> {
                CaisseDTO caisseDTO= new CaisseDTO();
                BeanUtils.copyProperties(caisse, caisseDTO);
                caisseDTOList.add(caisseDTO);
            });
        }
        return caisseDTOList;
    }

    @Override
    public CaisseDTO getByreference(String reference) {

        CaisseDTO caisseDTO = new CaisseDTO();
        Caisse caisse = caisseRepository.findByreference(reference);
        BeanUtils.copyProperties(caisse, caisseDTO);
        return  caisseDTO;
    }


    @Override
    public  void ajouterCaisse (CaisseDTO caisseDTO){
        Caisse caissse = new Caisse();
        BeanUtils.copyProperties(caisseDTO, caissse );
        caisseRepository.save(caissse);
    }
}
