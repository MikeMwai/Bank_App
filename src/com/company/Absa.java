package com.company;

import java.util.Scanner;

public class Absa extends Bank
{
    //("Welcome to Absa!!Growing Together In Trust!!");
public static void absa()
{
    Scanner userinputs = new Scanner(System.in);

    System.out.println("Welcome to Absa Bank!! \nWe Bring Possibilities To Life");

    System.out.println("Kindly choose any option of your choice\n1)Create an account  \n2)Deposit money \n3)Withdraw money \n4)Request for a loan \n5)Transfer money \n6)Status Check");

    int choice = userinputs.nextInt();
    Absa absa=new Absa();
    switch (choice) {
        case 1 ->absa.account_creation();
        case 2 ->absa.deposits();
        case 3 ->absa.withdrawals();
        case 4 ->absa.loans();
        case 5->absa.transferMoney();
        case 6->absa.status_check();
        default -> {
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
        super.account_creation();
    }

    @Override
    public void deposits()
    {
        super.deposits();
    }

    @Override
    public void withdrawals()
    {
        super.withdrawals();
    }

    @Override
    public void loans()
    {
        super.loans();
    }

    @Override
    public void transferMoney()
    {
        super.transferMoney();
    }

    @Override
    public void status_check()
    {
        super.status_check();
    }
}
