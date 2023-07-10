package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entites.Agence;
import ma.atos.reclamation.entites.Rapprochement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Optional;

@Repository
public interface RapprochementRepository extends JpaRepository<Rapprochement,Long> {

    Rapprochement findByReference(@Param("reference") String reference);
    Rapprochement findByDate(@Param("date") LocalDateTime date);

        }
