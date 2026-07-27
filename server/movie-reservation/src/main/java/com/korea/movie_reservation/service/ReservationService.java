package com.korea.movie_reservation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.korea.movie_reservation.dao.ReservationDAO;
import com.korea.movie_reservation.vo.ReservationVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReservationService {

	// DAO DI
	private final ReservationDAO reservationDAO;

	public Integer insertReservation(ReservationVO reservation) {
		return reservationDAO.insert(reservation);
	}

	public Integer updateReservation(ReservationVO reservation) {
		return reservationDAO.update(reservation);
	}

	public List<ReservationVO> findReservationDetails() {
		return reservationDAO.findReservationDetails();
	} 

}
