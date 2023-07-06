package ma.atos.reclamation.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface Agence {
    public List<Agence> getAllAgenceList();

    public Optional<Agence> getAgence(String code);

    public void addAgence(Agence agence);

    public void updateAgence(String code, Agence agence);

    public void deleteAgence(String code);

}
