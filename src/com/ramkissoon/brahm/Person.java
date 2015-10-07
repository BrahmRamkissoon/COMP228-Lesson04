package com.ramkissoon.brahm;

public class Person {
	
	// PRIVATE INSTANCE VARIABLES
	private int _age;
	private boolean _isValid = false;

	// GET ACCESSOR METHOD for age
	public int getAge() {
		return this._age;
	}

	// GET ACCESSOR METHOD for isValid
	public boolean getIsValid() {
		return this._isValid;
	}

	//	SET / MUTATOR METHOD
	public void setAge(String ageString) {
		try {
			int age = Integer.parseInt(ageString);
			
			if(age < 0){
				System.out.println("Please enter a positive number");
			}
			else{
				this._age = age;
				this._isValid = true;
			}
		} catch (Exception exception){
			System.out.println("Please enter a positive number");
		}		
	}
	
	// EMPTY CONSTRUCTOR
	Person(){
		
	}
	
	// Overriding the toString Method
	@Override
	public String toString(){
		return "You Entered: " + this._age;
		
	}
	

}
