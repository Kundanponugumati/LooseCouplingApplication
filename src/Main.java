import dao.*;
import service.PaymentProcess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Please Enter Payment Options");
        System.out.println("Options-1 : DebitCard");
        System.out.println("Options-2 : CreditCard");
        System.out.println("Options-3 : QRCode");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        PaymentProcess pp = new PaymentProcess();
        if(num==1)
        {
            // constructor Injection
            PaymentProcess pp = new PaymentProcess(new DebitCard());
            pp.paymentAmount(100.53);
            // setter Injection
//            pp.setPay(new DebitCard());
        }
        else if(num==2)
        {
            // constructor Injection
            PaymentProcess pp = new PaymentProcess(new CreditCard());
            pp.paymentAmount(100.53);
            // setter Injection
//            pp.setPay(new CreditCard());
        }
        else if(num==3)
        {
            // constructor Injection
            PaymentProcess pp = new PaymentProcess(new QRCode());
            pp.paymentAmount(100.53);
            // setter Injection
//            pp.setPay(new QRCode());
        }
        else
        {
            System.out.println("Please Select Among the Three Options");
        }
//        pp.paymentAmount(100.53);
    }
}