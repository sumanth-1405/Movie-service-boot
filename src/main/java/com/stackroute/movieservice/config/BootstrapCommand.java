package com.stackroute.movieservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.stackroute.movieservice.Repository.MovieRepository;
import com.stackroute.movieservice.domain.Movie;
@Primary
@Configuration
public class BootstrapCommand implements CommandLineRunner {

	MovieRepository movieRepository;

	@Autowired
	public BootstrapCommand(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		Movie movie = new Movie();
		movie.setMovieTitle("superman");
		movieRepository.save(movie);
		Movie movie1 = Movie.builder()
				.movieTitle("flash")
				.build();
		movieRepository.save(movie1);
		
	}

}
