package ma.atos.reclamation.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AgenceDTO {

    private String code;
    private String nom;
    private String localisation;
    private DistributeurDTO distributeurDTO;
}
