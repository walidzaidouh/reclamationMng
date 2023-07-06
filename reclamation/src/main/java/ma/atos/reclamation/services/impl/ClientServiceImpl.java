package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.entites.Client;
import ma.atos.reclamation.repositories.ClientRepository;
import ma.atos.reclamation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    @Override
    public Optional<Client> getClientByReference(String reference) {
        return clientRepository.getClientByReference(reference);
    }

    @Override
    public void addClient(Client client) {
        clientRepository.save(client);
    }

    @Override
    public void updateClient(Long id, Client client) {
        if(clientRepository.findById(id).get() != null){
            clientRepository.save(client);
        }
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
