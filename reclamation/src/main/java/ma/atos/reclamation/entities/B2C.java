package ma.atos.reclamation.entities;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@DiscriminatorValue("B2C")
public class B2C extends Client {

    private String cin;
    private String nomComplet;

}