package com.corejava.programs;

public class PrimeAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=100;
		boolean flag=false;
		
		for(int i=1;i<=no;i++){
			
			if(no%i==0){
				flag=true;
			}
		}
		if(flag==false){
			System.out.println("prime");
		}else{
			System.out.println("not a prime");
		}
	}

}
