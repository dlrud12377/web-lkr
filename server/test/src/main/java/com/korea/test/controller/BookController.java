package com.korea.test.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.test.DTO.BookDTO;
import com.korea.test.DTO.ResponseDTO;
import com.korea.test.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("books")
public class BookController {

	private final BookService bookService;
	
	
	// 도서등록
	// 메서드명 : create
	@PostMapping("create")
	public ResponseEntity<?> createBook(@RequestBody BookDTO bookDTO){
		
		try {
			
			BookDTO book = bookService.create(bookDTO);
			
			ResponseDTO<BookDTO> response = 
					ResponseDTO.<BookDTO>builder()
					.data(List.of(book))
					.error(null)
					.build();
			return ResponseEntity.ok().body(response);
		}
		catch(Exception e) {
	        ResponseDTO<BookDTO> response =
	                ResponseDTO.<BookDTO>builder()
	                        .error(e.getMessage())
	                        .build();

	        return ResponseEntity.ok().body(response);
		}
		
	}
	
	
	// ID로 도서 조회 GET
	// 경로 GET /books/{id}
	// 메서드명 : findById
	
	@GetMapping("/{id}")
	public ResponseEntity<?> findById(@PathVariable("id") Long id){
		try {
			
			BookDTO foundedBook = bookService.findById(id);
				
			ResponseDTO<BookDTO> response = 
					ResponseDTO
					.<BookDTO>builder()
					.data(List.of(foundedBook))
					.error(null)
					.build();
			
			return ResponseEntity.ok().body(response);
		}
		catch(Exception e){
			
	        ResponseDTO<BookDTO> response =
	                ResponseDTO.<BookDTO>builder()
	                        .error(e.getMessage())
	                        .build();
	        
	        return ResponseEntity.ok().body(response);
		}
	}
	
	//전체도서 조회 GET
	//메서드명 : findAll
	@GetMapping
	public ResponseEntity<?> findAll() {
		
		try {
			
			List<BookDTO> foundBooks = bookService.findAll();
			
			ResponseDTO<BookDTO> response = 
					ResponseDTO
					.<BookDTO>builder()
					.data(foundBooks)
					.error(null)
					.build();
			
			return ResponseEntity.ok().body(response);
			
		} catch (Exception e) {
			
	        ResponseDTO<BookDTO> response =
	                ResponseDTO.<BookDTO>builder()
	                        .error(e.getMessage())
	                        .build();
	        
	        return ResponseEntity.badRequest().body(response);
		}
		
	}
	
	
	// 제목을 통한 조회
	// 경로 GET /search?title=xxx
	@GetMapping("/search")
	public ResponseEntity<?> findByTitleContaining(@RequestParam("keyword") String keyword) {
		try {
			
			List<BookDTO> foundBooks = bookService.findByTitleContaining(keyword);
				
			ResponseDTO<BookDTO> response = 
					ResponseDTO
					.<BookDTO>builder()
					.data(foundBooks)
					.error(null)
					.build();
			
			return ResponseEntity.ok().body(response);
		}
		catch(Exception e){
			
	        ResponseDTO<BookDTO> response =
	                ResponseDTO.<BookDTO>builder()
	                        .error(e.getMessage())
	                        .build();
	        
	        return ResponseEntity.badRequest().body(response);
		}		
	}
	
	
	// 카테고리별 조회
	// 경로 GET /category?category=xx
	@GetMapping("/category")
	public ResponseEntity<?> findByCategory(@RequestParam("keyword") String keyword){
		try {
			
			List<BookDTO> foundBooks = bookService.findByCategory(keyword);
			
			ResponseDTO<BookDTO> response = 
					ResponseDTO
					.<BookDTO>builder()
					.data(foundBooks)
					.error(null)
					.build();
			
			return ResponseEntity.ok().body(response);
			
		} catch (Exception e) {
	        ResponseDTO<BookDTO> response =
	                ResponseDTO.<BookDTO>builder()
	                        .error(e.getMessage())
	                        .build();
	        
	        return ResponseEntity.badRequest().body(response);
		}
	}
	
	// 도서 수정
	// 경로 PUT {id}
	
	// 도서 삭제
	// 경로 DELETE {id}
	
	
}
