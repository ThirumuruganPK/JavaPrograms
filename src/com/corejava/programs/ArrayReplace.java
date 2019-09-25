package com.corejava.programs;

public class ArrayReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c[]={'m','a','n','i','9','f','%','^','a'};
			for(int i=0;i<c.length;i++){
				if(c[i]=='9' || c[i]=='f'|| c[i]=='%' || c[i]=='^'){
					c[i]='0';
				}
				if(c[i]!='0'){
				System.out.println(c[i]);
				}
			}
	}

}
