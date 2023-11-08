package dao;

import service.Ipay;

public class QRCode implements Ipay
{
    public QRCode() {
        System.out.println("QRCode is Instantiated");
    }

    @Override
    public void payBill(double amount) {
        System.out.println("Payment is Done Through QRCode and "+amount+" is Successfully Debited.");
    }
}
