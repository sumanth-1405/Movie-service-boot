package com.stackroute.movieservice.services;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.stackroute.movieservice.domain.Movie;

@Service("child2service")
@Primary
//@Qualifier("child2service")
public class MovieServicesDummyImpl implements MovieServices {

	@Override
	public Movie saveMovie(Movie movie) {
		System.out.println("ukygsdfiweugy");
		return null;
	}

	@Override
	public List<Movie> getAllMovies() {
		System.out.println("ukygsweugy");
		return null;
	}

	@Override
	public Movie getMovieById(int movieId) {
		System.out.println("ukygsdfiweugy");
		return null;
	}

	@Override
	public Movie deleteMovie(int movieId) {
		System.out.println("ukygsdfiweugy");
		return null;
	}

	@Override
	public Movie updateMovie(int movieId, Movie movie) {
		System.out.println("ukygsdfiweugy");
		return null;
	}

//	@Override
//	public List<Movie> getMovieByName(String movie) {
//		System.out.println("ukygsdfiweugy");
//		return null;
//	}
	


}
