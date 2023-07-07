package ma.atos.reclamation.repositories;



import ma.atos.reclamation.entites.Distributeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DistributeurRepository extends JpaRepository<Distributeur, Long> {
    Optional<Distributeur> findById(@Param("code") String code);

}
