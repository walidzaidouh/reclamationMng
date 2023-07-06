package ma.atos.reclamation.services;

import ma.atos.reclamation.entites.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {

    public List<Client> getAllClients();

    public Optional<Client> getClientByReference(String reference);

    public void addClient(Client client);

    public void updateClient(Long id, Client client);

    public void deleteClient(Long id);

}
