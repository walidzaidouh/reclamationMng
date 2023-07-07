package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.TransactionDTO;
import ma.atos.reclamation.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    @RequestMapping("/transaction")
    public class TransactionController {

        @Autowired
        private TransactionService transactionService;

        @GetMapping("/list")
        public List<TransactionDTO> list(){
            List<TransactionDTO> transactionDTOList = null;

            try {
                transactionDTOList = transactionService.transactionList();
            } catch (Exception e){
                e.printStackTrace();
            }
            return transactionDTOList;
        }
        @GetMapping("/get/{reference}")
        public TransactionDTO getTransactionByReference(@PathVariable  String reference){

           TransactionDTO transactionDTO = null;

            try{
                transactionDTO = (TransactionDTO) transactionService.getTransactionByReference(reference);
            }catch (Exception e){
                e.printStackTrace();
            }
            return transactionDTO;
        }
        @PostMapping("/update")
        public String updateTransaction(@RequestBody TransactionDTO transactionDTO) throws Exception {
            transactionService.updateTransaction(transactionDTO);
            return "done !";
        }
        @PostMapping("/ajout")
        public String ajoutTransation(@RequestBody TransactionDTO transactionDTO){
            transactionService.ajoutTransaction(transactionDTO);
            return "done !";
        }


}
