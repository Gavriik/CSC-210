package employeeworker6;


// This class will serve as a superclass for different types of employees.

public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;

	
	// Default constructor - creates employee object with parameters included to specify initial state
	// This constructor sets the name, number and hire date for an employee
	public Employee(String inputName, String inputNumber, String inputDate) {
		name = inputName;
		setEmployeeNumber(inputNumber);
		hireDate = inputDate;
	}

	// copy constructor????
	public Employee() {
		name = "";
		employeeNumber = "";
		hireDate = "";
	}
	
	// accessor method (getter) - gets hire date from 
	public String getHireDate() {
		return hireDate;
	}
	
	// mutator method (setter) - sets hire date for employee
    public void setHireDate(String inputtedDate) {
        hireDate = inputtedDate;
    }

    // mutator method (setter)- sets name for employee
	public void setName(String inputtedName) {
		name = inputtedName;
	}

	// mutator method (setter) - sets employee number
	public void setEmployeeNumber(String e) {
		if (isValidEmpNum(e))
			employeeNumber = e;
		else
			employeeNumber = "";
	}

	// employee number input validation - letter should be within the range of A-M
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
	
	// To String Method - prints a nicely formatted string representation of the class' fields
	public String toString() {
		String str = "Name: " + name + "\nEmployee Number: ";
		if (employeeNumber == "")
			str += "INVALID EMPLOYEE NUMBER";
		else
			str += employeeNumber;
		return str += ("\nHire Date: " + hireDate);
	}
	
}