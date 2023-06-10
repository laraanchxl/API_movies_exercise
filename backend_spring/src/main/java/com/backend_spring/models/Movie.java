package com.backend_spring.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Movie {
    private String title;
    private String overview;
    private int id;
    private String release_date;
    private String original_language;
}
