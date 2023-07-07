package ma.atos.reclamation.services.impl;

import ma.atos.reclamation.dto.TransactionDTO;
import ma.atos.reclamation.repositories.TransactionRepository;
import ma.atos.reclamation.services.TransactionService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }

    @Override
    public List<TransactionDTO> transactionList() {
        List<Transaction> transactionList = transactionRepository.findAll();

        List<TransactionDTO> transactionDTOList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(transactionList)) {
            transactionList.stream().forEach(transaction -> {
                TransactionDTO transactionDTO = new TransactionDTO();
                BeanUtils.copyProperties(transaction,transactionDTO);
                transactionDTOList.add(transactionDTO);
            });
        }
        return transactionDTOList;
    }



    @Override
    public TransactionDTO getTransactionByReference(String Reference) {
       TransactionDTO transactionDTO = new TransactionDTO();
        Transaction transaction= new Transaction();
         transaction= transactionRepository.findTransactionByReference(Reference);
       BeanUtils.copyProperties(transaction, transactionDTO);
       return transactionDTO   ;
    }

    @Override
    public Boolean isRapprochement() {
        return null;
    }

    @Override
    public void updateTransaction(TransactionDTO transactionDTO) throws Exception{
        if (transactionDTO != null ){

            if(transactionDTO.getReference()!=null){
                Transaction transaction = transactionRepository.findTransactionByReference(transactionDTO.getReference());
                if (transaction==null){
                    System.out.println("Transaction non trouvé");
                    throw new Exception("Error");
                }
                BeanUtils.copyProperties(transactionDTO, transaction);
                transactionRepository.save(transaction);
            }
        }
    }
    @Override
    public void ajoutTransaction (TransactionDTO transactionDTO){

        Transaction transaction = new Transaction();
        BeanUtils.copyProperties(transactionDTO, transaction);
        transactionRepository.save(transaction);
    }


}

