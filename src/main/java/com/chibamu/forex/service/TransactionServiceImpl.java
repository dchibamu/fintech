package com.chibamu.forex.service;

public class TransactionServiceImpl implements TransactionService {

    @Override
    public Transaction getTransactionDetails() {
        return new Transaction(1L, TransactionType.ABNORMAL);
    }

    public static TransactionService newInstance(){
        return new TransactionServiceImpl();
    }
}
