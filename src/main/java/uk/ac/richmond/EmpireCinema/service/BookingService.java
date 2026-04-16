package uk.ac.richmond.EmpireCinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.richmond.EmpireCinema.repository.BookingRepo;

@Service
public class BookingService
{
    @Autowired
    private BookingRepo bookingRepo;


}
