package ma.atos.reclamation.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity
public class Caisse {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String reference;
    private String etat;
    private String devise;
    private BigDecimal montant;

    @OneToOne
    private Agence agence;

    @OneToMany(mappedBy = "caisse")
    private List<Rapprochement> rapprochement;

}

