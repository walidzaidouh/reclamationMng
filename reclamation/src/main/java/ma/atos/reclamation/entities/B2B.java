package ma.atos.reclamation.entities;

import lombok.*;

import javax.persistence.*;

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
