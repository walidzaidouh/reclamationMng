package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.services.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

/**
 * Agence controller
 */
@RestController
@RequestMapping("/agence")
public class AgenceController {

    @Autowired
    private AgenceService agenceService;

    @Autowired
    private MessageSource messageSource;


    /**
     * End point / Ressource
     */
    @GetMapping("/list")
    public List<AgenceDTO> list() {

        List<AgenceDTO> agenceList = null;

        try {
            agenceList = agenceService.list();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return agenceList;
    }

    @GetMapping("/get")
    public AgenceDTO getAgenceByCode(@RequestParam(name = "code") String code) {

        AgenceDTO agence = null;
        try {
            agence = agenceService.getAgenceByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agence;
    }

    @GetMapping("/getByCode/{code}")
    public ResponseEntity<AgenceDTO> getAgenceByCodeRestTemplate(@PathVariable String code) {
        AgenceDTO agence = agenceService.getAgenceByCodeRestTemplate(code);
        if (agence != null) {
            return new ResponseEntity<>(agence, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/add")
    public String addAgence(@RequestBody AgenceDTO agenceDTO){
        agenceService.createAgence(agenceDTO);
        return messageSource.getMessage("agence.add.msg.succes",new Object[] {agenceDTO.getCode()}, Locale.FRENCH);
    }
}
