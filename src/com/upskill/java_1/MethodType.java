package com.upskill.java_1;

public class MethodType {
	
	/* Types of method
	 
	   1. void method
	   2. static method
	   3. return type method
	 */
	
public static int hourlyincome = 85;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//void method
	public void annualincomeVoid(){
		
		int calculateannualincome = hourlyincome * 3000;
		
		System.out.println("annual income" + calculateannualincome);
	}
     
	//return type method
	
	public int monthlyincomeReturn(){
		int calculatemonthlyincome = hourlyincome * 170;
		return calculatemonthlyincome;
		
	}
    
	//static method
	public static void weeklyincomeStatic(){
		int calculateweeklyincome = hourlyincome * 40;
		System.out.println("weekly income=" + calculateweeklyincome);
		
	}
}
