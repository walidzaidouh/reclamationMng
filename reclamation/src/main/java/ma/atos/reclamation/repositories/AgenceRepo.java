package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entities.Agence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface AgenceRepo extends JpaRepository<Agence, Long> {

    Agence findByNameAndType(@Param("name")String name, @Param("type") String type);




}
