package sentencecapitalizer5;

import java.util.Scanner; 

/*Write a method that accepts a String Object as an argument and returns a copy of the string with the first character of each sentence capitalized. For instance, if the argument is 

“hello. my name is Joe. what is your name?” 

the method should return the string 

“Hello. My name is Joe. What is your name?”

Demonstrate the method in a program that asks the user to input a string and then passes it to the method. The modified string should be displayed on the screen.

*/



//capitalizes first letter of every sentence.
public class SentenceCapitalizer {
	
	public static String sentence; // line of text entered by the user

	public static void main(String[] args) {
		
		Scanner inputSentc = new Scanner(System.in);
		System.out.println("Enter a line of text.");
		sentence = inputSentc.nextLine();
		System.out.println();
		System.out.println("Capitalized version:");
		printCapitalized( sentence );
		inputSentc.close();
	}
    
	static void printCapitalized( String str ) {
		
		// using StringBuilder
		int position = 0;
		boolean capitalize = true;
		
		// sb (stringbuilder) is an instance of StringBuilder. 
		StringBuilder sb = new StringBuilder(sentence);
		
		while (position < sb.length()) {
			
		    if (sb.charAt(position) == '.' || sb.charAt(position) ==  '?' || sb.charAt(position) ==  '!') {
		        capitalize = true;
		    }

		    else if (capitalize && !Character.isWhitespace(sb.charAt(position))) {
		        sb.setCharAt(position, Character.toUpperCase(sb.charAt(position)));
		        capitalize = false;
		    }
		    position++;
		}
		System.out.println(sb.toString());
	}
    
}