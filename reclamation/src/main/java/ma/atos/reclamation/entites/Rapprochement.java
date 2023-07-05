package ma.atos.reclamation.entites;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Rapprochement {
    @ManyToOne
    @JoinColumn(name="caisse_id")
        private Caisse caisse;
}
