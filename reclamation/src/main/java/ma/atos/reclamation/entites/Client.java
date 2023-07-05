package ma.atos.reclamation.entites;

import javax.persistence.*;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String reference;
    private String adresse;

    @OneToMany(mappedBy = "client")
    private List<B2B> b2bClients;

    @OneToMany(mappedBy = "client")
    private List<B2C> b2CList;
    @OneToMany(mappedBy = "client")
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
