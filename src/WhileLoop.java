import java.util.Scanner;

/*
 * Tyler Wasssel
 * Period 5
 */
public class WhileLoop
{

	public static void main(String[] args)
	{
		System.out.println("Please enter an number greater than 1: ");
		Scanner user = new Scanner (System.in);
		int number = user.nextInt();
		
		while(number <= 1)
		{
			System.out.println("Please enter a number greater than 1: ");
			 number = user.nextInt();
		}
		int LoopCounter = 0;
		
		while (number > 1 && number <= 100)
		{
			number = 2*number;
			LoopCounter++;
		}
		System.out.print("You have multiplied your number by 2 " + LoopCounter + " times");
	}

}
