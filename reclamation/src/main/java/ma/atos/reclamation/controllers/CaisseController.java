package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.CaisseDTO;
import ma.atos.reclamation.entites.Caisse;
import ma.atos.reclamation.services.CaisseService;
import ma.atos.reclamation.services.impl.CaisseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("caisse")
public class CaisseController {
    @Autowired
    private CaisseService caisseService;

    @GetMapping("/list")
    public List<CaisseDTO> list(){

        List<CaisseDTO> caisselist= null;
        try{
            caisselist= caisseService.list();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return caisselist;
    }
    @GetMapping("/get/{reference}")
    public  CaisseDTO getByreference(@PathVariable(name = "reference") String reference) {
        CaisseDTO caisse = null;
        try{
            caisse=caisseService.getByreference(reference);
        }
        catch (Exception e){
            e.printStackTrace();
        }


        return caisse;
    }
    @PostMapping("/add")
    public String ajouterCaisse (@RequestBody CaisseDTO caisseDTO){
        caisseService.ajouterCaisse(caisseDTO);
        return "Les données sont bien enregistrer";

    }


}
