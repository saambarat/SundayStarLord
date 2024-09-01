package com.upskill.java_5;

public class InterfaceImplementation implements Interface{

	@Override
	public void idoor() {
		System.out.println("my car has 4 door");
		
	}

	@Override
	public void idoor(int door) {
		System.out.println("my car has 4 door : "+ door);
		
	}

	@Override
	public void idoor(String glass) {
		System.out.println("my car has 4 door" + glass);
		
	}

	@Override
	public String iEngine() {
		return "10hp";
	}

	@Override
	public int iwheel() {
	return 4;
	
	}
	

}
