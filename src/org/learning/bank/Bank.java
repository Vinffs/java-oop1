package org.learning.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Your Bank!");
        System.out.println("Would you like to create a new bank account? (Y/N)");
        String response = scan.nextLine().toUpperCase();

        if(response.equals("Y")) {
            System.out.println("Very Well! Let's get started!");
            System.out.println("Give us your full name: ");
            String fullName = scan.nextLine();

            Random randomGen = new Random();
            int randomNum = randomGen.nextInt(1001);
            String accountNumber = String.format("%025d", randomNum);

            System.out.println("Dear " + fullName + ", your bank account has been created! Account number: IT" + accountNumber);

        }

        scan.close();
    }
}
