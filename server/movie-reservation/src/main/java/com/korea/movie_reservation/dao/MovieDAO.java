package com.korea.movie_reservation.dao;

import org.apache.ibatis.annotations.Mapper;

import com.korea.movie_reservation.vo.MovieVO;

@Mapper
public interface MovieDAO {

	Integer insert(MovieVO movie);

	MovieVO findMovieById(Integer movieId);

}
