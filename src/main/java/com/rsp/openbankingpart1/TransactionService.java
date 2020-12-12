package com.rsp.openbankingpart1;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class TransactionService {

    List<Transaction> transactionList;

    public TransactionService() {
        transactionList = new ArrayList<Transaction>();
        transactionList.add(new Transaction(1,111, Currency.getInstance(Locale.US),10,"Kohls","Kohls.jpeg"));
        transactionList.add(new Transaction(1,111, Currency.getInstance(Locale.US),20,"Kohls","Kohls.jpeg"));
        transactionList.add(new Transaction(1,111, Currency.getInstance(Locale.US),30,"Kohls","Kohls.jpeg"));
        transactionList.add(new Transaction(1,111, Currency.getInstance(Locale.US),40,"Kohls","Kohls.jpeg"));
        transactionList.add(new Transaction(1,111, Currency.getInstance(Locale.US),50,"Kohls","Kohls.jpeg"));
        transactionList.add(new Transaction(1,222, Currency.getInstance(Locale.US),50,"Kohls","Kohls.jpeg"));
        transactionList.add(new Transaction(1,222, Currency.getInstance(Locale.US),50,"Kohls","Kohls.jpeg"));

    }

    List<Transaction> findAllByAccountNumber(int accountNumber) {
        List<Transaction> result = transactionList.stream()
                .filter( transaction -> transaction.getAccountNumber()==accountNumber)
                .collect(Collectors.toList());
        return result;
    }
}
