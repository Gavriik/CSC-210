package employeeworker6;

public class ProductionWorkerDemo {
	
	public static void main(String[] args) {
		
		// here we are invoking the constructor to create an object or instance of "Employee"
		ProductionWorker pw = new ProductionWorker("John Smith", "123-A", "11-15-2005", ProductionWorker.DAY_SHIFT, 16.50);
		
		// print first created employee
		System.out.println("Here's the first production worker. ");
		System.out.println(pw);
		
		// production worker set employee number
		ProductionWorker pw2 = new ProductionWorker();
		// production worker set name
		pw2.setName("Joan Jones");
		// production worker set employee number
		pw2.setEmployeeNumber("222-L");
		// production worker set hire date
		pw2.setHireDate("12-12-2005");
		// production worker set shift
		pw2.setShift(ProductionWorker.NIGHT_SHIFT);
		// production worker set pay rate
		pw2.setPayRate(18.50);
		
		// print second employee
		System.out.println("\nHere's the second production worker. ");
		System.out.println(pw2);
	}
	
}