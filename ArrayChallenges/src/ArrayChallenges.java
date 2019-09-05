import java.util.Scanner;

public class ArrayChallenges
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
			System.out.println("Hello! How many favorite sweets do you have?");
				
			int numberOfSweets = userInput.nextInt();
			
		
			String [] printSweets = new String[numberOfSweets];
			
			printSweets [numberOfSweets] = userInput.next();
			
					for (String p : printSweets)
						{
							
					System.out.println("Enter your sweet: ");
					
					System.out.println("Ahhh your, " + numberOfSweets + " favorite sweet: " + p);
						}
						
			}

	}
