package ma.atos.reclamation.controllers;


import ma.atos.reclamation.dto.DistributeurDTO;
import ma.atos.reclamation.services.DistributeurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class DistributeurController {

    @Autowired
    private DistributeurService distributeurService;

    @GetMapping("/distributeur")
    public List<DistributeurDTO> listdistributeur(){
        return distributeurService.list();

    }


}
