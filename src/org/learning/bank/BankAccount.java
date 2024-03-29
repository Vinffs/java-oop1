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

    /*
    1 metodo per versare la somma di denaro sul conto
    1 metodo per prelevare una somma di denato ( il BALANCE non può essere negativo )
    metodi per ritornare le informazioni del conto e il saldo

     */

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
        return this.balance.add(value);
    }
}
