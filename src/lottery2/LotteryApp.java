package lottery2;

/**
 * Lottery Application- Write a Lottery class that simulates a lottery. The
 * class should use the Random class (from the Java API) to generate a random
 * number in the range of 0 through 9 for each element in the array.
 * 
 * The class should also have a method that accepts an array of 5 integers that
 * represent a person's lottery picks. The method is to compare the
 * corresponding elements in the two arrays and return the number of digits that
 * match. For example, the following shows that lotteryNumbers array and the
 * user's array with sample numbers stored in each.
 * 
 * There are two matching digits (elements 2 and 4) lotteryNumbers array: (7, 4,
 * 9, 1, 3) user's array: (4, 2, 9, 7, 3)
 * 
 * In addition, the class should have a method that returns a copy of the
 * lotteryNumbers array.
 * 
 */

import java.util.Scanner;

public class LotteryApp {

	// main method
	public static void main(String[] args) {

		// create instance/object class
		Lottery lottery1 = new Lottery();
		int lotteryNumbersCount = lottery1.getLotteryNumbers().length;

		// asks the user to enter five numbers.
		System.out.println("Lottery Application\n");
		System.out.println("There are " + lotteryNumbersCount + " secret numbers in range of 0 through 9. "
				+ "Try to guess them!!!\n");

		// scan input
		Scanner inputNumbers = new Scanner(System.in);
		// get user input as array
		int playerNumbers[] = new int[lotteryNumbersCount];
		// store user numbers by order into array
		for (int i = 0; i < playerNumbers.length; i++) {
			System.out.print(String.format("Enter Number %d: ", i + 1));
			playerNumbers[i] = inputNumbers.nextInt();
		}

		// Display the number of digits that match the randomly generate
		// lottery numbers.

		int match = lottery1.compareNumbers(playerNumbers);

		if (match == lotteryNumbersCount) {

			// If all of the digits match, display a message proclaiming the
			// user a grand prize winner.
			System.out.println("\nWOHOO! ALL CORRECT! YOU WON THE BIG PRIZE!");
		}

		else {
			System.out.println("\nYou hit " + match + " number(s).");
		}

		// print player numbers
		System.out.print("Your numbers: ");
		for (int i = 0; i < playerNumbers.length; i++) {
			System.out.print(playerNumbers[i] + " ");
		}

		// print lottery number
		System.out.print(" Lottery numbers: ");
		for (int i = 0; i < lottery1.lotteryNumbers.length; i++) {
			System.out.print(lottery1.lotteryNumbers[i] + " ");
		}

		// print matching numbers
		System.out.print(" Matching numbers: ");
		lottery1.getMatchingNumbers(playerNumbers);

		inputNumbers.close();
	}
}