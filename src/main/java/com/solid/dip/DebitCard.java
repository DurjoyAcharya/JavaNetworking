package com.solid.dip;

public class DebitCard implements BankCard{
    public void doTransaction()
    {
        System.out.println("Payment using Debit Card");
    }
}
