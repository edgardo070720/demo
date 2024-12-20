package com.example.demo.controller;

import com.example.demo.model.Movie;
import com.example.demo.service.implementation.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping
    public ResponseEntity<Iterable<Movie>> findAllMovie(){
        Iterable<Movie> movies= movieService.findAllMovie();
        return  new ResponseEntity<>(movies, HttpStatus.OK);
    }
    @GetMapping("/default")
    public ResponseEntity<Movie> defaultMovie(){
        Movie movie= new Movie();
        movie.setName("rapidos y furiosos");
        movie.setDate(LocalDate.now().toString());
        movie.setDescription("La quinta entrega de " +
                "la saga de acción “Rápidos y Furiosos” se estrenó " +
                "en 2011, dirigida por Justin Lin y escrita por Chris Morgan.");
        movieService.seveMovie(movie);
        return new ResponseEntity<>(movie,HttpStatus.OK);
    }
    @PostMapping
    public  ResponseEntity<Movie> saveMovie(@RequestBody Movie movie){
        Movie movieResponse=movieService.seveMovie(movie);
        return new ResponseEntity<>(movieResponse,HttpStatus.OK);
    }

}
