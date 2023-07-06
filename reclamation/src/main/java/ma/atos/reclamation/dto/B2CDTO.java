package ma.atos.reclamation.dto;

import java.util.List;

public class B2CDTO extends ClientDTO {

    private String cin;
    private String nomComplet;

    public B2CDTO(String reference, String adresse, List<FactureDTO> factureDTOList, String cin, String nomComplet) {
        super(reference, adresse, factureDTOList);
        this.cin = cin;
        this.nomComplet = nomComplet;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public void setNomComplet(String nomComplet) {
        this.nomComplet = nomComplet;
    }
}
