package ma.atos.reclamation.enums;

public enum TypePaiement {
    ESPECE ("E"),
    CHEQUE("C");
    private String type;
    private TypePaiement (String type){
        this.type= type;
    }
}
