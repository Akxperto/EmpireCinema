package uk.ac.richmond.EmpireCinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Seat
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer seatNumber;

    @Column(nullable = false)
    private boolean isReserved;

    @ManyToOne
    @JoinColumn(name = "screen_id", nullable = false)
    @JsonIgnoreProperties("screen")
    private Screen screen;


}
