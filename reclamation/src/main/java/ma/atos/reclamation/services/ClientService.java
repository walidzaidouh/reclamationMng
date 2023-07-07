package ma.atos.reclamation.services;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.ClientDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ClientService {

    public List<ClientDTO> list();

    public ClientDTO getClientByReference(String reference);

    void createClient(ClientDTO clientDTO);
}
