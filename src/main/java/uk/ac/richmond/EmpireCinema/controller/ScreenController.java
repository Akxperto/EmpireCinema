package uk.ac.richmond.EmpireCinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.richmond.EmpireCinema.entity.Screen;
import uk.ac.richmond.EmpireCinema.service.ScreenService;

import java.util.List;

@RestController
@RequestMapping("/screens")
public class ScreenController
{
    @Autowired
    private ScreenService screenService;

    @GetMapping
    public List<Screen> getAllScreens()
    {
        return screenService.getAllScreens();
    }
}
