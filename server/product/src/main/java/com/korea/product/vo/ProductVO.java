package com.korea.product.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ProductVO {
	
	private Long productId;
	private String productName;
	private int productStock;
	private int productPrice;
	private LocalDateTime registerDate;
	private LocalDateTime updateDate;

}
