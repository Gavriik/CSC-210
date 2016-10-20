package rainfall1;

public class Rainfall {
	public static String[] monthName = { "January", "February", "March", "April", "May", "June", "July", "August",
			"September", "October", "November", "December" };
	public static double[] rainFall;

	// Get Total Rainfall
	public static double getTotal() {

		double total = 0;
		for (int i = 0; i < 12; i++) {
			total += rainFall[i];
		}
		return total;
	}

	// Get Average Rainfall
	public static double getAverage() {
		double average;
		average = getTotal() / 12.0;
		return average;
	}

	// Get Maximum Rainfall
	public static double[] getMax() {

		double[] max = { rainFall[0], 0 };
		for (int i = 1; i < 12; i++) {
			if (rainFall[i] > max[0]) {
				max[0] = rainFall[i];
				max[1] = i;
			}
		}
		return max;
	}

	// Get Minimum Rainfall
	public static double[] getMin() {

		double[] min = { rainFall[0], 0 };
		for (int i = 1; i < 12; i++) {
			if (rainFall[i] < min[0]) {
				min[0] = rainFall[i];
				min[1] = i;
			}
		}
		return min;
	}

	// Get month name
	public static void monthRainFall() {
		for (int i = 0; i < 12; i++) {
			System.out.println(monthName[i] + "\t\t" + rainFall[i]);
		}
	}
}
