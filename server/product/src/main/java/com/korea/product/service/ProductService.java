package com.korea.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.product.dao.ProductDAO;
import com.korea.product.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

	// DAO DI
	private final ProductDAO productDAO;

	public List<ProductVO> findAll() {
		return productDAO.findAll();
	}

	public int createProduct(ProductVO vo) {
		return productDAO.createProduct(vo);
	}

	public ProductVO findById(Long id) {
		return productDAO.findById(id);
	}

	public int update(ProductVO vo) {
		return productDAO.update(vo);
	}
	
	
}
