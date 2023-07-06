package ma.atos.reclamation.services;

import javafx.util.converter.BigDecimalStringConverter;

import java.math.BigDecimal;

public interface Caisse {
    public Caisse findByreference (String reference, String etat, String devise, BigDecimal montant);

}
