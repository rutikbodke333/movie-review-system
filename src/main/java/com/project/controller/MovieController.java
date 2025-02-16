package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.project.entity.Movie;
import com.project.service.IMovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

	@Autowired
	private IMovieService movieService;

	@PostMapping
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.saveMovie(movie);
	}

	@GetMapping
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}


}
