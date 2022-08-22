package com.adanave.designPatterns.factoryMethod;

public class PushNotifcations implements Notification {

	@Override
	public void notifyUser() {

		System.out.println("Sending Push notifications");
	}

	
}
