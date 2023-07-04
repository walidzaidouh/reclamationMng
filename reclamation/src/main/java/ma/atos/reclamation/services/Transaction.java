package ma.atos.reclamation.services;

import ma.atos.reclamation.enums.TypePaiement;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface Transaction {

    public List<Transaction> transactionList();
    public Boolean isRapprochement();

}
