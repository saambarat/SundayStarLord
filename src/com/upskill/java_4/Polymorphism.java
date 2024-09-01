package com.upskill.java_4;

import com.upskill.java_1.MethodType;

public class Polymorphism extends MethodType {
    
    /* Polymorphism is the ability of an object to take on many forms.
        - Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
        - Method Overriding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
    */

    public static void main(String[] args) {
        
        car("White");
        Polymorphism obj = new Polymorphism();
        obj.annualIncomeVoid(); 
        weeklyincomeStatic();
    }
    
    // Method Overriding - Runtime Polymorphism - Dynamic binding
    // Same method name from Parent class to override
    
    public void annualIncomeVoid() {
        int calculateAnnualIncome = hourlyincome * 2000;
        int RentalIncome = 40000;
        int SideIncome = 40000;
        int SecondJob = 120000;
        int newIncome = calculateAnnualIncome + RentalIncome + SideIncome + SecondJob;
        System.out.println("My Annual Income = " + newIncome);
    }




	//Method Overloading (Compile time Polymorphism/Static binding) 
	//Same method name with different signature to overload
	
	  public static void car (){
		  System.out.println("my car is tesla");		  
	  }
	  public static void car (String color){
		  System.out.println("my car is " + color);
		  
	  }
	  public static void car (int seat){
		  System.out.println("my car is seat " + seat);
	  }
	  
	  public static void car (boolean ev){
		  System.out.println("my car is EV:" + ev);
	  }
	  
	  public static void car (String color, int seat ){
		  System.out.println("my car is " + color + " . it has seat:" + seat);
	  }
	  
	  public static void car (int seat, boolean ev){
		  System.out.println("my car is seat " + seat + ". my car is ev:" +ev);
	  }
	  
	
}
