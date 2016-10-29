package employeeworker6;

import java.util.Scanner;

public class ProductionWorkerDemo {
	
	public static void main(String[] args) {
		
		// invoking constructor to create an object or instance of "ProductionWorker"
		ProductionWorker pw1 = new ProductionWorker("John Smith", "123-A", "11-15-2005", ProductionWorker.DAY_SHIFT, 16.50);
		
		// print first employee
		System.out.println("Production Worker #1 ");
		System.out.println(pw1);
		
		// scanner - gets user input
		Scanner userInput = new Scanner(System.in);
		
		// invoking constructor to create an object or instance of "ProductionWorker"
		ProductionWorker pw2 = new ProductionWorker();
		
		// production worker set name
		System.out.println("\nEnter your name: \n(Format: FirstName LastName)");
		pw2.setName(userInput.nextLine());
		// production worker set employee number
        System.out.println("Enter your employee number: \n(Format: 789-L)");
        pw2.setEmployeeNumber(userInput.nextLine());
        // production worker set hire date
        System.out.println("Enter your hire date: \n(Format: xx-xx-xxxx)");
        pw2.setHireDate(userInput.nextLine());
        // production worker set pay rate
        System.out.println("Enter your payrate: \n(Format: 10.50)");
        pw2.setPayRate(userInput.nextDouble());
        // production worker set shift
        System.out.println("Enter your shift (day=1, night=2): ");
        pw2.setShift(userInput.nextInt());
		
		// print second employee
		System.out.println("\nProduction Worker #2");
		System.out.println(pw2);
		
		// close scanner
		userInput.close();
	}
	
}