package ma.atos.reclamation.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AgenceDTO {

    private String code;
    private String nom;
    private String localisation;
    private DistributeurDTO distributeurDTO;

    public AgenceDTO(String code, String nom, String localisation, DistributeurDTO distributeurDTO) {
        this.code = code;
        this.nom = nom;
        this.localisation = localisation;
        this.distributeurDTO = distributeurDTO;
    }
}
