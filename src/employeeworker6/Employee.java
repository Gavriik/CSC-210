package employeeworker6;

public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;

	// constructor - creates employee object with parameters included to specify initial state 
	public Employee(String n, String num, String date) {
		name = n;
		setEmployeeNumber(num);
		hireDate = date;
	}

	// constructor -
	public Employee() {
		name = "";
		employeeNumber = "";
		hireDate = "";
	}
	
	// method - sets hire date for employee
    public void setHireDate(String inputtedDate) {
        hireDate = inputtedDate;
    }

    // method - sets name for employee
	public void setName(String inputtedName) {
		name = inputtedName;
	}

	// method - sets employee number
	public void setEmployeeNumber(String e) {
		if (isValidEmpNum(e))
			employeeNumber = e;
		else
			employeeNumber = "";
	}

	// method - gets hire date from 
	public String getHireDate() {
		return hireDate;
	}

	private boolean isValidEmpNum(String e) {
		boolean status = true;
		if (e.length() != 5)
			status = false;
		else {
			if ((!Character.isDigit(e.charAt(0))) || (!Character.isDigit(e.charAt(1)))
					|| (!Character.isDigit(e.charAt(2))) || (e.charAt(3) != '-')
					|| (Character.toUpperCase(e.charAt(4)) < 'A') || (Character.toUpperCase(e.charAt(4)) > 'M'))
				status = false;
		}
		return status;
	}

	public String toString() {
		String str = "Name: " + name + "\nEmployee Number: ";
		if (employeeNumber == "")
			str += "INVALID EMPLOYEE NUMBER";
		else
			str += employeeNumber;
		return str += ("\nHire Date: " + hireDate);
	}
	
}