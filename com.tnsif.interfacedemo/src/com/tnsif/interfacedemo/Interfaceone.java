package com.tnsif.Interfacedemo;
//demo for  multi level 
public interface Ipackage com.tnsif.exceptionhandling;
//demo for nestedtrycatch

public class NestedTrycatch {
	public static void check() {
		String str="TNS";
		int slength=str.length();
		System.out.println("String lenghth"+slength);
		
		String anotherstring=null;
		int y=6;
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException ex) {
				System.out.println(ex.getMessage());
			}
			System.out.println("string length"+anotherstring.length());
		}
		catch(NullPointerException npe) {
			System.out.println(npe.getMessage());
		}
	}
	public static void main(String[] args) {
		NestedTrycatch.check();
	}

}

		
	void print();
	}

