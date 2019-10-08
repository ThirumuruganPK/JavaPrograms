package com.corejava.programs;

public class Factorial {

	public static void main(String[] args) {
		Factorial obj = new Factorial();
		int ans=obj.factorial(5);
		System.out.println(ans);
		// TODO Auto-generated method stub
		/* instead  of this we can go for loop
		int fact=1;
		fact=fact*1;
		fact=fact*2;
		fact=fact*3;
	*/
		//12345
		/*
		int fact =1;
		int no =5;
		for(int i=1;i<=no;i++){
		 fact =i*fact;
		}
		System.out.println(fact);
		
		*/
		
		
	}
	//using recursion
			
			//int no=5;
			int fact=1;
			int factorial(int no){
				
		    //Factorial obj = new Factorial();
				if (no == 0){
					
					return fact;
				}else
				{
					fact= fact*no;
					factorial(no-1);
					return fact;
					
				}
			}
			

}
/*
1*5=5
5*4=20
20*3=60
60*2=120
120*1=120

1 2 3 4 5
*/
//doubt
// 1.why i cann't call sysout  outside method
// 2.why i have to reassign the getting instance variable inside local method by object calling
