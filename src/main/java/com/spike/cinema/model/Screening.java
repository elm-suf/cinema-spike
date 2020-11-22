package com.spike.cinema.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Screening {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @NonNull
    private LocalDateTime startDate;

    @NotNull
    private LocalDateTime endDate;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="movie_id")
    @ToString.Exclude
    private Movie movie;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="hall_id")
    @ToString.Exclude
    private Hall hall;

    @JsonManagedReference
    @OneToMany(mappedBy = "screening")
    List<Reservation> reservations;


}
