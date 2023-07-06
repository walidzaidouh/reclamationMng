package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.CaisseDTO;
import ma.atos.reclamation.entites.Agence;
import ma.atos.reclamation.entites.Caisse;
import ma.atos.reclamation.repositories.CaisseRepository;
import ma.atos.reclamation.services.CaisseService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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
}
