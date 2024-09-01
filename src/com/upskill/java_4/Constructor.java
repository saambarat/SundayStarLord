package com.upskill.java_4;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	String Membername;
	int Memberage;

	
	public Constructor(String name){
		Membername = name;
	}
	 public Constructor (int age){
		 Memberage = age;
	 }
	 public Constructor (String name, int age){
		 Membername =name;
		 Memberage = age;
	 }
	 
	
	public static void main(String[] args) {

		
		Constructor obj = new Constructor("nora");
		System.out.println(obj.Membername);
		
		Constructor obj2  = new Constructor(22);
		System.out.println(obj2.Memberage);
		
		Constructor obj3 = new Constructor ("nora", 22);
		System.out.println(obj3.Membername +"  "+ obj3.Memberage);
	}

}
