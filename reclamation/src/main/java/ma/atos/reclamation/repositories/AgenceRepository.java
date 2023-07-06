package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entites.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {

    Optional<Agence> findByCode(@Param("code") String code);
}
