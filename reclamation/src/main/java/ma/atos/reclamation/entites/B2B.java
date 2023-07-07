package ma.atos.reclamation.entites;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("B2B")
public class B2B extends Client {

    private String registreCommerce;
    private String patente;
    private String fax;
    private String raisonSocial;
}
