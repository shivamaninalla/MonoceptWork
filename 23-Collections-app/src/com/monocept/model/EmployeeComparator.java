package com.monocept.model;

import java.util.Comparator;

public class EmployeeComparator {
	
	public static class  EmployeesByName implements Comparator<Employee>{

		@Override
		public int compare(Employee arg0, Employee arg1) {
			// TODO Auto-generated method stub
			return arg0.getName().compareTo(arg1.getName());
		}
		
	}
	
	public static class EmployeesById implements Comparator<Employee>{

		@Override
		public int compare(Employee arg0, Employee arg1) {
			// TODO Auto-generated method stub
			return arg0.getEmployeeId()-arg1.getEmployeeId();
		}
		
	}
	
	public static class EmployeesBySalary implements Comparator<Employee>{

		@Override
		public int compare(Employee arg0, Employee arg1) {
			// TODO Auto-generated method stub
			return (int) (arg0.getSalary()-arg1.getSalary());
		}
		
	}

}
