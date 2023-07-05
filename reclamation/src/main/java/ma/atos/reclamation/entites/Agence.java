package ma.atos.reclamation.entites;

import javax.persistence.*;

@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @OneToOne
    private Caisse caisse;
    public Agence(Caisse caisse) {
        this.caisse = caisse;
    }
    public Caisse getCaisse() {
        return caisse;
    }
    public void setCaisse(Caisse caisse) {
        this.caisse = caisse;
    }
}
