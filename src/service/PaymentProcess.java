package service;

import dao.DebitCard;

public class PaymentProcess {
    private Ipay pay;

    public PaymentProcess(Ipay pay) {
        this.pay=pay;
    }
//
//    public void setPay(Ipay pay)
//    {
//        this.pay = pay;
//    }

    public void paymentAmount(double amount)
    {
       pay.payBill(amount);
    }
}
