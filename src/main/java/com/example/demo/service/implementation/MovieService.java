package com.example.demo.service.implementation;

import com.example.demo.model.Movie;
import com.example.demo.repository.IMovieRepository;
import com.example.demo.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private IMovieRepository movieRepository;

    @Override
    public Movie seveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Iterable<Movie> findAllMovie() {
        return movieRepository.findAll();
    }
}
