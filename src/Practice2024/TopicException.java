package Practice2024;

public class TopicException {
	
	public static void main(String[] args) {
		
		//Built-in Exceptions - ArrayIndexOutOfBoundsException
		try{
			int[] ageStarlord = new int[]{25, 19, 21, 28, 35};
			System.out.println(ageStarlord[5]);
		   }
	    catch (Exception e){
			e.printStackTrace();
			System.out.println("Array Completed !");
		}
		
		//Specific Built-in Exceptions - NumberFormatException
		try{
			int num = Integer.parseInt("Test");
			System.out.println(num);
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("Parshing Completed !");
		}

		
	}
}
