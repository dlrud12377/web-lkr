package com.korea.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.product.dao.OrdersDAO;
import com.korea.product.dao.ProductDAO;
import com.korea.product.vo.OrdersVO;
import com.korea.product.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrdersService {

	// DAO DI
	private final OrdersDAO ordersDAO;
	private final ProductDAO productDAO;
	
	public int order(OrdersVO vo) {
		
		// 상품 번호 조회
		ProductVO product = productDAO.findById(vo.getProductId());
		
		try {
			
			// 조회 안되면 error로 넘기기
			if(product == null) {
				throw new Exception("주문하려는 상품 정보가 없습니다.");
			}
			
			// 재고가 적으면 error로 넘기기
			if(product.getProductStock() < vo.getProductCount()) {
				throw new Exception("재고 수량이 주문 수량보다 적습니다.");
			}
			
			// 주문 수량이 0보다 작으면 error로 넘기기
			if(vo.getProductCount() <= 0) {
				throw new Exception("주문 수량이 정상적이지 않습니다.");
			}
			
			// 주문 저장
			int orderResult = ordersDAO.insert(vo);
			
			// 주문한 만큼 product 재고 감소
			product.setProductId(vo.getProductId());
			product.setProductStock(product.getProductStock() - vo.getProductCount());
			productDAO.update(product);
			
			return orderResult;
			
			
		} catch (Exception e) {
			String message = e.getMessage();
			System.out.println(message);
			return -1;
		}
		
		
		
		
	}

	public List<OrdersVO> findAll() {
		return ordersDAO.findAll();
	}

}
