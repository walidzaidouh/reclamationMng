package ma.atos.reclamation.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
public class Distributeur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String refernce;
    private String nom;

    @OneToMany(mappedBy = "distributeur")
    private List<Agence> agences;
}