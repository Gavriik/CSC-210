package capitalizer;
import java.util.Scanner;

public class SentenCapitalizer {
	
    public static void main(String args[]){

    Scanner kb = new Scanner(System.in);
    String str;
    System.out.print("Enter a string: ");
    str = kb.nextLine();

    System.out.println(str);
    System.out.println(cap(str));    
    kb.close();
    }
    
    public static String cap(String str){
    	// scan through and look for the first non-whitespace character after a punctuation mark. use a boolean variable to do this.
    		
        char[] arr = str.toCharArray();

        // Start off by indicating to capitalize the first letter.
        boolean cap = true;
        
        for (int i = 0; i<arr.length; i++){
            if (cap == true && !Character.isWhitespace(arr[i])) {
                arr[i] =  Character.toUpperCase(arr[i]);
                cap = false;
            }
            
            else {
                if (arr[i] == '.' || arr[i] == '?') {
                    cap = true;
                }
            }
        }
        String s = new String(arr);
        return s;
    }       
}