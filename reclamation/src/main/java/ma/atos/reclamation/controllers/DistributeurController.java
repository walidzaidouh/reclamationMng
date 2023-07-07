package ma.atos.reclamation.controllers;


import ma.atos.reclamation.dto.DistributeurDTO;
import ma.atos.reclamation.services.DistributeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/distributeur")
public class DistributeurController {

    @Autowired
    private DistributeurService distributeurService;

    @GetMapping("/list")
    public List<DistributeurDTO> listdistributeur(){
        return distributeurService.list();
    }

    @PostMapping("/add")
    public String ajouterDistributeur (@RequestBody DistributeurDTO distributeurDTO){
        distributeurService.createDistributeur(distributeurDTO);
        return "done ";
    }

    @GetMapping("/get/{reference}")
    public DistributeurDTO getDistributeurByReference(@PathVariable String reference){
        DistributeurDTO distributeur = distributeurService.findByReference(reference);

        return distributeur;
    }

}
