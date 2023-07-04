package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.enums.TypePaiement;
import ma.atos.reclamation.services.Transaction;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class TransactionImpl implements Transaction {


    @Override
    public List<Transaction> transactionList() {
        return null;
    }

    @Override
    public Boolean isRapprochement() {
        return null;
    }
}

