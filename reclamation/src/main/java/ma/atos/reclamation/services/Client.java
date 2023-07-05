package ma.atos.reclamation.services;

import java.util.List;
import java.util.Optional;

public interface Client {

    public List<Client> getAllClientList();

    public Optional<Client> getClient(String reference);

    public void addClient(Client client);

    public void updateClient(String reference, Client client);

    public void deleteClient(String reference);

    public List<Facture> getFacturesByClient(String reference);


}
