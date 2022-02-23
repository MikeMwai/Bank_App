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
                case 1 -> national.account_creation();
                case 2 -> national.deposits();
                case 3 -> national.withdrawals();
                case 4 -> national.loans();
                case 5 -> national.transferMoney();
                case 6 -> national.status_check();
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
    public void account_creation() {
        System.out.println("                    Create a new NATIONAL account today!                    ");
        System.out.println("------------------------------------------------------------------------");
        super.account_creation();
    }

    @Override
    public void deposits() {
        System.out.println("Deposit money easily at NATIONAL!");
        super.deposits();
    }

    @Override
    public void withdrawals() {
        System.out.println("Withdraw money easily at NATIONAL!");
        super.withdrawals();
    }

    @Override
    public void loans() {
        System.out.println("Request for a loan easily at NATIONAL!");
        super.loans();
    }

    @Override
    public void transferMoney() {
        System.out.println("Transfer money easily at NATIONAL!");
        super.transferMoney();
    }

    @Override
    public void status_check() {
        System.out.println("Monitor your account easily at NATIONAL!");
        super.status_check();
    }
}

