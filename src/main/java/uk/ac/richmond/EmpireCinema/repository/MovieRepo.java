package uk.ac.richmond.EmpireCinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.richmond.EmpireCinema.entity.Movie;

import java.util.List;

public interface MovieRepo extends JpaRepository<Movie, Integer>
{
    public List<Movie> findByTitle(String title);
}
