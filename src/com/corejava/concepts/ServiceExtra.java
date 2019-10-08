package com.corejava.concepts;

interface Service{
	void atm();
	void loan();
	int deposite();
	
}

public interface ServiceExtra extends Service{
	 int policy();
	 @Override
	 int deposite();
}
