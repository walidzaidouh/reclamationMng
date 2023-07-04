package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.services.Caisse;
import ma.atos.reclamation.services.Rapprochement;
import ma.atos.reclamation.services.Transaction;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.List;

public class RapprochementImpl implements Rapprochement {

    private final Caisse caisse;

    private final Transaction transaction;


    // Injection par constrcuteur
    public RapprochementImpl(Caisse caisse, Transaction transaction) {
        this.caisse = caisse;
        this.transaction = transaction;
    }


    @Override
    public BigDecimal calculEcart(String refCaisse) {

        ma.atos.reclamation.dto.Caisse caisseDto = caisse.fi(refCaisse);

        List<ma.atos.reclamation.dto.Transaction> transactionList = transaction.list();


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
}
//Transaction transaction1 : transaction = (List<Transaction>) lF.get(i)