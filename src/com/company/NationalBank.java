package com.company;

import java.util.Scanner;

 class NationalBank extends Bank {



        //("welcome!!The National Bank of Kenya Is Here To Serve You!!");

        Scanner userinputs = new Scanner(System.in);


        int cash=0;
        String fname, lname="";
        int phoneNumber;
        int age=0;
        String sex="";
        int balance=25000;

    public NationalBank() {

        System.out.println("welcome!!The National Bank of Kenya Is Here To Serve You!!");

            System.out.println("Enter your first name");
            fname = String.valueOf(userinputs.nextLine());
            System.out.println(fname);
            userinputs.nextLine();

            System.out.println("Enter your surname");
            lname = String.valueOf(userinputs.nextLine());
            System.out.println("welcome"+fname+""+lname);
        userinputs.nextLine();


        System.out.println("Enter your phone number");
            phoneNumber = userinputs.nextInt();
            System.out.println("Incase of any emergency we'll reach you through"+phoneNumber);
        userinputs.nextLine();

            System.out.println("Enter your gender");
            sex = String.valueOf(userinputs.nextLine());
            System.out.println("your gender is"+sex);
        userinputs.nextLine();


        System.out.println("Enter your age ");
            age = userinputs.nextInt();
            System.out.println(age);
        userinputs.nextLine();

        System.out.println("Enter the amount you wish to be lent");
        cash = userinputs.nextInt();

            if (age >= 18 && balance > cash) {
                System.out.println("Your eligible for consideration");

            } else {
                System.out.println("Sorry you are not of age");

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
            System.out.println("Thank You for banking with us!! \t \n \nIn case of any problems kindly contact us.");

        }
    }

