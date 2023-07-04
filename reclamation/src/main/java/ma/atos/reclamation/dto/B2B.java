package ma.atos.reclamation.dto;

import java.util.List;

public class B2B extends Client{

    private String registreCommerce;
    private String patente;
    private String fax;
    private String raisonSocial;

    public B2B(String reference, String adresse, List<Facture> factureList, String registreCommerce, String patente, String fax, String raisonSocial) {
        super(reference, adresse, factureList);
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
