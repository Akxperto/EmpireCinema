package uk.ac.richmond.EmpireCinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.richmond.EmpireCinema.entity.Movie;
import uk.ac.richmond.EmpireCinema.entity.Seat;
import uk.ac.richmond.EmpireCinema.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController
{
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Movie> getAllMovies()
    {
        return  movieService.getAllMovies();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie)
    {
        return movieService.addMovie(movie);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMovie(@PathVariable int id)
    {
        if (movieService.getMovieById(id).isPresent())
        {
            movieService.deleteMovie(id);
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.status(404).build();
    }
}



























