package com.korea.product.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.korea.product.vo.ProductVO;

@Mapper
public interface ProductDAO {
	
	List<ProductVO> findAll();
	
	int createProduct(ProductVO vo);
	
	ProductVO findById(Long id);

	int update(ProductVO product);

}
