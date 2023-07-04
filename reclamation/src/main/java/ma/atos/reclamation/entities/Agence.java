package ma.atos.reclamation.entities;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

public class Agence {

    @OneToMany(mappedBy= "agence", cascade= CascadeType.ALL)
    List<Caisse> caisseList;
}
