import java.util.Scanner;

public class GeometryCalculator 
{

	public static void main(String[] args) 
	{
		Scanner bread = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String name;
		name = bread.nextLine();
		System.out.println("\n\nHello, " + name + ", welcome to the Geometry Calculator");
		System.out.println("Press enter to continue...");
		bread.nextLine();
		System.out.println("AREA OF A TRIANGLE");
		System.out.print("Please enter the measure of the base: ");
		String baseStr = bread.nextLine();
		System.out.print("\nPlease enter the measure of the height: ");
		String heightStr = bread.nextLine();
		double base;
		base = Double.parseDouble(baseStr);
		double height = Double.parseDouble(heightStr);
		System.out.print("Please enter the unit of measure: ");
		String unit = bread.nextLine();
		double area = .5*(base*height);
		System.out.println("The area of the triangle is " + area + " " + unit + "^2");
		
	}

}
