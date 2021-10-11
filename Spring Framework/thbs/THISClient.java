package org.thbs;

public class THISClient
{
    Bank bank;

    //Constructor Injection
    public THISClient(Bank bank)
    {
        this.bank=bank;
    }

    public Bank getBank()
    {
        return bank;
    }

    public void setBank(Bank bank)
    {
        this.bank = bank;
    }

    public double getBalance(long accid)
    {
        System.out.println("In THBS Client : Get Balance");
        return bank.getBalance(accid);
    }
    public double withdraw(long accid,double amount)
    {
        System.out.println("In THBS Client : withdraw");
        return bank.withdraw(accid,amount);
    }
    public double deposit(long accid,double amount)
    {
        System.out.println("In THBS Client : Deposit");
        return bank.withdraw(accid,amount);
    }
}
