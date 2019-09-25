package com.corejava.programs;

import java.util.Scanner;

public class AgeGroupFinder {
	int age;
	
	public static void main(String[] args){
		AgeGroupFinder obj =new AgeGroupFinder();
		obj.personFinder();
	}
	
	void personFinder(){
		Scanner sc =new Scanner(System.in);
		System.out.println("pls tell your age");
		age =sc.nextInt();
		sc.close();
	if(age<=-1){	
		System.out.println("pls enter valid age");
	}else
	{
		if(age>=0 && age<=17){
			System.out.println("minor");
		}else if(age>=18 && age<=59){
			System.out.println("major");
		}else if(age>=60){
			System.out.println("senior citizen");
		}
		
	}
	}
}

/* use case:
 * >get the age from user
 * >check the age 
 * >tell the result
 */