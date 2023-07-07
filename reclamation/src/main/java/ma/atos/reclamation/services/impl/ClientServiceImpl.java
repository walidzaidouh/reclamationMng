package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.ClientDTO;
import ma.atos.reclamation.entites.Agence;
import ma.atos.reclamation.entites.B2B;
import ma.atos.reclamation.entites.B2C;
import ma.atos.reclamation.entites.Client;
import ma.atos.reclamation.enums.TypeClient;
import ma.atos.reclamation.repositories.ClientRepository;
import ma.atos.reclamation.services.ClientService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Override
    public List<ClientDTO> list() {

        List<Client> agenceList =  clientRepository.findAll();

        List<ClientDTO> clientDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(clientDTOList)) {
            agenceList.stream().forEach(client -> {
                ClientDTO clientDTO = new ClientDTO();
                BeanUtils.copyProperties(client, clientDTO);
                clientDTOList.add(clientDTO);
            });
        }

        return clientDTOList;
    }

    @Override
    public ClientDTO getClientByReference(String reference) {

        ClientDTO clientDTO = new ClientDTO();
        Client client = clientRepository.getClientByReference(reference);

        BeanUtils.copyProperties(client, clientDTO);

        return clientDTO;
    }

    public void add(ClientDTO clientDTO) {

        if (clientDTO.getType().equals(TypeClient.B2B)) {
            B2B b2b = new B2B();

        }else {
            B2C b2C = new B2C();

        }

    }
}
