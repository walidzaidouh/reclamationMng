package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.CaisseDTO;
import ma.atos.reclamation.dto.TransactionDTO;
import ma.atos.reclamation.services.CaisseService;
import ma.atos.reclamation.services.RapprochementService;
import ma.atos.reclamation.services.TransactionService;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

public class RapprochementServiceImpl implements RapprochementService {

    private final CaisseService caisseService;

    private final TransactionService transactionService;


    // Injection par constrcuteur
    public RapprochementServiceImpl(CaisseService caisseService, TransactionService transactionService) {
        this.caisseService = caisseService;
        this.transactionService = transactionService;
    }


    @Override
    public BigDecimal calculEcart(String refCaisse) {

        CaisseDTO caisseDto = null;

        List<TransactionDTO> transactionDTOList = transactionService.transactionList();


        BigDecimal tr = BigDecimal.ZERO;

        if(!CollectionUtils.isEmpty(transactionDTOList)){
            tr = transactionDTOList.stream().map(transactionDTO1 -> transactionDTO1.getMontant()).reduce(BigDecimal.ZERO,BigDecimal::add);
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
}
//Transaction transaction1 : transaction = (List<Transaction>) lF.get(i)