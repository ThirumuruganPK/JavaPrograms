package com.corejava.concepts;

public class MovieName extends Movie{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(movie_name); //we deny the direct access of private member
		MovieName obj = new MovieName();
		obj.setter("Bigil");
		System.out.println(obj.getter());
		/*
		 * THIS IS AN ONE WAY OF APPROCH IN OOPS CONCEPTS 
		 * 1. MARK VARIABLE AS PRIVATE
		 * 2. ACCESS IT BY SETTER()
		 * 3. GET IT BY GETTER()
		 * 
		 * SO HERE,WE CAN ACCESS PRIVATE MEMBER IN A CLASS BY ENCAPSULATION
		 */
		
		
	}

}
