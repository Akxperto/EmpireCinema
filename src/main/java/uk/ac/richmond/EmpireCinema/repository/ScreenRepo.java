package uk.ac.richmond.EmpireCinema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import uk.ac.richmond.EmpireCinema.entity.Screen;

public interface ScreenRepo extends JpaRepository<Screen, Integer>
{

}

