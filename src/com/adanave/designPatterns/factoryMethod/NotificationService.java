package com.adanave.designPatterns.factoryMethod;
//Since this design patterns talk about instantiation 
//of an object and so it comes under the category of creational design pattern
public class NotificationService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NotificationFactory notificationFactory= new NotificationFactory();
		Notification notification= notificationFactory.createNotification("EMAIL");
		notification.notifyUser();
	}

}
