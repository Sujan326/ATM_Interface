package com.project;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("WELCOME TO SUJAN BANK");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Pin: ");
        int inputPin;
        int counter = 0;
        char choose;

        for(int attempts = 3; attempts > 0; attempts--) {
            inputPin = sc.nextInt();

            if(inputPin == BankServer.getPin()) {

                do {
                    System.out.println();
                    System.out.println("The Services provided are: ");
                    System.out.println("1. Check Balance");
                    System.out.println("2. Deposit Amount");
                    System.out.println("3. Withdraw Amount");
                    System.out.print("Choose the service: ");
                    int option = sc.nextInt();

                    switch (option) {
                        case 1:
                            System.out.println("Checking Balance");
                            BankUtil.checkBalance();
                            break;

                        case 2:
                            System.out.println("Depositing Amount");
                            BankUtil.depositAmount(sc);
                            break;

                        case 3:
                            System.out.println("Withdrawing Amount");
                            BankUtil.withdrawAmount(sc);
                            break;

                        default:
                            System.out.println("Invalid Option");
                    }
                    System.out.println();
                    System.out.println("Do you want to continue (Y / N): ");
                    choose = sc.next().charAt(0);

                } while(choose == 'Y');
                System.out.println("Transaction Completed");
                System.out.println("Thank You for using Sujan Bank");
                break;

            } else {
                System.out.println("Incorrect Password. Remaining attempts " + (attempts-1));
                counter++;
                if(counter == 3) {
                    System.out.println("CARD BLOCKED");
                }
            }
        }
    }
}
