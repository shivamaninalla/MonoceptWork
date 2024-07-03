package com.monocept.composite.test;

import com.monocept.composite.model.Developer;
import com.monocept.composite.model.EmployeeDirectory;
import com.monocept.composite.model.IEmployee;
import com.monocept.composite.model.Manager;

public class IEmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IEmployee employee1 = new Developer("Shivamani", "Intern");
		IEmployee employee2 = new Developer("Varish", "junior developer");
		IEmployee employee3 = new Developer("Ajay", "junior developer");
		System.out.println("Developer details");
		employee1.showEmployeeDetails();

		System.out.println("\n");

		EmployeeDirectory employeeDirectory = new EmployeeDirectory();
		employeeDirectory.addEmployee(employee1);
		employeeDirectory.addEmployee(employee2);
		employeeDirectory.addEmployee(employee3);

		IEmployee emplopyeeManager1 = new Manager("Aju sir", "Team Manager");
		IEmployee emplopyeeManager2 = new Manager("Swapnil sir", "Assingment Manager");

		System.out.println("Manager details");
		emplopyeeManager1.showEmployeeDetails();

		System.out.println("\n");

		EmployeeDirectory managerDirectory = new EmployeeDirectory();
		managerDirectory.addEmployee(emplopyeeManager1);
		managerDirectory.addEmployee(emplopyeeManager2);

		managerDirectory.showEmployeeDetails();
		employeeDirectory.showEmployeeDetails();
		
		
		IEmployee d1=new Developer("Shankar","senior developer");
		EmployeeDirectory compositeDirectory=new EmployeeDirectory();
		compositeDirectory.addEmployee(managerDirectory);
		compositeDirectory.addEmployee(employeeDirectory);
		compositeDirectory.addEmployee(d1);
		
		compositeDirectory.showEmployeeDetails();
		
		compositeDirectory.removeEmployee(employee1);
		compositeDirectory.removeEmployee(d1);
		compositeDirectory.showEmployeeDetails();
		
		
		

	}

}
