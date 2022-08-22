package com.adanave.designPatterns.factoryMethod;

public class NotificationFactory {
	
	public Notification createNotification(String channel) {
		
		if (channel==null || channel.isEmpty())
		return null;
		switch(channel) {
			case "SMS":
				return new SMSNotifcations();
			case "EMAIL":
				return new EmailNotifcations();
			case "PUSH":
				return new PushNotifcations();
			default:
				throw new IllegalArgumentException("Unknown channel "+channel);
		}
		
	}

}
