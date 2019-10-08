package com.corejava.programs;

public class Flames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flames obj = new Flames();
		int count=obj.gettingNames();
		obj.getflamesletters(count);
	}
	/**
	 * get names 
	 */
	int gettingNames(){
		String boy_name ="ravi";
		String girl_name="pavithra";
		System.out.println("lover name is: "+ boy_name.toUpperCase());
		System.out.println("girlfriend name is: "+ girl_name.toUpperCase());
		char names[]=new char[boy_name.length() + girl_name.length()];
		
		for(int i=0;i<boy_name.length();i++){
			names[i]=boy_name.charAt(i);
		}
		int k=0;
		for(int i=boy_name.length();i<names.length;i++){
			names[i]=girl_name.charAt(k);
			k++;
		}
		for(int i=0;i<names.length;i++){
		System.out.print(names[i]);
		}
		/**
		 * Linear comparison algorithm for remove duplicates
		 */
		for(int i=0;i<names.length;i++){
			for(int j=i+1;j<names.length;j++){
				if(names[i]==names[j]){
					names[i]=0;
					names[j]=0;
				}
			}
		}
		System.out.println();
		int count=0;
		for(int i=0;i<names.length;i++){
			if(names[i]!=0){
			count++;
			//System.out.print(names[i]);
			}
		}
		System.out.println("The count is : "+count);
		return count;
	}
	
	void getflamesletters(int count){
		char flames[]={'F','L','A','M','E','S'};
		
		for(int i=0;i<count;i++){
			if(i==count-1){
				flames[i]=0;
			}
		}
	}
}
