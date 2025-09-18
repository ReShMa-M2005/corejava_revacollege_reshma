package com.tnsif.collectionframework;

import java.util.Stack;

// demo for stack

public class Stackdemo {
	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer>();
	// push to add the elements
		
		ob.push(5);
		ob.push(8);
		ob.push(54);
		ob.push(59);
		ob.push(52);
		
		System.out.println(ob);
		ob.pop();
		System.out.println(ob);
		
		// searching of data
		
		if(ob.isEmpty()) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("stack is not empty");
		}
	}

}
