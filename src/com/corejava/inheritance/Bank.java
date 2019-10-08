package com.corejava.inheritance;
import com.corejava.concepts.*;
import com.corejava.polymorphism.*;

public class Bank extends Overloading implements ServiceExtra,ServiceFast {
	int a;
	public void divya(){
		
	}

	public  void cash(){
		
	}
	public 	int policy(){
		int a=5;
	 	return a;	
	}
	public  void atm() {
		// TODO Auto-generated method stub
		System.out.println("atm");
	}

	@Override
	public void loan() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int deposite() {
		// TODO Auto-generated method stub
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj = new Bank();
		obj.atm();
		obj.add(32, 44);
		obj.deposite();
		
	}

	@Override
	public void a1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a2() {
		// TODO Auto-generated method stub
		
	}
}
