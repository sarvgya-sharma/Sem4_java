//CO24557 Assignment 3 - problem 5
//Employee management system - shows leave balance and salary since DOJ

import java.util.*;
import java.time.LocalDate;
import Date.*;		//user-defined package

class Employee
{
	double leavesPerMonth;
	double initialSalary;
	int hike;

	public Employee() {}

	public void showDetails(MyDate doj,float leaves)
	{
		LocalDate today = LocalDate.now();			//for today's date
		int cur_year = today.getYear();
		int cur_month = today.getMonthValue();
		
		int yearsOfWork = cur_year - doj.getYear();
		if(cur_month-doj.getMonth() < 0)
			yearsOfWork--;

		while(yearsOfWork>0)
		{
			initialSalary = initialSalary + (initialSalary*hike/100);
			yearsOfWork--;
		}

		System.out.printf("\n\nSalary of employee per month now: Rs. %.3f lakhs",initialSalary/12);
		System.out.print("\nLeaves remaining = "+((leavesPerMonth*12)-leaves));		 
	}
}

class Manager extends Employee
{
	public Manager()
	{
		initialSalary = 12.0;		//in lpa
		leavesPerMonth = 2.5;
	}
}


class Engineer extends Employee
{
	public Engineer() {}
}

class Researcher extends Employee
{
	public Researcher()
	{
		initialSalary = 12.0;		//in lpa
	}
}


class HR extends Manager
{
	public HR()
	{
		hike = 20;		//percentage
	}
}

class Technology extends Manager
{
	public Technology()
	{
		hike = 30;		//percentage
	}
}


class Developer extends Engineer
{
	public Developer()
	{
		initialSalary = 10.0;		//in lpa
		leavesPerMonth = 3;
		hike = 40;				//percentage
	}
}

class Tester extends Engineer
{
	public Tester()
	{
		initialSalary = 6.0;		//in lpa
		leavesPerMonth = 2.5;
		hike = 10;				//percentage
	}
}

class Architect extends Engineer
{
	public Architect()
	{
		initialSalary = 12.0;		//in lpa
		leavesPerMonth = 4;
		hike = 50;				//percentage
	}
}

class DataScience extends Researcher
{
	public DataScience()
	{
		leavesPerMonth = 4;
		hike = 50;				//percentage
	}
}

class Analytics extends Researcher
{
	public Analytics()
	{
		leavesPerMonth = 3;
		hike = 40;				//percentage
	}
}

class Cloud extends Researcher
{
	public Cloud()
	{
		leavesPerMonth = 3;
		hike = 40;				//percentage
	}
}


public class EmployeeManagementSystem
{
	public static void main(String[] args)
	{
		float leaves;
		MyDate doj = new MyDate();
		Scanner input = new Scanner(System.in);
		int ch;

		System.out.print("\n\nEnter the employee's date of Joining: ");
		doj.getDate();
	
		System.out.print("\n\nEnter the Leaves taken for the current year: ");
		leaves = input.nextFloat();
		
		System.out.print("\nSelect the designation of Employee: ");
		System.out.print("\n\n1.HR Manager");
		System.out.print("\n2.Technology Manager");
		System.out.print("\n3.Developer");
		System.out.print("\n4.Tester");
		System.out.print("\n5.Architect");
		System.out.print("\n6.Data Science Researcher");
		System.out.print("\n7.Analytics Researcher");
		System.out.print("\n8.Cloud Researcher");
		System.out.print("\n\nChoice: ");
		
		ch = input.nextInt();

		switch(ch)
		{
			case 1: HR emp1 = new HR();
				   emp1.showDetails(doj,leaves);
				   break;
			case 2: Technology emp2 = new Technology();
				   emp2.showDetails(doj,leaves);
				   break;
			case 3: Developer emp3 = new Developer();
				   emp3.showDetails(doj,leaves);
				   break;
			case 4: Tester emp4 = new Tester();
				   emp4.showDetails(doj,leaves);
				   break;
			case 5: Architect emp5 = new Architect();
				   emp5.showDetails(doj,leaves);
				   break;
			case 6: DataScience emp6 = new DataScience();
				   emp6.showDetails(doj,leaves);
				   break;
			case 7: Analytics emp7 = new Analytics();
				   emp7.showDetails(doj,leaves);
				   break;
			case 8: Cloud emp8 = new Cloud();
				   emp8.showDetails(doj,leaves);
				   break;
			default: System.out.print("\nWrong Choice! \nTerminating...\n");
				    System.exit(0);
		}

	}
}
	
		







	