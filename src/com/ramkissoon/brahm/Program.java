package com.ramkissoon.brahm;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Person person = new Person();
				
		while (!person.getIsValid()) {
			Scanner input = new Scanner(System.in);			// create input scanner
			
			System.out.println("Please enter your age: ");
			person.setAge(input.nextLine());
			
			if(person.getIsValid()){
				System.out.println(person.toString());
			}
			else{
				System.out.println();
			}
										
		} 	
	}
}
