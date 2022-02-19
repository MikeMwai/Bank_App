package com.company;

public class Withdrawals extends Account_Creation
{
    public Withdrawals()
    {
        super();
        System.out.println("A new withdrawal has been done!");
    }

    @Override
    public void stores()
    {
        System.out.println("An account stores...");
    }

}