import java.util.Scanner;

public class PenniesForPay
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.println("Please enter the amount of days you want to be paid: ");
		int UserDays = user.nextInt();
		double pennies = 0.01;
		System.out.println(" Days          Amount");
		System.out.println("0       0.01");
		for(int days = 1; days < UserDays; days++)
		{
			pennies = pennies*2;
			System.out.printf("\n%d %10.2f", days, pennies);
		}
		System.out.printf("\nAfter " + UserDays + " you will have earned $%.2f", pennies );
		
	}

}
