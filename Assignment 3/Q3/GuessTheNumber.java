//CO24557 Assignment 3 - problem 3
//Guess the number game

import java.util.*;

class GuessTheNumber
{
	public static void main(String[] args)
	{
		char ch = 'y' ;
		while(ch=='y' || ch=='Y')
		{
			System.out.println("\n GUESS THE NUMBER GAME (1 to 1000) ");
			System.out.print("\n1.Easy \n2.Normal \n3.Hard");
			System.out.print("\n\n Select the difficulty level: ");
			
			Scanner stdin = new Scanner(System.in);
			int level  = stdin.nextInt();
			int chances = 9;
			switch(level)
			{
				case 1: chances = 13;
					break;

				case 2: chances = 10;
					break;

				case 3: chances = 7;
					break;

				default: System.out.println("\n Wrong choice!");
					    main(new String[1]);
			}

			Random rand = new Random();
			int key = rand.nextInt(1000)+1;
			int i;
			for(i=chances;i>0;--i)
			{
				System.out.printf("\n Enter your Guess(%d chances left): ",i);
				int guess = stdin.nextInt();
				if(guess == key)
				{
					System.out.print("\n\n Congratulations! You guessed the number.");
					break;
				}
				if(guess<key)
					System.out.println(" Too low. Try again.");
				else
					System.out.println(" Too High. Try again.");	
			}
			
			if(i==0)
				System.out.print("\n Sorry you lost. The number was "+key);

			System.out.print("\n\n Do you want to play again(y/n)? ");
			ch = stdin.next().charAt(0);

		}	
	}
}
				

			 
							 