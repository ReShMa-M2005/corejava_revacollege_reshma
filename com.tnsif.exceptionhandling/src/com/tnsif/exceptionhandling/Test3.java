package com.tnsif.exceptionhandling;
// with no matching catch block

public class Test3 {
	public static void main(String[] args) {
		try {
			System.out.println(20/0);
		}
		catch(ArrayIndexOutOfBoundsException r) {
			System.out.println(r.getMessage());
		}
		finally {
			System.out.println("hello python");
		}
	}

}
