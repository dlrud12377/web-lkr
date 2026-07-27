package com.korea.movie_reservation.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.movie_reservation.service.ReservationService;
import com.korea.movie_reservation.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/reservations")
@RequiredArgsConstructor
public class ReservationController {

	// Service DI
	private final ReservationService reservationService;
	
	@PostMapping
	public ResponseEntity<?> insertReservation(@RequestBody ReservationVO reservation){
		try {
			System.out.println(reservation.getCustomerName()); // 데이터 전달 확인용
			Integer result = reservationService.insertReservation(reservation);
			if (result >= 1) {
				System.out.println("예약 성공");
				return ResponseEntity.ok().body(reservation);
			}
			else {
				throw new Exception("예약 실패");
			}
		} catch (Exception e) {
			String msg = e.getMessage();
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@PutMapping("{reservationId}")
	public int updateReservation(@PathVariable Integer reservationId, @RequestBody ReservationVO updatedReservation) {
	
		
		System.out.println(updatedReservation.getReservationDate());
		
		updatedReservation.setReservationId(reservationId);
		Integer result = reservationService.updateReservation(updatedReservation);
		if (result == 1) {
			System.out.println("예매 수정 성공");
			return result;
		}
		else {
			System.out.println("예매 수정 실패");
			return result;
		}
		
	}
	
	@GetMapping("/details")
	public List<ReservationVO> findReservationDetails(){
		return reservationService.findReservationDetails();
	}
	
}
