package filearray7;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

import java.io.FileNotFoundException;

/*
 * NOTE: I/O  means Input/Output, whenever dealing with input and output we need to use IOException, 
 * as we are also dealing with read(), write() and close() etc.
 * sometimes OS may not find file, read properly, write properly, or close properly. 
 * And IOExeption informs "throws" the programmer where is  the failure.
 * 
 * throws IOException  is attached to a method header
 * where this specifies that the method may going to throws IOException
 * and insist the compiler that the block which is calling this method needs some special attention towards this
 * regarding handling or again throwing back.
 * when if the methods throws any exceptions we can use "try catch" to handle the exception the way you want.
*/

public class FileArray {

	// writes first array into a new file
	public static void writeArray(String fileName, int[] array) throws IOException {
		
		try {
			FileOutputStream fstream = new FileOutputStream(fileName);
			DataOutputStream outputFile = new DataOutputStream(fstream);

			for (int index = 0; index < array.length; index++) {
				outputFile.writeInt(array[index]);
			}
			
			outputFile.close();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Directory where you want to save file does not exist!");
		}
	}

	// reads first array file and transfers values into a new second array.
	public static void readArray(String fileName, int[] array) throws IOException {
		
		try {
			FileInputStream fstream = new FileInputStream(fileName);
			DataInputStream inputFile = new DataInputStream(fstream);

			for (int index = 0; index < array.length; index++) {
				array[index] = inputFile.readInt();
			}

			inputFile.close();

		} catch (FileNotFoundException e) { // Note: catch(Exception e){ }   catches all the exceptions, but is not specific
			JOptionPane.showMessageDialog(null, "Specified File could not be found!");
		}
		
		while (array[1] == 0) {
			String inputPath = JOptionPane.showInputDialog("Name the output file");
			FileArray.readArray(inputPath, FileArrayDemo.secondArray);	
		}
		
	}

}