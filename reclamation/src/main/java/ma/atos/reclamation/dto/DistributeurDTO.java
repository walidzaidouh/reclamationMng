package ma.atos.reclamation.dto;

public class DistributeurDTO {

    private String refernce;
    private String nom;

    public DistributeurDTO(String refernce, String nom) {
        this.refernce = refernce;
        this.nom = nom;
    }

    public String getRefernce() {
        return refernce;
    }

    public void setRefernce(String refernce) {
        this.refernce = refernce;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
