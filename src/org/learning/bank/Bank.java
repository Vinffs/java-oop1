package org.learning.bank;

import java.math.BigDecimal;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Your Bank!");

        System.out.print("Please give us your full name: ");
        String fullName = scan.nextLine();

        BankAccount user = new BankAccount(fullName);

        System.out.println("Dear " + user.getName() + ", your bank account has been created! Account number: IT" + user.getAccountNumber());
        System.out.println("Your balance is: €" + String.format("%.2f",user.getBalance()));


        boolean flag = false;

        while(!flag) {
            System.out.print("Would you like to make a deposit? (Y/N) ");
            String deposit = scan.nextLine().toUpperCase();
            if(deposit.equals("Y")) {
                System.out.print("How much would you like to deposit? ");
                BigDecimal depositValue = new BigDecimal(scan.nextLine().replaceAll(",", "."));

                System.out.println("Great! Your balance is now: € " + String.format("%.2f", user.deposit(depositValue)));
            }

            System.out.print("Would you like to make a withdraw? (Y/N) ");
            String withdraw = scan.nextLine().toUpperCase();
            if(withdraw.equals("Y")) {
                System.out.print("How much would you like to withdraw? ");
                BigDecimal withdrawValue = new BigDecimal(scan.nextLine().replaceAll(",", "."));

                System.out.println(user.withdraw(withdrawValue));
            }
            System.out.print("Would you like to exit the menu? (Y/N) ");
            String exit = scan.nextLine().toUpperCase();
            flag = exit.equals("Y");
        }

        System.out.println("Thank you!");


        scan.close();
    }
}
