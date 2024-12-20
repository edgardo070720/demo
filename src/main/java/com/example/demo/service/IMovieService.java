package com.example.demo.service;

import com.example.demo.model.Movie;

public interface IMovieService {
    Movie seveMovie(Movie movie);



    Iterable<Movie> findAllMovie();

}
