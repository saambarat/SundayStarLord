package com.upskill.java_2;

public class IfElseStatement {
	
	public static void main(String[] args){
	  int age = 105;
	  if (age<= 19)
		  System.out.println("you are  a teen ");
	  
	  else if (age > 20 && age < 27)
		  System.out.println("you are a adult");
		  
	  
	  else if (age >= 60 )
		  if (age <=100)
		 System.out.println("you are  a senior ");
		  else
				  System.out.println("you are a older");
	  
		  
	  
	  
	  
	  else 
		  System.out.println("you are  a men ");
		  
	  
	}

}
