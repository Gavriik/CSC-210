package capitalizer;

import java.util.Scanner;

// capitalizes first letter of every word.
public class WordCapitalizer {

	public static void main(String[] args) {
		String line; // Line of text entered by user.
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a line of text.");
		line = input.nextLine();
		System.out.println();
		System.out.println("Capitalized version:");
		printCapitalized(line);
		input.close();
	}
	
	static void printCapitalized(String str) {
		// Print a copy of str to standard output, with the
		// first letter of each word in upper case.
		char ch; // One of the characters in str.
		char prevCh; // The character that comes before ch in the string.
		int i; // A position in str, from 0 to str.length()-1.
		prevCh = '.'; // Prime the loop with any non-letter character.
		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (Character.isLetter(ch) && !Character.isLetter(prevCh))
				System.out.print(Character.toUpperCase(ch));
			else
				System.out.print(ch);
			prevCh = ch;
		}
		System.out.println();
	}
}