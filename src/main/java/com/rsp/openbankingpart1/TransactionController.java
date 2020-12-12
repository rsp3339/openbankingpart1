package com.rsp.openbankingpart1;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import lombok.SneakyThrows;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {

    @GetMapping("/transactions")
    @SneakyThrows
    public String getTransactions(@RequestParam(name="accountNumber") int accountNumber) {
            TransactionService transactionService = new TransactionService();
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            return(mapper.writeValueAsString(transactionService.findAllByAccountNumber(accountNumber)));
        }
}