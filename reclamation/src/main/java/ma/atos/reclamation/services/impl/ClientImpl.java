package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.services.Client;
import ma.atos.reclamation.services.Facture;

import java.util.List;
import java.util.Optional;

public class ClientImpl implements Client {
    @Override
    public List<Client> getAllClientList() {
        return null;
    }

    @Override
    public Optional<Client> getClient(String reference) {
        return Optional.empty();
    }

    @Override
    public void addClient(Client client) {

    }

    @Override
    public void updateClient(String reference, Client client) {

    }

    @Override
    public void deleteClient(String reference) {

    }

    @Override
    public List<Facture> getFacturesByClient(String reference) {
        return null;
    }
}
