package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        System.out.println("Choose one of the following \n1.)Absa Bank \n2.)Equity Bank \n3.)National Bank");

        int choice = input.nextInt();
        switch (choice) {
            case 1 -> Absa.absa();
            case 2 -> Equity.equity();
            case 3-> National.national();
            default -> System.out.println("Choice " + choice + " not known , choose either 1 or 2");
        }
    }
}
