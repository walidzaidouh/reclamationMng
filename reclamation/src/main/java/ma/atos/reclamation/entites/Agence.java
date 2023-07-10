package ma.atos.reclamation.entites;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Agence {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String code;
    private String nom;
    private String localisation;

    @OneToMany(mappedBy = "agence")
    private List<Client> clientList;

    @ManyToOne
    @JoinColumn(name = "distributeur_id")
    private Distributeur distributeur;

}
