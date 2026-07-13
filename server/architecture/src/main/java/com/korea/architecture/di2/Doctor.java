package com.korea.architecture.di2;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class Doctor {

	private final Patient patient;
	
	public void treat() {
		System.out.println("의사가 환자 진료를 시작합니다");
		patient.checkInformation();
		System.out.println(patient.getName() + " 환자 진료가 완료되었습니다.");
	}
	
}
