package com.korea.petclinic.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.korea.petclinic.vo.ReservationStatusCountVO;
import com.korea.petclinic.vo.ReservationVO;

@Mapper
public interface ReservationDAO {
	List<ReservationVO> findAll();

	ReservationVO findById(Long id);
	
	int insert(ReservationVO vo);
	
	int update(Long id, ReservationVO vo);

	int delete(Long id);
	
	List<ReservationVO> findByTypeAndKeyword(@Param("searchType") String searchType, @Param("keyword") String keyword);

	List<ReservationVO> findAllOrder(String order);
	
	List<ReservationStatusCountVO> countByStatus();
}
