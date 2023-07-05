package ma.atos.reclamation.services;

import java.util.List;

public interface Transaction {
  
    public List<ma.atos.reclamation.dto.Transaction> transactionList();
    public Boolean isRapprochement();

}
