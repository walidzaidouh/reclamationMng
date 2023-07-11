package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.ClientDTO;
import ma.atos.reclamation.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<ClientDTO>> clientDTOList() {

        List<ClientDTO> clientList = null;

        try {
            clientList = clientService.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ResponseEntity.ok().body(clientList);
    }

    @GetMapping("/get/{reference}")
    public ResponseEntity<ClientDTO> client(@PathVariable String reference) {

        ClientDTO client = null;

        try {
            client = clientService.getClientByReference(reference);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().body(client);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addClient(@RequestBody ClientDTO clientDTO) {
        clientService.createClient(clientDTO);
        return ResponseEntity.ok().body(messageSource.getMessage("client.add.msg.succes", new Object[]{clientDTO.getReference()}, Locale.FRENCH));

    }

    @GetMapping("/getClientByAgence/{code}")
    public ResponseEntity<?> getClientByAgence(@PathVariable String codeAgence) {

        List<ClientDTO> client = null;

        try {
            client = clientService.getClientByAgence(codeAgence);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().body(client);
    }
}
