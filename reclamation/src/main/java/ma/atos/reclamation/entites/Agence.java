package ma.atos.reclamation.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String code;
    private String nom;
    private String localisation;

    @ManyToOne
    @JoinColumn(name = "distributeur_id")
    private Distributeur distributeur;

}
