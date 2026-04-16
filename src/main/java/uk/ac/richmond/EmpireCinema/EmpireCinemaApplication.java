package uk.ac.richmond.EmpireCinema;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.ac.richmond.EmpireCinema.entity.Screen;
import uk.ac.richmond.EmpireCinema.repository.ScreenRepo;

@SpringBootApplication
public class EmpireCinemaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpireCinemaApplication.class, args);

	}
}