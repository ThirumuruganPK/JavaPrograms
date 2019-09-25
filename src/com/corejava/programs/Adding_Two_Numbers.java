package com.corejava.programs;
import java.util.Scanner;

public class Adding_Two_Numbers {
	
	public static void main(String[] args){
		Adding_Two_Numbers obj=new Adding_Two_Numbers();
		obj.add();
		obj.add_from_user();
	}
	void add(){
		int a=10,b=10,c;
		c=a+b;
		System.out.println("Some of these numbers"+ c);
	}
	void add_from_user(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int num1=sc.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		sc.close();
		
		int num3=num1+num2;
		System.out.println("sum of these numbers"+ num3);
	}
}

/*use case:
 * >give the sum of number in hardcoded
 * >give the values from users
 * >calculate and tell to user
 */
