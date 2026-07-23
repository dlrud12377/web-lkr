package com.example.book2.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.example.book2.dao.BookDAO;
import com.example.book2.vo.BookVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {
	
	// BookDAO DI
	private final BookDAO bookDAO;
	
	// 전체 조회
	public List<BookVO> findAll() {
		return bookDAO.findAll();
	}
	
	// id를 통한 조회
	public BookVO findById(Long id) {
		return bookDAO.findById(id);
	}
	
	// 추가
	public int insert(BookVO vo) {
		return bookDAO.insert(vo);
	}
	
	// 수정
	public int update(BookVO vo, Long id) {
		return bookDAO.update(vo, id);
	}
	
	// 삭제
	public int delete(Long id) {
		return bookDAO.delete(id);
	}

	// 카테고리를 통한 조회
	public List<BookVO> findByCategory(String category) {
		return bookDAO.findByCategory(category);
	}

	// 도서 제목을 통한 검색
	public List<BookVO> findByTitleContaining(String title) {
		return bookDAO.findByTitleContaining(title);
	}

	public List<BookVO> findByPriceGreaterThanOrderByPriceAsc(int price) {
		return bookDAO.findByPriceGreaterThanOrderByPriceAsc(price);
	}

	public int count() {
		return bookDAO.count();
	}
	
	public List<BookVO> findAllOrder(@Param("sort") String sort){
		return bookDAO.findAllOrder(sort);
	}

}
