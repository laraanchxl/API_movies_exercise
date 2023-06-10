package com.backend_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend_spring.models.MovieSearchQueryResponse;
import com.backend_spring.services.MovieService;

@RestController
public class MoviesController {

    private final MovieService movieService;

    @Autowired
    public MoviesController(MovieService movieService) {
        this.movieService = movieService;
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/movies-api/search/movie")
    public MovieSearchQueryResponse getMovieListFromQuery(@RequestParam("query") String query) {
        return this.movieService.getMovieListFromQuery(query);
    }
}
