package ma.atos.reclamation.controllers;

import lombok.extern.slf4j.Slf4j;
import ma.atos.reclamation.dto.RapprochementDTO;
import ma.atos.reclamation.services.RapprochementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/rapprochement")
@Slf4j
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
    @GetMapping("/getDate")
    public ResponseEntity<?> getRapprochementByDate(@RequestParam(name = "date") String date) {

        RapprochementDTO rapprochement = null;
        LocalDate localDate = LocalDate.parse(date);
        log.info("date  " + localDate);
        try {
            rapprochement = rapprochementService.getRapprochementByDate(localDate);
            log.info("rapprochement " + rapprochement);
        } catch (Exception e) {
            //ResponseEntity.status(HttpStatus.BAD_REQUEST).body(rapprochement);
            log.error("Error " + e.getMessage());
        }
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(rapprochement);
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
