package com.company;

import java.util.Scanner;

public class Equity extends Bank {
    //("Welcome to Equity!!Growing Together In Trust!!");

    Scanner j = new Scanner(System.in);


    int cash;
    String fname,lname;
    int phoneNumber;
    int age;
    String sex;

    public void NationalBank(){

        System.out.println("Enter your first name");
        fname= String.valueOf(j.nextInt());

        System.out.println("Enter your surname");
        lname= String.valueOf(j.nextInt());

        System.out.println("Enter your phone number");
        phoneNumber=j.nextInt();

        System.out.println("Enter your gender");
        sex= String.valueOf(j.nextInt());

        System.out.println("Enter your age ");
        age=j.nextInt();
        if(age>=18){
            System.out.println("Your eligible for consideration");

            System.out.println("Enter the amount you wish to be lent");
            cash=j.nextInt();

            System.out.println("enter 1 for business loan 2 for personal loan  3 for education loans 4 for mortgage loan");
            int cash=5;
            switch(cash) {
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
        else {
            System.out.println("Sorry you are not of age");

            try{
                Thread.sleep(1000);
            }

            catch (InterruptedException e) {

                e.printStackTrace();
            }
        }

    }
}
