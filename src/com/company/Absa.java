package com.company;

import java.util.Scanner;

public class Absa extends Bank
{
    //("Welcome to Absa!!Growing Together In Trust!!");
public static void absa() {
    Scanner userinputs = new Scanner(System.in);
    int choice;

    System.out.println("Welcome to Absa Bank!! \nWe Bring Possibilities To Life");
    Absa absa = new Absa();
    do{
        System.out.println("Kindly choose any option of your choice\n1)Create an account     2)Deposit money \n3)Withdraw money        4)Request for a loan \n5)Transfer money        6)Status Check \n7)Close app");

        choice = userinputs.nextInt();
        switch (choice) {
            case 1 -> absa.createAccount();
            case 2 -> absa.depositAmount();
            case 3 -> absa.withdrawAmount();
            case 4 -> absa.loanAmount();
            case 5 -> absa.transferAmount();
            case 6 -> absa.checkStatus();
            case 7->System.out.println("Have a Good Day!");
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
        System.out.println("                    Create a new ABSA account today!                    ");
        System.out.println("------------------------------------------------------------------------");
        super.createAccount();
        System.out.println("Thank you! And Welcome \nWe hope you will enjoy our services!");
    }

    @Override
    public void depositAmount()
    {
        System.out.println("Deposit money easily at ABSA!");
        super.depositAmount();
    }

    @Override
    public void withdrawAmount()
    {
        System.out.println("Withdraw money easily at ABSA!");
        super.withdrawAmount();
    }

    @Override
    public void loanAmount()
    {
        System.out.println("Request for a loan easily at ABSA!");
        super.loanAmount();
    }

    @Override
    public void transferAmount()
    {
        System.out.println("Transfer money easily at ABSA!");
        super.transferAmount();
    }

    @Override
    public void checkStatus()
    {
        System.out.println("Monitor your account easily at ABSA!");
        super.checkStatus();
    }
}
