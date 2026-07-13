package com.korea.architecture.di2;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Patient {

	private String name = "홍길동";
	
	public void checkInformation() {
		System.out.println("환자 " + name + "의 정보를 확인합니다.");
	}

	public String getName() {
		return name;
	}
	
}
