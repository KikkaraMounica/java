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
public class Developer extends Employee{

	/**
	 * 
	 */
	public Developer() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[]) {
		
		Employee employee=new Developer();
		employee.setEmpId(123);
		employee.setEmpName("Rohitha");
		employee.setEmpAge(25);
		employee.setEmpDesignation("Trainee");
		employee.setSalary(28000f);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpDesignation());
		System.out.println(employee.getSalary());
	}

}
