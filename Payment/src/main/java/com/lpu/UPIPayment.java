package com.lpu;

public class UPIPayment implements Payments {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}
