package area3;

import java.util.Scanner;

public class AreaApp {

	public static void main(String[] args) {

		System.out.println("Enter 1 to find the area of a Circle, " + "\nEnter 2 to find the area of a Rectangle, "
				+ "\nEnter 3 to find the area of a Cylinder");

		// scan input
		Scanner inputChoice = new Scanner(System.in);

		// decide what to do
		int choiceNumbers = inputChoice.nextInt();

		if (choiceNumbers == 1) {
			System.out.println("Area of Circle is " + Area.getArea(Area.radius));
		}

		else if (choiceNumbers == 2) {
			System.out.println("Area of Rectangle is " + Area.getArea(Area.length, Area.width));
		}

		else if (choiceNumbers == 3) {
			System.out.println("Area of Cylinder is " + Area.getArea(Area.radius, Area.height));
		}

		inputChoice.close();
	}

}