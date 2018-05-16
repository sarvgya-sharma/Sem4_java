//CO24557 Assignment 3 - problem 5
//class Date : sets and shows date given by user
//package for employee management system

package Date;

import java.util.Scanner;

public class MyDate
{
	private int year,month,day ;

	public MyDate() {}		//default constructor

	public MyDate(int year,int month,int day)	//param constructor
	{
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public MyDate(MyDate date)		//clone constructor
	{
		this.year = date.year;
		this.month = date.month;
		this.day = date.day;

	}
	
	public void setYear(int year)
	{	this.year = year;	}
	
	public void setMonth(int month)
	{	this.month = month;	}

	public void setDay(int day)
	{	this.day = day;	}

	public int getYear() 
	{ return year;	}

	public int getMonth() 
	{ return month;	}
	
	public int getDay() 
	{ return day;	}

	public void displayDate()
	{ 
	
		System.out.print("\nDate: "+month+"/"+day+"/"+year);	
	}
		

	public void getDate()
	{
		Scanner stdin = new Scanner(System.in);

		System.out.print("\nEnter Year: ");	
		year = stdin.nextInt();

		System.out.print("\nEnter Month: ");	
		month = stdin.nextInt();
		while(month>12||month<=0)
		{
			System.out.print("Invalid Month!\nEnter month again: ");	
			month = stdin.nextInt();
		}

		System.out.print("\nEnter day: ");	
		day = stdin.nextInt();
		while(day>31||day<=0)
		{
			System.out.print("Invalid Day!\nEnter day again: ");	
			day = stdin.nextInt();
		}

		this.displayDate();	

	}
}


