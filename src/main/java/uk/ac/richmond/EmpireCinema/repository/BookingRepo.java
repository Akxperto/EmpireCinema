package uk.ac.richmond.EmpireCinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.richmond.EmpireCinema.entity.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer>
{

}
