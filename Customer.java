
import java.util.*;
class Customer
{
    public static String bankName="ANDRABANK";
	public String name;
	public double balance;
	Customer(String name)
	{
		this.name=name;		
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("After Deposit Balance is:"+this.balance);
	}
	public void withdraw(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Sorry..Insufficient Funds..Cannot perform this operation");
			System.exit(0);
		}
		else
		{
			balance=balance-amount;
			System.out.println("After withdraw the balance :"+balance);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to Java "+Customer.bankName);
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Name:");
		String name=sc.next();
		Customer c1= new Customer(name);
		System.out.println("Hello "+c1.name+" Your Account got Created");
		while(true)
		{
			System.out.println("Choose Your Option to perform:");
			System.out.println("D-Deposit\nW-WithDraw \nE-Exit");
			String option=sc.next();
			if (option.equalsIgnoreCase("D"))
			{
				System.out.println("Enter Amount:");
				double amount=sc.nextDouble();
				c1.deposit(amount);
			}
			else if(option.equalsIgnoreCase("W"))
			{
				System.out.println("Enter amount to Withdraw:");
				double amount=sc.nextDouble();
				c1.withdraw(amount);
			}
			else if(option.equalsIgnoreCase("E"))
			{
				System.out.println("Thanks for Banking");
				System.exit(0);
			}
			else
			{
				System.out.println("Invalid option..Plz choose valid option");
			}
		}		
	}
}

