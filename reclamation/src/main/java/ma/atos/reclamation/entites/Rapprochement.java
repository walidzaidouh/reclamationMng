package ma.atos.reclamation.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Rapprochement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String reference;
    @ManyToOne
    @JoinColumn(name = "caisse_id")
    private CaisseDTO caisseDTO;
    private LocalDateTime date;
    private boolean ecart;
    private BigDecimal montantEcart;

}
