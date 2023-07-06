package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> findByReference(@Param("reference") String reference);
}
