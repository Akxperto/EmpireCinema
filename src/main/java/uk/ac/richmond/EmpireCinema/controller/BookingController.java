package uk.ac.richmond.EmpireCinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.richmond.EmpireCinema.entity.Movie;
import uk.ac.richmond.EmpireCinema.service.BookingService;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController
{
    @Autowired
    private BookingService bookingService;

    @GetMapping("/currently-running") //Qn1
    public List<Movie> getRunningMovies()
    {
        return bookingService.getRunningMovies();
    }

    @GetMapping("/screen/{id}") //Qn2
    public List<Movie> getMovieByScreenId(@PathVariable int id)
    {
        return bookingService.getMovieByScreenId(id);
    }


}
