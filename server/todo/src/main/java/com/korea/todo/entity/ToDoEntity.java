package com.korea.todo.entity;

//import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity : DB테이블과 연결되는 객체
//@Entity
@Builder
@NoArgsConstructor // 기본생성자 생성
// 기본 생성자가 필요한 이유 : 객체를 먼저 만들고 값을 나중에 넣으려고 / JPA는 리플렉션으로 객체를 생성하기 때문
@AllArgsConstructor
@Data // getter, setter 등 여러가지 메서드가 통합된 어노테이션
public class ToDoEntity {

	private String id; // 이 객체의 아이디
	private String userId; // 이 객체를 생성한 유저의 아이디
	private String title; // 할 일
	private boolean done; // 완료 여부
	
}
