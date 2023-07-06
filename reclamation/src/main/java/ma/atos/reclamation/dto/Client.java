package ma.atos.reclamation.dto;

import java.util.List;

public class Client {

    private String reference;
    private String adresse;
    private List<Facture> factureList;

    public Client(String reference, String adresse, List<Facture> factureList) {
        this.reference = reference;
        this.adresse = adresse;
        this.factureList = factureList;
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

    public List<Facture> getFactureList() {
        return factureList;
    }

    public void setFactureList(List<Facture> factureList) {
        this.factureList = factureList;
    }
}
