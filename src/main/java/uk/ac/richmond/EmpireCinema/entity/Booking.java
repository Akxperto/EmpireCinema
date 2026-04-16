package uk.ac.richmond.EmpireCinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Booking
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "movie")
    @JsonIgnoreProperties("movie")
    private Movie movie;

    @ManyToOne
    @JoinColumn(name="screen")
    @JsonIgnoreProperties("screen")
    private Screen screen;

    @JoinColumn(name="seat")
    @JsonIgnoreProperties("seat")
    private Seat seat;

}
