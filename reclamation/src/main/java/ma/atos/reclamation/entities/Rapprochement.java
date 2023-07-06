package ma.atos.reclamation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import ma.atos.reclamation.dto.Caisse;
import ma.atos.reclamation.dto.Transaction;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
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
