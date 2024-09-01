package com.upskill.java_3;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_Hashtable {

	public static void main(String[] args) {
		
    //Array store multiple data using index
		
	int age = 25;                                             //variable
	
	int [] agestarlord = new int [] {25, 30, 35, 40, 45, 50, 55};  //Array
	
	
	
	//Array index                     0   1   2   3   4   5   6
	
	String[]  namestarlord = new String []  {"aumio"," omi", " ovi"};
	
	System.out.println("Age  : "  + agestarlord[0]);
	
	System.out.println("Total  : "  + agestarlord.length);
	
	System.out.println("name : " + namestarlord[0]);
	
		
	//multi-dimentional Array
		
		int [][] agestarlord2d = {{25, 30 , 28, 35, 27}, 							  //[0][0] [0][1] [0][2]
									{26, 29, 30, 34, }};                              //[1][0] [1][1] [1][2]
		
		System.out.println(" member age 2d : " + agestarlord2d[1][1]);
	
	
		
		
	//Hashmap store multiple data 
		
		HashMap<String, Integer> member = new HashMap<String, Integer>();
		member.put("aumio", 25);
		member.put("omi", 30 );
		member.put("ovi", 35);
		member.put(null, null);
		//Hashmap allows null key and value.
		
		System.out.println("Hashmap member age : " + member.get ("ovi"));
		
		
	//HashMap String String country,capital
		
		HashMap <String, String> country = new HashMap<String,String>();
		country.put("Bnagladesh", "Dhaka");
		country.put("france", "paris");
		System.out.println("Hashmap Capital : " + country.get ("france"));
		
		
	// HashTable
	Hashtable<String, String> region = new Hashtable <String, String>();
	region.put("BD" , "asia");
	//region.put(null, null);
	//Hashtable doesnt allow null
	
	System.out.println("Hashtable region: " + region.get ("BD"));
		
	
	//Hashset
	HashSet<String> car = new HashSet<String>();
	car.add("Benz");
	car.add("audi");
	
	System.out.print("car : " + car);
	
	
	}
		
		
	}
