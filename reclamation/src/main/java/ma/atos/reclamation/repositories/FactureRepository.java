package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entites.Facture;
import ma.atos.reclamation.entites.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FactureRepository extends JpaRepository {

    Facture findByReference(String reference);

    // List<Facture> findAll();

    //afficher les transactions effectuées par la facture
    List<Transaction> findAllByFacture(Facture facture);
  /*  @Modifying
    @Query("UPDATE Facture f SET f.statut = 'payée' WHERE f.id = :id")
    void payerFacture(@Param("id") Long id);
   */
}
