package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.RapprochementDTO;
import ma.atos.reclamation.entites.Rapprochement;
import ma.atos.reclamation.repositories.RapprochementRepository;
import ma.atos.reclamation.services.RapprochementService;
import ma.atos.reclamation.services.Transaction;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class RapprochementImpl implements RapprochementService {

    //private final Caisse caisse;

    @Autowired
    private RapprochementRepository rapprochementRepository;
    //private final Transaction transaction;


    // Injection par constrcuteur



    /*@Override
    public BigDecimal calculEcart(String refCaisse) {

        ma.atos.reclamation.dto.Caisse caisseDto = null;

        List<ma.atos.reclamation.dto.Transaction> transactionList = transaction.transactionList();


        BigDecimal tr = BigDecimal.ZERO;

        if(!CollectionUtils.isEmpty(transactionList)){
            tr = transactionList.stream().map(transaction1 -> transaction1.getMontant()).reduce(BigDecimal.ZERO,BigDecimal::add);
        }

        BigDecimal ecart = BigDecimal.ZERO;


        if (caisseDto.getMontant() != null && tr != null) {
            if (tr.compareTo(caisseDto.getMontant()) > 0) {
                ecart = tr.subtract(caisseDto.getMontant());
                System.out.println("il y a une difference en faveur de l'agence d'un montant : " + ecart);
            } else if (tr.compareTo(caisseDto.getMontant()) < 0) {
                ecart = caisseDto.getMontant().subtract(tr);
                System.out.println("il y a une difference au niveau de l'agence d'un montant : " + ecart);
            } else if (tr.compareTo(caisseDto.getMontant()) == 0) {
                ecart.equals(0);
                System.out.println("il n y a pas d'ecart");
            }
        }
        return ecart;
    }*/

    @Override
    public BigDecimal calculEcart(String refCaisse) {
        return null;
    }

    @Override
    public List<RapprochementDTO> listRapprochement() {
        List<Rapprochement> rapprochementList =  rapprochementRepository.findAll();

        List<RapprochementDTO> rapprochementDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(rapprochementList)) {
            rapprochementList.stream().forEach(rapprochement -> {
                RapprochementDTO rapprochementDTO = new RapprochementDTO();
                BeanUtils.copyProperties(rapprochement, rapprochementDTO);
                rapprochementDTOList.add(rapprochementDTO);
            });
        }

        return rapprochementDTOList;
    }
}
//Transaction transaction1 : transaction = (List<Transaction>) lF.get(i)