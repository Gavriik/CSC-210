package employeeworker6;

import java.text.DecimalFormat;

/**
* This class is a subclass of the Employee superclass.
* It extends the Employee class by adding fields and methods that
* are specific to a Production Worker, which is a kind of employee.
*/

public class ProductionWorker extends Employee {
	public static final int DAY_SHIFT = 1;
	public static final int NIGHT_SHIFT = 2;
	private int shift;
	private double payRate;

	// deconstructor - creates production worker1 object with parameters included to specify initial state
	  /**
	   * Default constructor.
	   * This constructor sets the name, number and hire date for an Employee.
	   * Then it sets up the specific fields for a ProductionWorker.
	   * @param name The employee's name
	   * @param number The employee's number
	   * @param hireDate The date the employee was hired
	   * @param shift The shift the employee works
	   * @param payRate How much the employee is paid per hour
	   */
	public ProductionWorker(String inputName, String inputNumber, String inputDate, int inputShift, double inputRate) {
		super(inputName, inputNumber, inputDate); // invoking superclass (employee) constructor 
		shift = inputShift;
		payRate = inputRate;
	}

	// constructor - creates production worker2 object with parameters included to specify initial state
	  /**
	   * Copy constructor.
	   * This constructor will create a new ProductionWorker by copying another.
	   * @param pw An existing ProductionWorker object
	   */
	public ProductionWorker() {
		super(); // invoking superclass (employee) constructor 
		shift = DAY_SHIFT;
		payRate = 0.0;
	}
	
	// accessor method (getter) - get production worker shift
	public int getShift() {
		return shift;
	}
	
	// mutator method (setter) - set production worker shift
	public void setShift(int inputtedShift) {
		shift = inputtedShift;
	}
	
	// accessor method (getter) - get production worker pay rate
	public double getPayRate() {
		return payRate;
	}

	// mutator (setter) - set production worker pay rate
	public void setPayRate(double inputtedPayRate) {
		payRate = inputtedPayRate;
	}
	
	public String toString() {
		DecimalFormat dollar = new DecimalFormat("###0.00");
		String str = super.toString();
		str += "\nShift: ";
		if (shift == DAY_SHIFT)
			str += "Day";
		else if (shift == NIGHT_SHIFT)
			str += "Night";
		else
			str += "INVALID SHIFT NUMBERS";
		return str += ("\nHourly Pay Rate: $" + dollar.format(payRate));
	}
	
}