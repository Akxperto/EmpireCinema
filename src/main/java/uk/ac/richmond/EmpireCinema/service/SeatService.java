package uk.ac.richmond.EmpireCinema.service;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import uk.ac.richmond.EmpireCinema.entity.Booking;
import uk.ac.richmond.EmpireCinema.entity.Screen;
import uk.ac.richmond.EmpireCinema.entity.Seat;
import uk.ac.richmond.EmpireCinema.repository.BookingRepo;
import uk.ac.richmond.EmpireCinema.repository.ScreenRepo;
import uk.ac.richmond.EmpireCinema.repository.SeatRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SeatService {
    @Autowired
    private SeatRepo seatRepo;
    @Autowired
    private BookingRepo bookingRepo;
    @Autowired
    private ScreenRepo screenRepo;

    public List<Seat> getAllSeats()
    {
        return seatRepo.findAll();
    }
    public List<Seat> getSeatsByMovie(int movieId)
    {
        LocalDate today = LocalDate.now();

        Booking booking = bookingRepo.findFirstByMovieIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(movieId, today, today)
                .orElseThrow(() -> new EntityNotFoundException("Movie is not currently showing"));
        return seatRepo.findByScreenId(booking.getScreen().getId());

    }
    public Optional<Seat> reserveSeat(Integer id)
    {
        return seatRepo.findById((int)id)
                .map(seat -> {
                    seat.setReserved(true);
                    return seatRepo.save(seat);
    });
    }
    public Seat addSeatToScreen(int screenId, Seat seat)
    {
        Screen sccreen = screenRepo.findById(screenId)
                .orElseThrow(() -> new EntityNotFoundException("Screen is not currently showing"));
        seat.setScreen(screen);
        seat.setReserved(false);
        return seatRepo.save(seat);
    }




}
