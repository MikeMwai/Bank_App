package com.company;

import java.util.Scanner;

 class NationalBank extends Bank {
     Scanner userInputs = new Scanner(System.in);


     int cash = 0;
     String fName, lName = "";
     String f1Name, l2Name = "";
     int phoneNumber;
     int age = 0;
     String sex = "";
     int balance = 25000;
     int amount = 0;
     int available=0;



     public void available_services() {
         System.out.println("Welcome to Equity!!We are one with you!!");

        System.out.println("Kindly choose any option of your choice\t\n 1 to create an account  2 to deposit money\t\n\n" +
                " 3 to withdraw money \t\n\n\n 4 to request for a loan\t\n\n\n\n 5 to apply for a Visa and 6 to transfer money ");
     String choice = String.valueOf(5);
        switch (choice) {
         case 1: {
             System.out.println("create an account");

             public void create_account () {
                 System.out.println("Kindly enter your full name:");

                 System.out.println("Enter your first name");
                 fName = String.valueOf(userInputs.nextLine());
                 System.out.println(fName);
                 userInputs.nextLine();

                 System.out.println("Enter your surname");
                 lName = String.valueOf(userInputs.nextLine());
                 System.out.println("welcome" + fName + "" + lName);
                 userInputs.nextLine();

                 System.out.println("Kindly enter your phone number:");
                 phoneNumber = userInputs.nextInt();
                 System.out.println(phoneNumber);
                 userInputs.nextLine();

                 System.out.println("Enter your age ");
                 age = userInputs.nextInt();
                 System.out.println(age);
                 userInputs.nextLine();

                 System.out.println("Kindly enter the details of your next of kin :");
                 f1Name = String.valueOf(userInputs.nextLine());
                 System.out.println(f1Name);
                 userInputs.nextLine();
                 l2Name = String.valueOf(userInputs.nextLine());
                 System.out.println(l2Name);
                 userInputs.nextLine();
                 phoneNumber = userInputs.nextInt();
                 System.out.println(phoneNumber);
                 userInputs.nextLine();

                 System.out.println("Your next of kin is:" + f1Name + "" + l2Name + "and their contacts are" + phoneNumber);

             }


             break;
         }
         case 2: {
             System.out.println("deposit money");

             public void deposits () {
                 System.out.println("Enter the amount you wish to deposit:");
                 amount = userInputs.nextInt();
                 System.out.println(amount);
                 userInputs.nextLine();
                 if (amount <= 1000000) {
                     System.out.println("A new deposit has been made...");
                     float bal2 = balance + amount;
                     System.out.println("Your new balance is" + bal2);
                 } else {
                     System.out.println("contact the bank to verify this amount :");
                 }


             }
             break;
         }
         case 3: {
             System.out.println("withdraw money");

             public void withdrawals () {
                 System.out.println("Enter the amount you wish to withdraw:");
                 available = userInputs.nextInt();
                 System.out.println(available);
                 userInputs.nextLine();
                 if (available <= balance) {
                     System.out.println("A new withdrawal has been made...");
                     float bal3 = balance - available;
                     System.out.println("Your new balance is" + bal3);
                 } else {
                     System.out.println("You do not have enough money in your account to cover the withdrawal :");
                 }

             }


             break;
         }
         case 4: {

             System.out.println("Request for a loan");

             public void loans () {
                 System.out.println("Kindly enter your full name:");

                 System.out.println("Enter your first name");
                 fName = String.valueOf(userInputs.nextLine());
                 System.out.println(fName);
                 userInputs.nextLine();

                 System.out.println("Enter your surname");
                 lName = String.valueOf(userInputs.nextLine());
                 System.out.println("welcome" + fName + "" + lName);
                 userInputs.nextLine();

                 System.out.println("Enter the amount you wish to be lent");
                 cash = userInputs.nextInt();
                 System.out.println("You want a loan of" + cash + "kenyan shillings:");

                 System.out.println("Enter your age ");
                 age = userInputs.nextInt();
                 System.out.println(age);
                 userInputs.nextLine();


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
         case 5: {
             System.out.println("Application for a Visa");

             System.out.println("Are you an account holder with this bank?\n 1 Yes 2 No");

             int selection = userInputs.nextInt();
             switch (selection) {
                 case 1: {
                     System.out.println("Kindly enter your full name:");

                     System.out.println("Enter your first name");
                     fName = String.valueOf(userInputs.nextLine());
                     System.out.println(fName);
                     userInputs.nextLine();

                     System.out.println("Enter your surname");
                     lName = String.valueOf(userInputs.nextLine());
                     System.out.println("welcome" + fName + "" + lName);
                     userInputs.nextLine();

                     System.out.println("Kindly enter your phone number:");
                     phoneNumber = userInputs.nextInt();
                     System.out.println(phoneNumber);
                     userInputs.nextLine();

                     System.out.println("Enter your age ");
                     age = userInputs.nextInt();
                     System.out.println(age);
                     userInputs.nextLine();

                     System.out.println("Kindly enter the details of your next of kin :");
                     f1Name = String.valueOf(userInputs.nextLine());
                     System.out.println(f1Name);
                     userInputs.nextLine();
                     l2Name = String.valueOf(userInputs.nextLine());
                     System.out.println(l2Name);
                     userInputs.nextLine();
                     phoneNumber = userInputs.nextInt();
                     System.out.println(phoneNumber);
                     userInputs.nextLine();

                     System.out.println("Your next of kin is:" + f1Name + "" + l2Name + "and their contacts are" + phoneNumber);

                     System.out.println("Thank you" + fName + "" + lName + "we shall get back to you via email");
                     break;
                 }
                 case 2: {
                     System.out.println("Sorry!This feature is for account holders only. Kindly sent up an account with us");
                     break;
                 }
                 default:
                     System.out.println("Kindly choose one of the given choices");
             }

             break;
         }
         case 6: {
             public void transferMoney () {
                 System.out.println("Money Transfer");

                 System.out.println("Kindly enter your full name:");

                 System.out.println("Enter your first name");
                 fName = String.valueOf(userInputs.nextLine());
                 System.out.println(fName);
                 userInputs.nextLine();

                 System.out.println("Enter your surname");
                 lName = String.valueOf(userInputs.nextLine());
                 System.out.println("welcome" + fName + "" + lName);
                 userInputs.nextLine();

                 System.out.println("Enter the amount you wish to be send:");
                 cash = userInputs.nextInt();

                 System.out.println("Enter the name of the bank of the account you wish to send money to:");
                 String bankName = userInputs.nextLine();

                 System.out.println("Enter the number of the account you wish to send money to:");
                 int accountNumber = userInputs.nextInt();

                 System.out.println("You want to transfer" + cash + "kenyan shillings to" + accountNumber + bankName);


             }


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
}




   /* public void deposits() {
        System.out.println("Enter the amount you wish to deposit:");
        amount = userInputs.nextInt();
        System.out.println(amount);
        userInputs.nextLine();
        if (amount <= 1000000) {
            System.out.println("A new deposit has been made...");
            System.out.println("Your new balance is" + amount + balance);
        } else {
            System.out.println("contact the bank to verify this amount :");
        }


    }

    public void withdrawals() {
        System.out.println("Enter the amount you wish to withdraw:");
        available = userInputs.nextInt();
        System.out.println(available);
        userInputs.nextLine();
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
        fName = String.valueOf(userInputs.nextLine());
        System.out.println(fName);
        userInputs.nextLine();

        System.out.println("Enter your surname");
        lName = String.valueOf(userInputs.nextLine());
        System.out.println("welcome" + fName + "" + lName);
        userInputs.nextLine();

        System.out.println("Enter the amount you wish to be lent");
        cash = userInputs.nextInt();
        System.out.println("You want a loan of"+cash+"kenyan shillings:");

        System.out.println("Enter your age ");
        age = userInputs.nextInt();
        System.out.println(age);
        userInputs.nextLine();


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
        }*/








      /*System.out.println("Kindly choose any option of your choice\t\n 1 to create an account  2 to deposit money\t\n\n" +
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

