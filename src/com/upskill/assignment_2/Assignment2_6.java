package com.upskill.assignment_2;

public class Assignment2_6 {
	

	public static void main(String[] args) {
		
		{
			System.out.println("Prime number between 1 to 100");
		}
		
		for (int num = 100;
				num>= 2;
				num--)
		{
			boolean isprime = true;
			
			for (int i = 2; 
					i <= num / 2; 
					i++)
			{
				if (num % i == 0)
				{
					isprime = false;
					break;
				}
			}
			if (isprime){
				System.out.println(num);
			}
		}


	}

}
