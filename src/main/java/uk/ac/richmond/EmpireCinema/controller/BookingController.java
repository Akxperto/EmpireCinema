package uk.ac.richmond.EmpireCinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/currently-running")
    public List<Movie> getRunningMovies()
    {
        return bookingService.getRunningMovies();
    }


}
