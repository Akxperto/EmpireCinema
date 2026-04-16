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
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Screen {
    @Id
    public int Id; //1 or 2
    @Column(nullable = false, length = 50)
    private String type;
    @Column(nullable = false, length = 50)
    private int capacity; //25 or 50

}


