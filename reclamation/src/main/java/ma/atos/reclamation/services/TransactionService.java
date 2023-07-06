package ma.atos.reclamation.services;
import ma.atos.reclamation.entities.Transaction;
import java.util.List;


public interface TransactionService {

    public List<Transaction> transactionList();
    public Boolean isRapprochement();

}
