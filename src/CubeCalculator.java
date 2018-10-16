import java.util.Scanner;
/*
 * Tyler Wassel
 * Period 5
 */
public class CubeCalculator 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name = user.nextLine();
		System.out.println("Hello " + name + " Welcome to the cube calculator.");
		System.out.println("Volume Of A Cube");
		System.out.print("Please enter the length of one side: ");
		String sideStr = user.nextLine();
		double side = Double.parseDouble(sideStr);
		System.out.print("Please enter the unit of measure: ");
		String unit = user.nextLine();
		double volume = side * side * side;
		System.out.print("The volume of your cube is " + volume + " " + unit + "^3");
				
				

	}

}
