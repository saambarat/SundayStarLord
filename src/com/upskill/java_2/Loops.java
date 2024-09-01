package com.upskill.java_2;

public class Loops {
	
	/*type of loops
	 * for loop -  do again and again up to upper limit
	 * while loop - do again and again up to condition match
	 * do while loop - do action then match condition
	 * infinite loop - never ending loop
	 */
	
	public static void main(String[] args) {
        //forloop();
		//whileloop();
		//dowhilrloop();
		//infiniteloop();
		Nestedforloop();
	}
public static void loop(){
	int i;
	for(i = 10;
		i >= 1; 
		i--)
	
		System.out.println("loop = " + i);
		
   }

    public static void Loop(){
    int i = 1;
		   while (i <=10){
			   System.out.println("whileloop = " + i );
			   i++;
		   }
}
			   
			   public static void dowhileloop(){
				   int i = 5;
				   do {
					   System.out.println("dowhileloop = " + i);
					   i++;
				   } while (i <=10);
			   
					  
    }
			   
			   public static void infiniteloop(){
				   int i;
				   for (i = 1; ; i++){
					   System.out.println("infiniteloop = " + i);
		 }
					   
	 }
		public static void Nestedforloop(){
			int i;
			int j;
			for (i=1; i<=10; i++){
				for (j=1; j<=10; j++){
				int multipication = i * j;
				System.out.print(multipication + "  ");
				}
				System.out.println(" ");
				}
			}
			
		}



			