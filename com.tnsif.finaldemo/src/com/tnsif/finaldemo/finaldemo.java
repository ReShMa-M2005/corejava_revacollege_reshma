package com.tnsif.finaldemo;
	// parent 
public class finaldemo {
		
		final static int a=5;  // final variable we can't change value
		
		static void display() {
			a=10;
		}
		
	  final	void show() {   // final method cant override
			System.out.println("welcome");
		}

	}
}
