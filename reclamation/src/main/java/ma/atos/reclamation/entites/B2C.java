package ma.atos.reclamation.entites;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@DiscriminatorValue("B2C")
public class B2C extends Client {

    private String cin;
    private String nomComplet;

}
