
public class ArrayChallenges3 {

	public static void main(String[] args) {
		
		int[] printNumbers = new int[5];
		
		System.out.println("Your 5 random numbers: ");
		for (int i = 0; i < 5; i++)
		{
			int randomNumber = (int)(Math.random()*91+10);
			
			System.out.println(randomNumber);
			
			printNumbers [i] = randomNumber;
	
		}
		
		System.out.println("\nYour 5 random numbers backwords: ");
		
		for (int i = 4; i >= 0; i--)
			{
				System.out.println(printNumbers[i]);
			}
			
		
	}

}
