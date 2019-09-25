package com.corejava.programs;
import java.util.Scanner;

public class OddOrEvenFinder {
	public static void main(String[] args){
		OddOrEvenFinder obj = new OddOrEvenFinder();
		obj.oddOrEven();
	}
	void oddOrEven(){
		int sum=100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check odd or even: \n");
		int num=sc.nextInt();
		sc.close();
		if(num%2==0){
			sum=sum+num;
			System.out.println(sum);
			System.out.println(num +"number is even");	
		}else{
			System.out.println(num +"number is odd");
		}
	}
}

/*
 * use case:
 * >get the number from user
 * >check it wheather even or odd
 * >exit
 * */
