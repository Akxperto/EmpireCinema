package uk.ac.richmond.EmpireCinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.richmond.EmpireCinema.entity.Seat;
import uk.ac.richmond.EmpireCinema.repository.SeatRepo;

import java.util.List;

@Service
public class SeatService {
    @Autowired
    private SeatRepo seatRepo;

    public List<Seat> getAllSeats()
    {
        return seatRepo.findAll();
    }

}
