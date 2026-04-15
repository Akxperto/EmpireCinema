
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.ac.richmond.EmpireCinema.entity.Screen;
import uk.ac.richmond.EmpireCinema.service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/screens")
public class ScreenController
{
    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<Screen> getAllScreens()
    {
        return movieService.getAllMovies();
    }
}
