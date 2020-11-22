package com.spike.cinema.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Table(uniqueConstraints={
        @UniqueConstraint(columnNames = {"screening_id", "seat_id"})
})
public class Reservation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Boolean isPaid = Boolean.FALSE; // Default false
    private String phoneNumber;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="screening_id")
    @ToString.Exclude
    private Screening screening;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="seat_id")
    @ToString.Exclude
    private Seat seat;
}
