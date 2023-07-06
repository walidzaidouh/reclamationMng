package ma.atos.reclamation.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AgenceDTO {

    private String code;
    private String nom;
    private String localisation;
    private Distributeur distributeur;

    public AgenceDTO(String code, String nom, String localisation, Distributeur distributeur) {
        this.code = code;
        this.nom = nom;
        this.localisation = localisation;
        this.distributeur = distributeur;
    }
}
