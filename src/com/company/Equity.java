package com.company;

import java.util.Scanner;

public class Equity extends Bank
{
    //("Welcome to Equity!!Growing Together In Trust!!");

    public static void equity()
    {
        Scanner userinputs = new Scanner(System.in);

        System.out.println("Welcome to Equity Bank!! \nGrowing Together In Trust");

        System.out.println("Kindly choose any option of your choice\n1)Create an account  \n2)Deposit money \n3)Withdraw money \n4)Request for a loan \n5)Transfer money");

        int choice = userinputs.nextInt();
        Equity equity=new Equity();

        switch (choice) {
            case 1 -> equity.account_creation();
            case 2 -> equity.deposits();
            case 3 -> equity.withdrawals();
            case 4 -> equity.loans();
            case 5-> equity.transferMoney();
            case 6->equity.status_check();
            default ->
                    {
                System.out.println("Sorry invalid request try again ");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
            }
        }
    }
    @Override
    public void account_creation()
    {
        System.out.println("                    Create a new EQUITY account today!                    ");
        System.out.println("------------------------------------------------------------------------");
        super.account_creation();
        System.out.println("Thank you! And Welcome \nWe hope you will enjoy our services!");
    }

    @Override
    public void deposits()
    {
        System.out.println("Deposit money easily at EQUITY!");
        super.deposits();
    }

    @Override
    public void withdrawals()
    {
        System.out.println("Withdraw money easily at EQUITY!");
        super.withdrawals();
    }

    @Override
    public void loans()
    {
        System.out.println("Request for a loan easily at EQUITY!");
        super.loans();
    }

    @Override
    public void transferMoney()
    {
        System.out.println("Transfer money easily at EQUITY!");
        super.transferMoney();
    }

    @Override
    public void status_check()
    {
        System.out.println("Monitor your account easily at EQUITY!");
        super.status_check();
    }
}





