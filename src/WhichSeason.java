import java.util.Scanner;

/*
 * @author Tyler Wassel
 * Period 5
 */
public class WhichSeason 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter a numerical value of the month you were born in: ");
		int month = user.nextInt();
		if (month> 12 || month<1)
		{
			System.out.println("That is an invalid month");
		}
		else
		{
			if(month == 12 || month <= 2 )
			{
				System.out.print("You were born in Winter");
			}
			else if(month <= 5)
			{
				System.out.print("You were born in Spring");
			}
			else if (month <= 8)
			{
				System.out.print("You were born in Summer");
			}
			else
			{ 
				System.out.print("You were born in Autumn");
			}
		}
		
	}

}
