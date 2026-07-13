package com.korea.architecture.d4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("SMS")

@Component
public class SmsNotificationService implements NotificationService {
	
	@Override
	public void send(String message) {
		System.out.println("문자메시지 알림 전송 : " + message); // 매개변수 활용해야함
	}
}
