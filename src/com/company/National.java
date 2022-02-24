package com.company;

import java.util.Scanner;

public class National extends Bank {
    public static void national()
    {
        Scanner userinputs = new Scanner(System.in);
        int choice;
        National national = new National();
        System.out.println("Welcome to National Bank!! \nWe Share Your Vision");
        do {
            System.out.println("Kindly choose any option of your choice\n1)Create an account     2)Deposit money \n3)Withdraw money        4)Request for a loan \n5)Transfer money        6)Status Check \n7)Close app");

            choice = userinputs.nextInt();

            switch (choice) {
                case 1 -> national.createAccount();
                case 2 -> national.depositAmount();
                case 3 -> national.withdrawAmount();
                case 4 -> national.loanAmount();
                case 5 -> national.transferAmount();
                case 6 -> national.checkStatus();
                case 7 -> System.out.println("Have a Good Day!");
                default -> {
                    System.out.println("Sorry invalid request try again ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            }
        } while (choice != 7);
    }

    @Override
    public void createAccount() {
        System.out.println("                    Create a new NATIONAL account today!                    ");
        System.out.println("------------------------------------------------------------------------");
        super.createAccount();
    }

    @Override
    public void depositAmount() {
        System.out.println("Deposit money easily at NATIONAL!");
        super.depositAmount();
    }

    @Override
    public void withdrawAmount() {
        System.out.println("Withdraw money easily at NATIONAL!");
        super.withdrawAmount();
    }

    @Override
    public void loanAmount() {
        System.out.println("Request for a loan easily at NATIONAL!");
        super.loanAmount();
    }

    @Override
    public void transferAmount() {
        System.out.println("Transfer money easily at NATIONAL!");
        super.transferAmount();
    }

    @Override
    public void checkStatus() {
        System.out.println("Monitor your account easily at NATIONAL!");
        super.checkStatus();
    }
}

