package ma.atos.reclamation.entites;

import javax.persistence.*;
import java.util.List;

@Entity
public class Distributeur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String refernce;
    private String nom;

    @OneToMany(mappedBy = "distributeur")
    private List<Agence> agences;

    public Distributeur(String refernce, String nom) {
        this.refernce = refernce;
        this.nom = nom;
    }

    public String getRefernce() {
        return refernce;
    }

    public void setRefernce(String refernce) {
        this.refernce = refernce;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
