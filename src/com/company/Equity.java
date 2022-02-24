package com.company;

import java.util.Scanner;

public class Equity extends Bank
{
    //("Welcome to Equity!!Growing Together In Trust!!");

    public static void equity()
    {
        Scanner userinputs = new Scanner(System.in);
        int choice;
        Equity equity = new Equity();
        System.out.println("Welcome to Equity Bank!! \nGrowing Together In Trust");
        do {
            System.out.println("Kindly choose any option of your choice\n1)Create an account     2)Deposit money \n3)Withdraw money        4)Request for a loan \n5)Transfer money        6)Status Check \n7)Close app");

            choice = userinputs.nextInt();
            switch (choice) {
                case 1 -> equity.createAccount();
                case 2 -> equity.depositAmount();
                case 3 -> equity.withdrawAmount();
                case 4 -> equity.loanAmount();
                case 5 -> equity.transferAmount();
                case 6 -> equity.checkStatus();
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
        }while(choice!=7);
    }
    @Override
    public void createAccount()
    {
        System.out.println("                    Create a new EQUITY account today!                    ");
        System.out.println("------------------------------------------------------------------------");
        super.createAccount();
        System.out.println("Thank you! And Welcome \nWe hope you will enjoy our services!");
    }

    @Override
    public void depositAmount()
    {
        System.out.println("Deposit money easily at EQUITY!");
        super.depositAmount();
    }

    @Override
    public void withdrawAmount()
    {
        System.out.println("Withdraw money easily at EQUITY!");
        super.withdrawAmount();
    }

    @Override
    public void loanAmount()
    {
        System.out.println("Request for a loan easily at EQUITY!");
        super.loanAmount();
    }

    @Override
    public void transferAmount()
    {
        System.out.println("Transfer money easily at EQUITY!");
        super.transferAmount();
    }

    @Override
    public void checkStatus()
    {
        System.out.println("Monitor your account easily at EQUITY!");
        super.checkStatus();
    }
}





