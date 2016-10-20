package capitalizer;

import java.util.Scanner;

// capitalizes first letter of sentence
public class SentenceCap {
	public static String line; // line of text entered by the user

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.println("Enter a line of text.");
       line = input.nextLine();
       System.out.println();
       System.out.println("Capitalized version:");
       System.out.println(capitalizeFirstLetterOfEachSentence(line));
       input.close();
    }  // end main()



public static String capitalizeFirstLetterOfEachSentence(String str){
    char[] arr = line.toCharArray();

    // Start off by indicating to capitalize the first letter.
    boolean cap = true;
    boolean space_found = true;

    for (int i = 0; i<arr.length; i++){
        if (cap) {
            // white space includes \n, space
            if (Character.isWhitespace(arr[i])) 
                space_found = true;
            else {
                if (space_found && !Character.isUpperCase(arr[i]))
                    arr[i] = Character.toUpperCase(arr[i]);

                cap = false;
                space_found = false;
            }
        } else {
            if (arr[i] == '.' || arr[i] == '?' || arr[i] == '!') {
                cap = true;
            }
        }
    }
    return new String(arr);
}
}