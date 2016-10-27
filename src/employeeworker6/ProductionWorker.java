package employeeworker6;

import java.text.DecimalFormat;

public class ProductionWorker extends Employee {
	public static final int DAY_SHIFT = 1;
	public static final int NIGHT_SHIFT = 2;
	private int shift;
	private double payRate;

	// constructor - creates production worker object with parameters included to specify initial state 
	public ProductionWorker(String n, String num, String date, int sh, double rate) {
		super(n, num, date);
		shift = sh;
		payRate = rate;
	}

	// constructor - 
	public ProductionWorker() {
		super();
		shift = DAY_SHIFT;
		payRate = 0.0;
	}
	
	// method - set production worker shift
	public void setShift(int inputtedShift) {
		shift = inputtedShift;
	}

	// method - set production worker pay rate
	public void setPayRate(double inputtedPayRate) {
		payRate = inputtedPayRate;
	}

	// method - get production worker shift
	public int getShift() {
		return shift;
	}

	// method - get production worker pay rate
	public double getPayRate() {
		return payRate;
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