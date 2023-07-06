package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.services.AgenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Agence controller
 */
@RestController
@RequestMapping("/agence")
public class AgenceController {

    @Autowired
    private AgenceService agenceService;


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

    @GetMapping("/get/{code}")
    public AgenceDTO getAgenceByCode(String code) {

        AgenceDTO agence = null;

        try {
            agence = agenceService.getAgenceByCode(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return agence;
    }

    @PostMapping("/add")
    public String addAgence(AgenceDTO agenceDTO){
        agenceService.createAgence(agenceDTO);
        return "Done !  ";
    }
}
