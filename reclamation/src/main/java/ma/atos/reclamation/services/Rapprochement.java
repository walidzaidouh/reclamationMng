package ma.atos.reclamation.services;

import java.math.BigDecimal;

public interface Rapprochement {
    BigDecimal calculEcart(String refCaisse);
    Rapprochement getRapprochement(String reference);
}
