package rainfall1;

import java.util.Scanner;

public class RainfallApp {

	// main method
	public static void main(String[] args) {

		Scanner inputMonths = new Scanner(System.in);
		Rainfall.rainFall = new double[12];

		for (int i = 0; i < Rainfall.rainFall.length; i++) {
			System.out.println("Enter rain activity in inches for " + Rainfall.monthName[i] + ":");
			Rainfall.rainFall[i] = inputMonths.nextDouble();
			
			while (Rainfall.rainFall[i] < 0) {
				System.out.println("invalid value, please enter positive! numbers only.");
				Rainfall.rainFall[i] = inputMonths.nextDouble();
			}
		}

		System.out.println("The total rainfall is: " + Rainfall.getTotal() + " inches");
		System.out.printf("The average rainfall is: " + "%.2f", Rainfall.getAverage());
		System.out.println(" inches");
		double[] max = Rainfall.getMax();
		System.out.println(
				"The maximum rainfall is: " + max[0] + " inches for the Month " + Rainfall.monthName[(int) max[1]]);
		double[] min = Rainfall.getMin();
		System.out.println(
				"The minimum rainfall is: " + min[0] + " inches for the Month " + Rainfall.monthName[(int) min[1]]);

		inputMonths.close();

	}
}