package ma.atos.reclamation.services;

import javafx.util.converter.BigDecimalStringConverter;

import java.math.BigDecimal;

public interface Caisse {
    public Caisse findByRef (String reference, String etat, String devise, BigDecimal montant);

}
