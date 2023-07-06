package ma.atos.reclamation.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ma.atos.reclamation.dto.CaisseDTO;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Rapprochement {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String reference;

    @ManyToOne
    @JoinColumn(name = "caisse_id")
    private Caisse caisse;
    private LocalDateTime date;
    private boolean ecart;
    private BigDecimal montantEcart;

}
