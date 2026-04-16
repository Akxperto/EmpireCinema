package uk.ac.richmond.EmpireCinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.richmond.EmpireCinema.entity.Booking;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer>
{
    public List<Booking> findByStartDateLessThanEqualAndEndDateGreaterThanEqual(LocalDate todayStart, LocalDate todayEnd);

    public List<Booking> findByScreenIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(int screenId, LocalDate todayStart, LocalDate todayEnd);

    //Checking for bookings today
    public Optional<Booking> findFirstByMovieIdAndStartDateLessThanEqualAndEndDateGreaterThanEqual(int movieId, LocalDate todayStart, LocalDate todayEnd);
}
