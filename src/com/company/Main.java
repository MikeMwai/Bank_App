package com.company;

import java.util.Scanner;

public class Main
{
    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose one of the following \n1.) Absa Bank \n2.) Equity Bank");

        int choice = input.nextInt();
        Absa absa=new Absa();
        Equity equity=new Equity();
        switch (choice) {
            case 1 ->
                    Absa.absa();
                    /*{
                        Scanner userinputs = new Scanner(System.in);
                System.out.println("Welcome to Absa!!Growing Together In Trust!!");
                System.out.println("Kindly choose any option of your choice\n1)Create an account  \n2)Deposit money \n3)Withdraw money \n4)Request for a loan ");
                int choice1 = userinputs.nextInt();
                switch(choice1)
                {
                    case 1->
                            {
                                Absa.account_creation();
                            }
                            case 2->
                                    {
                                        Absa.deposits();
                                    }
                                    case 3->
                                            {
                                                Absa.withdrawals();
                                            }
                                            case 4->
                                                    {
                                                        Absa.loans();
                                                    }
                }
                    }*/
            case 2 -> Equity.equity();
            default -> System.out.println("Choice " + choice + " not known , choose either 1 or 2");
        }
    }
}
