package com.korea.product.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.product.service.ProductService;
import com.korea.product.vo.ProductVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class ProductController {
	
	// service DI
	private final ProductService productService;

	@GetMapping
	public List<ProductVO> findAll(){
		return productService.findAll();
	}
	
	@PostMapping
	public int createProduct(@RequestBody ProductVO vo) {
		return productService.createProduct(vo);
	}
	
	@GetMapping("{id}")
	public ProductVO findById(@PathVariable Long id) {
		return productService.findById(id);
	}
	
	@PutMapping
	public int update(@RequestBody ProductVO vo) {
		return productService.update(vo);
	}
	
}
