package com.korea.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.test.DTO.BookDTO;
import com.korea.test.entity.BookEntity;
import com.korea.test.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookRepository bookRepository;
	
    public BookDTO create(BookDTO bookDTO){

        BookEntity entity = BookEntity.builder()
                .title(bookDTO.getTitle())
                .author(bookDTO.getAuthor())
                .price(bookDTO.getPrice())
                .category(bookDTO.getCategory())
                .stock(bookDTO.getStock())
                .build();

        BookEntity savedEntity = bookRepository.save(entity);

        return new BookDTO(savedEntity);
    }
    
    // 전체 검색
    public List<BookDTO> findAll(){
    	
    	List<BookEntity> entityList = bookRepository.findAll();
    	
    	return entityList.stream().map(BookDTO::new).toList(); // 아마 객체명::new가 가능했던거같음
    	
    }
    
    
    // id를 이용한 검색
    public BookDTO findById(Long id) { // id는 primary key이므로 겹치지 않음 -> 무조건 하나의 결과를 가져옴
    	
    	BookEntity entity = bookRepository.findById(id).get(); // get()으로 Optional wrapping 처리
    	
    	BookDTO book = new BookDTO(entity);
    	
    	return book;
    	
    }
    
    
    // 제목에 특정 단어를 포함한 책 검색
    public List<BookDTO> findByTitleContaining(String keyword){
    	
    	List<BookEntity> entityList = bookRepository.findByTitleContaining(keyword);
    	
    	return entityList.stream().map(entity -> new BookDTO(entity)).toList();
    	
    }
    
    
    // 카테고리별 책 검색
    
    public List<BookDTO> findByCategory(String keyword){
    	List<BookEntity> entityList = bookRepository.findByCategory(keyword);
    	
    	return entityList
    			.stream()
    			.map(BookDTO::new)
    			.toList(); // :: 명명 규칙 다시 찾아보기

    }
	
}
