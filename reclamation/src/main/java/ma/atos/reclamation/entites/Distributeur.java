package ma.atos.reclamation.entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Distributeur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String reference;
    private String nom;

    @OneToMany(mappedBy = "distributeur")
    private List<Agence> agences;
}
