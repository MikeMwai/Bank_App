package com.company;

import java.util.Scanner;

public class Equity extends Bank
{
    //("Welcome to Equity!!Growing Together In Trust!!");

    public static void equity()
    {
        Scanner userinputs = new Scanner(System.in);


        int cash;
        String fname, lname;
        int phoneNumber;
        int age;
        int balance = 25000;
        int amount;
        int available;

        System.out.println("Welcome to Equity!!Growing Together In Trust!!");

        System.out.println("Kindly choose any option of your choice\n1)Create an account  \n2)Deposit money \n3)Withdraw money \n4)Request for a loan ");

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
        }
    }

    /*public void available_services(){
        System.out.println("Welcome to Equity!!Growing Together In Trust!!");

        System.out.println("Kindly choose any option of your choice\t\n 1 to create an account  2 to deposit money\t\n\n" +
                " 3 to withdraw money \t\n\n\n and  4 to request for a loan ");
        String choice = String.valueOf(5);
        switch (choice) {
            case 1: {
                System.out.println("create an account");

                public void create_account(){
                    System.out.println("Kindly enter your full name:");

                    System.out.println("Enter your first name");
                    fname = String.valueOf(userinputs.nextLine());
                    System.out.println(fname);
                    userinputs.nextLine();

                    System.out.println("Enter your surname");
                    lname = String.valueOf(userinputs.nextLine());
                    System.out.println("welcome" + fname + "" + lname);
                    userinputs.nextLine();

                    System.out.println("Kindly enter your phone number:");
                    phoneNumber=userinputs.nextInt();
                    System.out.println(phoneNumber);
                    userinputs.nextLine();

                    System.out.println("Enter your age ");
                    age=userinputs.nextInt();
                    System.out.println(age);
                    userinputs.nextLine();

                    System.out.println("Kindly enter the details of your next of kin :");
                    fname = String.valueOf(userinputs.nextLine());
                    System.out.println(fname);
                    userinputs.nextLine();
                    lname = String.valueOf(userinputs.nextLine());
                    System.out.println(lname);
                    userinputs.nextLine();
                    phoneNumber=userinputs.nextInt();
                    System.out.println(phoneNumber);
                    userinputs.nextLine();

                    System.out.println("Your next of kin is:"+fname+""+lname+"and their contacts are"+phoneNumber);

                }


                break;
            }
            case 2: {
                System.out.println("deposit money");

                public void deposits() {
                    System.out.println("Enter the amount you wish to deposit:");
                    amount = userinputs.nextInt();
                    System.out.println(amount);
                    userinputs.nextLine();
                    if (amount <= 1000000) {
                        System.out.println("A new deposit has been made...");
                        System.out.println("Your new balance is" + amount + balance);
                    } else {
                        System.out.println("contact the bank to verify this amount :");
                    }


                }
                break;
            }
            case 3: {
                System.out.println("withdraw money");

                public void withdrawals() {
                    System.out.println("Enter the amount you wish to withdraw:");
                    available = userinputs.nextInt();
                    System.out.println(available);
                    userinputs.nextLine();
                    if (available <= balance) {
                        System.out.println("A new withdrawal has been made...");
                        System.out.println("Your new balance is" + balance - available);
                    } else {
                        System.out.println("You do not have enough money in your account to cover the withdrawal :");
                    }

                }


                break;
            }
            case 4: {

                System.out.println("Request for a loan");

                public void loans() {
                    System.out.println("Kindly enter your full name:");

                    System.out.println("Enter your first name");
                    fname = String.valueOf(userinputs.nextLine());
                    System.out.println(fname);
                    userinputs.nextLine();

                    System.out.println("Enter your surname");
                    lname = String.valueOf(userinputs.nextLine());
                    System.out.println("welcome" + fname + "" + lname);
                    userinputs.nextLine();

                    System.out.println("Enter the amount you wish to be lent");
                    cash = userinputs.nextInt();
                    System.out.println("You want a loan of"+cash+"kenyan shillings:");

                    System.out.println("Enter your age ");
                    age = userinputs.nextInt();
                    System.out.println(age);
                    userinputs.nextLine();


                    if (age >= 18 && balance > cash) {
                        System.out.println("Your eligible for consideration");

                    } else {
                        System.out.println("Sorry you do not meet the needed requirements:");

                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                        System.out.println("enter 1 for business loan 2 for personal loan  3 for education loans 4 for mortgage loan");
                        int cash = 5;
                        switch (cash) {
                            case 1: {
                                System.out.println("Business loan Request");

                                break;
                            }
                            case 2: {
                                System.out.println("Personal loan request");
                                break;
                            }
                            case 3: {
                                System.out.println("Educational loan request");


                                break;
                            }
                            case 4: {

                                System.out.println("Mortgage loan request");
                                break;
                            }
                            default:
                                System.out.println("Sorry invalid request try again ");

                                try {
                                    Thread.sleep(1000);
                                } catch (InterruptedException e) {

                                    e.printStackTrace();
                                }
                        }
                    }
                    break;
                }

            }
            default:
                System.out.println("Sorry invalid request try again ");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
        }
    }*/

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
}





