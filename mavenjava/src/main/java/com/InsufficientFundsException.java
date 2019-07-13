package com;

public class InsufficientFundsException extends Exception {
    private double amount;//表示取钱时所差的额度

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
    }
}
