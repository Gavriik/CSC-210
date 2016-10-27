package employeeworker6;

public class ProductionWorkerDemo {
	public static void main(String[] args) {
		ProductionWorker pw = new ProductionWorker("John Smith", "123-A", "11-15-2005", ProductionWorker.DAY_SHIFT,
				16.50);
		System.out.println("Here's the first production worker. ");
		System.out.println(pw);
		ProductionWorker pw2 = new ProductionWorker();
		pw2.setName("Joan Jones");
		pw2.setEmployeeNumber("222-L");
		pw2.setHireDate("12-12-2005");
		pw2.setShift(ProductionWorker.NIGHT_SHIFT);
		pw2.setPayRate(18.50);
		System.out.println("\nHere's the second production worker. ");
		System.out.println(pw2);
	}
	
}