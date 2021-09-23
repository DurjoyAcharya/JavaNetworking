package com.solid.dip;

public class ShoppingMall {
    // private DebitCard debitCard;
    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }
    public void buySomething(long amount)
    {
        bankCard.doTransaction();
    }

    public static void main(String[] args) {

        var creditCard=new CreditCard();
        var debitCard=new DebitCard();
        var shopping=new ShoppingMall(creditCard);
        shopping.buySomething(100);
        new ShoppingMall(debitCard).buySomething(120);
    }
}
