package dao;

import service.Ipay;

import java.sql.SQLOutput;

public class DebitCard implements Ipay
{
    public DebitCard() {
        System.out.println("DebitCard is Instantiated");
    }

    @Override
    public void payBill(double amount) {
        System.out.println("Payment is Done Through DebitCard and "+(amount+0.18*amount)+" is Successfully Debited.");
    }
}
