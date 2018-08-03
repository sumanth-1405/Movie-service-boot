package com.stackroute.movieservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;

import com.stackroute.movieservice.Repository.MovieRepository;
import com.stackroute.movieservice.domain.Movie;

@Configuration
public class BootstrapData implements ApplicationListener<ContextRefreshedEvent> {

	MovieRepository movieRepository;

	@Autowired
	public BootstrapData(MovieRepository movieRepository) {
		super();
		this.movieRepository = movieRepository;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Movie movie = new Movie();
		movie.setMovieTitle("qwerty");
		movieRepository.save(movie);
		Movie movie1 = Movie.builder()
				.movieTitle("deadpool")
				.build();
		movieRepository.save(movie1);

	}

}
