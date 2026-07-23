package com.example.book2.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.book2.service.BookService;
import com.example.book2.vo.BookVO;

import lombok.Builder;
import lombok.RequiredArgsConstructor;

@Builder
@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
	
	//Service DI
	private final BookService bookService;
	
	@GetMapping
	public List<BookVO> findAll() {
		return bookService.findAll();
	}
	
	@GetMapping("{id}")
	public BookVO findById(@PathVariable Long id) {
		return bookService.findById(id);
	}
	
	@PostMapping
	public int insert(@RequestBody BookVO vo) {
		return bookService.insert(vo);
	}
	
	@PutMapping("{id}")
	public int update(@RequestBody BookVO vo, @PathVariable Long id) {
		vo.setId(id);
		return bookService.update(vo, id);
	}
	
	@DeleteMapping("{id}")
	public int delete(@PathVariable Long id) {
		return bookService.delete(id);
	}
	
	// 카테고리별 도서 조회
	// GET /books/category?name=프로그래밍
	// 메서드명 : findByCategory
	@GetMapping("/category")
	public List<BookVO> findByCategory(@RequestParam String category){
		return bookService.findByCategory(category);
	}
	
	// 도서 제목 검색
	@GetMapping("/search")
	public List<BookVO> findByTitleContaining(@RequestParam String title){
		return bookService.findByTitleContaining(title);
	}
	
	
	@GetMapping("/price")
	public List<BookVO> findByPriceGreaterThanOrderByPriceAsc(@RequestParam("min") int price){
		return bookService.findByPriceGreaterThanOrderByPriceAsc(price);
	}
	
	@GetMapping("/count")
	public int count() {
		return bookService.count();
	}
	
	@GetMapping("sort/{sort}")
	public List<BookVO> findAllOrder(@PathVariable String sort){
		return bookService.findAllOrder(sort);
	}

}
