package com.example.book2.vo;

import lombok.Data;

@Data
public class BookVO {

	private Long id;
	private String title;
	private String author;
	private String category;
	private int price;
	private int stock;
	
}