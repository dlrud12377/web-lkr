package com.korea.movie_reservation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.korea.movie_reservation.service.MovieService;
import com.korea.movie_reservation.vo.MovieVO;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/movies")
public class MovieController {
	
	// Service DI
	private final MovieService movieService;

	@PostMapping
	public ResponseEntity<?> insertMovie(@RequestBody MovieVO movie){
		try {
			System.out.println(movie.getMovieTitle());
			Integer result = movieService.insertMovie(movie);
			if (result >= 1) {
				System.out.println("영화 등록 성공");
				return ResponseEntity.ok().body(movie);
			}
			else {
				throw new Exception("영화 등록 실패");
			}
		} catch (Exception e) {
			String msg = e.getMessage();
			return ResponseEntity.badRequest().body(e);
		}
	}
	
	@GetMapping("{movieId}")
	public MovieVO findMovieById(@PathVariable Integer movieId){
		return movieService.findMovieById(movieId);
	}
	
}
