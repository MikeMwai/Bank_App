package com.company;

import java.util.Scanner;

public class Absa extends Bank
{
    //("Welcome to Absa!!Growing Together In Trust!!");
public static void absa()
{
    Scanner userinputs = new Scanner(System.in);


    int cash;
    String fname, lname;
    int phoneNumber;
    int age;
    int balance = 25000;
    int amount;
    int available;

    System.out.println("Welcome to Absa!!Growing Together In Trust!!");

    System.out.println("Kindly choose any option of your choice\n1)Create an account  \n2)Deposit money \n3)Withdraw money \n4)Request for a loan \n5)Transfer money");

    int choice = userinputs.nextInt();

    switch (choice) {
        case 1 -> {
            System.out.println("Create an account");
            System.out.println("Kindly enter your full name:");
            System.out.println("Enter your first name");
            fname = String.valueOf(userinputs.nextLine());
            userinputs.nextLine();
            System.out.println("Enter your surname");
            lname = String.valueOf(userinputs.nextLine());
            System.out.println("Welcome  " + fname + "" + lname);
            System.out.println("Kindly enter your phone number:");
            phoneNumber = userinputs.nextInt();
            userinputs.nextLine();
            System.out.println("Enter your age ");
            age = userinputs.nextInt();
            userinputs.nextLine();

            System.out.println("Kindly enter the details of your next of kin :");
            System.out.println("Enter first name");
            fname = String.valueOf(userinputs.nextLine());
            System.out.println("Enter surname");
            lname = String.valueOf(userinputs.nextLine());
            System.out.println("Kindly enter phone number:");
            phoneNumber = userinputs.nextInt();
            userinputs.nextLine();
            System.out.println("Your next of kin is:" + fname + " " + lname + " and their contacts are" + phoneNumber);
            System.out.println("------------------------------------------------------------------------");
            System.out.println("                     A new account has been created!                    ");
        }
        case 2 -> {
            System.out.println("Deposit money");
            System.out.println("Enter the amount you wish to deposit:");
            amount = userinputs.nextInt();
            System.out.println(amount);
            userinputs.nextLine();
            if (amount <= 1000000) {
                System.out.println("A new deposit has been made...");
                System.out.println("Your new balance is" + (amount + balance));
            } else {
                System.out.println("contact the bank to verify this amount :");
            }
        }
        case 3 -> {
            System.out.println("Withdraw money");
            System.out.println("Enter the amount you wish to withdraw:");
            available = userinputs.nextInt();
            System.out.println(available);
            userinputs.nextLine();
            if (available <= balance) {
                System.out.println("A new withdrawal has been made...");
                System.out.println("Your new balance is" + (balance - available));
            } else {
                System.out.println("You do not have enough money in your account to cover the withdrawal :");
            }
        }
        case 4 -> {
            System.out.println("Request for a loan");
            System.out.println("Kindly enter your full name:");
            System.out.println("Enter your first name");
            fname = String.valueOf(userinputs.nextLine());
            userinputs.nextLine();
            System.out.println("Enter your surname");
            lname = String.valueOf(userinputs.nextLine());
            System.out.println("Welcome " + fname + "" + lname);
            System.out.println("Enter the amount you wish to be lent");
            cash = userinputs.nextInt();
            System.out.println("You want a loan of" + cash + " kenyan shillings:");
            System.out.println("Enter your age ");
            age = userinputs.nextInt();
            userinputs.nextLine();
            if (age >= 18 && balance > cash) {
                System.out.println("You're eligible for consideration");
            } else {
                System.out.println("Sorry you do not meet the needed requirements:");
            }
            System.out.println("Enter \n1)Business loan \n2)Personal loan  \n3)Education loans \n4)Mortgage loan");
            int cash1 = userinputs.nextInt();

            switch (cash1) {
                case 1 -> System.out.println("Business loan Request");
                case 2 -> System.out.println("Personal loan request");
                case 3 -> System.out.println("Educational loan request");
                case 4 -> System.out.println("Mortgage loan request");
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
        case 5->
                {
                    System.out.println("Money Transfer");

                    System.out.println("Kindly enter your full name:");

                    System.out.println("Enter your first name");
                    fname = String.valueOf(userinputs.nextLine());
                    userinputs.nextLine();

                    System.out.println("Enter your surname");
                    lname = String.valueOf(userinputs.nextLine());
                    System.out.println("Welcome " + fname + "" + lname);

                    System.out.println("Enter the amount you wish to be send:");
                    cash = userinputs.nextInt();

                    System.out.println("Enter the bank name of the account you wish to send money to:");
                    String bankName = userinputs.nextLine();
                    userinputs.nextLine();

                    System.out.println("Enter the account number you wish to send money to:");
                    int accountNumber = userinputs.nextInt();

                    System.out.println("Transfer of " + cash + " kenyan shillings to " + accountNumber  +"completed!");
                }
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
}
