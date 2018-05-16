//CO24557 Assignment 2 - problem 4
//Adds all the numbers given as command line arguments

public class Add
{
	public static void main(String args[])
	{
		double sum =  0.0;
		for(int i=0;i<args.length;i++)
		{
			sum = sum + Double.parseDouble(args[i]);
		}
		
		System.out.println("Sum = "+sum);
	}
}