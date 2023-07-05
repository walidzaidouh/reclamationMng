package ma.atos.reclamation.entites;

import ma.atos.reclamation.dto.Client;
import ma.atos.reclamation.dto.Facture;

import java.util.List;

public class B2C extends Client {

    private Client client;
    private String cin;
    private String nomComplet;

    public B2C(String reference, String adresse, List<Facture> factureList, String cin, String nomComplet) {
        super(reference, adresse, factureList);
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
