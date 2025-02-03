/**
 * 
 */
package com.wipro.java.oops;

/**
 * 
 */
public class Flower {

	//properties and behaviours
	//name, color
	//Rose, Red
	//Sunflower, Yellow
	
	String flowername;
	String flowercolor;
	
	Flower(String name, String color){
		this.flowername=name;
		this.flowercolor=color;

	}
	
	void display() {
        System.out.println("Flower name: " + flowername + ", Flower color: " + flowercolor);
	}
	
	public static void main(String args[]) {
		Flower flowername1=new Flower("Rose","Red");
		Flower flowername2=new Flower("Sunflower", "Yellow");
		
		flowername1.display();
		flowername2.display();
	}

}
