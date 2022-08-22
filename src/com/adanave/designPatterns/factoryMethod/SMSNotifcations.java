package com.adanave.designPatterns.factoryMethod;

public class SMSNotifcations implements Notification {

	@Override
	public void notifyUser() {

		System.out.println("Sending SMS notifications");
	}

	
}
