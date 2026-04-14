package uk.ac.richmond.EmpireCinema.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false);
    private Integer seatNumber;
    @Column(nullable = false);
    private boolean isAvailable;

    @ManyToOne
    private Movie movie;
}
