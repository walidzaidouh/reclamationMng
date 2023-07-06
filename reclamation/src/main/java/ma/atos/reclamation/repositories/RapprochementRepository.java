package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entities.Rapprochement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RapprochementRepository extends JpaRepository<Rapprochement,Long> {



}
