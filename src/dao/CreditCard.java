package dao;

import service.Ipay;

public class CreditCard implements Ipay
{
    public CreditCard() {
        System.out.println("CreditCard is Instantiated");
    }

    @Override
    public void payBill(double amount) {
        System.out.println("Payment is Done Through CreditCard and "+(amount+0.12*amount)+" is Successfully Debited.");
    }
}
