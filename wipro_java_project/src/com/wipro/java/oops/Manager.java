/**
 * 
 */
package com.wipro.java.oops;

/**parent class = employee
 * child class = manager
 * extends is a keyword
 * 
 * 
 */
public class Manager extends Employee {

	/**
	 * 
	 */
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		
		Employee employee=new Manager();
		employee.setEmpId(12345);
		employee.setEmpName("Arghya");
		employee.setEmpAge(35);
		employee.setEmpDesignation("Manager");
		employee.setSalary(50000f);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpDesignation());
		System.out.println(employee.getSalary());
	}
}
