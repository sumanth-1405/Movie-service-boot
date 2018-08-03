package com.stackroute.movieservice.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Movie {
	private int movieId;
	private String id; 
	private String movieTitle;
	private float movieRating;
	private String movieYor;
	
	

	
}
