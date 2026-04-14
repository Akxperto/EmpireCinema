package uk.ac.richmond.EmpireCinema.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Screen {
    @Id
    public String screenId;
    @Column(nullable = false, length = 50)
    private String screenType;
    @Column(nullable = false, length = 50)
    private int capacity;
    // one instance of screen can have many movies
    @OneToMany(mappedBy = "screen")
    private List<Movie> movies;

}

