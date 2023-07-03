package ma.atos.reclamation.dto;

public class Agence {
    private String nom;
    private String localisation;
    private String code;
    private  Distributeur distributeur;

    public Agence(String nom, String localisation, String code, Distributeur distributeur) {
        this.nom = nom;
        this.localisation = localisation;
        this.code = code;
        this.distributeur = distributeur;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}
