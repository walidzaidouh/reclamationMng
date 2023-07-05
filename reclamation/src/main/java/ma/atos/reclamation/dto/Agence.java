package ma.atos.reclamation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Agence {

    private String code;
    private String nom;
    private String localisation;
    private Distributeur distributeur;

    public Agence(String code, String nom, String localisation, Distributeur distributeur) {
        this.code = code;
        this.nom = nom;
        this.localisation = localisation;
        this.distributeur = distributeur;
    }
}
