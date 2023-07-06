package ma.atos.reclamation.services;

import java.math.BigDecimal;

public interface CaisseService {
    public CaisseService findByRef (String reference, String etat, String devise, BigDecimal montant);

}
