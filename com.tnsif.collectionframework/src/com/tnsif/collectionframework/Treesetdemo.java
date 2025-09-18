package com.tnsif.collectionframework;
// demo for tree set interface

import java.util.TreeSet;

public class Treesetdemo {
	public static void treesetoperation() {
		TreeSet<Integer> n=new TreeSet<Integer>();
		
		n.add(78);
		n.add(179);
		n.add(19);
		n.add(9);
		n.add(1);
		
		System.out.println(n);
		//n.add(null);
		//n.add(null);
		System.out.println(n);
		
	}
	
	public static void main(String[] args) {
		Treesetdemo.treesetoperation();
	}

}
