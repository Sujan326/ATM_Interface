package com.project;

import java.util.Scanner;

public class BankUtil {

    static int minAmount = 500;
    static int currentAmount = minAmount;

    public static void checkBalance() {

        System.out.print("Your current balance amount is: " + currentAmount);
        System.out.println();

    }

    public static void depositAmount(Scanner sc) {

        System.out.print("Enter the Deposit Amount: ");
        int deposit = sc.nextInt();

        currentAmount += deposit;
        System.out.println("Deposit Complete");

    }

    public static void withdrawAmount(Scanner sc) {


        System.out.print("Enter the Withdraw Amount: ");
        int withdraw = sc.nextInt();

        if(currentAmount - withdraw < 500) {
            System.out.println("Insufficient Funds, minimum Balance must be 500RS");
        } else {
            currentAmount -= withdraw;
            System.out.println("Withdraw Complete");
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    }
}
