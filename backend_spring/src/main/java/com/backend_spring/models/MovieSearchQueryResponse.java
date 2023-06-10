package com.backend_spring.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieSearchQueryResponse {
    private List<Movie> results;
}
