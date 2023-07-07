package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.CaisseDTO;
import ma.atos.reclamation.dto.RapprochementDTO;
import ma.atos.reclamation.dto.TransactionDTO;
import ma.atos.reclamation.entites.Agence;
import ma.atos.reclamation.entites.Rapprochement;
import ma.atos.reclamation.repositories.RapprochementRepository;
import ma.atos.reclamation.services.RapprochementService;
import ma.atos.reclamation.services.TransactionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class RapprochementServiceImpl implements RapprochementService {

    //private final Caisse caisse;

    @Autowired
    private RapprochementRepository rapprochementRepository;
    @Autowired
    private TransactionService transaction;


    // Injection par constrcuteur



    @Override
    public BigDecimal calculEcart(String refCaisse) {

        CaisseDTO caisseDto = null;

        List<TransactionDTO> transactionList = transaction.transactionList();


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

    @Override
    public RapprochementDTO getRapprochementByReference(String reference) {
        Rapprochement rapprochement = rapprochementRepository.findByReference(reference);
        if(rapprochement==null){
            throw new EntityNotFoundException("Aucun rapprochement trouvé !");
        }
        RapprochementDTO rapprochementDTO = new RapprochementDTO();

        BeanUtils.copyProperties(rapprochement, rapprochementDTO);

        return rapprochementDTO;
    }
}
//Transaction transaction1 : transaction = (List<Transaction>) lF.get(i)