package com.solid.dip;

public class CreditCard implements BankCard{

    public void doTransaction()
    {
        System.out.println("Payment using CreditCard");
    }
}
