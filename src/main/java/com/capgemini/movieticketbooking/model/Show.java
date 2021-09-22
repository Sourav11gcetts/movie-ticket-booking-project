package com.capgemini.movieticketbooking.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
@Table(name = "show")
public class Show {
    @Id
    @Column(name = "id", nullable = false)
    private int showId;
    private LocalDateTime showEndTime;
    private String showName;
    private Movie movie;
    private int screenId;
    private int theatreId;

}
