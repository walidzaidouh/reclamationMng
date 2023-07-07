package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.RapprochementDTO;
import ma.atos.reclamation.services.RapprochementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/get/{reference}")
    public ResponseEntity<?> getRapprochementByReference(@PathVariable String reference) {

        RapprochementDTO rapprochement = null;
        try {
            rapprochement = rapprochementService.getRapprochementByReference(reference);
        } catch (Exception e) {
            //ResponseEntity.status(HttpStatus.BAD_REQUEST).body(rapprochement);
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(rapprochement);
    }
    @GetMapping("/calculEcart")
    public BigDecimal calculEcart(String reference){
            return rapprochementService.calculEcart(reference);
    }
}
