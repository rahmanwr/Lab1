
import java.util.*;

public class CalculateClassSize {
	public static void main(String args[]) {
		// declaring variables
		
		double length;
		double width;
		double area;
		double perimeter;
		
		String continueLoop;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter length of classroom");
		length = in.nextDouble();
		System.out.println("Enter Width of classroom");
		width = in.nextDouble();

		// Calculate Area of Classroom size = length * width

		area = length * width;

		// Calculate Perimeter of Classroom = 2 (length + Width)

		perimeter = 2 * (length + width);

		System.out.println(" Area of Classroom Area :   " + area);
		System.out.println("Area of Classroom Perimeter :   " + perimeter);
	
		// Prompt for user to continue
		System.out.print("Continue? (y/n): ");
		
		// Set value for loop control variable
		continueLoop = in.next();
		
		// Continuation clause
		while(continueLoop.equalsIgnoreCase("Y"));
		
	}

}