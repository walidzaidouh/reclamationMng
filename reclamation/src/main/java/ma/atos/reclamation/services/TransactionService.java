package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.TransactionDTO;

import java.util.List;

public interface TransactionService {

    public List<TransactionDTO> transactionList();

    public TransactionDTO getTransactionByReference(String Reference);

    public Boolean isRapprochement();

    public void updateTransaction( TransactionDTO transactionDTO) throws Exception;

    public void ajoutTransaction (TransactionDTO transactionDTO);

}
