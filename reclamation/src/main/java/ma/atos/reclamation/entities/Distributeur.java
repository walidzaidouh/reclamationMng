package ma.atos.reclamation.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Distributeur {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String refernce;
    private String nom;

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
