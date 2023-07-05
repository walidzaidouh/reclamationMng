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
@DiscriminatorValue("B2B")
public class B2B extends Client {

    private String registreCommerce;
    private String patente;
    private String fax;
    private String raisonSocial;
}
