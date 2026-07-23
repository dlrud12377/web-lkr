package com.example.book2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.book2.vo.BookVO;

@Mapper
public interface BookDAO {
	
	// 전체 조회
	public List<BookVO> findAll();
	
	// 단건 조회
	BookVO findById(Long id);
	
	// 추가
	int insert(BookVO vo);
	
	// 변경
	int update(BookVO vo, Long id);

	// 삭제
	int delete(Long id);

	public List<BookVO> findByCategory(String category);

	public List<BookVO> findByTitleContaining(String title);

	public List<BookVO> findByPriceGreaterThanOrderByPriceAsc(int price);

	public int count();
	
	List<BookVO> findAllOrder(@Param("sort") String sort);
	
}
