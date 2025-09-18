package com.tnsif.statickeyword;
	// demo for static method
 public class student {
		int rollno;
		String name;
		static String college="Reva university";
		
		//static method change value
		
		static void change() {
			college="Reva";
			
		}
		student(int r,String n){
			rollno=r;
			name=n;
		}
		void display() {
			System.out.println(rollno+" "+name+" "+college);
		}
		
		public static void main(String[] args) {
			student.change();
			
			student s1=new student(1,"kusuma");
			student s2=new student(2,"sushma");
			student s3=new student(3,"suma");
			
			s1.display();
			s2.display();
			s3.display();
		}


}
