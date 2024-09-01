package com.upskill.java_1;

public class Variables {

    
    String country = "usa";             // Instance (global) variable

    
    static String region = "America";   //Static Variable

    public static void main(String[] args) {
        
        String city = "new york";         // Local variable
        michigan("Wayne");
        texas("Anderson");
    }
    
    public static void texas(String county){     //Method Perameter
       String city = "Dallas";
       String myCounty = county;
       System.out.println(city);
       System.out.println(myCounty);
       System.out.println(region);   
    }
    public static void michigan(String county){   //method perameter
           String city = "detroit";
           String myCounty = (county);
           System.out.println(city);
           System.out.println(myCounty);
           System.out.println(region);
           
        }
}