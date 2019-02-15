package com.example.webhook.resources;

public class NotificationRequest {
	
	private String notificationType;
	private String notificationCode;
	
	
	public String getNotificationType() {
		return notificationType;
	}
	
	public void setNotificationType(final String notificationType) {
		this.notificationType = notificationType;
	}
	
	public String getNotificationCode() {
		return notificationCode;
	}
	
	public void setNotificationCode(final String notificationCode) {
		this.notificationCode = notificationCode;
	}

	@Override
	public String toString() {
		return "NotificationRequest [notificationType=" + notificationType + ", notificationCode=" + notificationCode
				+ "]";
	}

}
