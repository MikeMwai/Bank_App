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
            case 1 -> absa.account_creation();
            case 2 -> absa.deposits();
            case 3 -> absa.withdrawals();
            case 4 -> absa.loans();
            case 5 -> absa.transferMoney();
            case 6 -> absa.status_check();
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
    public void account_creation()
    {
        System.out.println("                    Create a new ABSA account today!                    ");
        System.out.println("------------------------------------------------------------------------");
        super.account_creation();
        System.out.println("Thank you! And Welcome \nWe hope you will enjoy our services!");
    }

    @Override
    public void deposits()
    {
        System.out.println("Deposit money easily at ABSA!");
        super.deposits();
    }

    @Override
    public void withdrawals()
    {
        System.out.println("Withdraw money easily at ABSA!");
        super.withdrawals();
    }

    @Override
    public void loans()
    {
        System.out.println("Request for a loan easily at ABSA!");
        super.loans();
    }

    @Override
    public void transferMoney()
    {
        System.out.println("Transfer money easily at ABSA!");
        super.transferMoney();
    }

    @Override
    public void status_check()
    {
        System.out.println("Monitor your account easily at ABSA!");
        super.status_check();
    }
}
