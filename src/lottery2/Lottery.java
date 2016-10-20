package lottery2;

import java.util.Random;

class Lottery {

	// the lottery numbers.
	public int[] lotteryNumbers;

	// constructor using the Random Class from the Java API to generate a random
	// number in the range of 0 to 9 for each element in the array.

	public Lottery() {
		Random random = new Random();
		lotteryNumbers = new int[5];
		for (int i = 0; i < lotteryNumbers.length; i++) {
			lotteryNumbers[i] = random.nextInt(9);
		}
	}

	// this method compares the user numbers with the lottery numbers and
	// returns the number of digits that match.
	public int compareNumbers(int[] playerNumbers) {
		int match = 0;
		if (playerNumbers.length == lotteryNumbers.length) {
			for (int i = 0; i < lotteryNumbers.length; i++) {
				for (int j = 0; j < lotteryNumbers.length; j++) {
					if (playerNumbers[i] == lotteryNumbers[j]) {
						match++;
						break;
					}
				}
			}
		}
		return match;
	}

	public void getMatchingNumbers(int[] playerNumbers) {
		if (playerNumbers.length == lotteryNumbers.length) {
			for (int i = 0; i < playerNumbers.length; i++) {
				for (int j = 0; j < lotteryNumbers.length; j++) {
					if (playerNumbers[i] == lotteryNumbers[j]) {
						System.out.print(lotteryNumbers[j] + " ");
					}
				}
			}
		}
	}

	// this method returns a copy of the lotteryNumbers array.
	public int[] getLotteryNumbers() {
		return lotteryNumbers;
	}
}