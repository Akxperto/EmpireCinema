package uk.ac.richmond.EmpireCinema;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import uk.ac.richmond.EmpireCinema.entity.Screen;

@SpringBootApplication
public class EmpireCinemaApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(EmpireCinemaApplication.class, args);
	}
	Screen Screen1 = Screen(id=1,type="Standard",capacity=50);
	Screen Screen2 = Screen(id=2,type="VIP",capacity=25);
}
