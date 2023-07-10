package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.AgenceDTO;
import ma.atos.reclamation.dto.RapprochementDTO;
import ma.atos.reclamation.dto.TransactionDTO;
import ma.atos.reclamation.services.RapprochementService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

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

    @GetMapping("/getReference/{reference}")
    public ResponseEntity<?> getRapprochementByReference(@PathVariable String reference) {

        RapprochementDTO rapprochement = new RapprochementDTO();
        try {
            rapprochement = rapprochementService.getRapprochementByReference(reference);
        } catch (Exception e) {
            rapprochement.setCode("001");
            rapprochement.setMessage(e.getMessage());
            ResponseEntity.status(HttpStatus.BAD_REQUEST).body(rapprochement);
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(rapprochement);
    }

    @GetMapping("/getDate/{date}")
    public ResponseEntity<?> getRapprochementByDate(@PathVariable LocalDateTime date) {
        System.out.println("testOk112");
        RapprochementDTO rapprochement2 = null;
        try {
            System.out.println("testOk113");
            rapprochement2 = rapprochementService.getRapprochementByDate(date);
            System.out.println("testOk114");
        } catch (Exception e) {
            //ResponseEntity.status(HttpStatus.BAD_REQUEST).body(rapprochement);
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(rapprochement2);
    }

    @PostMapping("/ajout")
    public String ajoutRapprochement(@RequestBody RapprochementDTO rapprochementDTO){
        rapprochementService.ajoutRapprochement(rapprochementDTO);
        return "test OK";
    }

    @GetMapping("/calculEcart")
    public BigDecimal calculEcart(String reference){
            return rapprochementService.calculEcart(reference);
    }
}
