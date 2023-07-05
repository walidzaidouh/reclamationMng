package ma.atos.reclamation.entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "SEGMENT", discriminatorType = DiscriminatorType.STRING)
@NoArgsConstructor
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String reference;
    private String adresse;
    @OneToMany(mappedBy = "client")
    private List<Facture> factureList;

    @Column(updatable = false, insertable = false)
    private String segment;

}
