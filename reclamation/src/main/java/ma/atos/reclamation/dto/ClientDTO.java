package ma.atos.reclamation.dto;

import java.util.List;

public class ClientDTO {

    private String reference;
    private String adresse;
    private List<FactureDTO> factureDTOList;

    public ClientDTO(String reference, String adresse, List<FactureDTO> factureDTOList) {
        this.reference = reference;
        this.adresse = adresse;
        this.factureDTOList = factureDTOList;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<FactureDTO> getFactureList() {
        return factureDTOList;
    }

    public void setFactureList(List<FactureDTO> factureDTOList) {
        this.factureDTOList = factureDTOList;
    }
}
