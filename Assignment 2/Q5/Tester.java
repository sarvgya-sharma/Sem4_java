//CO24557 Assignment 2 - problem 5
//student class inherits from person class and displays their information

import java.util.*;

class Person
{
	private String name,address,phoneNumber;	

	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber)
	{
		this.phoneNumber = phoneNumber;
	}

	public String getName() { return name; }
	public String getAddress() { return address; }
	public String getPhoneNumber() { return phoneNumber; }

}

class Student extends Person
{
	private String rollNumber,branch;
	private float marks;

	public void setRollNumber(String roll)
	{
		rollNumber = roll;
	}
	
	public void setBranch(String branch)
	{
		this.branch = branch;
	}

	public void setMarks(float marks)
	{
		this.marks = marks;
	}

	public String getRollNumber() { return rollNumber; }
	public String getBranch() { return branch; }
	public float getMarks() { return marks; }

}

public class Tester
{
	public static void main(String[] args)
	{
		Student student = new Student();
		String temp1;
		float temp2;
		Scanner stdin = new Scanner(System.in);

		System.out.print("Enter the following information about student: \n");
		System.out.println("Name: ");
		temp1 = stdin.nextLine();
		student.setName(temp1);
		System.out.println("Address: ");
		temp1 = stdin.nextLine();
		student.setAddress(temp1);
		System.out.println("Phone Number: ");
		temp1 = stdin.nextLine();
		student.setPhoneNumber(temp1);
		System.out.println("Roll Number: ");
		temp1 = stdin.nextLine();
		student.setRollNumber(temp1);
		System.out.println("Branch: ");
		temp1 = stdin.nextLine();
		student.setBranch(temp1);
		System.out.println("Marks: ");
		temp2 = stdin.nextFloat();
		student.setMarks(temp2);

		System.out.println("\nFollowing are details of the student: ");
		System.out.println("Name: "+student.getName());
		System.out.println("Address: "+student.getAddress());
		System.out.println("Phone Number: "+student.getPhoneNumber());
		System.out.println("Roll Number: "+student.getRollNumber());
		System.out.println("Branch: "+student.getBranch());
		System.out.println("Marks: "+student.getMarks());

		stdin.close();
	}

}






