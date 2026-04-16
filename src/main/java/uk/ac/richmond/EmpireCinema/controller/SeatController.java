package uk.ac.richmond.EmpireCinema.controller;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.ac.richmond.EmpireCinema.entity.Seat;
import uk.ac.richmond.EmpireCinema.service.SeatService;

import java.util.List;

@RestController
@RequestMapping("/seats")
public class SeatController
{
    @Autowired
    private SeatService seatService;


    @GetMapping("/movies/{movieId}")
    public ResponseEntity<List<Seat>>  getSeatsByMovie(@PathVariable int movieId)
    {
        try
        {
            List<Seat> seats = seatService.getSeatsByMovie(movieId);
            return ResponseEntity.status(200).body(seats);
        } catch (EntityNotFoundException e)
            {
            return ResponseEntity.status(404).build();
            }

    }

    @PutMapping("/reserve/{id}")
    public ResponseEntity<?> reserveSeat(@PathVariable Integer id)
    {
        return seatService.reserveSeat(id)
                .map(seat -> ResponseEntity.status(200).body(seat))
                .orElseGet(() -> ResponseEntity.status(404).build());
    }

    @PostMapping("/screens/{screenId}")
    public ResponseEntity<?> addSeatToScreen (@PathVariable int screenId, @RequestBody Seat seat)
    {
        try
        {
            Seat newSeat = seatService.addSeatToScreen(screenId, seat);
            return ResponseEntity.status(201).body(newSeat);
        }
        catch (EntityNotFoundException e)
        {
            return ResponseEntity.status(404).build();
        }
        catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

}
