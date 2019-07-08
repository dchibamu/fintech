package com.chibamu.forex.service;

public class Transaction
{
    private Long transactionId;
    private TransactionType type;

    public Transaction(Long transactionId, TransactionType type) {
        this.transactionId = transactionId;
        this.type = type;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId=" + transactionId +
                ", type=" + type +
                '}';
    }
}
