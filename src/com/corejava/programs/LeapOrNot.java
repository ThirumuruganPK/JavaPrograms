package com.corejava.programs;

public class LeapOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=2020;
		if(year>1582){
			
		if((year%400==0) || (year%4==0 && year%100!=0)){
			System.out.println("Leap year");
		}else{
			System.out.println("Not a Leap year");
		}
		}else{
			System.out.println("pls give more than 1582year");
		}
		
		if(year==202)
			for(int i=0;i<=4;i++){
				System.out.println("ggooo");
			}
			System.out.println("end");
		System.out.println("very end");
		
	}

}
