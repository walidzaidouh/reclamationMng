package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.FactureDTO;
import ma.atos.reclamation.services.FactureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/factures")
public class FactureController {
    @Autowired
    private  FactureService factureService;

    @GetMapping("/get/{reference}")
    public FactureDTO getFactureByReference(@PathVariable("reference") String reference) {
        return factureService.getFactureByReference(reference);
    }

    @GetMapping("/list")
    public List<FactureDTO> getAllFactures() {
        return factureService.list();
    }

    /*
    @PostMapping("/add")
    public String createFacture(@RequestBody FactureDTO factureDTO) {
         factureService.createFacture(factureDTO);
        return "Done !";
    }
    *
     */

/*    @PutMapping("/{id}")
    public Facture updateFacture(@PathVariable("id") Long id, @RequestBody Facture facture) {
        return factureService.updateFacture(id, facture);
    }

    @DeleteMapping("/{id}")
    public void deleteFacture(@PathVariable("id") Long id) {
        factureService.deleteFacture(id);
    }*/

    /*
    @PostMapping("/{reference}/payer")
    public void payerFacture(@PathVariable("reference") String reference) {
        factureService.payerFacture(reference);
    }

*
     */
}
