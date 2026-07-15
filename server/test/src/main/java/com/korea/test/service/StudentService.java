package com.korea.test.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.test.DTO.StudentDTO;

@Service
public class StudentService {
		
	// 수강생 조회
	// 데이터베이스에 연결하는 것이 아니므로 ArrayList를 하나 만들고
	// 임의의 데이터 두개를 추가하기

	private List<StudentDTO> students = new ArrayList<>();
	
	private static Integer sequence = 1;
	
	// studentservice 객체가 처음 생성자에 의해 호출되면서 한번만 add가 됨 - singleton 단일 객체로 관리
	public StudentService() {
		students.add(
				StudentDTO.builder()
				.id(sequence++)
				.name("홍길동")
				.course("스프링부트 개발")
				.email("test1@gmail.com")
				.build()
				);
		
		students.add(
				StudentDTO.builder()
				.id(sequence++)
				.name("김혜수")
				.course("자바 웹 개발")
				.email("test2@gmail.com")
				.build()
				);
	}
	
	public List<StudentDTO> getStudents(){
		return students;
	}
	
	public StudentDTO addStudent(StudentDTO studentDTO) {
		StudentDTO newStudent = StudentDTO.builder()
				.id(sequence++)
				.name(studentDTO.getName())
				.course(studentDTO.getCourse())
				.email(studentDTO.getEmail())
				.build();
		
		students.add(newStudent);
		
		return newStudent;
	}
	
	

}
