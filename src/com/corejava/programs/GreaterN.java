package com.corejava.programs;

import java.util.Scanner;

public class GreaterN {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int temp=0;
		for(int i=1;i<=10;i++){
		System.out.println("Enter a value: ");
		int value=sc.nextInt();
			if(value>temp){
				temp=value;
			}
		}
		System.out.println(temp+ " is the heighest value");
		sc.close();
		
		
	}

}
/**
 * ALGORITHM FOR GREATER AMOUNG N NUMBER'S
 * 
 * step 1: get the number from user at 4 times
 * 		1.1: set a highest value temporary as zero
 * 		1.2: check the number with zero 
 * 			1.2.1: if number is greater,then set the  value as highest
 * 			1.2.2: do it again above
 * step 2: display the heighest value 
 * 			
 */
 