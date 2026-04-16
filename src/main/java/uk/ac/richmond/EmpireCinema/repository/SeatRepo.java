package uk.ac.richmond.EmpireCinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.richmond.EmpireCinema.entity.Seat;

import java.util.List;

public interface SeatRepo extends JpaRepository<Seat, Integer>
{
    List<Seat> findByScreenId(int screenId);
}
