package org.learning.bank;

import java.math.BigDecimal;
import java.util.Random;

public class BankAccount {

    // ATTRIBUTES

    private String accountNumber;

    private String holderName;

    private BigDecimal balance;


    // CONSTRUCTORS

    public BankAccount(String holderName) {

        Random randomGen = new Random();
        int randomNum = randomGen.nextInt(1001);

        this.accountNumber = String.format("%025d", randomNum);
        this.holderName = holderName;
        this.balance = BigDecimal.valueOf(0);

    }

    // METHODS

    public String getName() {
        return this.holderName;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public BigDecimal deposit(BigDecimal value) {
        this.balance = this.balance.add(value);
        return this.balance;
    }

    public String withdraw(BigDecimal value) {
        this.balance = this.balance.subtract(value);

        if(this.balance.compareTo(BigDecimal.ZERO) < 0) {
            return "You can't withdraw this amount.";
        } else {
            return "Your withdraw has been processed with success! Your new balance is: € " + String.format("%.2f", this.balance);
        }
    }
}
