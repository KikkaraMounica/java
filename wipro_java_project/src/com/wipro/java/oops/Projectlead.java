/**
 * 
 */
package com.wipro.java.oops;

/**parent class = employee
 * child class = manager
 * extends is a keyword
 * 
 */
public class Projectlead extends Employee {

	/**
	 * 
	 */
	public Projectlead() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]) {
		
		Employee employee=new Projectlead();
		employee.setEmpId(1234);
		employee.setEmpName("Mounica");
		employee.setEmpAge(34);
		employee.setEmpDesignation("Trainer");
		employee.setSalary(34000f);
		
		System.out.println(employee.getEmpId());
		System.out.println(employee.getEmpName());
		System.out.println(employee.getEmpAge());
		System.out.println(employee.getEmpDesignation());
		System.out.println(employee.getSalary());
	}
}
