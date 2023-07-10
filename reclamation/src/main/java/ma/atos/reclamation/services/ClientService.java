package ma.atos.reclamation.services;


import ma.atos.reclamation.dto.ClientDTO;

import java.util.List;

public interface ClientService {

    List<ClientDTO> list();

    ClientDTO getClientByReference(String reference);

    void createClient(ClientDTO clientDTO);
}
