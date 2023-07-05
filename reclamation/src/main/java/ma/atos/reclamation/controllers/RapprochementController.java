package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.Transaction;
import org.springframework.util.CollectionUtils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RapprochementController {

    public BigDecimal calculerEcart(){

        List<Transaction> transactionsList = new ArrayList<>();

        BigDecimal totalTransactionsAmount = BigDecimal.ZERO;

        if (!CollectionUtils.isEmpty(transactionsList)) {
            totalTransactionsAmount = transactionsList.stream()
                    .map(transaction -> transaction.getMontant())
                    .reduce(BigDecimal.ZERO,BigDecimal ::add);
        }

        return totalTransactionsAmount;
    }
}
