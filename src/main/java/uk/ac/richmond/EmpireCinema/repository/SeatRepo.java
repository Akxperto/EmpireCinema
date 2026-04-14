package uk.ac.richmond.EmpireCinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.richmond.EmpireCinema.entity.Seat;

public interface SeatRepo extends JpaRepository<Seat, Integer>
{

}
