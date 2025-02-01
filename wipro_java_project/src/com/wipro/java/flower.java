/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class flower {

	//properties and behaviours
	//name, color
	//Rose, Red
	//Sunflower, Yellow
	
	String flowername;
	String flowercolor;
	
	flower(String name, String color){
		this.flowername=name;
		this.flowercolor=color;

	}
	
	void display() {
        System.out.println("Flower name: " + flowername + ", Flower color: " + flowercolor);
	}
	
	public static void main(String args[]) {
		flower flowername1=new flower("Rose","Red");
		flower flowername2=new flower("Sunflower", "Yellow");
		
		flowername1.display();
		flowername2.display();
	}

}
