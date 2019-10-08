package com.corejava.programs;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=7;
		boolean flag=false;
		
		for(int i=2;i<=no-1;i++){
			
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
