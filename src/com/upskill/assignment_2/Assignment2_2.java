package com.upskill.assignment_2;

public class Assignment2_2 {

	public static void main(String[] args) 
	  {
		
	calculategrade(90);     //should be print grade A
	calculategrade(85);     //should be print grade B
	calculategrade(75);     //should be print grade C
	calculategrade(65);     //should be print grade D
	calculategrade(50);     //should be print grade F
	  }
	
      public static void calculategrade(int marks)
   {
	    if (marks >= 90) 
	  {
		System.out.println("grade A");
	  }
	    else if (marks >= 80 & marks <=89)
	  {
		System.out.println("grade B");
	  }  
	    else if (marks>= 70 & marks <=79)
	  {
	    System.out.println("grade C");
	  }
	    else if (marks>= 60 & marks <=69)
	  {
		System.out.println ("grade D");
	  }
	    else 
	  { 
	    System.out.println("fail");
	  }
	    
    }
	
}

	
	
	
	
	
