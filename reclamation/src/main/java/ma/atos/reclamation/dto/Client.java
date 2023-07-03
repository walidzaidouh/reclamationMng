package ma.atos.reclamation.dto;

public class Client {

    private String reference;
    private String adresse;

    public String getReference() {
        return reference;
    }

    public Client(String reference, String adresse) {
        this.reference = reference;
        this.adresse = adresse;
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
}
