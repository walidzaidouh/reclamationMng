package ma.atos.reclamation.repositories;


import ma.atos.reclamation.entites.Distributeur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DistributeurRepository extends JpaRepository <Distributeur, Long> {
    //Distributeur findById(@Param("code") String code);
    Distributeur findByReference(@Param("code") String code);


}
