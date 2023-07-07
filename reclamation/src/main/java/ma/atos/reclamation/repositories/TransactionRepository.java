package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entites.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    Transaction findTransactionByReference(@Param("reference") String reference);
}
