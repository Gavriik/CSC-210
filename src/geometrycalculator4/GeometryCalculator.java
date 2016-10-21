package geometrycalculator4;

import java.util.Scanner;

public class GeometryCalculator {

	public static void main(String[] args) {

		// scanner
		Scanner inputChoice = new Scanner(System.in);
		int choiceNumbers;

		// do while loop
		do {
			System.out.println("\nGeometry Calculator\n" + "\n1. Calculate the Area of a Circle"
					+ "\n2. Calculate the Area of a Rectangle" + "\n3. Calculate the Area of a Triangle" + "\n4. Quit"
					+ "\n\nEnter your choice (1-4):");

			choiceNumbers = inputChoice.nextInt();

			if (choiceNumbers == 1) {
				System.out.println("Area of Circle is " + Geometry.getArea(Geometry.radius));
			}

			else if (choiceNumbers == 2) {
				System.out.println("Area of Rectangle is " + Geometry.getArea(Geometry.length, Geometry.width));
			}

			else if (choiceNumbers == 3) {
				System.out.println("Area of Triangle is " + Geometry.getArea(Geometry.base, Geometry.height));
			}

			else if (choiceNumbers == 4) {
				System.out.println("You have exited the program.");
				break;
			}

			else {
				System.out.println("Invalid value!!!, please enter a value from (1-4)");
				//choiceNumbers = inputChoice.nextInt();
			}

		} while (choiceNumbers < 1 || choiceNumbers > 4); // loops menu if answer is not 1-4. Works great, but will not loop menu again after giving the area. 
		//while (choiceNumbers < 1 || choiceNumbers < 4); // menu loops after giving area, but if you enter more than 4 on menu choice, it will not loop
		// only option is to put another scanner in else.

		inputChoice.close();
	}

}