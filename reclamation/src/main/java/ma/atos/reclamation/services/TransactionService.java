package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.TransactionDTO;

import java.util.List;

public interface TransactionService {

    public List<TransactionDTO> transactionList();
    public Boolean isRapprochement();

}
