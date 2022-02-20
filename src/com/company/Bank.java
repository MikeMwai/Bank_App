package com.company;

import java.util.Scanner;

public class Bank
{
    Scanner userinputs = new Scanner(System.in);


    int cash = 0;
    String fname, lname = "";
    int phoneNumber;
    int age = 0;
    int balance = 25000;
    int amount = 0;
    int available=0;
    public  void account_creation()
    {

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

    public void deposits()
    {
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
    public void withdrawals()
    {
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
    public void status_check()
    {
        System.out.println("Status check ongoing...");
    }
    public void loans()
    {
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

    }
