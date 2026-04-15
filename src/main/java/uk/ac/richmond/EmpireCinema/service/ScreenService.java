package uk.ac.richmond.EmpireCinema.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uk.ac.richmond.EmpireCinema.entity.Screen;
import uk.ac.richmond.EmpireCinema.repository.ScreenRepo;

import java.util.List;

@Service
public class ScreenService
{
    @Autowired
    private ScreenRepo screenRepo;

    public List<Screen> getAllScreens()
    {
        return screenRepo.findAll();
    }
}
