package ma.atos.reclamation.entites;

import lombok.*;
import ma.atos.reclamation.entites.Client;
import ma.atos.reclamation.dto.Facture;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@Entity
@DiscriminatorValue("B2C")
public class B2C extends Client {

    private String cin;
    private String nomComplet;

}
