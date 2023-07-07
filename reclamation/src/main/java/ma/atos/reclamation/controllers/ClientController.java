package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.ClientDTO;
import ma.atos.reclamation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("/list")
    public List<ClientDTO> clientDTOList() {

        List<ClientDTO> clientList = null;

        try {
            clientList = clientService.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return clientList;
    }

    @GetMapping("/get/{code}")
    public ClientDTO client(String reference) {

        ClientDTO client = null;

        try {
            client = clientService.getClientByReference(reference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }
}
