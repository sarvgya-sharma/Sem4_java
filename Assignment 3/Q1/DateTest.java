//CO24557 Assignment 3 - problem 1
//class Date : sets and shows date given by user
//class DateTest : takes date as input from user and implements the Date class

import java.util.Scanner;

class Date
{
	private int year,month,day ;

	public Date(int year,int month,int day)
	{
		this.year = year;
		this.month = month;
		this.day = day;
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
		
}

public class DateTest
{
	public static void main(String[] args)
	{
		int year,month,day;
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

		Date date = new Date(year,month,day);
		date.displayDate();	

		System.out.print("\n\nDo you want to change this date(y/n)? ");
		char ch = stdin.next().charAt(0);
		if(ch=='y'||ch=='Y')
		{
			System.out.print("\nEnter Year: ");	
			year = stdin.nextInt();
			date.setYear(year);
	
			System.out.print("\nEnter Month: ");	
			month = stdin.nextInt();
			while(month>12||month<=0)
			{
				System.out.print("\nInvalid Month!\nEnter month again: ");	
				month = stdin.nextInt();
			}
			date.setMonth(month);
	
			System.out.print("\nEnter day: ");	
			day = stdin.nextInt();
			while(day>31||day<=0)
			{
				System.out.print("\nInvalid Day!\nEnter day again: ");	
				day = stdin.nextInt();
			}
			date.setDay(day);
			System.out.print("\nDate changed succesfully! ");
			date.displayDate();
		}		
	
	}
}
