package com.korea.petclinic.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.korea.petclinic.dao.ReservationDAO;
import com.korea.petclinic.vo.ReservationStatusCountVO;
import com.korea.petclinic.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationService {
	
	// DAO(repository) DI
	private final ReservationDAO reservationDAO;
	
	public List<ReservationVO> findAll() {
		return reservationDAO.findAll();
	}

	public ReservationVO findById(Long id) {
		return reservationDAO.findById(id);
	}

	public int insert(ReservationVO vo) {
		return reservationDAO.insert(vo);
	}
	
	public int update(Long id, ReservationVO vo) {
		return reservationDAO.update(id, vo);
	}

	public int delete(Long id) {
		return reservationDAO.delete(id);
	}
	
	public List<ReservationVO> findByTypeAndKeyword(@Param("searchType") String searchType, @Param("keyword") String keyword) {
		return reservationDAO.findByTypeAndKeyword(searchType, keyword);
	}

	public List<ReservationVO> findAllOrder(@Param("sort") String order) {
		return reservationDAO.findAllOrder(order);
	}

	public List<ReservationStatusCountVO> countByStatus() {
		return reservationDAO.countByStatus();
	}

}
