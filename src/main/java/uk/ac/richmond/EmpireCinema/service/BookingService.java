package uk.ac.richmond.EmpireCinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.richmond.EmpireCinema.entity.Booking;
import uk.ac.richmond.EmpireCinema.entity.Movie;
import uk.ac.richmond.EmpireCinema.repository.BookingRepo;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService
{
    @Autowired
    private BookingRepo bookingRepo;

    public List<Movie> getRunningMovies()
    {
        LocalDate today = LocalDate.now();
        return bookingRepo.findByStartDateLessThanEqualAndEndDateGreaterThanEqual(today,today)
                .stream()
                .map(Booking::getMovie)
                .distinct()
                .toList();
    }

    public List<Movie> getMovieByScreenId(int screenId)
    {
        LocalDate today = LocalDate.now();
        return bookingRepo.findByScreenIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(screenId,today,today)
                .stream()
                .map(Booking::getMovie)
                .distinct()
                .toList();

    }


}
