package com.korea.test.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.korea.test.entity.BookEntity;

// JpaRepository<BookEntity, Long>를 상속받으면 Repository로 취급한다. 따라서 @Repository 어노테이션을 굳이 안붙여도 됨
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {

	// 특정 제목이 포함된 데이터를 조회하는 메서드
	public List<BookEntity> findByTitleContaining(String keyword);
	
	// 카테고리에 맞는 데이터를 조회하는 메서드
	public List<BookEntity> findByCategory(String category);
	
}
