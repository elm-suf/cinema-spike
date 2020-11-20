package com.spike.cinema.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Hall {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;

    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name="cinema_id")
    @ToString.Exclude
    private Cinema cinema;
}
