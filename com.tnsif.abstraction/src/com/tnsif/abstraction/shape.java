package com.tnsif.abstraction;
//to demostrate the abstraction
public abstract class shape {

	protected float area;      // variable
	
	// abstract method
	
	abstract void calarea();
	
	// concreate method
	void show() {
		System.out.println("area of a shape"+area);
	}


}
