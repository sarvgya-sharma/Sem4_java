//CO24557 Assignment 3 - problem 4
//simple bank account activities;2 types of account - saving and current

import java.util.*;
							
abstract class Account
{
	String CustomerName;
	private int AccountNumber;
	private double Balance;
	String AccountType;

	public Account() {}
	
	public Account(String name,String type,double money)
	{
		CustomerName = name;
		AccountType = type;;
		Balance = money;
		Random rand = new Random();
		AccountNumber = rand.nextInt(10000000)+1000000;	//random number between 1000000 to 9999999 
	}

	public double getBalance()
	{	return Balance;	}

	public void setBalance(double money)
	{	Balance = money;	}

	public void deposit(double money,int time)
	{
		this.calculateInterest(time);
		Balance = Balance + money;
		System.out.print("\n\nRs."+money+" deposited successfully.");
	}

	public void withdraw(double money,int time)
	{
		this.calculateInterest(time);

		if(money>this.getBalance() || this.getBalance()<0)
			System.out.print("\nCannot withdraw more than your balance in account!");
		else
		{	
			Balance = Balance - money;
			System.out.print("\n\nRs."+money+" withdrwan successfully.");
		}
	}
	
	public abstract void calculateInterest(int time);
	
	public void showDetails()
	{
		System.out.print("\n\nMini Statement:");
		System.out.print("\nCustomer Name: "+CustomerName);
		System.out.print("\nAccount Type: "+AccountType);
		System.out.print("\nAccount Number: "+AccountNumber);
		System.out.print("\nAccount Balance: Rs."+Balance);
	}
}

class SavingsAccount extends Account
{
	
	public SavingsAccount(String name,String type,double money)
	{
		super(name,type,money);
	}	

	public void calculateInterest(int time)		//compound interest
	{
		double interest;

		while(time>0)
		{
			interest = this.getBalance()*0.005;		//0.5% interest rate per month
			this.setBalance(this.getBalance()+interest);
			time--;
		}
	}			
}  

class CurrentAccount extends Account
{
	public CurrentAccount(String name,String type,double money)
	{
		super(name,type,money);
	}
	
	public void calculateInterest(int time)		//simple interest
	{
		double interest = (this.getBalance()*0.003*time)/100;		//0.3% interest rate per month
		this.setBalance(this.getBalance()+interest);
	}

	public void withdraw(double money, int time)		//withdraw func overridden
	{	
		this.calculateInterest(time);

		if(money>this.getBalance() || this.getBalance()<0)
			System.out.print("\nCannot withdraw more than your balance in account!");
		else
		{	
			this.setBalance(this.getBalance() - money);
			System.out.print("\n\nRs."+money+" withdrwan successfully.");
			if(this.getBalance()<1000)
			{
				System.out.print("\nBalance in account is less than RS.1000(min. limit)!\nImposing penalty of Rs.500");
				this.setBalance(this.getBalance() - 500);
			}
		}

	}             
}    

public class AccountTester
{
	public static void main(String[] args)
	{
		String name;
		double money = 0;
		int time;
		int choice = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("\n\n ----Banking System----");
		System.out.print("\n\nSelect Account type: \n1.Current Account \n2.Savings Account");
		System.out.print("\n\nChoice: ");
		int type = input.nextInt();
		input.nextLine();		//flushing buffer

		switch(type)
		{
			case 1: System.out.print("\n\nEnter Customer Name: ");
				   name = input.nextLine();
				   int flag=0;
				   while(flag==0)
				   {
					System.out.print("\nEnter Initial amount to be deposited(Min. limit is Rs.1000): ");
					money = input.nextDouble();
					if(money<1000)
						System.out.print("\nCannot open account for balance less than Rs.1000");
					else
						flag=1;
				   }
				   CurrentAccount account1 = new CurrentAccount(name,"Current Account",money);
		
		while(choice!=4)
		{
					System.out.print("\n\n ----Account Menu----");
		System.out.print("\n\n1.Deposit money");
		System.out.print("\n2.Withdraw money");
		System.out.print("\n3.Get mini statement");
		System.out.print("\n4.exit");
		System.out.print("\n\nChoice: ");
		choice = input.nextInt();

		switch(choice)
		{
			case 1:System.out.print("\n\nEnter Amount to be deposited: ");
				  money = input.nextDouble();
				  System.out.print("\nEnter time since last transaction(in months): ");
				  time = input.nextInt();
				  account1.deposit(money,time);
				  break;
		
			case 2:System.out.print("\n\nEnter Amount to be withdrawn: ");
				  money = input.nextDouble();
				  System.out.print("\nEnter time since last transaction(in months): ");
				  time = input.nextInt();
				  account1.withdraw(money,time);
				  break;
			
			case 3:account1.showDetails();
				  break;
			
			case 4:break;
			
			default: System.out.print("\n\n Wrong Choice! \nTerminating...\n");
				    System.exit(0);			

                }
		}
 
				   break;
	
			case 2: System.out.print("\n\nEnter Customer Name: ");
				   name = input.nextLine();
				   System.out.print("\nEnter Initial amount to be deposited(Min. limit is Rs.1000): ");
				   money = input.nextDouble();
				   SavingsAccount account2 = new SavingsAccount(name,"Saving Account",money);

		while(choice!=4)
		{
					System.out.print("\n\n ----Account Menu----");
		System.out.print("\n\n1.Deposit money");
		System.out.print("\n2.Withdraw money");
		System.out.print("\n3.Get mini statement");
		System.out.print("\n4.exit");
		System.out.print("\n\nChoice: ");
		choice = input.nextInt();
	
		switch(choice)
		{
			case 1:System.out.print("\n\nEnter Amount to be deposited: ");
				  money = input.nextDouble();
				  System.out.print("\nEnter time since last transaction(in months): ");
				  time = input.nextInt();
				  account2.deposit(money,time);
				  break;
		
			case 2:System.out.print("\n\nEnter Amount to be withdrawn: ");
				  money = input.nextDouble();
				  System.out.print("\nEnter time since last transaction(in months): ");
				  time = input.nextInt();
				  account2.withdraw(money,time);
				  break;
			
			case 3:account2.showDetails();
				  break;
			
			case 4:break;
			
			default: System.out.print("\n\n Wrong Choice! \nTerminating...\n");
				    System.exit(0);			

                }
		}
 
				   break;

			default: System.out.print("\n\n Wrong Choice! \nTerminating...\n");
				    System.exit(0);
			
		}
	}
}
                
                
                
                
                
                
                
                
                
                         
