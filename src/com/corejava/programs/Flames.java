package com.corejava.programs;

import java.util.Scanner;

public class Flames {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flames obj = new Flames();
		int count=obj.gettingNames();
		char flameletter = obj.getflamesletters(count);
		obj.display(flameletter);
	}
	/**
	 * get names 
	 */
	int gettingNames(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String boy_name=sc.next();
		System.out.println("Enter your lover name:");
		String girl_name=sc.next();
		System.out.println("BoyFriend Name is: "+ boy_name.toUpperCase());
		System.out.println("GirlFriend Name is: "+ girl_name.toUpperCase());
		char bname[]=boy_name.toCharArray();
		char gname[]=girl_name.toCharArray();
		
		int bgnamelength=bname.length+gname.length;
		
		/**
		 * LOGIC FOR REMOVE SAME LETTER IN BOTH NAME
		 */
		for(int i=0;i<bname.length;i++){
			for(int j=0;j<gname.length;j++){
				if(bname[i]==gname[j]){
					bname[i]=0;
					gname[j]=0;
				}
			}
		}
		
		/**
		 * MERGING ARRAY
		 */
		char bg[]=new char[bgnamelength];
		for(int i=0;i<bname.length;i++){
			bg[i]=bname[i];
		}
		int k=0;
		for(int i=bname.length;i<bg.length;i++){
			bg[i]=gname[k];
			k++;
		}

		int count=0;
		for(int i=0;i<bg.length;i++){
			//System.out.print(bg[i]+"");
			if(bg[i]!=0){
			count++;
			//System.out.print(names[i]);
			}
		}
		System.out.println();
		//System.out.println("The count is : "+count);
		return count;
	}
	
	/**
	 * LOGIC TO GET A LETTER OF FLAEMS AFTER REMOVING
	 */
	char getflamesletters(int count){
		char flameletter='P';
		char flames[]={'F','L','A','M','E','S'};
		int iteration=0;
		int k=0;
		for(int i=0;i<flames.length;i++){
			if(flames[i]!=0){
				iteration++;	
			}
			if(iteration==count){
				k++;
				flames[i]=0;
				iteration=0;
				if(k==5){
					break;
				}
			}
			if(i==flames.length-1){
				i=-1;
			}
		}
		
		for(int i=0;i<flames.length;i++){
			if(flames[i]!=0){
				flameletter=flames[i];
			}
		}
		return flameletter;
	}
	
	/**
	 * LOGIC TO DISPLAY MESSAGE
	 */
	void display(char msg){
		switch(msg){
		case 'F':
			System.out.println("She Will became a " +" Friend");
			break;
		case 'L':
			System.out.println("She Will became your " +" Lover");
			break;
		case 'A':
			System.out.println("It's Just a  " +" Affection ");
			break;
		case 'M':
			System.out.println("You will get " +" Married");
			break;
		case 'E':
			System.out.println("Both are become" +" Enemy");
			break;
		case 'S':
			System.out.println("She is your " +" Sister");
			break;
		default:
			System.out.println("None");
			break;
		}
	}
}
