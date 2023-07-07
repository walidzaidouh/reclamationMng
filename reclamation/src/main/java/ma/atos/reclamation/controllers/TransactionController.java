package ma.atos.reclamation.controllers;

import ma.atos.reclamation.dto.TransactionDTO;
import ma.atos.reclamation.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
    @RequestMapping("/transaction")
    public class TransactionController {

        @Autowired
        MessageSource messageSource;
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
            return messageSource.getMessage("transaction.update.msg.succes",new Object[]{transactionDTO.getReference()},Locale.FRENCH);
        }
        @PostMapping("/ajout")
        public String ajoutTransation(@RequestBody TransactionDTO transactionDTO){
            transactionService.ajoutTransaction(transactionDTO);
            return messageSource.getMessage( "transaction.add.msg.succes",new Object[]{transactionDTO.getReference()},Locale.FRENCH);
        }


}
