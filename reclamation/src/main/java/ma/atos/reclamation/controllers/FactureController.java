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
    FactureService factureService;

    @GetMapping("/list")
    public List<FactureDTO> factureDTOList() {

        List<FactureDTO> factureList = null;

        try {
            factureList = factureService.list();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return factureList;
    }

    @GetMapping("/get/{reference}")
    public FactureDTO facture(String reference) {

        FactureDTO facture = null;

        try {
            facture = factureService.getFactureByReference(reference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return facture;

    }
    @PostMapping("/add")
    public String addFacture(@RequestBody FactureDTO factureDTO){
        factureService.createFacture(factureDTO);
        return "Facture bien ajoutée! ";
    }

    @PostMapping("/{reference}/payer")
    public String payerFacture(@PathVariable("reference") String reference) {
        factureService.payerFacture(reference);
        return "Facture bien payée";
    }
}
