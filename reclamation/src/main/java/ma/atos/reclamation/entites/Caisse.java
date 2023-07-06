package ma.atos.reclamation.entites;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
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

    @OneToMany(mappedBy = "Caisse")
    private List<Rapprochement> rapprochement;
}