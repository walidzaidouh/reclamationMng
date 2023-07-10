package ma.atos.reclamation.repositories;

import ma.atos.reclamation.entites.Rapprochement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface RapprochementRepository extends JpaRepository<Rapprochement,Long> {

    Rapprochement findByReference(@Param("reference") String reference);

    @Query("select r from Rapprochement r where year(r.date)=:year and month(r.date)=:month and day(r.date)=:day")
    Rapprochement findByDate(@Param("year") int year, @Param("month") int month, @Param("day") int day);

}
