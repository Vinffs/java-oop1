package org.learning.bank;

import java.math.BigDecimal;
import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Your Bank!");

        System.out.print("Please give us your full name: ");
        String fullName = scan.nextLine();

        BankAccount user = new BankAccount(fullName);

        System.out.println("Dear " + user.getName() + ", your bank account has been created! Account number: IT" + user.getAccountNumber());
        System.out.println("Your balance is: €" + user.getBalance());


        boolean flag = false;

        while(!flag) {
            System.out.println("Would you like to make a deposit? (Y/N) ");
            String deposit = scan.nextLine().toUpperCase();
            if(deposit.equals("Y")) {
                System.out.print("How much would you like to deposit? ");
                BigDecimal depositValue = new BigDecimal(scan.nextLine());

                System.out.println("Great! Your balance is now: € " + user.deposit(depositValue));
            }

            System.out.println("Would you like to make a withdraw? (Y/N) ");
            String withdraw = scan.nextLine().toUpperCase();
            if(withdraw.equals("Y")) {
                System.out.print("How much would you like to withdraw?");
                double withdrawValue = Integer.parseInt(scan.nextLine());
            }
            System.out.println("Would you like to exit the menu? (Y/N) ");
            String exit = scan.nextLine().toUpperCase();
            flag = exit.equals("Y");
        }


        scan.close();
    }
}
