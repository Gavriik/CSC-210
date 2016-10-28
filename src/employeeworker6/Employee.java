package employeeworker6;


// This class will serve as a superclass for different types of employees.

public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;

	// constructor - creates employee object with parameters included to specify initial state
	  /**
	   * Default constructor.
	   * This constructor sets the name, number and hire date for an employee
	   * @param name The employee's name
	   * @param number The employee's number
	   * @param hireDate The date the employee was hired
	   */
	public Employee(String inputName, String inputNumber, String inputDate) {
		name = inputName;
		setEmployeeNumber(inputNumber);
		hireDate = inputDate;
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