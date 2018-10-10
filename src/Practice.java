import java.util.Scanner;

public class Practice
{

	public static void main(String[] args)
	{
		//printing
		System.out.print("I know how to print.");
		
		//printing the value of a variable
		int value = 10; 
		double  decimal = 6.25; // declared an initialized
		String user = "i can do this"; // declared and initialized in one line
		//print the value of each
		System.out.println("\n"  + value);
		System.out.println(decimal);
		System.out.println(user);
		
		value += 30;
		decimal = decimal -25.012345;
		user += " more stuff";
		System.out.println("Value: " + value);
		System.out.println("Decimal: " + decimal);
		System.out.println("User:" + user);
		
		Scanner Tyler = new Scanner (System.in);
		System.out.print("Please enter your favorite sport:   " );
		String sport= Tyler.nextLine();
		System.out.print("\nYour favorite sport is " + sport + ", and mine is football.");
	
		
	}

}
