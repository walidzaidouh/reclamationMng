package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.RapprochementDTO;
import ma.atos.reclamation.services.RapprochementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/rapprochement")
public class RapprochementController {

   @Autowired
    private RapprochementService rapprochementService;
    @GetMapping("/list")
    public List<RapprochementDTO> list(){

        List<RapprochementDTO> rapprochementList = null;
        try{
            rapprochementList = rapprochementService.listRapprochement();
        }catch (Exception e){
            e.printStackTrace();
        }
        return rapprochementList;
    }

    @GetMapping("/calculEcart")
    public BigDecimal calculEcart(String reference){
            return rapprochementService.calculEcart(reference);
    }
}
