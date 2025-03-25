package com.theater.Theater_Management_System.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.theater.Theater_Management_System.model.Movie;
import com.theater.Theater_Management_System.service.MovieService;

@RestController
@RequestMapping("/admin/movies")
public class MovieController {
	
	  @Autowired
	    private MovieService movieService;

	    @PostMapping
	    public Movie addMovie(@RequestBody Movie movie) {
	        return movieService.addMovie(movie);
	    }

	    @GetMapping
	    public List<Movie> getAllMovies() {
	        return movieService.getAllMovies();
	    }

	    @DeleteMapping("/{id}")
	    public void deleteMovie(@PathVariable Long id) {
	        movieService.deleteMovie(id);
	    }

  
}