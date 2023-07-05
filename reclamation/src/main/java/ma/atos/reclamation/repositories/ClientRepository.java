package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entites.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Long> {

    Optional<Client> getClientByReference(String reference);
}
