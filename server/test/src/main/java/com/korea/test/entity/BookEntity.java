package com.korea.test.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name = "book")
public class BookEntity {
	
	@Id //현재 필드를 엔티티의 기본키(PK)로 지정한다
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // 이 객체의 아이디
	
	@Column(nullable = false)
	private String title; // 책 제목
	
	@Column(nullable = false)
	private String author; // 저자
	private int price; // 가격
	private int stock; // 재고
	private String category;
	private boolean done; // 완료 여부
	
}
