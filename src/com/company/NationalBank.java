package com.company;

import java.util.Scanner;

 class NationalBank extends Bank {
     Scanner userinputs = new Scanner(System.in);


     int cash = 0;
     String fname, lname = "";
     int phoneNumber;
     int age = 0;
     String sex = "";
     int balance = 25000;
     int amount = 0;
     int available=0;


     {
      System.out.println("Kindly choose any option of your choice\t\n 1 to create an account  2 to deposit money\t\n\n" +
              " 3 to withdrwaw money \t\n\n\n and  4 to request for a loan ");
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
     }




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

         public void account_creation; () {

             System.out.println("welcome!!The National Bank of Kenya Is Here To Serve You!!");

             System.out.println("Enter your first name");
             fname = String.valueOf(userinputs.nextLine());
             System.out.println(fname);
             userinputs.nextLine();

             System.out.println("Enter your surname");
             lname = String.valueOf(userinputs.nextLine());
             System.out.println("welcome" + fname + "" + lname);
             userinputs.nextLine();


             System.out.println("Enter your phone number");
             phoneNumber = userinputs.nextInt();
             System.out.println("Incase of any emergency we'll reach you through" + phoneNumber);
             userinputs.nextLine();

             System.out.println("Enter your gender");
             sex = String.valueOf(userinputs.nextLine());
             System.out.println("your gender is" + sex);
             userinputs.nextLine();


             System.out.println("Enter your age ");
             age = userinputs.nextInt();
             System.out.println(age);
             userinputs.nextLine();

             if (age >= 18) {
                 System.out.println("You're eligible for a standard account");
             } else {
                 System.out.println("You're still too young\t\n\n Kindly visit our nearest office to apply for" +
                         "a jumbo junior account.Thank you");
             }
         }


     }
 }

