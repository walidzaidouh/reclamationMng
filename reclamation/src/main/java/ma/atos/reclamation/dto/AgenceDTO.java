package ma.atos.reclamation.dto;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


public class AgenceDTO {

    private String code;
    private String nom;
    private String localisation;
    private DistributeurDTO distributeurDTO;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public DistributeurDTO getDistributeurDTO() {
        return distributeurDTO;
    }

    public void setDistributeurDTO(DistributeurDTO distributeurDTO) {
        this.distributeurDTO = distributeurDTO;
    }
}
