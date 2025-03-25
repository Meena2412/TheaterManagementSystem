package com.theater.Theater_Management_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.theater.Theater_Management_System.model.Movie;
import com.theater.Theater_Management_System.repository.MovieRepository;
@Service
public class MovieService {
	 @Autowired
	    private MovieRepository movieRepository;

	    public Movie addMovie(Movie movie) {
	        return movieRepository.save(movie);
	    }

	    public List<Movie> getAllMovies() {
	        return movieRepository.findAll();
	    }

	    public void deleteMovie(Long id) {
	        movieRepository.deleteById(id);
	    }

		

		

}
