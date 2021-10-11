package org.thbs;

public class ICICI implements Bank
{

    @Override
    public double getBalance(long accid) {
        System.out.println("ICICI:Balance");
        return Math.random()*10000;
    }

    @Override
    public double withdraw(long accid, double amount) {
        System.out.println("ICICI:Withdraw");
        return Math.random()*10000;
    }

    @Override
    public double deposit(long accid, double amout) {
        System.out.println("ICICI:Deposit");
        return Math.random()*10000;
    }
}
