package geometrycalculator4;

import java.util.Scanner;

public class Geometry {
	// variables.
	public static double radius;
	public static int width;
	public static int length;
	public static double height;
	public static double base;

	// public scanner 
	public static Scanner scanner = new Scanner(System.in);

	// calculate area of circle
	public static double getArea(double radius) {
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius of Circle");
		radius = scanner.nextDouble();

		// note: this code will only be executed if number is negative
		// otherwise it will skip this code and go straight to the calculations
		while (radius < 0) {
			System.out.println("Positive numbers only please! Try Again");
			radius = scanner.nextDouble();
		}

		return Math.PI * radius * radius;
	}

	// calculate area of rectangle
	public static double getArea(int length, int width) {
		// Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Rectangle:");
		length = scanner.nextInt();
		
		while (length < 0) {
			System.out.println("Positive numbers only please! Try Again");
			length = scanner.nextInt();
		}
		
		System.out.println("Enter the width of Rectangle:");
		width = scanner.nextInt();

		while (width < 0) {
			System.out.println("Positive numbers only please! Try Again");
			width = scanner.nextInt();
		}

		return length * width;
	}

	// calculate area of cylinder
	public static double getArea(double base, double height) {
		
		System.out.println("Enter the base of Trinagle:");
		base = scanner.nextDouble();
		
		while (base < 0) {
			System.out.println("Positive numbers only please! Try Again");
			base = scanner.nextDouble();
		}
		
		System.out.println("Enter the height of Triangle:");
		height = scanner.nextDouble();
		
		while (height < 0) {
			System.out.println("Positive numbers only please! Try Again");
			height = scanner.nextDouble();
		}

		return base * height * 0.5;

	}
	
}
