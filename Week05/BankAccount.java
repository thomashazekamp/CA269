import java.util.Scanner;

public class BankAccount
{
    /* Author: Thomas Hazekamp
    * Date : 08/02/22
    * Description: This program can be called to return a balance
    */
    
    double balance;

    public BankAccount()
    {
        balance = 100;
    }

    public void withdraw(double amount)
    {
        balance -= amount;
    }

    public void deposit(double amount)
    {
        balance += amount;
    }

    public String toString()
    {
        return ("The balance is " + balance);
    }
}