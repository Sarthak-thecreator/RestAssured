package com.lti.handson1;

public class BANK
{
	public static void main(String[] args) 
	{
		Bank tinyBank = new Bank(3);    
        tinyBank.openCheckingAccount(100,20);   
        tinyBank.openSavingsAccount(200, 0.05); 
        tinyBank.openCheckingAccount(300,30);    
        tinyBank.openSavingsAccount(400,0.05);  
        tinyBank.openCheckingAccount(400,40);    
        tinyBank.openSavingsAccount(400,0.05);  

        tinyBank.printAccounts();
        
        System.out.println("\ntinyBank.deposit(112,500)");
        tinyBank.deposit(112,500);

        System.out.println("\ntinyBank.withdraw(101,500)");
        tinyBank.withdraw(101,500);
        System.out.println("\ntinyBank.withdraw(101,110)");
        tinyBank.withdraw(101,110);
        System.out.println("\ntinyBank.addInterest(101)");
        tinyBank.addInterest(101);

        System.out.println("\ntinyBank.addInterest(102)");
        tinyBank.addInterest(102);
        System.out.println("\ntinyBank.withdraw(102,500)");
        tinyBank.withdraw(102,500);
        System.out.println("\ntinyBank.withdraw(102,200)");
        tinyBank.withdraw(102,200);

        System.out.println();
        tinyBank.printAccounts();
	}
}
public class Account
{
    private double bal;  //The current balance
    private int accnum;  //The account number
    
    
    public Account(int a)
    {    
        bal=0.0;
        accnum=a;
    }
    
    public void deposit(double sum)
    {
        if (sum>0)
            bal+=sum;    
        else
            System.out.println("Account.deposit(...): "
                               +"cannot deposit negative amount.");    
    }
    
    public void withdraw(double sum)
    {
        if (sum>0)
            bal-=sum;    
        else
            System.out.println("Account.withdraw(...): "
                               +"cannot withdraw negative amount.");    
    }
    
    public double getBalance()
    {
        return bal;
    }
    
    public int getAccountNumber()
    {
        return accnum;
    }
    
    public String toString()
    {
        return "Acc " + accnum + ": " + "balance = " + bal;    
    }
    
    public final void print()
    {
        //Don't override this,
        //override the toString method
        System.out.println( toString() );    
    }
    public void addInterest()
    {
    }

}
