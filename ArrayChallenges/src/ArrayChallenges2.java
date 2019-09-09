import java.util.Scanner;

public class ArrayChallenges2 {

	public static void main(String[] args) {
		Scanner intInput = new Scanner(System.in);
		
		System.out.println("Hello!");
		
		int[] printNumbers = new int[8];
		
		for (int i = 0; i < 8; i++ )
		{
			System.out.println("Please input a number: ");
			int numberInputs = intInput.nextInt();
			
			printNumbers [i] = numberInputs;
		}
		
		
		
		System.out.println("Your even numbers: ");	
		for (int p: printNumbers)
		{
			if (p%2 ==0)
			{
			System.out.println(p);
		}
		}
	
		
		
		System.out.println("Your odd numbers: ");
		for (int p: printNumbers)
		{
		if (p%2 != 0)
		{

			System.out.println(p);
		
		}
		}
		
		
		
	}

}
