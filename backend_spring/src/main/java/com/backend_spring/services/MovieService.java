package com.backend_spring.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.backend_spring.models.MovieSearchQueryResponse;

@Service
public class MovieService {
    private RestTemplate restTemplate;
    // cambiar API KEY a variable de entorno
    private final String API_KEY = "42444aa2368fb7335feac23c3de79e1a";
    private final String URL = "https://api.themoviedb.org/3";
    private final String LANGUAGE = "es-ES";

    @Autowired
    public MovieService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public MovieSearchQueryResponse getMovieListFromQuery(String query) {
        return restTemplate.getForObject(URL + "/search/movie?api_key={API_KEY}&language={LANGUAGE}&query={query}",
                MovieSearchQueryResponse.class, API_KEY, LANGUAGE, query);
    }
}
