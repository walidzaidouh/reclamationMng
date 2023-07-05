package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.repositories.AgenceRepo;
import ma.atos.reclamation.services.Agence;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class AgenceImpl implements Agence {


    @Override
    public List<Agence> getAllAgenceList() {
        return null;
    }

    @Override
    public Optional<Agence> getAgence(String code) {
        return Optional.empty();
    }

    @Override
    public void addAgence(Agence agence) {

    }

    @Override
    public void updateAgence(String code, Agence agence) {

    }

    @Override
    public void deleteAgence(String code) {

    }

}
