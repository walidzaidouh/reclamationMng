package ma.atos.reclamation.dto;

import java.util.List;

public class B2BDTO extends ClientDTO {

    private String registreCommerce;
    private String patente;
    private String fax;
    private String raisonSocial;

    public B2BDTO(String reference, String adresse, List<FactureDTO> factureDTOList, String registreCommerce, String patente, String fax, String raisonSocial) {
        super(reference, adresse, factureDTOList);
        this.registreCommerce = registreCommerce;
        this.patente = patente;
        this.fax = fax;
        this.raisonSocial = raisonSocial;
    }

    public String getRegistreCommerce() {
        return registreCommerce;
    }

    public void setRegistreCommerce(String registreCommerce) {
        this.registreCommerce = registreCommerce;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }
}
