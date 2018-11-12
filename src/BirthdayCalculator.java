import java.util.Scanner;

/*
 * @author Tyler Wassel
 * Period 5
 * Birthday Calculator
 */
public class BirthdayCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("First person please enter your name: ");
		String firstName = user.nextLine();
		System.out.print("Please enter the your birthday: ");
		int firstBirthday = user.nextInt();
		System.out.print("Please enter your birth month as a number: ");
		int firstBirthMonth = user.nextInt();
		System.out.print("Please enter your birth year: ");
		int firstBirthYear = user.nextInt();
		
		System.out.print("Second person please enter your name: ");
		String secondName = user.nextLine();
		System.out.print("Please enter your birthday: ");
		int secondBirthday = user.nextInt();
		System.out.print("Please enter your birth month as a number: ");
		int secondBirthMonth = user.nextInt();
		System.out.print("Please enter your birth year: ");
		int secondBirthYear = user.nextInt();
		
		if( firstBirthYear < secondBirthYear)
		{
			System.out.println(firstName + " is older");
			
		}
		else if (firstBirthYear > secondBirthYear)
		{
		
			System.out.println(secondName + " is older");
		}
		else
		{ 
			if( firstBirthMonth < secondBirthMonth)
			{
				System.out.println(firstName + " is older");
				
			}
			else if (firstBirthMonth > secondBirthMonth)
			{
			
				System.out.println(secondName + " is older");
			}
			else
			{ 
				if( firstBirthday < secondBirthday)
				{
					System.out.println(firstName + " is older");
					
				}
				else if (firstBirthday > secondBirthday)
				{
				
					System.out.println(secondName + " is older");
				}
				else
				{ 
				System.out.println("You are the same age");
				}
			}
		}
	
		
	}
}

