package com;

public class CheckingAccount {
    private double balance;//余额
    private int number;//卡号

    public CheckingAccount(int number) {
        //创建卡号
        this.number = number;
    }

    //存钱
    public void deposit(double amount) {
        this.balance += amount;
    }

    //取钱
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= this.balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    //获取余额
    public double getBalance() {
        return this.balance;
    }

    //获取卡号
    public int getNumber() {
        return this.number;
    }
}
