package com.corejava.programs;

public class ArrayMergingLarge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,3,2,5,6,1,77,6};
		int b[]={5,6,4,3,2};
		int c[]={1,2,3,4,5};
		int d[] = new int[a.length+b.length+c.length];
		
		for(int i=0;i<a.length;i++){
			d[i]=a[i];
		}
		int k=0;
		System.out.println();
		for(int i=a.length;i<a.length+b.length;i++){
			d[i]=b[k];
			k++;
		}
		int j=0;
		for(int i=a.length+b.length;i<d.length;i++){
			d[i]=c[j];
			j++;
		}
		
		//printing
		for(int i=0;i<d.length;i++){
			System.out.print(d[i] +" ");
		}
	}

}
