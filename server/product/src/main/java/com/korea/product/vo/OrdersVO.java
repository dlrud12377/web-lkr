package com.korea.product.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class OrdersVO {

    private Long orderId;
    private Long productId;
    private int productCount;
    private LocalDateTime orderDate;

}