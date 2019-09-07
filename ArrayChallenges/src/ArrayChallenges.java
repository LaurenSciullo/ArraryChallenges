import java.util.Scanner;

public class ArrayChallenges
	{

		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				Scanner userInput2 = new Scanner(System.in);
			System.out.println("Hello! How many favorite sweets do you have?");
				
			int numberOfSweets = userInput.nextInt();
	
			
			String[] printSweets = new String[numberOfSweets];
			
					for (int i =0; i < numberOfSweets ; i++)
						{
							
					System.out.println("Enter your sweet: " );
					String userSweets = userInput2.nextLine();
					
					printSweets [i] = userSweets;
					}
					
					if (numberOfSweets ==1)
						{
							System.out.println("Your sweet: ");
							for (String p: printSweets)
								{
							
									System.out.println(p);	
								}
						}
							
					else 
						{
					System.out.println("Your sweets: ");
					for (String p: printSweets)
						{
					
							System.out.println(p);	
						}
					
						}
						
					
			}
						
	}
