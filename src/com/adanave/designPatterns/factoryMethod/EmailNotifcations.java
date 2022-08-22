package com.adanave.designPatterns.factoryMethod;

public class EmailNotifcations implements Notification {

	@Override
	public void notifyUser() {

		System.out.println("Sending Email notifications");
	}

	
}
