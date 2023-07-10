package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.ClientDTO;
import ma.atos.reclamation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@Controller
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService clientService;

    @Autowired
    MessageSource messageSource;

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
    public ClientDTO client(@PathVariable String reference) {

        ClientDTO client = null;

        try {
            client = clientService.getClientByReference(reference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }

    @PostMapping("/add")
    public String addClient(@RequestBody ClientDTO clientDTO){
        clientService.createClient(clientDTO);
        return messageSource.getMessage("client.add.msg.succes", new Object[] {clientDTO.getReference()}, Locale.FRENCH);
    }
}
