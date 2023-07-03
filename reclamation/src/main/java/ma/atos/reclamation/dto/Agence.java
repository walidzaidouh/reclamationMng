package ma.atos.reclamation.dto;

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

    public Distributeur getDistributeur() {
        return distributeur;
    }

    public void setDistributeur(Distributeur distributeur) {
        this.distributeur = distributeur;
    }
}
