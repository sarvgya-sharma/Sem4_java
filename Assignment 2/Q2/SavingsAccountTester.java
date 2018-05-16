//CO24557 Assignment 2 - problem 2
//creates a saving account and calculates monthly interest 

class SavingsAccount
{
	private double savingsBalance;
	private static double annualInterestRate;

	public SavingsAccount(double savingsBalance)
	{
		this.savingsBalance = savingsBalance;
	}

	public static void modifyInterestRate(double newInterestRate)
	{
		annualInterestRate = newInterestRate;
	}

	public double getSavingsBalance()
	{ return  savingsBalance; }

	public double getAnnualInterestRate()
	{ return  annualInterestRate; }

	public void calculateMonthlyInterest()
	{
		double monthlyInterest;
		monthlyInterest = (annualInterestRate/1200)*savingsBalance;   
					//div by 12*100 to get monthly interest in decimal
		savingsBalance += monthlyInterest;
	}

}

public class SavingsAccountTester
{
	public static void main(String[] args)
	{
		SavingsAccount saver1 = new SavingsAccount(2000.0);
		SavingsAccount saver2 = new SavingsAccount(3000.0);

		System.out.println("\n Saver 1 balance in account : "+saver1.getSavingsBalance());
		System.out.println(" Saver 2 balance in account : "+saver2.getSavingsBalance());

		System.out.println("\n Now applying 4% annual interest rate....");
		
		SavingsAccount.modifyInterestRate(4.0);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();

		System.out.println("\n Saver 1 balance in account next month : "+saver1.getSavingsBalance());
		System.out.println(" Saver 2 balance in account next month : "+saver2.getSavingsBalance());	
	}
}

		