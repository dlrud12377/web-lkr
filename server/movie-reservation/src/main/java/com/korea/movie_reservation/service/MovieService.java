package com.korea.movie_reservation.service;

import org.springframework.stereotype.Service;

import com.korea.movie_reservation.dao.MovieDAO;
import com.korea.movie_reservation.vo.MovieVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieService {
	
	// dao DI
	private final MovieDAO movieDAO;

	public Integer insertMovie(MovieVO movie) {
		return movieDAO.insert(movie);
	}

	public MovieVO findMovieById(Integer movieId) {
		return movieDAO.findMovieById(movieId);
	}

}
