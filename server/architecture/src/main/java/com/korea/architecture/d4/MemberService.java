package com.korea.architecture.d4;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MemberService {

	private final NotificationService notificationService;
	
	public MemberService(@Qualifier("SMS") NotificationService smsNotificationService) {
		this.notificationService = smsNotificationService;
	}
	
	public void joinMember(String memberName) {
		System.out.println(memberName + " 회원을 등록합니다.");
		notificationService.send("회원가입을 축하합니다.");
		System.out.println("회원 등록이 완료되었습니다.");
	}
	
}
