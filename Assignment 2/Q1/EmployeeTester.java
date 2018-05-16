//CO24557 Assignment 2 - problem 1
//creates object of two employees and shows their information; gives 10% raise and shows new information
 
import java.util.*;

class Employee
{
	private String firstName,lastName;
	private double monthlySalary;

	public Employee()
	{
		Scanner stdin = new Scanner(System.in);
		System.out.print("Enter the following information about employee: \n");
		System.out.println("First name: ");
		firstName = stdin.nextLine();
		System.out.println("Last name: ");
		lastName = stdin.nextLine();
		System.out.println("Monthly salary: ");
		monthlySalary = stdin.nextDouble();
		if(monthlySalary<0)	this.monthlySalary = 0.0;
	}

	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}

	public void setMonthlySalary(double monthlySalary)
	{
		if(monthlySalary<0)	this.monthlySalary = 0.0;
		else 	this.monthlySalary = monthlySalary ;
	}

	public String getFirstName() { return firstName; }
	public String getLastName() { return lastName; }
	public double getMonthlySalary() { return monthlySalary; }

}

public class EmployeeTester
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		System.out.println("\nFor Employee 1: ");
		System.out.println("Name : "+e1.getFirstName()+" "+e1.getLastName());
		System.out.println("Salary per annum : "+12*e1.getMonthlySalary());

		System.out.println("\nFor Employee 2: ");
		System.out.println("Name : "+e2.getFirstName()+" "+e2.getLastName());
		System.out.println("Salary per annum : "+12*e2.getMonthlySalary());	
		
		System.out.println("\n Now giving a 10% raise to each employee....");
		e1.setMonthlySalary(e1.getMonthlySalary()+0.1*e1.getMonthlySalary());
		e2.setMonthlySalary(e2.getMonthlySalary()+0.1*e2.getMonthlySalary());
		
		System.out.println("\nFor Employee 1: ");
		System.out.println("Name : "+e1.getFirstName()+" "+e1.getLastName());
		System.out.println("Salary per annum : "+12*e1.getMonthlySalary());

		System.out.println("\nFor Employee 2: ");
		System.out.println("Name : "+e2.getFirstName()+" "+e2.getLastName());
		System.out.println("Salary per annum : "+12*e2.getMonthlySalary());
	}
}