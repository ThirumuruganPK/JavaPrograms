package com.corejava.programs;

public class CovertStringToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CovertStringToInteger obj = new CovertStringToInteger();
		String s="218918719";
		/*
		int value = Integer.parseInt(s);
		System.out.println(value);
		*/
		
		char c[]=new char[s.length()];
		for(int i=0;i<c.length;i++){
			c[i]=s.charAt(i);
			if(c[i]%2==0){
				  System.out.println(c[i]);
			}else{
				  System.out.println(c[i]);
							
			}
		}
		
	}

}
// 288
//191719