package com.korea.petclinic.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.korea.petclinic.service.ReservationService;
import com.korea.petclinic.vo.ReservationStatusCountVO;
import com.korea.petclinic.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reservation")
@RequiredArgsConstructor
public class ReservationController {
	
	//Service DI
	private final ReservationService reservationService;

	@GetMapping
	public List<ReservationVO> findAll(){
		return reservationService.findAll();
	}
	
	@GetMapping("{id}")
	public ReservationVO findById(@PathVariable Long id) {
		return reservationService.findById(id);
	}
	
	@PostMapping
	public int insert(@RequestBody ReservationVO vo) {
		return reservationService.insert(vo);
	}
	
	// insert, update, delete 쿼리를 실행하고 난 결과 -> 이 쿼리를 실행하고 나서 영향을 받은 행의 개수를 반환
	// 예약 정보 수정
	@PutMapping("{id}")
	public int update(@PathVariable Long id, @RequestBody ReservationVO vo){
		vo.setId(id);
		return reservationService.update(id, vo);
	}
	
	@DeleteMapping("{id}")
	public int delete(@PathVariable Long id) {
		return reservationService.delete(id);
	}
	
	@GetMapping("/search-detail")
	public List<ReservationVO> findByTypeAndKeyword(@Param("searchType") String searchType, @Param("keyword") String keyword){
		return reservationService.findByTypeAndKeyword(searchType, keyword);
	}
	
	@GetMapping("/sort")
	public List<ReservationVO> findAllOrder(@RequestParam(required=false) String sort){
		return reservationService.findAllOrder(sort);
	}
	
	@GetMapping("/status-count")
	public List<ReservationStatusCountVO> countByStatus() {
		return reservationService.countByStatus();
	}
	
	@GetMapping("/total-price")
	public int totalPrice() {
		return reservationService.totalPrice();
	}
	
}
