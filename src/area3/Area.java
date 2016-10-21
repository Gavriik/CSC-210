package area3;

import java.util.Scanner;

class Area {

	public static double radius;
	public static int width;
	public static int length;
	public static double height;

	// methods
	public static Scanner scanner = new Scanner(System.in);

	// calculate area of circle
	public static double getArea(double radius) {
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		radius = scanner.nextDouble();
		scanner.close();
		return Math.PI * radius * radius;
	}

	// calculate area of rectangle
	public static double getArea(int length, int width) {
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		length = scanner.nextInt();
		System.out.println("Enter the width of Rectangle:");
		width = scanner.nextInt();
		return length * width;
	}

	// calculate area of cylinder
	public static double getArea(double radius, double height) {
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of Cylinder:");
		radius = scanner.nextInt();
		System.out.println("Enter the height of Cylinder:");
		height = scanner.nextInt();
		return 2 * (Math.PI * radius * radius) + height * (Math.PI * radius * radius);
	}
	
}