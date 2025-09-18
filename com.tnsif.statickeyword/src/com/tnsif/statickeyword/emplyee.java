package com.tnsif.statickeyword;
	// demo for static variable

public class emplyee {
		// 3 proprties
		int eid;
		String name;
		static String company="TNS";
		
		emplyee(int e,String n){
			eid=e;
			name=n;
		}
		void display() {
			System.out.println(eid +" "+name+" "+company);
		}
		
		public static void main(String[] args) {
			emplyee e=new emplyee(1,"Rakhi");
			emplyee e1=new emplyee(2,"Radhika");
			emplyee e2=new emplyee(3,"Raghu");
			
			e.display();
			e1.display();
			e2.display();
			
			
		}


}
