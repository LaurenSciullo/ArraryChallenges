
public class ArrayChallenges3 {

	public static void main(String[] args) {
		
		int[] printNumbers = new int[5];
		System.out.println("Your 5 random numbers: ");
		for (int p: printNumbers)
		{
			int randomNumber = (int)(Math.random()*91+10);
			
			System.out.println(randomNumber);
			
			printNumbers [p] = randomNumber;
			
		}
		
		
	}

}
