package com.corejava.inheritance;

public class Single {
	
	public static void main(String[] args){
		periyakaruppaiah obj = new periyakaruppaiah();
		char initial = obj.initial;
		obj.study();
		obj.study_pg();
		System.out.println(initial);
	}
}

class kalimuthu{
	char initial='M';
	void study(){
		System.out.println("10th");
	}
}

class periyakaruppaiah extends kalimuthu{
	char initial='K';
	void study_pg(){
		System.out.println("Msc");
	}
}