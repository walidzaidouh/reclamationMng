package ma.atos.reclamation.repositories;


import ma.atos.reclamation.entites.Caisse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface CaisseRepository extends JpaRepository<Caisse, Long> {

     Caisse findByreference(@Param("reference") String reference);


}
