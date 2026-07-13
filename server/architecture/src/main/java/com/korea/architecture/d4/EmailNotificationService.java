package com.korea.architecture.d4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("Email")

@Component
public class EmailNotificationService implements NotificationService {

	@Override
	public void send(String message) {
		System.out.println("이메일 알림 전송 : " + message); // message 구현 아직
	}
}
