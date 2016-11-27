package filearray7;

//import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Arrays;

public class FileArrayDemo {
	
	public static int[] firstArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public static int[] secondArray = new int[10];

	public static void main(String[] args) throws IOException {

		// display "print" first array
		JOptionPane.showMessageDialog(null, "Contents of first array: " + toString(firstArray));
		
		// ask user for output file path
		String savePath = JOptionPane.showInputDialog("Name the output file");
		
		// write first array into file
		FileArray.writeArray(savePath, firstArray);
		JOptionPane.showMessageDialog(null, "Writing the contents of first array into " + savePath);

		// ask user for input file path
		String inputPath = JOptionPane.showInputDialog("Enter input file path");

		// input file into readArray() method to create a second array with the same values as the first array
		FileArray.readArray(inputPath, secondArray);
		JOptionPane.showMessageDialog(null, "Reading contents of " + savePath + " to create a new second array..");

		// display "print" second array
		JOptionPane.showMessageDialog(null, "Contents of new second array: " + toString(secondArray));
	}

	// prints array
	public static String toString(int[] array) {
		return Arrays.toString(array);
	}

}