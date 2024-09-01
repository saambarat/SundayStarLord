package com.upskill.java_4;

public class Encapsulation {

	//Encapsulaton used to hide the data using setter method and getter method.
	
	private String name = "onx";        //write & read
	
	private int ssn = 378269894;         //write only
	
	private String username = "saam";    //read only
	
	//setter method
	 
	public void setName (String value){           //set the data, write
		name = value;
	}
	//Getter method
	
	public String getName (){      //get the data, read
		return name;
	}
	
	//stter method               
	public void setSSN(int value){
		ssn = value;
		
	}
		//Getter method - username
		public String getUserName(){
			return username;
		
	}
		




             //DOB, DL, ADRESS


   
  private String address = "jamaica";
  
  private int DOB = 5864662;
  
  private int dl = 24556564;
  
  public void setaddress (String value){
	  address = value;
         }
  
   
  public int getdl(){
	  return dl;
	     }
  
	  
  public void setDOB(int value){
		 DOB = value;
		 }
	 public void getdob(){
		
	 }
	  
  }
	  
  
  
  
  
  