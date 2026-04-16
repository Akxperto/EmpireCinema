package uk.ac.richmond.EmpireCinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.richmond.EmpireCinema.entity.Movie;
import uk.ac.richmond.EmpireCinema.repository.MovieRepo;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService
{
    @Autowired
    private MovieRepo movieRepo;

    public List<Movie> getAllMovies()
    {
        return movieRepo.findAll();
    }
    public Optional<Movie> getMovieById(int id)
    {
        return movieRepo.findById(id);
    }
    public Movie addMovie(Movie movie)
    {
        return movieRepo.save(movie);
    }
    public List<Movie> getMovieByTitle(String title)
    {
        return movieRepo.findByTitle(title);
    }

    public void deleteMovie(int id)
    {
        movieRepo.deleteById(id);
    }
}
